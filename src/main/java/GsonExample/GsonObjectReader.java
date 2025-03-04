package GsonExample;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class GsonObjectReader {
    public static void main(String[] args) throws FileNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        File file = new File(classLoader.getResource("Employee.json").getFile());

        Gson gson = new Gson();
        FileReader jsonReader = new FileReader(file.getPath());
        Employee Obj = gson.fromJson(jsonReader, Employee.class);

        System.out.println(Obj.Fullname);
        System.out.println(Obj.Major);
        System.out.println(Obj.Experence);
    }
}
