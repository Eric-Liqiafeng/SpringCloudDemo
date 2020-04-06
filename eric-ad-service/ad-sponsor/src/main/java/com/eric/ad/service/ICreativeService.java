package com.eric.ad.service;

import com.eric.ad.vo.CreativeRequest;
import com.eric.ad.vo.CreativeResponse;

/**
 * @author Eric Li
 * @date 2020/4/6 3:19 下午
 */
public interface ICreativeService {

    CreativeResponse createCreative(CreativeRequest request);
}
