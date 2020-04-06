package com.eric.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.StringUtils;

/**
 * @author Eric Li
 * @date 2020/4/6 3:08 下午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserRequest {

    private String username;

    public boolean validate() {

        return !StringUtils.isEmpty(username);
    }
}
