public class Student extends Person{
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String first, String last, int age, double gpa) {
        super(first, last);
        this.name = first + " " + last;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }
    void study(){
        System.out.printf("%s is studying\n", name);
    }
    void showGPA(){
        System.out.println(this.name + "'s gpa is: "+ this.gpa);
    }
}
