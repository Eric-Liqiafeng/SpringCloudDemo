package com.eric.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Eric Li
 * @date 2020/4/4 4:37 下午
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse<T> implements Serializable {
    private Integer code;
    private String message;
    private T data;

    public CommonResponse(Integer code, String message){
        this.code = code;
        this.message = message;
    }
}
