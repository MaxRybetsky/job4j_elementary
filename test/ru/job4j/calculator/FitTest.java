package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenManHeight170ThenWeight80() {
        short in = 170;
        double expected = 80.5;
        double result = Fit.manWeight(in);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenManHeight180ThenWeight92() {
        short in = 180;
        double expected = 92.0;
        double result = Fit.manWeight(in);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenManHeight190ThenWeight103() {
        short in = 190;
        double expected = 103.5;
        double result = Fit.manWeight(in);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenWomanHeight150ThenWeight46() {
        short in = 150;
        double expected = 46.0;
        double result = Fit.womanWeight(in);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenWomanHeight160ThenWeight57() {
        short in = 160;
        double expected = 57.5;
        double result = Fit.womanWeight(in);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenWomanHeight170ThenWeight69() {
        short in = 170;
        double expected = 69.0;
        double result = Fit.womanWeight(in);
        Assert.assertEquals(expected, result, 0.01);
    }

}