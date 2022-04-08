package ObjectTest;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Bob", 18, true);
        Person p2 = p1;
        System.out.println(p2);
        p1.setAge(17);
        System.out.println(p2);
        p1 = new Person("Alice", 16, false);
        System.out.println(p2);
    }
}
