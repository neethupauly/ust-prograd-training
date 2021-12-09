import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArchitectTest {

    Architect architect;

    @Test
    public void throwIfCentimeterIsLessThanOrEqualToZero() {
        assertThrows(IllegalArgumentException.class, () -> new Architect(-2));
    }

    @Nested
    class MeterTest {

        @Test
        public void checkOneMeterIsEqualToHundredCentimeter() {
            architect = new Architect(1);
            double actualMeter = architect.meterToCentimeter();
            double expectedMeter = 100;
            assertEquals(actualMeter, expectedMeter);
        }

    }

    @Nested
    class CentimeterTest {
        @Test
        public void checkOneCentimeterIsEqualToOneCentimeter() {
            architect = new Architect(1);
            double actualCentimeter = architect.centimeterToCentimeter();
            double expectedCentimeter = 1;
            assertEquals(actualCentimeter, expectedCentimeter);
        }
    }

    @Nested
    class KilometerTest {

        @Test
        public void checkHundredCentimeterIsEqualToZeroPointZeroZeroOneKilometer() {
            architect = new Architect(100);
            double actualKilometer = architect.centimeterToKilometer();
            double expectedKilometer = 0.001;
            assertEquals(actualKilometer, expectedKilometer);
        }
    }


}