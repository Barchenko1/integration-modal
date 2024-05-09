package com.core.im.modal.client.dto.request.post;

import com.core.im.modal.client.entity.post.Post;
import lombok.Data;

@Data
public class PostDto {
    private long postId;
    private String name;
    private String email;
    private String message;
    private long dateOfCreate;
    private long parentPostId;
    private Post parentPost;

}
