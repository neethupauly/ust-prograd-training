import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthConverterTest {

    LengthConverter lengthConverter =new LengthConverter();


    @Nested
    class MeterToCentimeterTest {

        @Test
        public void checkOneMeterIsEqualToHundredCentimeter() {
            double actualMeter = lengthConverter.meterToCentimeter(1);
            double expectedMeter = 100;
            assertEquals(actualMeter, expectedMeter);
        }

    }

    @Nested
    class CentimeterToCentimeterTest {
        @Test
        public void checkOneCentimeterIsEqualToOneCentimeter() {
            double actualCentimeter = lengthConverter.centimeterToCentimeter(1);
            double expectedCentimeter = 1;
            assertEquals(actualCentimeter, expectedCentimeter);
        }
    }

    @Nested
    class CentimeterToKilometerTest {

        @Test
        public void checkHundredCentimeterIsEqualToZeroPointZeroZeroOneKilometer() {

            double actualKilometer = lengthConverter.centimeterToKilometer(100);
            double expectedKilometer = 0.001;
            assertEquals(actualKilometer, expectedKilometer);
        }
    }
    @Nested
    class AdditionOfMagnitude{

        @Test
        public void checkIfAdditionOfOneMeterAndHundredCentimeterGivesTwoMeters(){
            double actualMagnitude=1+ lengthConverter.centimeterToMeter(100);
            double expectedMagnitude=2;
            assertEquals(expectedMagnitude,actualMagnitude);
        }
        @Test
        public void checkIfAdditionOfTwoHundredCentimetersAndOneKilometersGivesOneLakhTwoHundredCentimeters(){
            double actualMagnitude=200+ lengthConverter.kilometerToCentimeter(1);
            double expectedMagnitude=100200;
            assertEquals(actualMagnitude,expectedMagnitude);
        }



    }
    @Nested
    class SubtractionOfMagnitude{
        @Test
        public void checkIfSubtractionOfOneMeterAndFiftyCentimeterGivesPointFiveMeters(){
            double actualMagnitude=1- lengthConverter.centimeterToMeter(50);
            double expectedMagnitude=0.5;
            assertEquals(actualMagnitude,expectedMagnitude);
        }
        @Test
        public void checkIfSubtractionOfTwoThousandCentimeterAndOneMeterGivesNineteenHundredCentimeter(){
            double actualMagnitude=2000- lengthConverter.meterToCentimeter(1);
            double expectedMagnitude=1900;
            assertEquals(actualMagnitude,expectedMagnitude);
        }
    }


}