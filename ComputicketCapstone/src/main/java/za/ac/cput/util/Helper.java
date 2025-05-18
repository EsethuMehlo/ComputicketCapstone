package za.ac.cput.util;

public class Helper {
    public static boolean isNullorEmpty(String s){
        if (s == null || s.isEmpty()){
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
    public static boolean isValidEmail() throws UnsupportedOperationException {

        throw new UnsupportedOperationException();
    }
}
