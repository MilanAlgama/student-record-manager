import java.util.ArrayList;

public class Main {
    static ArrayList<String> students = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Student Record Manager");
        addStudent("Alice");
        addStudent("Bob");
        viewStudents();
    }

    //Add Students
    static void addStudent(String name) {
        students.add(name);
        System.out.println(name + " added.");
    }

    //View Students
    static void viewStudents() {
        System.out.println("Student List:");
            for (String s : students) {
                System.out.println(s);
            }
    }
}