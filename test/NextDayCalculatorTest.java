import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void testGetNextDay1() {
        NextDayCalculator calculator = new NextDayCalculator();
        int[] results = calculator.getNextDay(1, 1, 2018);
        int[] expected = {2, 1, 2018};
        assertArrayEquals(expected, results);
    }

    @Test
    void testGetNextDay2() {
        NextDayCalculator calculator = new NextDayCalculator();
        int[] results = calculator.getNextDay(31, 1, 2018);
        int[] expected = {1, 2, 2018};
        assertArrayEquals(expected, results);
    }

    @Test
    void testGetNextDay3() {
        NextDayCalculator calculator = new NextDayCalculator();
        int[] results = calculator.getNextDay(30, 4, 2018);
        int[] expected = {1, 5, 2018};
        assertArrayEquals(expected, results);
    }

    @Test
    void testGetNextDay4() {
        NextDayCalculator calculator = new NextDayCalculator();
        int[] results = calculator.getNextDay(28, 2, 2018);
        int[] expected = {1, 3, 2018};
        assertArrayEquals(expected, results);
    }

    @Test
    void testGetNextDay5() {
        NextDayCalculator calculator = new NextDayCalculator();
        int[] results = calculator.getNextDay(29, 2, 2020);
        int[] expected = {1, 3, 2020};
        assertArrayEquals(expected, results);
    }

    @Test
    void testGetNextDay6() {
        NextDayCalculator calculator = new NextDayCalculator();
        int[] results = calculator.getNextDay(31, 12, 2018);
        int[] expected = {1, 1, 2019};
        assertArrayEquals(expected, results);
    }
}