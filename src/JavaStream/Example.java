package JavaStream;

public class Example implements TestInterface{
    public static void main(String[] args) {
        Example e = new Example();
        e.display();

    }

    @Override
    public void display() {
        System.out.println("TestInterface is called");
    }
}
