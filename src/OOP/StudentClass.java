package OOP;

public class StudentClass {

    public static class Car{
        String name;
        String type;
        int price;
    }

    public static void fun(Student x){
        System.out.println(x.name);
    }

    public static void main(String[] args) {

        Student s1 = new Student("Krishna", 1, 100);
        System.out.println(s1.getNumberOfStudents());
        Student s2 = new Student("Rahul", 2, 98.3);
        Student s3 = new Student("Malhar", 3, 95.4);
        System.out.println(Student.getNumberOfStudents());
    }
}
