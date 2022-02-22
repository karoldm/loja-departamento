package model;

/**
 *
 * @author karol
 */
public class Utilidades {

    public static boolean hasNull(String[] itens) {
        for (String item : itens) {
            if (item.equals("")) {
                return true;
            }
        }
        return false;
    }

    public static String randomKey(int i) {
        String theAlphaNumericS;
        StringBuilder builder;

        theAlphaNumericS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789";

        builder = new StringBuilder(i);

        for (int m = 0; m < i; m++) {
            int myindex = (int) (theAlphaNumericS.length()
                    * Math.random());
            builder.append(theAlphaNumericS
                    .charAt(myindex));
        }

        return builder.toString();
    }
}
