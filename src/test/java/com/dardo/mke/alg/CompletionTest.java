package com.dardo.mke.alg;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class CompletionTest {

    private static final int[] BAD_YARDAGE = new int[] { 0, -1, 100 };
    private static final int[] SINGLE_THROWS = new int[] { 25, 10, 5, 1 };

    private static final int WORST_CASE = 25 + 10 + 5 + 1;
    private static final int FULL_FIELD = 100;

    // 25 + 25 + 25 + 5 + 1 + 1 + 1
    private static final int RANDOM_CASE = 83;

    private Completion completion = new RecursiveCompletion();

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void minimumNumber_BadYardage() {
        for (int yardsLeft : BAD_YARDAGE) {
            expectedException.expect(IllegalArgumentException.class);
            assertEquals(0, completion.minimumNumber(yardsLeft));
        }
    }

    @Test
    public void minimumNumber_SingleCompletions() {
        for (int yardsLeft : SINGLE_THROWS) {
            assertEquals(1, completion.minimumNumber(yardsLeft));
        }
    }

    @Test
    public void minimumNumber_WorstCase() {
        assertEquals(4, completion.minimumNumber(WORST_CASE));
    }

    @Test
    public void minimumNumber_FullField() {
        assertEquals(4, completion.minimumNumber(FULL_FIELD));
    }

    @Test
    public void minimumNumber_RandomCase() {
        assertEquals(7, completion.minimumNumber(RANDOM_CASE));
    }

    @Test
    public void minimumNumber_KnownCases() {
        assertEquals(2, completion.minimumNumber(50));
        assertEquals(2, completion.minimumNumber(35));
        assertEquals(2, completion.minimumNumber(30));
        assertEquals(2, completion.minimumNumber(26));
    }

}