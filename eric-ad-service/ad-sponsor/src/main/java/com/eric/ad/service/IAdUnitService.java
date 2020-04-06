package com.eric.ad.service;

import com.eric.ad.exception.AdException;
import com.eric.ad.vo.AdUnitDistrictRequest;
import com.eric.ad.vo.AdUnitDistrictResponse;
import com.eric.ad.vo.AdUnitItRequest;
import com.eric.ad.vo.AdUnitItResponse;
import com.eric.ad.vo.AdUnitKeywordRequest;
import com.eric.ad.vo.AdUnitKeywordResponse;
import com.eric.ad.vo.AdUnitRequest;
import com.eric.ad.vo.AdUnitResponse;
import com.eric.ad.vo.CreativeUnitRequest;
import com.eric.ad.vo.CreativeUnitResponse;

/**
 * @author Eric Li
 * @date 2020/4/6 3:19 下午
 */
public interface IAdUnitService {

    AdUnitResponse createUnit(AdUnitRequest request) throws AdException;

    AdUnitKeywordResponse createUnitKeyword(AdUnitKeywordRequest request)
        throws AdException;

    AdUnitItResponse createUnitIt(AdUnitItRequest request)
        throws AdException;

    AdUnitDistrictResponse createUnitDistrict(AdUnitDistrictRequest request)
        throws AdException;

    CreativeUnitResponse createCreativeUnit(CreativeUnitRequest request)
        throws AdException;
}
