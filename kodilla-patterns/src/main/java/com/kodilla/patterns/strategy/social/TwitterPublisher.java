package com.kodilla.patterns.strategy.social;

public class TwitterPublisher implements SocialPublisher {

    @Override
    public String share() {
        return("(TWITTER) publish tweet on Twitter! Yay!");
    }
}
