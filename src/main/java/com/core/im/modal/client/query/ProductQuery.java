package com.core.im.modal.client.query;

public interface ProductQuery {
    String GET_PRODUCT_LIST = "select * from product";
    String GET_PRODUCT_BY_NAME = "select * from product p where p.name=?";

}
