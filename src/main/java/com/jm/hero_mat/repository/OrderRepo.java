package com.jm.hero_mat.repository;

import com.jm.hero_mat.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
