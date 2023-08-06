package com.core.im.dto;

import com.core.im.modal.product.Product;
import com.core.im.modal.user.AppUser;
import lombok.Data;

import java.util.List;

@Data
public class AppUserProductDto {
    private List<AppUser> appUserList;
    private List<Product> productList;
}
