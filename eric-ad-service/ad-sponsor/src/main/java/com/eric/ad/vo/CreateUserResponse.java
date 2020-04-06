package com.eric.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Eric Li
 * @date 2020/4/6 3:09 下午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserResponse {

    private Long userId;
    private String username;
    private String token;
    private Date createTime;
    private Date updateTime;
}
