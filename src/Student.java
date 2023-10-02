public class Student {
    private String name;
    private double gpa;

    public Student(String n, double g) {
        name = n; gpa = g;
    }

    public String fetchName() {
        return name;
    }

    public double fetchGpa() {
        return gpa;
    }

    public boolean isFailing() {
        return gpa < 1;
    }

    public void setName(String n) {
        name = n;
    }

    public void setGpa(double g) {
        gpa = g;
    }
}
