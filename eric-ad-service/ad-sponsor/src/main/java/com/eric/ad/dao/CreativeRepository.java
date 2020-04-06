package com.eric.ad.dao;

import com.eric.ad.entity.Creative;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Eric Li
 * @date 2020/4/6 2:56 下午
 */
public interface CreativeRepository extends JpaRepository<Creative, Long> {
}
