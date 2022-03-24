package dailyCoding.day_13;

public class WeightHelper {
    String inputWeight;


    public static Double weightValueIdentifier(String inputWeight){
        StringBuilder weightValue = new StringBuilder();

        for(int i = 0; i < inputWeight.length();i++){
            if(Character.isDigit(inputWeight.charAt(i))) {
                weightValue.append(inputWeight.charAt(i));
            }
        }
        return Double.parseDouble(weightValue.toString());
    }


    public static String weightTypeIdentifier(String inputWeight){
        StringBuilder weightType = new StringBuilder();
        for(int i = 0; i < inputWeight.length();i++){
            if(Character.isAlphabetic(inputWeight.charAt(i))){
                weightType.append(inputWeight.charAt(i));
            }
        }
        return weightType.toString();
    }

    public static double toMilligramConverter(String inputWeight){
        String weightTypeString = weightTypeIdentifier(inputWeight);
        double weightValueDouble = weightValueIdentifier(inputWeight);
        return switch (weightTypeString) {
            case "mg" -> weightValueDouble;
            case "g" -> weightValueDouble * 1000.0;
            case "kg" -> weightValueDouble * 1000000.0;
            default -> 0.0;
        };
    }

    public static double toGramConverter(String inputWeight){
        String weightTypeString = weightTypeIdentifier(inputWeight);
        double weightValueDouble = weightValueIdentifier(inputWeight);
        return switch (weightTypeString) {
            case "mg" -> weightValueDouble;
            case "g" -> weightValueDouble * 100.0;
            case "kg" -> weightValueDouble * 100000.0;
            default -> 0.0;
        };
    }

    public static double toKilometerConverter(String inputWeight){
        String weightTypeString = weightTypeIdentifier(inputWeight);
        double weightValueDouble = weightValueIdentifier(inputWeight);
        return switch (weightTypeString) {
            case "mg" -> weightValueDouble / 100000.0;
            case "g" -> weightValueDouble / 1000.0;
            case "kg" -> weightValueDouble;
            default -> 0.0;
        };
    }


    public static double weightCalculator(String weightOne, String weightTwo, String operation, String outputType){
        if(operation.equals("+")) {
            return switch (outputType) {
                case "cm" -> toGramConverter(weightOne) + toGramConverter(weightTwo);
                case "m" -> toMilligramConverter(weightOne) + toMilligramConverter(weightTwo);
                case "km" -> toKilometerConverter(weightOne) + toKilometerConverter(weightTwo);
                default -> 0.0;
            };
        }else if(operation.equals("-")){
            return switch (outputType) {
                case "cm" -> toGramConverter(weightOne) - toGramConverter(weightTwo);
                case "m" -> toMilligramConverter(weightOne) - toMilligramConverter(weightTwo);
                case "km" -> toKilometerConverter(weightOne) - toKilometerConverter(weightTwo);
                default -> 0.0;
            };
        }
        return 0.0;
    }
}
