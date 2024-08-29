package com.jm.hero_mat.service.interfaces;

import com.jm.hero_mat.dto.LoginRequest;
import com.jm.hero_mat.dto.Response;
import com.jm.hero_mat.dto.UserDto;
import com.jm.hero_mat.entity.User;

public interface UserService {
    Response registerUser(UserDto registrationRequest);

    Response loginUser(LoginRequest loginRequest);

    Response getAllUsers();

    User getLoginUser();

    Response getUserInfoAndOrderHistory();
}
