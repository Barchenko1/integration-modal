package com.core.im.tenant.dto.request.post;

import lombok.Data;

@Data
public class AuthenticationAppUserDto {
    private String email;
    private String password;

}
