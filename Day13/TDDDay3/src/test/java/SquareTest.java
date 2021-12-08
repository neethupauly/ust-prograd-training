import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Square square;

    @Test
    public void throwExceptionWhenSideIsNegativeOrZero() {
        assertThrows(IllegalArgumentException.class, () -> new Square(-4));
    }

    @Test
    public void throwExceptionWhenSideIsZeroOrNegative() {
        assertThrows(IllegalArgumentException.class, () -> new Square(-9));

    }

    @Nested
    class AreaTest {


        @Test
        public void testAreaIsFourWhenSideIsTwo() {
            square = new Square(2);
            double actualArea = square.area();
            double expectedArea = 4;
            assertEquals(actualArea, expectedArea);
        }

        @Test
        public void testAreaIsSeventeenPointSixFourWhenSideIsFourPointTwo() {
            square = new Square(4.2);
            double actualArea = square.area();
            double expectedArea = 17.64;
            assertEquals(actualArea, expectedArea);
        }

        @Nested
        class PerimeterTest {

            @Test
            public void testPerimeterEightWhenSideIsTwo() {
                square = new Square(2);
                double actualPerimeter = square.perimeter();
                double expectedPerimeter = 8;
                assertEquals(actualPerimeter, expectedPerimeter);
            }

            @Test
            public void testPerimeterFourtyWhenSideIsTen() {
                square = new Square(10);
                double actualPerimeter = square.perimeter();
                double expectedPerimeter = 40;
                assertEquals(actualPerimeter, expectedPerimeter);
            }

            @Test
            public void testPerimeterTenWhenSideIsTwoPointFive() {
                square = new Square(2.5);
                double actualPerimeter = square.perimeter();
                double expectedPerimeter = 10;
                assertEquals(actualPerimeter, expectedPerimeter);
            }

        }

    }

}