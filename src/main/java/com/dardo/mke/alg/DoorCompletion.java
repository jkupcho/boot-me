package com.dardo.mke.alg;

public class DoorCompletion implements Completion {

    private static final Integer[] YARDS_ARRAY = new Integer[] { 25, 10, 5, 1 };

    @Override
    public int minimumNumber(int totalYards) {
        if (totalYards > 100 || totalYards < 1) { throw new IllegalArgumentException("Enter a number between 1 and 100!"); }

        int remainder = 0,
            completions = 0,
            yardsLeft = totalYards,
            numThrows = 0;

        if (yardsLeft == 25 || yardsLeft == 10 || yardsLeft == 5 || yardsLeft == 1) {
            return 1;
        }

        for (int i = 0; i < YARDS_ARRAY.length; ++i) {
            int yardsThrown = YARDS_ARRAY[i];
            remainder = yardsLeft % yardsThrown;
            numThrows = (int)Math.floor(yardsLeft / yardsThrown);

            if (numThrows > 0) {
                completions += numThrows;
                yardsLeft -= numThrows * yardsThrown;
            }

            if (remainder == 0) { break; }
        }

        return completions;
    }
}
