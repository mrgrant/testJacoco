package com.test.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void TestAdd() {
        assertEquals(2, Plus.add(1, 1));
        assertEquals(3, Plus.add(1, 2));
    }

    @Test
    void TestFact() {
        assertEquals(1, Plus.fact(1));
        assertEquals(2, Plus.fact(2));
        assertEquals(6, Plus.fact(3));
        assertEquals(3628800, Plus.fact(10));
        assertEquals(2432902008176640000L, Plus.fact(20));
    }

    @Test
    void TestMinus() {
        assertEquals(0, Plus.minus(1, 1));
        assertEquals(1, Plus.minus(2, 1));
    }
}
