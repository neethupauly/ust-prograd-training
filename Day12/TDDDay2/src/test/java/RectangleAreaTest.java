import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class RectangleAreaTest {
    private Rectangle rectangle;

    @BeforeEach
    public void setup(){
        rectangle = new Rectangle();
    }

    @Nested
    public class TestingAreaOfRectangle{
        @Test
        public void rectangleAreaOfLengthFiveAndBreadthThreeGivesFifteen(){
            double answer=rectangle.areaOfRectangle(5,3);
            double expected=15;
            Assertions.assertEquals(answer,expected);
        }

        @Test
        public  void rectangleAreaOfLengthTwentyAndBreadthThirtyFiveGivesSevenHundred(){
            double answer=rectangle.areaOfRectangle(20,35);
            double expected=700;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void rectangleAreaOfLengthTwoPointFiveAndBreadthSevenPointFiveGivesEighteenPointSevenFive(){
            double answer=rectangle.areaOfRectangle(2.5,7.5);
            double expected=18.75;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void throwExceptionIfAreaOfRectangleLengthIsFiveAndBreadthIsFive(){
            Assertions.assertThrows(ArithmeticException.class,()->rectangle.areaOfRectangle(5,5));
        }
        @Test
        public void throwArithmeticExceptionIfLengthIsNegativeFiveAndBreadthIsTwo(){
            Assertions.assertThrows(ArithmeticException.class,()->rectangle.areaOfRectangle(-5,2));
        }
        @Test
        public void throwArithmeticExceptionIfLengthIsSevenAndBreadthIsMinusTwo(){
            Assertions.assertThrows(ArithmeticException.class,()->rectangle.areaOfRectangle(7,-2));
        }

    }

}
