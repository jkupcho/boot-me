package com.dardo.mke.alg;

public abstract class AbstractUsed implements Used {

    protected final boolean caseSensitive;

    public AbstractUsed() { this(true); }

    public AbstractUsed(boolean caseSensitive) { this.caseSensitive = caseSensitive; }

    @Override
    public String findMostUsed(String[] words) {
        if (words == null || words.length == 0) { throw new IllegalArgumentException("Please provide at least one word to compare!"); }
        return doFindMostUsed(words);
    }

    protected abstract String doFindMostUsed(String[] words);

    protected String getKey(String word) {
        return this.caseSensitive ? word : word.toLowerCase();
    }

}
