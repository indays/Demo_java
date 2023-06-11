package learnSet;


import lombok.Data;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyTreeSet {



    public static class Student{

        int age;

        String name;


        Student(int age,String name){
            this.age=age;
            this.name = name;

        }

    }

    public static void main(String[] args) {

        Student student1 = new Student(10,"student1");
        Student student2= new Student(2,"student2");
        Student student3 = new Student(4,"student3");
        Student student4 = new Student(3,"student4");
        Student student5 = new Student(32,"student5");
        Student student6 = new Student(41,"student6");
        Student student7 = new Student(16,"student7");


        Set<Student> set = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.age - o1.age;
            }
        });
        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(student4);
        set.add(student5);
        set.add(student6);
        set.add(student7);

        set.forEach(item->{
            System.out.println(item.name);
        });


    }


    public static void test01() {

    }
}
