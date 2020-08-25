package com.sample.scheduler.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sample.entity.OrderStatsEntity;

import org.springframework.stereotype.Repository;

@Repository
public interface orderMapper extends BaseMapper<OrderStatsEntity> {
    
}