package com.dardo.mke.mg;

import com.dardo.mke.alg.Combinations;
import com.dardo.mke.alg.Completion;
import com.dardo.mke.alg.Used;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MgAlgorithmsImpl implements MgAlgorithms {

    private final Combinations combinations;
    private final Used used;
    private final Completion completion;

    @Autowired
    public MgAlgorithmsImpl(Combinations combinations, Used used, Completion completion) {
        this.combinations = combinations;
        this.used = used;
        this.completion = completion;
    }

    @Override
    public String getHighestWordCount(List<String> words) {
        return used.findMostUsed(words.toArray(new String[words.size()]));
    }

    @Override
    public int getMinimumNumberOfCompletions(int num) {
        return completion.minimumNumber(num);
    }

    @Override
    public int getCombinationsToScorePoints(int num) {
        return combinations.total(num);
    }

}
