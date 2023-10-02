public class StudentRunner {
    public static void main(String[] args) {
        Student stud = new Student("John", 3.5);
        System.out.printf("Name: %s%n", stud.fetchName());
        System.out.printf("GPA: %.2f%n", stud.fetchGpa());
        System.out.printf("Failing? %b%n", stud.isFailing());
        stud.setName("Jane");
        stud.setGpa(0.5);
        System.out.printf("Name: %s%n", stud.fetchName());
        System.out.printf("GPA: %.2f%n", stud.fetchGpa());
        System.out.printf("Failing? %b%n", stud.isFailing());
    }
}
