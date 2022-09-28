import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FracCalcTestCheckpoint2 {

    @Test
    void testCheckpoint2_1of4() {
        String expected = "whole:6 numerator:5 denominator:8";
        String actual = FracCalc.produceAnswerCheckpoint2("5_3/4 + 6_5/8");
        assertEquals(expected, actual);
    }

    @Test
    void testCheckpoint2_2of4() {
        String expected = "whole:20 numerator:0 denominator:1";
        String actual = FracCalc.produceAnswerCheckpoint2("-3/7 - 20");
        assertEquals(expected, actual);
    }

    @Test
    void testCheckpoint2_3of4() {
        String expected = "whole:0 numerator:27 denominator:21";
        String actual = FracCalc.produceAnswerCheckpoint2("-32 - 27/21");
        assertEquals(expected, actual);
    }

    @Test
    void testCheckpoint2_4of4() {
        String expected = "whole:-2 numerator:1 denominator:2";
        String actual = FracCalc.produceAnswerCheckpoint2("10 / -2_1/2");
        assertEquals(expected, actual);
    }

}
