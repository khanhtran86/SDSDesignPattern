package regexexample;

import java.util.regex.Pattern;

public class PhoneFormater {
    public static void main(String[] args) {
        String input = "Ban co the lien he voi chung toi qua SDT 0913334445 hoac so hotline 24/24 0924448888 hoac Email: khanh.tx@live.com Chung toi se tra loi som nhat cac yeu cau cua ban.";
        Pattern phonePattern = Pattern.compile("09[0-9]{8}");

        //Replace All
        String result = input.replaceAll("09[0-9]{8}", "<a href=\"tel:$0\">$0</a>");

        result = result.replaceAll("[a-z\\.]+@[a-z]{2,}.[a-z]{2,}", "<a href=\"mailto:$0\">$0</a>");
        System.out.println(result);
    }
}
