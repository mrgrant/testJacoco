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

}
