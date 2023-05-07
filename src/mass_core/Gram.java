package mass_core;
/**
 * This class contains codes for conversion from Grams into other supported Units.
 */
public class Gram {
    static double result;
    /**
     * This Function contains code to check into what unit the user want to convert.
     * @param a Stores the entered value.
     * @param unit Stores the name of unit into which the value is to be Converted.
     * @return The Converted Value
     */
    public static double unit_Checker(double a, String unit){
        if(unit.equalsIgnoreCase("kilogram")){
            result = a/1000;
            return result;
        }
        else if(unit.equalsIgnoreCase("milligram")){
            result = a*1000;
            return result;
        }
        else if(unit.equalsIgnoreCase("ton")){
            result = a*0.0000009842;
            return result;
        }
        else if(unit.equalsIgnoreCase("ounce")){
            result = a*0.035274;
            return result;
        }
        else if(unit.equalsIgnoreCase("pound")){
            result = a*0.002204;
            return result;
        }
        else{
            return 0;
        }
    }
}
