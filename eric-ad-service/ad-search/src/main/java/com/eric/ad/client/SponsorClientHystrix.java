package com.eric.ad.client;

import com.eric.ad.client.vo.AdPlan;
import com.eric.ad.client.vo.AdPlanGetRequest;
import com.eric.ad.vo.CommonResponse;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Eric Li
 * @date 2020/4/6 4:07 下午
 */
@Component
public class SponsorClientHystrix implements SponsorClient {

    @Override
    public CommonResponse<List<AdPlan>> getAdPlans(
            AdPlanGetRequest request) {
        return new CommonResponse<>(-1,
                "eureka-client-ad-sponsor error");
    }
}
