package org.api.service;

import org.api.dto.UserDTO;
import org.springframework.stereotype.Component;


public interface UserService {


    /**
     *
     * @param id
     * @return
     */
    UserDTO getUser(Integer id);

}
