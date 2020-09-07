package ItProger;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {
	    Course [] objects = {
	            new Course(1, "Android"),
                new Course(2, "Kotlin")
        };

        try {
            FileOutputStream fos = new FileOutputStream("nameOfFile.com");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(objects);
            //oos.writeObject(kotlin);
            /*System.out.println(android);
            System.out.println(kotlin);*/

            oos.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
