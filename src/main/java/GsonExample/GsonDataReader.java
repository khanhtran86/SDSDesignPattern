package GsonExample;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

public class GsonDataReader {
    public static void main(String[] args) throws FileNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        File file = new File(classLoader.getResource("Data.json").getFile());

        Gson gson = new Gson();
        Type listType = new TypeToken<List<Employee>>(){}.getType();

        FileReader jsonReader = new FileReader(file.getPath());
        List<Employee> employees = gson.fromJson(jsonReader, listType);

        for (Employee employee : employees) {
            System.out.println(employee.Fullname);
            System.out.println(employee.Major);
            System.out.println(employee.Experence);
        }
    }
}
