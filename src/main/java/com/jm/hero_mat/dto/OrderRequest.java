package com.jm.hero_mat.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jm.hero_mat.entity.Payment;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderRequest {
    private BigDecimal totalPrice;
    private List<OrderItemRequest> items;
    private Payment paymentInfo;
}
