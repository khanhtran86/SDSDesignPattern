package Adapter;

public class OldSystemAdapter extends OldSystemLog{
    @Override
    public void SaveLog() {
        super.SaveLog();

        String content = getSystemInfo();
        NewSMSSystem smsSystem = new NewSMSSystem();
        smsSystem.setContent(content);

        smsSystem.SendSMS();
    }
}
