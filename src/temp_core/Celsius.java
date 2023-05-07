package temp_core;
/**
 * This class contains codes for conversion from Celsius into other supported Units.
 */
public class Celsius {
    static double result;
    /**
     * This Function contains code to check into what unit the user want to convert.
     * @param a Stores the entered value.
     * @param unit Stores the name of unit into which the value is to be Converted.
     * @return The Converted Value
     */
    public static double unit_Checker(double a, String unit){
        //Celsius to Kelivin
        if(unit.equalsIgnoreCase("kelvin")){
            result = a+273.15;
            return result;
        }
        //Celsius to Fahrenheit
        else if(unit.equalsIgnoreCase("Fahrenheit")){
            result = (a*1.8)+32;
            return result;
        }
        else{
            return 0;
        }
}
}
