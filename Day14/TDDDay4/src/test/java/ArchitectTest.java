import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArchitectTest {

    Architect architect;


    @Nested
    class MeterTest {

        @Test
        public void checkOneMeterIsEqualToHundredCentimeter() {
            double actualMeter = architect.meterToCentimeter(1);
            double expectedMeter = 100;
            assertEquals(actualMeter, expectedMeter);
        }

    }

    @Nested
    class CentimeterTest {
        @Test
        public void checkOneCentimeterIsEqualToOneCentimeter() {
            double actualCentimeter = architect.centimeterToCentimeter(1);
            double expectedCentimeter = 1;
            assertEquals(actualCentimeter, expectedCentimeter);
        }
    }

    @Nested
    class KilometerTest {

        @Test
        public void checkHundredCentimeterIsEqualToZeroPointZeroZeroOneKilometer() {

            double actualKilometer = architect.centimeterToKilometer(100);
            double expectedKilometer = 0.001;
            assertEquals(actualKilometer, expectedKilometer);
        }
    }
    @Nested
    class AdditionOfMagnitude{

        @Test
        public void checkIfAdditionOfOneMeterAndHundredCentimeterGivesTwoMeters(){
            architect=new Architect(1,100);
            double actualMagnitude=architect.addingMeterAndCentimeterGivesMeter();
            double expectedMagnitude=2;
            assertEquals(expectedMagnitude,actualMagnitude);
        }
        @Test
        public void checkIfAdditionOfTwoHundredCentimetersAndOneKilometersGivesOneLakhTwoHundredCentimeters(){
            architect=new Architect(200,1);
            double actualMagnitude=architect.addingCentimeterAndKilometerGivesCentimeter();
            double expectedMagnitude=100200;
            assertEquals(actualMagnitude,expectedMagnitude);
        }



    }
    @Nested
    class SubtractionOfMagnitude{
        @Test
        public void checkIfSubtractionOfOneMeterAndFiftyCentimeterGivesPointFiveMeters(){
            architect=new Architect(1,50);
            double actualMagnitude=architect.subtractingMeterAndCentimeter();
            double expectedMagnitude=0.5;
            assertEquals(actualMagnitude,expectedMagnitude);
        }
        @Test
        public void checkIfSubtractionOfTwoThousandCentimeterAndOneMeterGivesNineteenHundredCentimeter(){
            architect=new Architect(2000,1);
            double actualMagnitude=architect.subtractingMeterAndCentimeter();
            double expectedMagnitude=1900;
            assertEquals(actualMagnitude,expectedMagnitude);
        }
    }


}