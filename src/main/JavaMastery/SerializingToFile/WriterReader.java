package main.JavaMastery.SerializingToFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by chq-keving on 6/12/2017.
 */
public class WriterReader {

    public static void main(String[] args) {
        Person p1 = new Person("John", 30, "Male");
        Person p2 = new Person("Johnny", 45, "Male");

        try {
            FileOutputStream f = new FileOutputStream(new File("myObjects.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(p1);
            o.writeObject(p2);

            o.close();
            f.close();

            FileInputStream fi = new FileInputStream(new File("myObjects.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);

            Person pr1 = (Person) oi.readObject();
            Person pr2 = (Person) oi.readObject();

            System.out.println(pr1.toString());
            System.out.println(pr2.toString());

            oi.close();
            fi.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
