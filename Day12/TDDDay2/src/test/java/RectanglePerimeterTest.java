import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class RectanglePerimeterTest {
    private Rectangle rectangle;

    @BeforeEach
    public void setup(){
        rectangle = new Rectangle();
    }
    @Nested
    public class TestingPerimeterOfRectangle{
        @Test
        public void rectanglePerimeterOfLengthThreeAndBreadthFiveIsThirty(){
            double answer=rectangle.perimeterOfRectangle(3,5);
            double expected=30;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void rectanglePerimeterOfLengthFiveAndBreadthSixIsSixty(){
            double answer=rectangle.perimeterOfRectangle(5,6);
            double expected=60;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void rectanglePerimeterOfLengthTwoPointFiveAndBreadthTwoPointFourIsTwelve(){
            double answer=rectangle.perimeterOfRectangle(2.5,2.4);
            double expected=12;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void throwArithmeticExceptionIfLengthIsFourAndBreadthIsFour(){
            Assertions.assertThrows(ArithmeticException.class,()->rectangle.perimeterOfRectangle(4,4));
        }
        @Test
        public void throwArithmeticExceptionIfLengthIsMinusFourAndBreadthIsFive(){
            Assertions.assertThrows(ArithmeticException.class,()->rectangle.perimeterOfRectangle(-4,5));
        }
        @Test
        public void throwArithmeticExceptionIfLengthIsThreeAndBreadthIsMinusSix(){
            Assertions.assertThrows(ArithmeticException.class,()->rectangle.perimeterOfRectangle(3,-6));
        }
    }
}
