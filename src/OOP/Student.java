package OOP;

public class Student {

    public String name;
    int roll;
    double percentage;

    final String SchoolName = "Bishops";
    private static int NumberOfStudents;

    // DEFAULT CONSTRUCTOR
    public Student() {

    }
    // PUBLIC CONSTRUCTOR
    public Student(String name, int roll, double percentage) {
        this.name = name;
        this.roll = roll;
        this.percentage = percentage;
        NumberOfStudents++;
    }

    public static int getNumberOfStudents(){
        return NumberOfStudents;
    }
}
//    public int getRoll(){ // getter
//        return roll;
//    }
//
//    public void setRoll(int roll){ // setter
//        this.roll = roll;
//    }

