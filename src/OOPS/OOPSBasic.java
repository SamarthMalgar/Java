package OOPS;

import java.util.Scanner;

public class OOPSBasic {

        //object r the real life entities
        //class is the blueprint
        public static class Student{
            String name;
            int rno;
            double cgpa;
            String year;

            //method inside class.
            void print(){
                System.out.println(name+ " " +rno+ " " +cgpa+ " " +year);
            }

        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            //Scanner is a class.
            //sc is and object.
            Student s1 = new Student();  //creating an object
            s1.name = "Khushi";
            s1.cgpa = 4.5;
            s1.rno = 345;
            s1.year = "2nd";

            Student s2 = new Student(); //another object
            s2.name = "Tom";
            s2.rno = 23;
            s2.cgpa = 7.7;
            s2.year = sc.next();

            System.out.println(s2.year);
            System.out.println(s1.name+ " " +s1.rno+ " " +s1.cgpa+ " " +s2.name);
            s1.print();
            s2.print();

            sc.close();
        }
}
