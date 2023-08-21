package com.core.im.tenant.query;

public interface BucketQuery {
    String FIND_ALL_BUCKET_LIST = "select * from bucket";
    String FIND_ALL_BUCKET_BY_USER_NAME = "select * from bucket b where b.rolename=?";
    String FIND_ALL_BUCKET_BY_USER_EMAIL = "select * from bucket b where b.rolename=?";

}
