package ItProger;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class GetObject {

    public static void main(String[] args){

        try {
            FileInputStream fis = new FileInputStream("nameOfFile.com");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Course [] objects = (Course[]) ois.readObject();
            //Course kotlin = (Course) ois.readObject();

            System.out.println(Arrays.toString(objects));
           // System.out.println(kotlin);

            ois.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
