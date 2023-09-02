package com.core.im.tenant.dto.request;

import lombok.Data;

@Data
public class RegistrationAppUserDto {
    private OptionParams optionParams;
    private String email;
    private String password;

}
