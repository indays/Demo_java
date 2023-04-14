package org.api.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class UserDTO implements Serializable {

    private Integer id;


    private String name;


    private String phone;
}
