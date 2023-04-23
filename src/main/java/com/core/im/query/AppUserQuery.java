package com.core.im.query;

public interface AppUserQuery {
    String GET_APP_USER_LIST = "select * from app_user";
    String GET_APP_USER_BY_USERNAME = "select * from app_user u where u.username=?";
    String GET_APP_USER_BY_EMAIL = "select * from app_user u where u.email=?";
}
