package GsonExample;

import com.google.gson.annotations.SerializedName;

public class Employee {
    public String Fullname;
    public String Major;

    @SerializedName("ExperenceYear")
    public int Experence;
}
