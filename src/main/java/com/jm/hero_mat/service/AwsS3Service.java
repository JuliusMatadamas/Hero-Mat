package com.jm.hero_mat.service;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

@Service
@Slf4j
public class AwsS3Service {
    
    private final String bucketName = "hero-mat";

    @Value("${aws.s3.access}")
    private String awsAccessKey;

    @Value("${aws.s3.secret}")
    private String awsSecretKey;

    public String saveImageToS3(MultipartFile photo) {
        try {
            String s3FileName = photo.getOriginalFilename();
            BasicAWSCredentials awsCredentials = new BasicAWSCredentials(awsAccessKey, awsSecretKey);

            AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
                    .withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).withRegion(Regions.US_EAST_1)
                    .build();

            InputStream inputStream = photo.getInputStream();

            ObjectMetadata metaData = new ObjectMetadata();
            metaData.setContentType("image/jpeg");

            PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, s3FileName, inputStream, metaData);

            return "https://" + bucketName + ".s3.amazonaws.com/" + s3FileName;
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error saving image to S3: " + e.getMessage());
        }
    }
}
