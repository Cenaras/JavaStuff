
public class ConvertToBinary {

    public static String stringToBinary(String str) {
        String result = "";
        String tmpStr;
        int tmpInt;
        char[] messChar = str.toCharArray();

        for (int i = 0; i < messChar.length; i++) {
            tmpStr = Integer.toBinaryString(messChar[i]);
            tmpInt = tmpStr.length();
            if(tmpInt != 8) {
                tmpInt = 8 - tmpInt;
                if (tmpInt == 8) {
                    result += tmpStr;
                } else if (tmpInt > 0) {
                    for (int j = 0; j < tmpInt; j++) {
                        result += "0";
                    }
                    result += tmpStr;
                } else {
                    System.err.println("argument 'bits' is too small");
                }
            } else {
                result += tmpStr;
            }
            result += " "; // separator
        }
        return result;
    }

    String numberToBinary(double number) {
        String result = "";

        for (int i = 7; i>=0; i--) {
            if (number >= Math.pow(2, i)) {
                result+="1";
                number -= Math.pow(2, i);
            } else {
                result+="0";
            }
        }

        return result;
    }

}
