package mass_core;
/**
 * This class contains codes for conversion from Ounce into other supported Units.
 */
public class Ounce {
    static double result;
    /**
     * This Function contains code to check into what unit the user want to convert.
     * @param a Stores the entered value.
     * @param unit Stores the name of unit into which the value is to be Converted.
     * @return The Converted Value
     */
    public static double unit_Checker(double a, String unit){
        if(unit.equalsIgnoreCase("gram")){
            result = a*28.349523;
            return result;
        }
        else if(unit.equalsIgnoreCase("kilogram")){
            result = a*0.02835;
            return result;
        }
        else if(unit.equalsIgnoreCase("ton")){
            result = a*0.000028;
            return result;
        }
        else if(unit.equalsIgnoreCase("milligram")){
            result = a*28349.5231;
            return result;
        }
        else if(unit.equalsIgnoreCase("pound")){
            result = a*0.0625;
            return result;
        }
        else{
            return 0;
        }
    }
    
            
}

