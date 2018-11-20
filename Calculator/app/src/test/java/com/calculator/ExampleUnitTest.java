package com.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {


    @Test
    public void addTestOne() {
        MainActivity obj = new MainActivity();
        int result = obj.onAdd(10, 10);
        assertThat(result, is(20));
    }

    @Test
    public void addTestTwo() {
        MainActivity obj = new MainActivity();
        int result = obj.onAdd(-25, 10);
        assertThat(result, is(-15));
    }

    @Test
    public void addTestThree() {
        MainActivity obj = new MainActivity();
        int result = obj.onAdd(3, -4);
        assertThat(result, is(-1));
    }

    @Test
    public void subtractTestOne() {
        MainActivity obj = new MainActivity();
        int result = obj.onSubtract(5, 10);
        assertThat(result, is(-5));
    }

    @Test
    public void subtractTestTwo() {
        MainActivity obj = new MainActivity();
        int result = obj.onSubtract(-25, 10);
        assertThat(result, is(-35));
    }

    @Test
    public void subtractTestThree() {
        MainActivity obj = new MainActivity();
        int result = obj.onSubtract(13, -4);
        assertThat(result, is(17));
    }

    @Test
    public void multiplyTestOne() {
        MainActivity obj = new MainActivity();
        int result = obj.onMultiply(-5, 10);
        assertThat(result, is(-50));
    }

    @Test
    public void multiplyTestTwo() {
        MainActivity obj = new MainActivity();
        int result = obj.onMultiply(-0, -0);
        assertThat(result, is(0));
    }

    @Test
    public void multiplyTestThree() {
        MainActivity obj = new MainActivity();
        int result = obj.onMultiply(1, -4);
        assertThat(result, is(-4));
    }

    @Test
    public void divideTestOne() {
        MainActivity obj = new MainActivity();
        int result = obj.onDivide(15, 5);
        assertThat(result, is(3));
    }

    @Test
    public void divideTestTwo() {
        MainActivity obj = new MainActivity();
        int result = obj.onDivide(3, 3);
        assertThat(result, is(1));
    }

    @Test
    public void divideTestThree() {
        MainActivity obj = new MainActivity();
        int result = obj.onDivide(10, 2);
        assertThat(result, is(5));
    }
}