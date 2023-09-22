// Cat class definition
public class Cat {

    // instance variables
    private String name;
    private int age;
    private double weight;

    // constructor
    public Cat(String catName, int catAge, double catWeight) {
        name = catName;
        age = catAge;
        weight = catWeight;
    }

    // method that introduces the Cat
    public void introduce() {
        String ageStr = "";
        if (age < 7) {
            ageStr = " and i am a younger cat";
        } else {
            ageStr = " and i am a older cat";
        }
        System.out.println("Hello my name is " + name + ageStr);
    }

    // method that prints Cat info
    public void printCatInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }
}



