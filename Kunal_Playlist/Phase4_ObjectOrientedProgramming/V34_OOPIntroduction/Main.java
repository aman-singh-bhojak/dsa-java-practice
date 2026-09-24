package Kunal_Playlist.Phase4_ObjectOrientedProgramming.V34_OOPIntroduction;

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

//        Student Aman;
//        Aman = new Student();

        Student Aman = new Student(15, "Aman", 85.4f);
        Student rahul = new Student(18, "Rahul Rana", 90.3f);

//        Aman.rno = 13;
//        Aman.name = "Aman";
//        Aman.marks = 88.5f;


//        Aman.changeName("Shoe lover");
//        Aman.greeting();

//
        System.out.println(Aman.rno);
        System.out.println(Aman.name);
        System.out.println(Aman.marks);

        Student reflex = new Student(Aman);
        System.out.println(reflex.name);

        Student reflex2 = new Student();
        System.out.println(reflex2.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something something";

        System.out.println(two.name);

    }
}

class Student {
    int rno;
    String name;
    float marks = 90;

    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String name) {
        this.name = name;
    }

    Student  (Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    Student () {
        this (13, "default person", 100.0f);
    }


    // Student hritik = new Student(17, "Hritik", 89.7f);
    Student (int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
