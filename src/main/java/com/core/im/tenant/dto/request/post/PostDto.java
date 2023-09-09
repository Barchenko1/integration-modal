package com.core.im.tenant.dto.request.post;

import com.core.im.tenant.modal.post.Post;
import lombok.Data;

@Data
public class PostDto {
    private String name;
    private String email;
    private String message;
    private long dateOfCreate;
    private Post parentPost;

}
