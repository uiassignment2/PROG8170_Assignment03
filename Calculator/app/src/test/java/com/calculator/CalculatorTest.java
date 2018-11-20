package com.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class CalculatorTest {

    @Test
    public void Addition_Input_10_10_ExpectedResult_20() {
        MainActivity obj = new MainActivity();
        int result = obj.Addition(10, 10);
        assertThat(result, is(20));
    }

    @Test
    public void Addition_Input_1000_1000_ExpectedResult_2000() {
        MainActivity obj = new MainActivity();
        int result = obj.Addition(1000, 1000);
        assertThat(result, is(2000));
    }

    @Test
    public void Addition_Input_50_0_ExpectedResult_50() {
        MainActivity obj = new MainActivity();
        int result = obj.Addition(50, 0);
        assertThat(result, is(50));
    }

    @Test
    public void Subtraction_Input_8_4_ExpectedResult_4() {
        MainActivity obj = new MainActivity();
        int result = obj.Subtraction(8, 4);
        assertThat(result, is(4));
    }

    @Test
    public void Subtraction_Input_88888_22222_ExpectedResult_66666() {
        MainActivity obj = new MainActivity();
        int result = obj.Subtraction(88888, 66666);
        assertThat(result, is(22222));
    }

    @Test
    public void Subtraction_Input_15_20_ExpectedResult_Minus_5() {
        MainActivity obj = new MainActivity();
        int result = obj.Subtraction(15, 20);
        assertThat(result, is(-5));
    }

    @Test
    public void Multiplication_Input_4_4_ExpectedResult_16() {
        MainActivity obj = new MainActivity();
        int result = obj.Multiplication(4, 4);
        assertThat(result, is(16));
    }

    @Test
    public void Multiplication_Input_60_0_ExpectedResult_0() {
        MainActivity obj = new MainActivity();
        int result = obj.Multiplication(60, 0);
        assertThat(result, is(0));
    }

    @Test
    public void Multiplication_Input_25_1_ExpectedResult_25() {
        MainActivity obj = new MainActivity();
        int result = obj.Multiplication(25, 1);
        assertThat(result, is(25));
    }

    @Test
    public void Division_Input_1_1_ExpectedResult_1() {
        MainActivity obj = new MainActivity();
        int result = obj.Division(1, 1);
        assertThat(result, is(1));
    }

    @Test
    public void Division_Input_2_1_ExpectedResult_2() {
        MainActivity obj = new MainActivity();
        int result = obj.Division(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void Division_Input_9_3_ExpectedResult_3() {
        MainActivity obj = new MainActivity();
        int result = obj.Division(9, 3);
        assertThat(result, is(3));
    }
}