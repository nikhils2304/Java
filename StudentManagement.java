import java.io.*;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class StudentManagement {
    public static void saveStudentDetails(Student student, String fileName) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(student.name + "\n" + student.age);
        }
    }

    public static Student retrieveStudentDetails(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String name = reader.readLine();
            int age = Integer.parseInt(reader.readLine());
            return new Student(name, age);
        }
    }

    public static void main(String[] args) throws IOException {
        Student student = new Student("John Doe", 20);
        String fileName = "student.txt";

        saveStudentDetails(student, fileName);
        Student retrievedStudent = retrieveStudentDetails(fileName);

        System.out.println("Name: " + retrievedStudent.name);
        System.out.println("Age: " + retrievedStudent.age);
    }
}
