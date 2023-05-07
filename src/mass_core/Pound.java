package mass_core;
/**
 * This class contains codes for conversion from Pounds into other supported Units.
 */
public class Pound {
    static double result;
    /**
     * This Function contains code to check into what unit the user want to convert.
     * @param a Stores the entered value.
     * @param unit Stores the name of unit into which the value is to be Converted.
     * @return The Converted Value
     */
    public static double unit_Checker(double a, String unit){
        if(unit.equalsIgnoreCase("gram")){
            result = a*453.59237;
            return result;
        }
        else if(unit.equalsIgnoreCase("kilogram")){
            result = a*0.453592;
            return result;
        }
        else if(unit.equalsIgnoreCase("ton")){
            result = a*0.000446;
            return result;
        }
        else if(unit.equalsIgnoreCase("ounce")){
            result = a*16;
            return result;
        }
        else if(unit.equalsIgnoreCase("milligram")){
            result = a*453592.37;
            return result;
        }
        else{
            return 0;
        }
    }
    
            
}

