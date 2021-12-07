public class Rectangle {

    public double areaOfRectangle(double length,double breadth){
        if(length==breadth){
            throw new ArithmeticException("The rectangle sides cannot be equal");
        }
        if(length<0){
            throw new ArithmeticException("Length of the rectangle cannot be negative");
        }
        if(breadth<0){
            throw new ArithmeticException("Breadth of the rectangle cannot be negative");
        }

        return length*breadth;

    }
    public double perimeterOfRectangle(double length,double breadth){
        if(length==breadth){
            throw new ArithmeticException("The rectangle sides cannot be equal");
        }
        if(length<0){
            throw new ArithmeticException("Length of the rectangle cannot be negative");
        }
        if(breadth<0){
            throw new ArithmeticException("Breadth of the rectangle cannot be negative");

        }

        return 2*(length*breadth);

    }
}
