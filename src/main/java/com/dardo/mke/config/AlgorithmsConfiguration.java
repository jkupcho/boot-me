package com.dardo.mke.config;

import com.dardo.mke.alg.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AlgorithmsConfiguration {

    @Value("${used.case.sensitive}")
    private boolean usedCaseSensitive;

    @Bean
    public Combinations combinations() {
        return new CombinationsImpl();
    }

    @Bean
    public Completion completion() {
        return new RecursiveCompletion();
    }

    @Bean
    public Used used() {
        return new IterativeUsed(usedCaseSensitive);
    }

}
