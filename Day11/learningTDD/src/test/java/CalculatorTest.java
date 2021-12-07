import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calc;


    @BeforeEach
    public void setup() {
        calc = new Calculator();
    }

    @Nested
    public class TestingAdditionFunction {
        @Test
        public void additionOfFiveAndThreeGivesEight() {
            double answer = calc.addition(5, 3);
            double expected = 8;
            Assertions.assertEquals(answer, expected);

        }
        @Test
        public void additionOfSixAndFourGivesTen(){
            double answer=calc.addition(6,4);
            double expected=10;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void additionOfTwoAndSevenGivesNine(){
            double answer=calc.addition(2,7);
            double expected=9;
            Assertions.assertEquals(answer,expected);
        }
    }

    @Nested
    public class TestingSubtractionFunction {

        @Test
        public void fiveMinusThreeIsTwo() {
            double answer = calc.subtraction(5, 3);
            double expected = 2;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void eightMinusThreeIsFive() {
            double answer = calc.subtraction(8, 3);
            double expected = 5;
            Assertions.assertEquals(answer, expected);
        }
        @Test
        public void eightMinusTenIsMinusTwo(){
            double answer=calc.subtraction(8,10);
            double expected=-2;
            Assertions.assertEquals(answer,expected);
        }
    }

    @Nested
    public class TestingMultiplicationFunction{
        @Test
        public void twoMultipliedTwoIsFour(){
            double answer=calc.multiplication(2,2);
            double expected=4;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void sixMultiplicationEightIsFourEight(){
            double answer=calc.multiplication(6,8);
            double expected=48;
            Assertions.assertEquals(answer,expected);
        }
    }
    @Nested
    public class TestingDivisionFunction{
        @Test
        public void divisionOfTenAndTwoIsFive(){
            double answer=calc.division(10,2);
            double expected=5;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void throwsExceptionWhenDivideByZero(){
            Assertions.assertThrows(ArithmeticException.class, ()->calc.division(10,0));

        }
    }

}
