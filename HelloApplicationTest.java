package com.example.csd_214_test2b_bibek_lamichhane;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloApplicationTest {

    @Test
    void totalamount() {
        HelloApplication a = new HelloApplication();
        assertEquals(a.totalamount(5),10);

    }
}