package com.jm.hero_mat.dto;

import lombok.Data;

@Data
public class OrderItemRequest {
    private int productId;
    private int quantity;
}
