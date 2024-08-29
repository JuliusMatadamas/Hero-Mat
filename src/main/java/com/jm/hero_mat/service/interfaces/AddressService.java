package com.jm.hero_mat.service.interfaces;

import com.jm.hero_mat.dto.AddressDto;
import com.jm.hero_mat.dto.Response;

public interface AddressService {
    Response saveAndUpdateAddress(AddressDto addressDto);
}
