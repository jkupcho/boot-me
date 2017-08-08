package com.dardo.mke.alg;

import org.junit.Test;

import static org.junit.Assert.*;

public class UsedTest {

    private static final String[] NO_ARGS = new String[]{};
    private static final String[] NULL_ARGS = null;
    private static final String[] OUT_OF_ORDER = new String[] { "cycle", "apple", "Apple", "apple" };
    private static final String[] NO_REPEATS = new String[] { "cycle", "apple" };
    private static final String[] NO_REPEATS_WITH_NUMBERS = new String[]{"cycle", "apple", "123"};
    private static final String[] TIE_SENSITIVE = new String[] { "cycle", "CYCLE", "APPLE", "Apple" };

    private Used used;

    @Test(expected = IllegalArgumentException.class)
    public void IterativeCaseSensitive_NoArgs_ShouldThrowException() throws Exception {
        used = new IterativeUsed();

        used.findMostUsed(NO_ARGS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void IterativeCaseSensitive_NullArgs_ShouldThrowException() throws Exception {
        used = new IterativeUsed();

        used.findMostUsed(NULL_ARGS);
    }

    @Test
    public void IterativeCaseSensitive_OutOfOrder_ShouldReturn_apple() throws Exception {
        used = new IterativeUsed();

        final String expected = "apple";
        String actual = used.findMostUsed(OUT_OF_ORDER);

        assertEquals(expected, actual);
    }

    @Test
    public void IterativeNotCaseSensitive_NoRepeats_ShouldReturn_apple() throws Exception {
        used = new IterativeUsed();

        final String expected = "apple";
        String actual = used.findMostUsed(NO_REPEATS);

        assertEquals(expected, actual);
    }

    @Test
    public void IterativeNotCaseSensitive_NoRepeatsWithNumbers_ShouldReturn_123() throws Exception {
        used = new IterativeUsed();

        final String expected = "123";
        String actual = used.findMostUsed(NO_REPEATS_WITH_NUMBERS);

        assertEquals(expected, actual);
    }

    @Test
    public void IterativeNotCaseSensitive_TieSensitive_ShouldReturn_Apple() throws Exception {
        used = new IterativeUsed();

        final String expected = "APPLE";
        String actual = used.findMostUsed(TIE_SENSITIVE);

        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void IterativeNotCaseSensitive_NoArgs_ShouldThrowException() throws Exception {
        used = new IterativeUsed(false);

        used.findMostUsed(NO_ARGS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void IterativeNotCaseSensitive_NullArgs_ShouldThrowException() throws Exception {
        used = new IterativeUsed(false);

        used.findMostUsed(NULL_ARGS);
    }

    @Test
    public void IterativeNotCaseSensitive_OutOfOrder_ShouldReturn_apple() throws Exception {
        used = new IterativeUsed(false);

        final String expected = "apple";
        String actual = used.findMostUsed(OUT_OF_ORDER);

        assertEquals(expected, actual);
    }

    @Test
    public void IterativeCaseSensitive_NoRepeats_ShouldReturn_apple() throws Exception {
        used = new IterativeUsed(false);

        final String expected = "apple";
        String actual = used.findMostUsed(NO_REPEATS);

        assertEquals(expected, actual);
    }

    @Test
    public void IterativeCaseSensitive_NoRepeatsWithNumbers_ShouldReturn_123() throws Exception {
        used = new IterativeUsed(false);

        final String expected = "123";
        String actual = used.findMostUsed(NO_REPEATS_WITH_NUMBERS);

        assertEquals(expected, actual);
    }

    @Test
    public void IterativeCaseSensitive_TieSensitive_ShouldReturn_Apple() throws Exception {
        used = new IterativeUsed(false);

        final String expected = "apple";
        String actual = used.findMostUsed(TIE_SENSITIVE);

        assertEquals(expected, actual);
    }

}