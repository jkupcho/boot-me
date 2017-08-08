package com.dardo.mke.alg;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class IterativeUsed extends AbstractUsed {

    public IterativeUsed() { super(); }
    public IterativeUsed(boolean caseSensitive) { super(caseSensitive); }

    @Override
    protected String doFindMostUsed(String[] words) {
        Map<String, Integer> countMap = new HashMap<>();
        int runningCount = 0;
        TreeSet<String> finalSet = new TreeSet<>();

        for (String word : words) {
            String key = getKey(word);

            Integer count = countMap.get(key);

            if (count == null) {
                count = 1;
            } else {
                ++count;
            }
            countMap.put(key, count);

            if (count > runningCount) { finalSet.clear(); }
            if (finalSet.isEmpty() || count == runningCount) { runningCount = count; finalSet.add(key); }
        }
        return finalSet.first();
    }


}
