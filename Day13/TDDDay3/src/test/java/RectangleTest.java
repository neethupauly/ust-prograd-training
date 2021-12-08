import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rectangle;

    @Nested
    class TestArea {

        @Test
        public void checkAreaIsTenWhenLengthIsTwoAndBreadthIsFive() {
            rectangle = new Rectangle(2, 5);
            double actualArea = rectangle.area();
            double expectedArea = 10;
            assertEquals(expectedArea, actualArea);
        }

        @Test
        public void checkAreaIsThirtyWhenLengthIsFiveAndBreadthIsSix() {
            rectangle = new Rectangle(5, 6);
            double actualArea = rectangle.area();
            double expectedArea = 30;
            assertEquals(expectedArea, actualArea);
        }

        @Test
        public void checkAreaIsThirtyTwoPointSevenSixWhenLengthIsFivePointTwoAndBreadthIsSixPointThree() {
            rectangle = new Rectangle(5.2, 6.3);
            double actualArea = rectangle.area();
            double expectedArea = 32.76;
            assertEquals(expectedArea, actualArea);
        }

        @Test
        public void checkAreaIsErrorWhenLengthIsMinusTwoAndBreadthIsFive() {

            assertThrows(IllegalArgumentException.class, () -> new Rectangle(-2, 5));
        }


    }

    @Nested
    class TestPerimeter {

        @Test
        public void checkPerimeterIsFourteenWhenLengthIsTwoAndBreadthIsFive() {
            rectangle = new Rectangle(2, 5);
            double actualPerimeter = rectangle.perimeter();
            double expectedPerimeter = 14;
            assertEquals(expectedPerimeter, actualPerimeter);
        }

        @Test
        public void checkPerimeterIsFourteenWhenLengthIsFourAndBreadthIsTwo() {
            rectangle = new Rectangle(4, 2);
            double actualPerimeter = rectangle.perimeter();
            double expectedPerimeter = 12;
            assertEquals(expectedPerimeter, actualPerimeter);
        }

        @Test
        public void checkPerimeterIsElevenPointFourWhenLengthIsThreePointFourAndBreadthIsTwoPointTwo() {
            rectangle = new Rectangle(3.5, 2.2);
            double actualPerimeter = rectangle.perimeter();
            double expectedPerimeter = 11.4;
            assertEquals(expectedPerimeter, actualPerimeter);
        }
    }


}