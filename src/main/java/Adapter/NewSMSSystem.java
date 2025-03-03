package Adapter;

import lombok.Setter;

@Setter
public class NewSMSSystem {
    private String content;

    public void SendSMS()
    {
        System.out.println("SMS Log");
        System.out.println(content);
    }
}
