package java9newfeatures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class TryWithResource {
    public static void main(String[] args) {
        readData("hello java");
        readDataWithNewTry("hello community");
    }

    static void readData(String data){
        Reader inputString=new StringReader(data);
        BufferedReader br=new BufferedReader(inputString);
        try(BufferedReader br1=br){
            System.out.println(br1.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static void readDataWithNewTry(String data)  {
        Reader inputString=new StringReader(data);
        BufferedReader br=new BufferedReader(inputString);
        try(br){
            System.out.println(br.readLine());
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
