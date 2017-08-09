package com.dardo.mke.alg;

import org.junit.Test;

import static org.junit.Assert.*;

public class CombinationsImplTest {

    private CombinationsImpl combinations = new CombinationsImpl();

    @Test
    public void total() {
        assertEquals(1, combinations.total(1));
        assertEquals(2, combinations.total(2));
        assertEquals(3, combinations.total(3));

        assertEquals(9, combinations.total(8));
        assertEquals(12, combinations.total(9));
        assertEquals(14, combinations.total(10));
    }

    @Test
    public void num3s() {
        assertEquals(8, combinations.num3s(10));
        assertEquals(6, combinations.num2s(10));

        assertEquals(14, combinations.total(10));
        assertEquals(7, combinations.total(6));
    }

}