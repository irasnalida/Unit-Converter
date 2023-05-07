package temp_core;
/**
 * This class contains codes for conversion from Kelvin into other supported Units.
 */
public class Kelvin {
    static double result;
    /**
     * This Function contains code to check into what unit the user want to convert.
     * @param a Stores the entered value.
     * @param unit Stores the name of unit into which the value is to be Converted.
     * @return The Converted Value
     */
    public static double unit_Checker(double a, String unit){
        if(unit.equalsIgnoreCase("celsius")){
            result = a-273.15;
            return result;
        }
        else if(unit.equalsIgnoreCase("fahrenheit")){
            result = ((a-273.15)*1.8)+32;
            return result;
        }
        else{
            return 0;
        }
}
}
