package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User userMillenials = new Millenials("Mkowal");
        User userYGen = new YGeneration("Ykowal");
        User userZGen = new ZGeneration("Zkowal");
        //When
        String millenialsSharePost = userMillenials.sharePost();
        System.out.println(userMillenials.getUsername() + ": " + millenialsSharePost);
        String yGenSharePost = userYGen.sharePost();
        System.out.println(userYGen.getUsername() + ": " + yGenSharePost);
        String zGenSharePost = userZGen.sharePost();
        System.out.println(userZGen.getUsername() + ": " + zGenSharePost);
        //Then
        assertEquals("communication channel: Facebook", millenialsSharePost);
        assertEquals("communication channel: Twitter", yGenSharePost);
        assertEquals("communication channel: Snapchat", zGenSharePost);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User userMillenials = new Millenials("Mkowal");
        //When
        String millenialsSharepost = userMillenials.sharePost();
        System.out.println(userMillenials.getUsername() + ": " + millenialsSharepost);
        userMillenials.setSocialPublisher(new SnapchatPublisher());
        millenialsSharepost = userMillenials.sharePost();
        System.out.println(userMillenials.getUsername() + " now share: " + millenialsSharepost);
        //Then
        assertEquals("communication channel: Snapchat", millenialsSharepost);
    }
}
