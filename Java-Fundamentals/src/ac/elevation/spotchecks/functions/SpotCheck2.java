package ac.elevation.spotchecks.functions;

/**
 * @author Yogev Lidor
 * @date 13/02/2020
 */
public class SpotCheck2 {

    public static void main(String[] args) {
        String result = stringToHex("Elevation Academy", 'e');
        System.out.println(result);
    }

    public static String stringToHex(String input, char letter) {
        String alteredString = removeLetterFromText(input, letter);
        byte[] stringAsBytes = stringToBytes(alteredString);
        String hexString = byteArrayToHex(stringAsBytes);
        return hexString;
    }


    public static String removeLetterFromText(String text, char letter) {
        return text.replaceAll(Character.toString(letter), "");
    }

    public static byte[] stringToBytes(String input) {
        return input.getBytes();
    }

    public static String byteArrayToHex(byte[] byteArray) {
        StringBuffer hexStringBuffer = new StringBuffer();
        for (int i = 0; i < byteArray.length; i++) {
            hexStringBuffer.append(byteToHex(byteArray[i]));
        }
        return hexStringBuffer.toString();
    }

    public static String byteToHex(byte num) {
        char[] hexDigits = new char[2];
        hexDigits[0] = Character.forDigit((num >> 4) & 0xF, 16);
        hexDigits[1] = Character.forDigit((num & 0xF), 16);
        return new String(hexDigits);
    }
}
