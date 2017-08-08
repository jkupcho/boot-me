package com.dardo.mke.alg;

import org.junit.Test;

import static org.junit.Assert.*;

public class CombinationsImplTest {

    private Combinations combinations = new CombinationsImpl();

    @Test
    public void total() {
        assertEquals(1, combinations.total(1));
        assertEquals(2, combinations.total(2));
        assertEquals(3, combinations.total(3));

        assertEquals(8, combinations.total(8));
        assertEquals(10, combinations.total(9));
        assertEquals(11, combinations.total(10));
    }

}