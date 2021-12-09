public class Architect {
    double value;


    Architect(double value){
        if(value<=0 && value!=1){
            throw new IllegalArgumentException("The centimeter should be equal to one");
        }
        this.value=value;

    }
    public double meterToCentimeter(){
        return 100*value;
    }

    public double centimeterToCentimeter(){
        return value;
    }

    public double centimeterToKilometer(){
        return value/100000;
    }

}
