package com.core.im.tenant.dto.request;

import lombok.Data;

@Data
public class AuthenticationAppUserDto {
    private String email;
    private String password;

}
