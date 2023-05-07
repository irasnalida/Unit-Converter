package length_core;
/**
 * This class contains codes for conversion from Meters into other supported Units.
 */
public class Metre {
    static double result;
    /**
     * This Function contains code to check into what unit the user want to convert.
     * @param a Stores the entered value.
     * @param unit Stores the name of unit into which the value is to be Converted.
     * @return The Converted Value
     */
    public static double unit_Checker(double a, String unit){
        if(unit.equalsIgnoreCase("kilometre")){
            result = a/1000;
            return result;
        }
        else if(unit.equalsIgnoreCase("millimetre")){
            result = a*1000;
            return result;
        }
        else if(unit.equalsIgnoreCase("centimetre")){
            result = a*100;
            return result;
        }
        else if(unit.equalsIgnoreCase("inch")){
            result = a*39.370078;
            return result;
        }
        else if(unit.equalsIgnoreCase("feet")){
            result = a*3.2808398;
            return result;
        }
        else{
            return 0;
        }
    }
}
