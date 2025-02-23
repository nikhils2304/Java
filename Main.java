class University {
    static class Library {
        void displayLibraryName() {
            System.out.println("University Library");
        }
    }

    class Department {
        void displayDepartmentName() {
            System.out.println("Computer Science Department");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        University.Library library = new University.Library();
        library.displayLibraryName();

        University university = new University();
        University.Department department = university.new Department();
        department.displayDepartmentName();
    }
}
