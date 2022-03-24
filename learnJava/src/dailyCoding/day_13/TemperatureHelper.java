package dailyCoding.day_13;

public class TemperatureHelper {
    String temperature;
    StringBuilder temperatureValue = new StringBuilder(), temperatureType = new StringBuilder();

    public TemperatureHelper(String inputTemperature){
        this.temperature = inputTemperature;
        for(int i = 0; i < temperature.length();i++){

            if(Character.isDigit(temperature.charAt(i))) {
                temperatureValue.append(temperature.charAt(i));
            }else if(Character.isAlphabetic(temperature.charAt(i))){
                temperatureType.append(temperature.charAt(i));
            }
        }
    }




}
