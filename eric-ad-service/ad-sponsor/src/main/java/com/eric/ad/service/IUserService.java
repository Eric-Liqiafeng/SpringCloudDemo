package com.eric.ad.service;

import com.eric.ad.exception.AdException;
import com.eric.ad.vo.CreateUserRequest;
import com.eric.ad.vo.CreateUserResponse;

/**
 * @author Eric Li
 * @date 2020/4/6 3:07 下午
 */
public interface IUserService {
    CreateUserResponse createUser(CreateUserRequest request)
            throws AdException;
}
