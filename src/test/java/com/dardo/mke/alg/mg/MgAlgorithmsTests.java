package com.dardo.mke.alg.mg;

import com.dardo.mke.mg.MgAlgorithms;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MgAlgorithmsTests {

    @Autowired
    private MgAlgorithms mgAlgorithms;

    @Test
    public void injects() {
        assertNotNull(mgAlgorithms);
    }

    @Test
    public void basicTests() {
        assertEquals(10, mgAlgorithms.getCombinationsToScorePoints(9));
        assertEquals(2, mgAlgorithms.getMinimumNumberOfCompletions(30));
        assertEquals("APPLE", mgAlgorithms.getHighestWordCount(Arrays.asList("cycle", "CYCLE", "APPLE", "Apple")));

    }

}
