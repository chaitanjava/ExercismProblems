import org.junit.Test;
import org.junit.Ignore;

import static org.junit.Assert.assertEquals;

public class SpaceAgeTest {

    private static final double MAXIMUM_DELTA = 1E-02;

    @Test
    public void ageOnEarth() {
        SpaceAge age = new SpaceAge();

        assertEquals(31.69, age.onEarth(1000000000), MAXIMUM_DELTA);
    }


    @Test
    public void ageOnMercury() {
        SpaceAge age = new SpaceAge();

        assertEquals(2.8, age.onMercury(366877686), MAXIMUM_DELTA);
    }

    @Ignore("Remove to run test")
    @Test
    public void ageOnVenus() {
        SpaceAge age = new SpaceAge();

        assertEquals(9.78, age.onVenus(189839836), MAXIMUM_DELTA);
    }

    @Ignore("Remove to run test")
    @Test
    public void ageOnMars() {
        SpaceAge age = new SpaceAge();

        assertEquals(35.88, age.onMars(2129871239L), MAXIMUM_DELTA);
    }

    @Ignore("Remove to run test")
    @Test
    public void ageOnJupiter() {
        SpaceAge age = new SpaceAge();

        assertEquals(2.41, age.onJupiter(901876382), MAXIMUM_DELTA);
    }

    @Ignore("Remove to run test")
    @Test
    public void ageOnSaturn() {
        SpaceAge age = new SpaceAge();

        assertEquals(2.15, age.onSaturn(2000000000L), MAXIMUM_DELTA);
    }

    @Ignore("Remove to run test")
    @Test
    public void ageOnUranus() {
        SpaceAge age = new SpaceAge();

        assertEquals(0.46, age.onUranus(1210123456L), MAXIMUM_DELTA);
    }

    @Ignore("Remove to run test")
    @Test
    public void ageOnNeptune() {
        SpaceAge age = new SpaceAge();

        assertEquals(0.35, age.onNeptune(1821023456L), MAXIMUM_DELTA);
    }
}
