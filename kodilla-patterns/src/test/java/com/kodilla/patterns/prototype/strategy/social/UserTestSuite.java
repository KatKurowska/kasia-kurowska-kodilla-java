package com.kodilla.patterns.prototype.strategy.social;

import com.kodilla.patterns.strategy.social.*;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User mary = new Millenials("Mary Alice Young");
        User susan = new YGeneration("Susan Meyer");
        User gabrielle = new ZGenerration("Gabrielle Solis");

        //When
        String maryIsPublishing = mary.sharePost();
        System.out.println("Mary Alice prefers to:" + maryIsPublishing);
        String susanIsPublishing = susan.sharePost();
        System.out.println("Susan prefers to:" + susanIsPublishing);
        String gabrielleIsPublishing = gabrielle.sharePost();
        System.out.println("Gabrielle prefers to:" + gabrielleIsPublishing);

        //Then
        Assert.assertEquals("(FB) publish post on Facebook! Yay!", maryIsPublishing);
        Assert.assertEquals("(TWITTER) publish tweet on Twitter! Yay!", susanIsPublishing);
        Assert.assertEquals("(SC) publish snap on Snapchat! Yay!", gabrielleIsPublishing);

    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User mary = new Millenials("Mary Alice Young");

        //When
        String maryIsPublishing = mary.sharePost();
        System.out.println("Mary Alice prefers to:" + maryIsPublishing);
        mary.setSocialPublisher(new TwitterPublisher());
        maryIsPublishing = mary.sharePost();
        System.out.println("Mary Alice prefers to:" + maryIsPublishing);
        //Then
        Assert.assertEquals("(TWITTER) publish tweet on Twitter! Yay!", maryIsPublishing);
    }

}
