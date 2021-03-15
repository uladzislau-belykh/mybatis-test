package com.github.ub.mybatistest.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.github.ub.mybatistest.domain.TestEntity;

/**
 * @author Uladzislau_Belykh
 */
@Mapper
public interface TestEntityMapper {

    void insert(@Param("testEntity") TestEntity data);

    void update(@Param("testEntity") TestEntity data);

}
