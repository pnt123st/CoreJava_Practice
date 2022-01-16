package datareader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {

    public static void main(String[] args) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        String filePath = "DataReader/dataone.txt";

        try {
            fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);

            String data;
            while (   (data=bufferedReader.readLine())   !=null){
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File Not Found");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
                bufferedReader.close();

            }catch (Exception e){
                e.printStackTrace();
                System.out.println("File is closed");
            }
        }
    }
}
