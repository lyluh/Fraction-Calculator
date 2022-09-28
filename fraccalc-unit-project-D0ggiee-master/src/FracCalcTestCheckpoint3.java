import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FracCalcTestCheckpoint3 {

    @Test public void testCheckpoint3_AdditionSimple3() { assertEquals("4_3/7", r(FracCalc.produceAnswerCheckpoint3("1_1/7 + 3_2/7"))); }
    @Test public void testCheckpoint3_AdditionWholeNumbers2() { assertEquals("1", r(FracCalc.produceAnswerCheckpoint3("2/3 + 1/3"))); }
    @Test public void testCheckpoint3_AdditionWholeNumbers7() { assertEquals("1021778", r(FracCalc.produceAnswerCheckpoint3("124543 + 897235"))); }
    @Test public void testCheckpoint3_AdditionWithNegatives4() { assertEquals("-1_1/4", r(FracCalc.produceAnswerCheckpoint3("-3_3/4 + 2_2/4"))); }
    @Test public void testCheckpoint3_AdditionImproperFractionsAndReductions2() { assertEquals("1_1/20", r(FracCalc.produceAnswerCheckpoint3("4/5 + 2/8"))); }
    @Test public void testCheckpoint3_AdditionCombined4() { assertEquals("62_11/19", r(FracCalc.produceAnswerCheckpoint3("0 + 34_543/19"))); }
    @Test public void testCheckpoint3_SubtractionSimple3() { assertEquals("0", r(FracCalc.produceAnswerCheckpoint3("4_1/2 - 4_1/2"))); }
    @Test public void testCheckpoint3_SubtractionWithNegatives3() { assertEquals("-1_1/4", r(FracCalc.produceAnswerCheckpoint3("-3_3/4 - -2_2/4"))); }
    @Test public void testCheckpoint3_SubtractionCombined2() { assertEquals("8_5/21", r(FracCalc.produceAnswerCheckpoint3("-12_3/7 - -20_2/3"))); }
    @Test public void testCheckpoint3_MultiplicationBasic1() { assertEquals("3", r(FracCalc.produceAnswerCheckpoint3("1_1/2 * 2"))); }
    @Test public void testCheckpoint3_MultiplicationBasic10() { assertEquals("378/943", r(FracCalc.produceAnswerCheckpoint3("27/41 * 14/23"))); }
    @Test public void testCheckpoint3_MultiplicationBasic3() { assertEquals("164268", r(FracCalc.produceAnswerCheckpoint3("234 * 702"))); }
    @Test public void testCheckpoint3_MultiplicationWithNegatives2() { assertEquals("-8", r(FracCalc.produceAnswerCheckpoint3("-12/3 * 2/1"))); }
    @Test public void testCheckpoint3_MultiplicationWithNegatives6() { assertEquals("15_5/7", r(FracCalc.produceAnswerCheckpoint3("-3_2/3 * -4_2/7"))); }
    @Test public void testCheckpoint3_MultiplicationByZero2() { assertEquals("0", r(FracCalc.produceAnswerCheckpoint3("0 * 0"))); }
    @Test public void testCheckpoint3_MultiplicationByZero3() { assertEquals("0", r(FracCalc.produceAnswerCheckpoint3("0 * 9321"))); }
    @Test public void testCheckpoint3_MultiplicationByZero4() { assertEquals("0", r(FracCalc.produceAnswerCheckpoint3("0 * -5902"))); }
    @Test public void testCheckpoint3_MultiplicationCombined1() { assertEquals("1065_115/168", r(FracCalc.produceAnswerCheckpoint3("-32_75/16 * -27_43/21"))); }
    @Test public void testCheckpoint3_MultiplicationCombined2() { assertEquals("-15_67/943", r(FracCalc.produceAnswerCheckpoint3("1_27/41 * -3_140/23"))); }
    @Test public void testCheckpoint3_DivisionBasic1() { assertEquals("9/16", r(FracCalc.produceAnswerCheckpoint3("3/4 / 4/3"))); }
    @Test public void testCheckpoint3_DivisionBasic2() { assertEquals("2_1/4", r(FracCalc.produceAnswerCheckpoint3("3/2 / 2/3"))); }
    @Test public void testCheckpoint3_DivisionWithNegatives5() { assertEquals("-2_6/7", r(FracCalc.produceAnswerCheckpoint3("-20 / 7"))); }
    @Test public void testCheckpoint3_DivisionWithNegatives6() { assertEquals("1_13/32", r(FracCalc.produceAnswerCheckpoint3("-3_3/4 / -2_2/3"))); }
    @Test public void testCheckpoint3_DivisionWithZero5() { assertEquals("0", r(FracCalc.produceAnswerCheckpoint3("0 / 46/27"))); }
    @Test public void testCheckpoint3_DivisionWithZero6() { assertEquals("0", r(FracCalc.produceAnswerCheckpoint3("0/24 / 1/46"))); }
    @Test public void testCheckpoint3_DivisionCombined2() { assertEquals("-2_2/3", r(FracCalc.produceAnswerCheckpoint3("16/4 / -3/2"))); }
    @Test public void testCheckpoint3_DivisionCombined3() { assertEquals("6_661/5520", r(FracCalc.produceAnswerCheckpoint3("-38_3/72 / -4_82/37"))); }

    ////////////////////////////////////////////////////////////////////
    //
    //         ,-----.
    //       ,'_/_|_\_`.
    //      /<<::8[O]::>\
    //     _|-----------|_
    // :::|  | ====-=- |  |:::
    // :::|  | -=-==== |  |:::
    // :::\  | ::::|()||  /:::
    // ::::| | ....|()|| |::::
    //     | |_________| |
    //     | |\_______/| |
    //    /   \ /   \ /   \
    //    `---' `---' `---' 
    // 
    // these are not the droids you are looking for
    // 
    ////////////////////////////////////////////////////////////////////
    private static String r(String c) { String ws = "0", ns = "0", ds = "1";
        int ui = c.indexOf("_"); int fi = c.indexOf("/"); if (ui != -1) { ws = 
        c.substring(0, ui); if (fi != -1) { ns = c.substring(ui + 1, fi); ds = 
        c.substring(fi + 1); } } else if (fi != -1) { ns = c.substring(0, fi);
        ds = c.substring(fi + 1); } else { ws = c; } int w = Integer.parseInt(
        ws); int n = Integer.parseInt(ns); int d = Integer.parseInt(ds); n *= 
        (w < 0) ? -1 : 1; n += (w * d); if (n != 0) { int g = 1, i = 2; while 
        ((i <= Math.abs(n)) && (i <= Math.abs(d))) { if ((n % i == 0) && (d % 
        i == 0)) { g = i; } i++; } n /= g; d /= g; } w = n / d; n = n % d; n 
        *= (w < 0) ? -1 : 1; String t = ""; if ((w != 0) && (n != 0)) { t = 
        String.format("%d_%d/%d", w, n, d); } else if (n != 0) { t = 
        String.format("%d/%d", n, d); } else { t = String.format("%d", w); }
        return t;
    }
}
