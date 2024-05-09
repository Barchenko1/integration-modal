package com.core.im.modal.client.dto.request.post;

import com.core.im.modal.client.entity.user.UserDetail;
import lombok.Data;

@Data
public class RegistrationAppUserDto {
    private String email;
    private String password;
    private UserDetail userDetail;
}
