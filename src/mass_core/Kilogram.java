package mass_core;
/**
 * This class contains codes for conversion from Kilograms into other supported Units.
 */
public class Kilogram {
    static double result;
    /**
     * This Function contains code to check into what unit the user want to convert.
     * @param a Stores the entered value.
     * @param unit Stores the name of unit into which the value is to be Converted.
     * @return The Converted Value
     */
    public static double unit_Checker(double a, String unit){
        if(unit.equalsIgnoreCase("gram")){
            result = a*1000;
            return result;
        }
        else if(unit.equalsIgnoreCase("milligram")){
            result = a*1000000;
            return result;
        }
        else if(unit.equalsIgnoreCase("ton")){
            result = a*0.000984;
            return result;
        }
        else if(unit.equalsIgnoreCase("ounce")){
            result = a*35.273961;
            return result;
        }
        else if(unit.equalsIgnoreCase("pound")){
            result = a*2.204622;
            return result;
        }
        else{
            return 0;
        }
    }
    
            
}
