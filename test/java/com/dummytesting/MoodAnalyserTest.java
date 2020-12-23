package com.dummytesting;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMood_MoodAnalyser_ShouldReturnSad() {
        MoodAnalyser moodAnalyser=new MoodAnalyser("This is a Sad message");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("Sad",mood);
    }

    @Test
    public void givenMood_WhenAnyMood_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser=new MoodAnalyser("This is Any mood");
        String mood =moodAnalyser.analyseMood();
        Assert.assertEquals("Happy",mood);
    }
}
