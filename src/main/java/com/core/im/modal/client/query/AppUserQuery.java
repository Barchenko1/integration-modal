package com.core.im.modal.client.query;

public interface AppUserQuery {
    String FIND_ALL_APP_USER_LIST = "select * from app_user";
    String FIND_ALL_APP_USER_BY_USERNAME = "select * from app_user u where u.username=?";
    String FIND_ALL_USER_BY_EMAIL = "select * from app_user u where u.email=?";
}
