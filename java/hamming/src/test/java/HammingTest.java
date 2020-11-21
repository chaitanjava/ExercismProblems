import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Ignore;
import org.junit.Test;

public class HammingTest {
Hamming hamming = new Hamming();

    @Test
    public void testNoDistanceBetweenEmptyStrands() {
        assertEquals(0, hamming.hamming("",""));
    }


    @Test
    public void testNoDistanceBetweenShortIdenticalStrands() {
        assertEquals(0, hamming.hamming("A","A"));
    }

    @Ignore("Remove to run test")
    @Test
    public void testCompleteDistanceInSingleLetterDifferentStrands() {
        assertEquals(1,  hamming.hamming("G","T"));
    }

    @Ignore("Remove to run test")
    @Test
    public void testDistanceInLongIdenticalStrands() {
        assertEquals("They are completely the same", hamming.hamming("GGACTGAAATCTG", "GGACTGAAATCTG"));
    }

    @Ignore("Remove to run test")
    @Test
    public void testDistanceInLongDifferentStrands() {
        assertEquals(9, hamming.hamming("GGACGGATTCTG", "AGGACGGATTCT"));
    }

    @Ignore("Remove to run test")
    @Test
    public void testValidatesFirstStrandNotLonger() {
        IllegalArgumentException expected =
            assertThrows(
                IllegalArgumentException.class,
                () -> hamming.hamming("AATG", "AAA"));

        assertThat(expected)
            .hasMessage("leftStrand and rightStrand must be of equal length.");
    }

    @Ignore("Remove to run test")
    @Test
    public void testValidatesSecondStrandNotLonger() {
        IllegalArgumentException expected =
            assertThrows(
                IllegalArgumentException.class,
                () -> hamming.hamming("ATA", "AGTG"));

        assertThat(expected)
            .hasMessage("leftStrand and rightStrand must be of equal length.");
    }

    @Ignore("Remove to run test")
    @Test
    public void testDisallowLeftEmptyStrand() {
        IllegalArgumentException expected =
            assertThrows(
                IllegalArgumentException.class,
                () -> hamming.hamming("", "G"));

        assertThat(expected)
            .hasMessage("left strand must not be empty.");
    }

    @Ignore("Remove to run test")
    @Test
    public void testDisallowRightEmptyStrand() {
        IllegalArgumentException expected =
            assertThrows(
                IllegalArgumentException.class,
                () -> hamming.hamming("G", ""));

        assertThat(expected)
            .hasMessage("right strand must not be empty.");
    }

}
