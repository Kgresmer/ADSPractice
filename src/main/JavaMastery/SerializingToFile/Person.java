package main.JavaMastery.SerializingToFile;

import java.io.Serializable;

/**
 * Created by chq-keving on 6/12/2017.
 */
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
