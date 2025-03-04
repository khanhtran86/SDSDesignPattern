package regexexample;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static void main(String[] args) {
        List<String> phoneNumbers = Arrays.asList("0924448888", "9998886663", "1234567890");
        //1. Define Pattern object made by regex expression
        Pattern phonePattern = Pattern.compile("^09[0-9]{8}$");

        for (String phoneNumber : phoneNumbers) {
            //2. Create mater by defined pattern from #1
            Matcher matcher = phonePattern.matcher(phoneNumber);
            if(matcher.find()) {
                System.out.println(phoneNumber);
            }
        }
    }
}
