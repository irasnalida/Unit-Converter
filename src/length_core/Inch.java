package length_core;
/**
 * This class contains codes for conversion from Inches into other supported Units.
 */
public class Inch {
    static double result;
    /**
     * This Function contains code to check into what unit the user want to convert.
     * @param a Stores the entered value.
     * @param unit Stores the name of unit into which the value is to be Converted.
     * @return The Converted Value
     */
    public static double unit_Checker(double a, String unit){
        if(unit.equalsIgnoreCase("kilometre")){
            result = a*0.0000254;
            return result;
        }
        else if(unit.equalsIgnoreCase("millimetre")){
            result = a*25.4;
            return result;
        }
        else if(unit.equalsIgnoreCase("centimetre")){
            result = a*2.54;
            return result;
        }
        else if(unit.equalsIgnoreCase("metre")){
            result = a*0.0254;
            return result;
        }
        else if(unit.equalsIgnoreCase("feet")){
            result = a*0.08333333;
            return result;
        }
        else{
            return 0;
        }
    }
}
