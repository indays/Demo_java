package org.api.service.impl;

import org.api.dto.UserDTO;
import org.api.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {


    @Override
    public UserDTO getUser(Integer id) {
        return UserDTO.builder().name("hah").phone("123").build();
    }

}
