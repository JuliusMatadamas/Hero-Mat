package com.jm.hero_mat.security;

import com.jm.hero_mat.entity.User;
import com.jm.hero_mat.exception.NotFoundException;
import com.jm.hero_mat.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {
    private final UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByEmail(username).orElseThrow(()-> new NotFoundException("User not found"));
        return AuthUser.builder().user(user).build();
    }
}
