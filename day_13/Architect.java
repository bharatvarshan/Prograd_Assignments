package dailyCoding.day_13;




public class Architect {
    public static void main(String[] args) {
        TemperatureHelper temperatureHelper = new TemperatureHelper("100#F");
        LengthHelper lengthHelper = new LengthHelper();
        System.out.println(lengthHelper.toMeterConverter("100cm"));
//        System.out.println(lengthHelper.lengthCalculator("200cm","1km","+","cm"));
    }
}
