package befaster.solutions.CHK;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;

public class CheckoutSolutionTest {
    private CheckoutSolution chk;

    @Before
    public void setUp() {
        chk = new CheckoutSolution();
    }

    @Test
    public void checkout_empy() {
        assertThat(chk.checkout(""), equalTo(0));
    }

    @Test
    public void checkout_invalidValue() {
        assertThat(chk.checkout("AxA"), equalTo(-1));
    }

    @Test
    public void checkout_singleItem() {
        int actualResult = chk.checkout("CDGIJLMOW");
        int expectedResult = 285;
        assertThat(chk.checkout("C"), equalTo(20));
        assertThat(chk.checkout("D"), equalTo(15));
        assertThat(chk.checkout("G"), equalTo(20));
        assertThat(chk.checkout("I"), equalTo(35));
        assertThat(chk.checkout("J"), equalTo(60));
        assertThat(chk.checkout("L"), equalTo(90));
        assertThat(chk.checkout("M"), equalTo(15));
        assertThat(chk.checkout("O"), equalTo(10));
        assertThat(chk.checkout("W"), equalTo(20));
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void checkout_singleOffer() {
        int actualResult = chk.checkout("BBKKPPPPPQQQ");
        int expectedResult = 445;
        assertThat(chk.checkout("BB"), equalTo(45));
        assertThat(chk.checkout("KK"), equalTo(120));
        assertThat(chk.checkout("PPPPP"), equalTo(200));
        assertThat(chk.checkout("QQQ"), equalTo(80));
        assertEquals(expectedResult, actualResult);


    }

    @Test
    public void checkout_singleFreeOffer() {
        int actualResult = chk.checkout("FFFUUUU");
        int expectedResult = 140;
        assertThat(chk.checkout("FFF"), equalTo(20));
        assertThat(chk.checkout("UUUU"), equalTo(120));
        assertEquals(expectedResult, actualResult);


    }

    @Test
    public void checkout_singleReplaceOffer() {
        int actualResult = chk.checkout("EEBNNNMRRRQ");
        int expectedResult = 350;
        assertThat(chk.checkout("EEB"), equalTo(80));
        assertThat(chk.checkout("NNNM"), equalTo(120));
        assertThat(chk.checkout("RRRQ"), equalTo(150));
        assertEquals(expectedResult, actualResult);


    }

    @Test
    public void checkout_mulitipleOffers() {
        int actualResult = chk.checkout("AAAAAAAAHHHHHHHHHHHHHHHVVVVV");
        int expectedResult = 675;
        assertThat(chk.checkout("AAA"), equalTo(130));
        assertThat(chk.checkout("AAAAA"), equalTo(200));
        assertThat(chk.checkout("HHHHH"), equalTo(45));
        assertThat(chk.checkout("HHHHHHHHHH"), equalTo(80));
        assertThat(chk.checkout("VV"), equalTo(90));
        assertThat(chk.checkout("VVV"), equalTo(130));
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkout_combinationOffers() {
        int actualResult = chk.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ");
        int expectedResult = 1602;
        assertThat(chk.checkout("SSS"), equalTo(45));
        assertThat(chk.checkout("SST"), equalTo(45));
        assertThat(chk.checkout("SSX"), equalTo(45));
        assertThat(chk.checkout("SSY"), equalTo(45));
        assertThat(chk.checkout("SSZ"), equalTo(45));
        assertThat(chk.checkout("STT"), equalTo(45));
        assertThat(chk.checkout("STX"), equalTo(45));
        assertThat(chk.checkout("STY"), equalTo(45));
        assertThat(chk.checkout("STZ"), equalTo(45));

        assertThat(chk.checkout("TTT"), equalTo(45));
        assertThat(chk.checkout("TTS"), equalTo(45));
        assertThat(chk.checkout("TTX"), equalTo(45));
        assertThat(chk.checkout("TTY"), equalTo(45));
        assertThat(chk.checkout("TTZ"), equalTo(45));
        assertThat(chk.checkout("TSS"), equalTo(45));
        assertThat(chk.checkout("TSX"), equalTo(45));
        assertThat(chk.checkout("TSY"), equalTo(45));
        assertThat(chk.checkout("TSZ"), equalTo(45));
        assertThat(chk.checkout("TXS"), equalTo(45));
        assertThat(chk.checkout("TXT"), equalTo(45));
        assertThat(chk.checkout("TXX"), equalTo(45));
        assertThat(chk.checkout("TXY"), equalTo(45));
        assertThat(chk.checkout("TXZ"), equalTo(45));
        assertThat(chk.checkout("TYS"), equalTo(45));
        assertThat(chk.checkout("TYT"), equalTo(45));
        assertThat(chk.checkout("TYX"), equalTo(45));
        assertThat(chk.checkout("TYY"), equalTo(45));
        assertThat(chk.checkout("TYZ"), equalTo(45));
        assertThat(chk.checkout("TZS"), equalTo(45));
        assertThat(chk.checkout("TZT"), equalTo(45));
        assertThat(chk.checkout("TZX"), equalTo(45));
        assertThat(chk.checkout("TZY"), equalTo(45));
        assertThat(chk.checkout("TZZ"), equalTo(45));

        assertThat(chk.checkout("XXX"), equalTo(45));
        assertThat(chk.checkout("XXS"), equalTo(45));
        assertThat(chk.checkout("XXY"), equalTo(45));
        assertThat(chk.checkout("XXZ"), equalTo(45));
        assertThat(chk.checkout("XSS"), equalTo(45));
        assertThat(chk.checkout("XST"), equalTo(45));
        assertThat(chk.checkout("XSX"), equalTo(45));
        assertThat(chk.checkout("XSY"), equalTo(45));
        assertThat(chk.checkout("XSZ"), equalTo(45));
        assertThat(chk.checkout("XXS"), equalTo(45));
        assertThat(chk.checkout("XXT"), equalTo(45));
        assertThat(chk.checkout("XYS"), equalTo(45));
        assertThat(chk.checkout("XYT"), equalTo(45));
        assertThat(chk.checkout("XYX"), equalTo(45));
        assertThat(chk.checkout("XYY"), equalTo(45));
        assertThat(chk.checkout("XYZ"), equalTo(45));
        assertThat(chk.checkout("XZS"), equalTo(45));
        assertThat(chk.checkout("XZT"), equalTo(45));
        assertThat(chk.checkout("XZX"), equalTo(45));
        assertThat(chk.checkout("XZY"), equalTo(45));
        assertThat(chk.checkout("XZZ"), equalTo(45));

        assertThat(chk.checkout("YXX"), equalTo(45));
        assertThat(chk.checkout("YXS"), equalTo(45));
        assertThat(chk.checkout("YXY"), equalTo(45));
        assertThat(chk.checkout("YXZ"), equalTo(45));
        assertThat(chk.checkout("YSS"), equalTo(45));
        assertThat(chk.checkout("YST"), equalTo(45));
        assertThat(chk.checkout("YSX"), equalTo(45));
        assertThat(chk.checkout("YSY"), equalTo(45));
        assertThat(chk.checkout("YSZ"), equalTo(45));
        assertThat(chk.checkout("YXS"), equalTo(45));
        assertThat(chk.checkout("YXT"), equalTo(45));
        assertThat(chk.checkout("YYS"), equalTo(45));
        assertThat(chk.checkout("YYT"), equalTo(45));
        assertThat(chk.checkout("YYX"), equalTo(45));
        assertThat(chk.checkout("YYY"), equalTo(45));
        assertThat(chk.checkout("YYZ"), equalTo(45));
        assertThat(chk.checkout("YZS"), equalTo(45));
        assertThat(chk.checkout("YZT"), equalTo(45));
        assertThat(chk.checkout("YZX"), equalTo(45));
        assertThat(chk.checkout("YZY"), equalTo(45));
        assertThat(chk.checkout("YZZ"), equalTo(45));

        assertThat(chk.checkout("ZXX"), equalTo(45));
        assertThat(chk.checkout("ZXS"), equalTo(45));
        assertThat(chk.checkout("ZXY"), equalTo(45));
        assertThat(chk.checkout("ZXZ"), equalTo(45));
        assertThat(chk.checkout("ZSS"), equalTo(45));
        assertThat(chk.checkout("ZST"), equalTo(45));
        assertThat(chk.checkout("ZSX"), equalTo(45));
        assertThat(chk.checkout("ZSY"), equalTo(45));
        assertThat(chk.checkout("ZSZ"), equalTo(45));
        assertThat(chk.checkout("ZXS"), equalTo(45));
        assertThat(chk.checkout("ZXT"), equalTo(45));
        assertThat(chk.checkout("ZYS"), equalTo(45));
        assertThat(chk.checkout("ZYT"), equalTo(45));
        assertThat(chk.checkout("ZYX"), equalTo(45));
        assertThat(chk.checkout("ZYY"), equalTo(45));
        assertThat(chk.checkout("ZYZ"), equalTo(45));
        assertThat(chk.checkout("ZZS"), equalTo(45));
        assertThat(chk.checkout("ZZT"), equalTo(45));
        assertThat(chk.checkout("ZZX"), equalTo(45));
        assertThat(chk.checkout("ZZY"), equalTo(45));
        assertThat(chk.checkout("ZZZ"), equalTo(45));

        assertEquals(expectedResult, actualResult);

    }
}
