package length_core;
/**
 * This class contains codes for conversion from Millimeters into other supported Units.
 */
public class Millimetre {
    static double result;
    /**
     * This Function contains code to check into what unit the user want to convert.
     * @param a Stores the entered value.
     * @param unit Stores the name of unit into which the value is to be Converted.
     * @return The Converted Value
     */
    public static double unit_Checker(double a, String unit){
        if(unit.equalsIgnoreCase("kilometre")){
            result = a/1000000;
            return result;
        }
        else if(unit.equalsIgnoreCase("metre")){
            result = a/1000;
            return result;
        }
        else if(unit.equalsIgnoreCase("centimetre")){
            result = a/10;
            return result;
        }
        else if(unit.equalsIgnoreCase("inch")){
            result = a*0.03937007;
            return result;
        }
        else if(unit.equalsIgnoreCase("feet")){
            result = a*0.00328083;
            return result;
        }
        else{
            return 0;
        }
    }
}