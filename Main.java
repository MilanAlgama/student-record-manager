import java.util.ArrayList;

public class Main {
    static ArrayList<String> students = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Student Record Manager");
        addStudent("Alice");
        addStudent("Bob");
        viewStudents();
        deleteStudent("Alice");
        countStudents();
        searchStudent("Bob");
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

    //Delete Students
    static void deleteStudent(String name) {
        students.remove(name);
        System.out.println(name + " removed.");
    }

    //Count Students
    static void countStudents() {
        System.out.println("Total students: " + students.size());
    }

    //Search students
    static void searchStudent(String name) {
        boolean found = false;

        for (String s : students){
            if (s.equalsIgnoreCase(name)){
                System.out.println(name + " found.");
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println(name + " not found. ");
        }
        
    }
}