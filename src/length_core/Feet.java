package length_core;
/**
 * This class contains codes for conversion from Feet into other supported Units.
 */
public class Feet {
    static double result;
    /**
     * This Function contains code to check into what unit the user want to convert.
     * @param a Stores the entered value.
     * @param unit Stores the name of unit into which the value is to be Converted.
     * @return The Converted Value
     */
    public static double unit_Checker(double a, String unit){
        if(unit.equalsIgnoreCase("kilometre")){
            result = a*0.0003048;
            return result;
        }
        else if(unit.equalsIgnoreCase("millimetre")){
            result = a*304.8;
            return result;
        }
        else if(unit.equalsIgnoreCase("centimetre")){
            result = a*30.48;
            return result;
        }
        else if(unit.equalsIgnoreCase("inch")){
            result = a*12;
            return result;
        }
        else if(unit.equalsIgnoreCase("metre")){
            result = a*0.3048;
            return result;
        }
        else{
            return 0;
        }
    }
}
