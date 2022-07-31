package helpful;

import java.text.DecimalFormat;
import java.util.Arrays;

public class ParseClass {

    public Long parserToLong (String str) {
        StringBuilder builder = new StringBuilder();
        String result = str.replaceFirst("\\,", " ");
        String[] arrayResult = result.split(" ");
        for (int i = 0; i < arrayResult.length - 1; i++) {
            builder.append(arrayResult[i]);
        }
        Long toLong = Long.parseLong(builder.toString());
        return toLong;
    }
    public String formatter (Long summ) {
        String tempString = summ.toString();

        if (tempString.length() > 11) {
            tempString = new StringBuffer(tempString.trim())
                    .insert(tempString.length(), " " + "0xE2")
                    .insert(tempString.length()-2, ",")
                    .insert(tempString.length()-5, " ")
                    .insert(tempString.length()-8, " ")
                    .insert(tempString.length()-11, " ")
                    .toString();
        }
            else if (8 <= tempString.length()) {
                tempString = new StringBuffer(tempString.trim())
                    .insert(tempString.length(), " " + "0xE2")
                    .insert(tempString.length()-2, ",")
                    .insert(tempString.length()-5, " ")
                    .insert(tempString.length()-8, " ").toString();
        }
                else if (5 >= tempString.length()) {
                    tempString = new StringBuffer(tempString.trim())
                            .insert(tempString.length(), " " + "0xE2")
                            .insert(tempString.length()-2, ",")
                            .insert(tempString.length()-5, " ")
                            .insert(tempString.length()-8, " ")
                            .insert(tempString.length()-11, " ")
                            .toString();
        }
                return tempString;
    }
}
