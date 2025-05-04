package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionParametrTest {
    private final String sex;
    private final boolean isHasMane;

    public LionParametrTest(String sex, boolean isHasMane) {
        this.sex = sex;
        this.isHasMane = isHasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    Lion lion;
    Feline feline;

    @Test
    public void doesHaveManeTest() throws Exception {
        lion = new Lion(sex, feline);
        assertEquals(isHasMane, lion.doesHaveMane());
    }
}