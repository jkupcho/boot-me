package com.dardo.mke.alg;

public class CombinationsImpl implements Combinations {

    @Override
    public int total(int pointsScored) {
        if (pointsScored <= 0) { throw new IllegalArgumentException("Please enter number greater than 0!"); }

        if (pointsScored == 1) { return 1; }

        // Example: 8 points scored, floor = 4, 2 + 2 + 2 + 2
        //                                      2 + 2 + 2 + 1 + 1
        //                                      2 + 2 + 1 + 1 + 1 + 1
        //                                      2 + 1 + 1 + 1 + 1 + 1 + 1

        // Example: 9 points scored, floor = 4, 2 + 2 + 2 + 2 + 1
        //                                      2 + 2 + 2 + 1 + 1 + 1
        //                                      2 + 2 + 1 + 1 + 1 + 1 + 1
        //                                      2 + 1 + 1 + 1 + 1 + 1 + 1 + 1
        int numTwos = (int) Math.floor(pointsScored / 2);

        // Example: 10 points scored, floor = 3,    3 + 3 + 3 + 1
        //                                          3 + 3 + 2 + 1 + 1
        //                                          3 + 3 + 1 + 1 + 1 + 1
        //                                          3 + 2 + 1 + 1 + 1 + 1 + 1
        //                                          3 + 1 + 1 + 1 + 1 + 1 + 1 + 1
        int numThrees =  ((int) Math.floor(pointsScored / 3) * 2) - 1;

        return 1 + numTwos + (numThrees > 0 ? numThrees : 0);
    }

}
