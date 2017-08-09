package com.dardo.mke.alg;

public class CombinationsImpl implements Combinations {

    @Override
    public int total(int pointsScored) {
        if (pointsScored <= 0) { throw new IllegalArgumentException("Please enter number greater than 0!"); }

        if (pointsScored == 1) { return 1; }

        int x = num2s(pointsScored);
        int y = num3s(pointsScored);

        return x + y;
    }

    // 2 has two states, 2 and 1 + 1, so really it's just half the total + 1 to take care of all one's case.
    // Remainder doesn't matter due to 1 having only one state it can be in.
    // Example: 8 points scored, floor = 4, 2 + 2 + 2 + 2
    //                                      2 + 2 + 2 + 1 + 1
    //                                      2 + 2 + 1 + 1 + 1 + 1
    //                                      2 + 1 + 1 + 1 + 1 + 1 + 1
    //                                      1 + 1 + 1 + 1 + 1 + 1 + 1 + 1
    int num2s(int pointsScored) {
        return (int) Math.floor(pointsScored / 2) + 1;
    }


    // Keep a trailing 3 in order to not get duplicates from the 2s calculation, then pass a sliding door
    // of the floor of n / 3 + r where n is the points scored, and r is the remainder of the division.
    // Given n = pointsScored = 10
    // remainder = n % 3 = 1
    // iterations = floor(n / 3) - 1

    // Example: 3 + 3 + 3 + 1
    //          3 + 3 + 2s(3 + 1) = 3
    //          3 + 2s(3 + 3 + 1) = 4
    // 1 + 3 + 4 = 8
    int num3s(int pointsScored) {
        if (pointsScored < 3) { return 0; }
        int remainder = pointsScored % 3,
            iterations = (((int) Math.floor(pointsScored / 3)) - 1),
            total = 1;

        for (int i = 1; i <= iterations; ++i) {
            total += num2s(i * 3 + remainder);
        }
        return total;
    }

}
