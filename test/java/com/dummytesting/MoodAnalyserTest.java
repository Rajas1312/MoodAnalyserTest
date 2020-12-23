package com.dummytesting;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMood_MoodAnalyser_ShouldReturnSad() {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a Sad message");
        Assert.assertEquals("Sad",mood);
    }

    @Test
    public void givenMood_WhenAnyMood_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String mood =moodAnalyser.analyseMood("This is Any mood");
        Assert.assertEquals("Happy",mood);
    }
}
