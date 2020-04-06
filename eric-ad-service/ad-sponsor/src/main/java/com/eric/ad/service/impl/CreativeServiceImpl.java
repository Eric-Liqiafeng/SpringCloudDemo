package com.eric.ad.service.impl;

import com.eric.ad.dao.CreativeRepository;
import com.eric.ad.entity.Creative;
import com.eric.ad.service.ICreativeService;
import com.eric.ad.vo.CreativeRequest;
import com.eric.ad.vo.CreativeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Eric Li
 * @date 2020/4/6 3:13 下午
 */
@Service
public class CreativeServiceImpl implements ICreativeService {

    private final CreativeRepository creativeRepository;

    @Autowired
    public CreativeServiceImpl(CreativeRepository creativeRepository) {
        this.creativeRepository = creativeRepository;
    }

    @Override
    public CreativeResponse createCreative(CreativeRequest request) {

        Creative creative = creativeRepository.save(
                request.convertToEntity()
        );

        return new CreativeResponse(creative.getId(), creative.getName());
    }
}
