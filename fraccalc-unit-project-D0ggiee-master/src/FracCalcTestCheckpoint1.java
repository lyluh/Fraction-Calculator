import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FracCalcTestCheckpoint1 {

    @Test
    void testCheckpoint1_1of4() {
        String expected = "6_5/8";
        String actual = FracCalc.produceAnswerCheckpoint1("5_3/4 + 6_5/8");
        assertEquals(expected, actual);
    }

    @Test
    void testCheckpoint1_2of4() {
        String expected = "20";
        String actual = FracCalc.produceAnswerCheckpoint1("-3/7 - 20");
        assertEquals(expected, actual);
    }

    @Test
    void testCheckpoint1_3of4() {
        String expected = "27/21";
        String actual = FracCalc.produceAnswerCheckpoint1("-32 - 27/21");
        assertEquals(expected, actual);
    }

    @Test
    void testCheckpoint1_4of4() {
        String expected = "-2_1/2";
        String actual = FracCalc.produceAnswerCheckpoint1("10 / -2_1/2");
        assertEquals(expected, actual);
    }

}
