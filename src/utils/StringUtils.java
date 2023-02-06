package utils;

public class StringUtils {
    public static String capitalize(String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }

    public static String decapitalize(String string) {
        return string.substring(0, 1).toLowerCase() + string.substring(1);
    }

    public static boolean isInteger(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
