package com.github.ub.mybatistest;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.testcontainers.containers.PostgreSQLContainer;

/**
 * @author Uladzislau_Belykh
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Config.class)
class MybatisTestEntityApplicationTests {

    private static final PostgreSQLContainer postgreSQLContainer;

    static {
        postgreSQLContainer = new PostgreSQLContainer("postgres:12.2");
        postgreSQLContainer
                .withDatabaseName("test")
                .withUsername("test")
                .withPassword("test")
                .start();
    }

    @Test
    void test() {
    }

    @DynamicPropertySource
    static void properties(DynamicPropertyRegistry registry) {

        registry.add("embedded.postgresql.url", postgreSQLContainer::getJdbcUrl);
        registry.add("embedded.postgresql.username", postgreSQLContainer::getUsername);
        registry.add("embedded.postgresql.password", postgreSQLContainer::getPassword);

    }
}
