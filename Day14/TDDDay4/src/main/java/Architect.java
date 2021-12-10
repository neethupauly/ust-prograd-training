public class Architect {
    double magnitude1,magnitude2;


    Architect(double magnitude1,double magnitude2){

        this.magnitude1=magnitude1;
        this.magnitude2=magnitude2;
    }
    public double meterToCentimeter(double value){
        return 100*value;
    }

    public double centimeterToCentimeter(double value){
        return value;
    }

    public double centimeterToKilometer(double value){
        return value/100000;
    }

    public double addingMeterAndCentimeterGivesMeter(){
        return magnitude1+(magnitude2/100);

    }

    public double addingCentimeterAndKilometerGivesCentimeter(){

        return magnitude1+(magnitude2*100000);
    }

    public double subtractingMeterAndCentimeter() {
        return magnitude1-(magnitude2*100);
    }



}
