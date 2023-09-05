package com.core.im.tenant.dto.request.post;

import com.core.im.tenant.modal.user.UserDetail;
import lombok.Data;

@Data
public class RegistrationAppUserDto {
    private String email;
    private String password;
    private UserDetail userDetail;
    private String userStreet;
    private int userApartment;
}
