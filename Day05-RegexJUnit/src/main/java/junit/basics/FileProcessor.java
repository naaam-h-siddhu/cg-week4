package junit.basics;

import java.io.*;

public class FileProcessor {


    public void writeToFile(String filepath, String content){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filepath))){
            bufferedWriter.write(content);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public String readFromFile(String filepath){

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath))){
            String line = bufferedReader.readLine();
            return  line;
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return "";
    }
}
