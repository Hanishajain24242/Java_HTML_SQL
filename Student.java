package org.java.itv;

// Abstraction
abstract class Person {
    abstract void role();
}

// Encapsulation + Inheritance + Abstraction
public class Student extends Person {

    private int id;
    private String name;
    private String email;
    private String phone;
    private String course;

    // Constructor
    public Student(int id, String name, String email, String phone, String course) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.course = course;
    }

    // Implement abstract method
    @Override
    void role() {
        System.out.println("Student Role: Learning");
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getCourse() { return course; }

    public void display() {
        System.out.println(id + " " + name + " " + email + " " + phone + " " + course);
    }

	public String getLastName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDob() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getGender() {
		// TODO Auto-generated method stub
		return null;
	}
}
