package length_core;
/**
 * This class contains codes for conversion from Kilometers into other supported Units.
 */
public class Kilometre {
    static double result;
    /**
     * This Function contains code to check into what unit the user want to convert.
     * @param a Stores the entered value.
     * @param unit Stores the name of unit into which the value is to be Converted.
     * @return The Converted Value
     */
    public static double unit_Checker(double a, String unit){
        if(unit.equalsIgnoreCase("metre")){
            result = a*1000;
            return result;
        }
        else if(unit.equalsIgnoreCase("millimetre")){
            result = a*1000000;
            return result;
        }
        else if(unit.equalsIgnoreCase("centimetre")){
            result = a*100000;
            return result;
        }
        else if(unit.equalsIgnoreCase("inch")){
            result = a*39370.07874;
            return result;
        }
        else if(unit.equalsIgnoreCase("feet")){
            result = a*3280.839895;
            return result;
        }
        else{
            return 0;
        }
    }
}
