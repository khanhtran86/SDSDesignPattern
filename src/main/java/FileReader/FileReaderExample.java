package FileReader;

import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        File file = new File(classLoader.getResource("MyProfile.txt").getFile());

        //Read text from file use FileReader
        FileReader fileReader = new FileReader(file.getPath());
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while((line = bufferedReader.readLine())!=null)
        {
            System.out.println(line);
        }

        System.out.println(file.getPath());

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file.getPath()));
        bufferedWriter.write("Major: IT");
        bufferedWriter.newLine();
        bufferedWriter.write("Company: IPMac");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
