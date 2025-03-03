package Adapter;

public class OldSystemLog {
    public String getSystemInfo()
    {
        return "OS: Windows, CPU: Intel Core i5";
    }

    public void SaveLog()
    {
        System.out.println("Save Log");
        System.out.println(getSystemInfo());
    }
}
