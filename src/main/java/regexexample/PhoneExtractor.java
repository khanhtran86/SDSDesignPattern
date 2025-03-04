package regexexample;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneExtractor {
    public static void main(String[] args) {
        String input = "Ban co the lien he voi chung toi qua SDT 0913334445 hoac so hotline 24/24 0924448888 hoac Email: khanh.tx@live.com Chung toi se tra loi som nhat cac yeu cau cua ban.";

        //#1.
        Pattern phonePattern = Pattern.compile("09[0-9]{8}");
        //#2.
        Matcher matcher = phonePattern.matcher(input);
        List<String> foundPhoneNumbers = new ArrayList<>();

        while (matcher.find()) {
            foundPhoneNumbers.add(matcher.group()); //group() - trich xuat gia tri matched vs pattern
        }

        for (String phoneNumber : foundPhoneNumbers) {
            System.out.println(phoneNumber);
        }
    }
}
