package temp_core;
/**
 * This class contains codes for conversion from Fahrenheit into other supported Units.
 */
public class Fahrenheit {
    static double result;
    /**
     * This Function contains code to check into what unit the user want to convert.
     * @param a Stores the entered value.
     * @param unit Stores the name of unit into which the value is to be Converted.
     * @return The Converted Value
     */
    public static double unit_Checker(double a, String unit){
        if(unit.equalsIgnoreCase("Celsius")){
            result = (a-32)/1.8;
            return result;
        }
        else if(unit.equalsIgnoreCase("kelvin")){
            result =((a-32)/1.8)+273.15;
            return result;
        }
        else{
            return 0;
        }
    }
}
