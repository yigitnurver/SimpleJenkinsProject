//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World");

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
            Thread.sleep(2000);
        }
    }
}