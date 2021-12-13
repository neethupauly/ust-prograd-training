public class LengthConverter {
//    double magnitude1,magnitude2;
//    Architect(double magnitude1,double magnitude2){
//
//        this.magnitude1=magnitude1;
//        this.magnitude2=magnitude2;
//    }
    public double meterToCentimeter(double LengthInMeter){
        return 100*LengthInMeter;
    }

    public double centimeterToMeter(double LengthInCentimeter){
        return LengthInCentimeter/100;
    }

    public double centimeterToCentimeter(double LengthInCentimeter){

        return LengthInCentimeter;
    }

    public double centimeterToKilometer(double LengthInCentimeter){
        return LengthInCentimeter/100000;
    }
    public double kilometerToCentimeter(double LengthInKilometer){
        return LengthInKilometer*100000;
    }

//    public double addingMeterAndCentimeterGivesMeter(){
//        return magnitude1+(magnitude2/100);
//
//    }
//
//    public double addingCentimeterAndKilometerGivesCentimeter(){
//
//        return magnitude1+(magnitude2*100000);
//    }
//
//    public double subtractingMeterAndCentimeter() {
//        return magnitude1-(magnitude2*100);
//    }

}
