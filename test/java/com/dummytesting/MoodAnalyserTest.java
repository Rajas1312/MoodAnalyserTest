package com.dummytesting;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
    @Test
    public void givenMood_WhenEmpty_ShouldReturnEmpty() {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        try {
            moodAnalyser.analyseMood("");
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.EMPTY_TYPE,e.type);
        }

    }

    @Test
    public void givenMood_WhenNull_ShouldReturnNull() {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        try {
            moodAnalyser.analyseMood(null);
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.NULL_TYPE,e.type);
        }

    }
}
