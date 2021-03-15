package com.github.ub.mybatistest.domain;

import java.util.Objects;

/**
 * @author Uladzislau_Belykh
 */
public class TestEntity {
    private Integer id;
    private String test;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestEntity that = (TestEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(test, that.test);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, test);
    }

    @Override
    public String toString() {
        return "TestEntity{" +
                "id=" + id +
                ", test='" + test + '\'' +
                '}';
    }
}
