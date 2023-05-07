package mass_core;
/**
 * This class contains codes for conversion from Milligrams into other supported Units.
 */
public class Milligram {
    static double result;
    /**
     * This Function contains code to check into what unit the user want to convert.
     * @param a Stores the entered value.
     * @param unit Stores the name of unit into which the value is to be Converted.
     * @return The Converted Value
     */
    public static double unit_Checker(double a, String unit){
        if(unit.equalsIgnoreCase("gram")){
            result = a*0.001;
            return result;
        }
        else if(unit.equalsIgnoreCase("kilogram")){
            result = a*0.000001;
            return result;
        }
        else if(unit.equalsIgnoreCase("ton")){
            result = a*0.00000000098421;
            return result;
        }
        else if(unit.equalsIgnoreCase("ounce")){
            result = a*0.00003527396;
            return result;
        }
        else if(unit.equalsIgnoreCase("pound")){
            result = a*0.000002204622;
            return result;
        }
        else{
            return 0;
        }
    }
    
            
}

