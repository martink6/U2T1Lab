public class CatRunner {
    public  static void main(String[] args) {
        Cat cat1 = new Cat("Cat", 40, 100_000);
        cat1.printCatInfo();
        cat1.introduce();
        Cat cat2 = new Cat("Car", 12, 0.3);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
