package dailyCoding.day_13;

public class LengthHelper {
    String inputLength;


    public static Double lengthValueIdentifier(String inputLength){
        StringBuilder lengthValue = new StringBuilder();

        for(int i = 0; i < inputLength.length();i++){
            if(Character.isDigit(inputLength.charAt(i))) {
                lengthValue.append(inputLength.charAt(i));
            }
        }
        return Double.parseDouble(lengthValue.toString());
    }


    public static String lengthTypeIdentifier(String inputLength){
        StringBuilder lengthType = new StringBuilder();
        for(int i = 0; i < inputLength.length();i++){
            if(Character.isAlphabetic(inputLength.charAt(i))){
                lengthType.append(inputLength.charAt(i));
            }
        }
        return lengthType.toString();
    }

    public static double toMeterConverter(String inputLength){
        String lengthTypeString = lengthTypeIdentifier(inputLength);
        double lengthValueDouble = lengthValueIdentifier(inputLength);
        return switch (lengthTypeString) {
            case "cm" -> lengthValueDouble / 100;
            case "m" -> lengthValueDouble;
            case "km" -> lengthValueDouble * 1000;
            default -> 0.0;
        };
    }

    public static double toCentimeterConverter(String inputLength){
        String lengthTypeString = lengthTypeIdentifier(inputLength);
        double lengthValueDouble = lengthValueIdentifier(inputLength);
        return switch (lengthTypeString) {
            case "cm" -> lengthValueDouble;
            case "m" -> lengthValueDouble * 100.0;
            case "km" -> lengthValueDouble * 100000.0;
            default -> 0.0;
        };
    }

    public static double toKilometerConverter(String inputLength){
        String lengthTypeString = lengthTypeIdentifier(inputLength);
        double lengthValueDouble = lengthValueIdentifier(inputLength);
        return switch (lengthTypeString) {
            case "cm" -> lengthValueDouble / 100000.0;
            case "m" -> lengthValueDouble / 1000.0;
            case "km" -> lengthValueDouble;
            default -> 0.0;
        };
    }


public static double lengthCalculator(String lengthOne, String lengthTwo,String operation,String outputType){
        if(operation.equals("+")) {
            return switch (outputType) {
                case "cm" -> toCentimeterConverter(lengthOne) + toCentimeterConverter(lengthTwo);
                case "m" -> toMeterConverter(lengthOne) + toMeterConverter(lengthTwo);
                case "km" -> toKilometerConverter(lengthOne) + toKilometerConverter(lengthTwo);
                default -> 0.0;
            };
        }else if(operation.equals("-")){
            return switch (outputType) {
                case "cm" -> toCentimeterConverter(lengthOne) - toCentimeterConverter(lengthTwo);
                case "m" -> toMeterConverter(lengthOne) - toMeterConverter(lengthTwo);
                case "km" -> toKilometerConverter(lengthOne) - toKilometerConverter(lengthTwo);
                default -> 0.0;
            };
        }
    return 0.0;
}
}
