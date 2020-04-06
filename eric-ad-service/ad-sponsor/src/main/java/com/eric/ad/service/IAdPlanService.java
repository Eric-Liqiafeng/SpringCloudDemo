package com.eric.ad.service;

import com.eric.ad.entity.AdPlan;
import com.eric.ad.exception.AdException;
import com.eric.ad.vo.AdPlanGetRequest;
import com.eric.ad.vo.AdPlanRequest;
import com.eric.ad.vo.AdPlanResponse;

import java.util.List;

/**
 * @author Eric Li
 * @date 2020/4/6 3:19 下午
 */
public interface IAdPlanService {
    /**
     * <h2>创建推广计划</h2>
     * */
    AdPlanResponse createAdPlan(AdPlanRequest request) throws AdException;

    /**
     * <h2>获取推广计划</h2>
     * */
    List<AdPlan> getAdPlanByIds(AdPlanGetRequest request) throws AdException;

    /**
     * <h2>更新推广计划</h2>
     * */
    AdPlanResponse updateAdPlan(AdPlanRequest request) throws AdException;

    /**
     * <h2>删除推广计划</h2>
     * */
    void deleteAdPlan(AdPlanRequest request) throws AdException;
}
