package com.github.ub.mybatistest.autoconfigure;

import javax.annotation.PostConstruct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.github.ub.mybatistest.domain.TestEntity;
import com.github.ub.mybatistest.mapper.TestEntityMapper;

import liquibase.integration.spring.SpringLiquibase;

/**
 * @author Uladzislau_Belykh
 */
@Configuration
@MapperScan(basePackageClasses = TestEntityMapper.class)
//@Import({TestAutoconfiguration.LiquibaseSqlFactoryDependsOnPostProcessor.class}) //todo uncomment for workaround
public class TestAutoconfiguration {

    @Autowired
    private TestEntityMapper testEntityMapper;

    @PostConstruct
    private void init() {
        TestEntity test = new TestEntity();
        test.setTest("test");
        testEntityMapper.insert(test);
    }

    static final class LiquibaseSqlFactoryDependsOnPostProcessor extends SqlFactoryDependsOnPostProcessor{
        public LiquibaseSqlFactoryDependsOnPostProcessor() {
            super(SpringLiquibase.class);
        }
    }
}
