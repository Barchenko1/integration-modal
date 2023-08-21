package com.core.im.tenant.dto;

import com.core.im.tenant.modal.product.Product;
import com.core.im.tenant.modal.user.AppUser;
import lombok.Data;

import java.util.List;

@Data
public class AppUserProductDto {
    private List<AppUser> appUserList;
    private List<Product> productList;
}
