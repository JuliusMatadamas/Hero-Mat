package com.jm.hero_mat.repository;

import com.jm.hero_mat.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Long> {
}
