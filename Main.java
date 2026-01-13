package org.java.itv;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Aarav Jain", "aaravjain12@gmail.com", "9876543210", "Science"));
        students.add(new Student(2, "Neha", "neha@gmail.com", "9876543211", "Commerce"));

        // Display students + abstraction
        for (Student s : students) {
            s.role();      // abstraction
            s.display();
        }

        // File Handling
        FileWriter fw = new FileWriter("students.txt");
        for (Student s : students) {
            fw.write(s.getId() + "," + s.getName() + "," +
                     s.getEmail() + "," + s.getPhone() + "," +
                     s.getCourse() + "\n");
        }
        fw.close();
    }
}
