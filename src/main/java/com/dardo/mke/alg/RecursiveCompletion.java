package com.dardo.mke.alg;

public class RecursiveCompletion implements Completion {

    private static final Integer[] YARDS_ARRAY = new Integer[] { 25, 10, 5, 1 };

    private int currentIndex = 0;

    @Override
    public int minimumNumber(int yardsLeft) {
        int yardsThrown = YARDS_ARRAY[currentIndex];

        if (yardsLeft > 100 || yardsLeft <= 0) { throw new IllegalArgumentException("Enter a yardage between 1 and 100!"); }

        for (int iterativeYardsLeft : YARDS_ARRAY) {
            if (yardsLeft - iterativeYardsLeft == 0) { return 1; }
        }

        while (yardsThrown > yardsLeft) {
            ++currentIndex;
            yardsThrown = YARDS_ARRAY[currentIndex];
        }

        return 1 + minimumNumber(yardsLeft - yardsThrown);
    }

}
