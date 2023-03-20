package com.springboot.blog.BlogApplication.payload;

import lombok.Data;
import lombok.Singular;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import java.util.Set;


@Data
public class PostDto {
    private long id;
    //title should be not null and contain at least 2 letters
    @NotEmpty
    @Size(min = 2,message = "Post title should have at least 2 characters")
    private String title;

    @NotEmpty
    @Size(min = 10,message = "Post description should have at least 10 characters")
    private String description;

    @NotEmpty
    private String content;

    private Set<CommentDto> comments;

}
