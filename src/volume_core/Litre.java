package volume_core;  
/**
 * This class contains codes for conversion from Celsius into other supported Units.
 */
public class Litre {
    static double result;
    /**
     * This Function contains code to check into what unit the user want to convert.
     * @param a Stores the entered value.
     * @param unit Stores the name of unit into which the value is to be Converted.
     * @return The Converted Value
     */
    public static double unit_Checker(double a, String unit){
        if(unit.equalsIgnoreCase("Cubic cm")){
            result = a*1000;
            return result;
        }
        else if(unit.equalsIgnoreCase("Millilitre")){
            result =a*1000;
            return result;
        }
        else if(unit.equalsIgnoreCase("Cubic Metre")){
            result = a/1000;
            return result;
        }
        else{
            return 0;
        }
}
}
