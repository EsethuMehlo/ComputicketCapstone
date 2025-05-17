package za.ac.cput.util;

public class Helper {
    public static boolean isNullorEmpty(String s){
        if (s.isEmpty()|| s == null){
            return true;
        }
        return false;
    }
    public static boolean isZeroOrNull(int i){
        if (i ==0){
            return true;
        }
        return false;
    }
    public static boolean isValidEmail(){

        throw new UnsupportedOperationException();
    }
}
