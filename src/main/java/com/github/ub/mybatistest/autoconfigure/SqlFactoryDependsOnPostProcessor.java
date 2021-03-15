package com.github.ub.mybatistest.autoconfigure;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.boot.autoconfigure.AbstractDependsOnBeanFactoryPostProcessor;

/**
 * @author Uladzislau_Belykh
 */
public class SqlFactoryDependsOnPostProcessor extends AbstractDependsOnBeanFactoryPostProcessor {

    public SqlFactoryDependsOnPostProcessor(String... dependsOn) {
        super(SqlSessionFactory.class, dependsOn);
    }

    public SqlFactoryDependsOnPostProcessor(Class<?>... dependsOn) {
        super(SqlSessionFactory.class, dependsOn);
    }
}
