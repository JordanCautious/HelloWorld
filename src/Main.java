import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        class Dog {
            int age;

            String bark() {
                return "WOOF!";
            }
        }
        Dog max = new Dog();
        String dogBarking = max.bark();
        System.out.println(dogBarking);

    }

    public static void sayHello(String name, int age) {
        System.out.println("Hello " + name + "!" + " It seems your age is " + age);
    }

    public static void arraynum() {
        int[] numbers = {45, 3, 57, 63, 8, 22, 78};
        for (int num: numbers) {
            System.out.print(num);
            System.out.print("-");
        }
        System.out.println("[End of Array]");
    }

    public static void fizzBuzz() {
        // FizzBuzz Exercise
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your number?: ");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("FizzBuzz!");
        } else if (number % 3 == 0) {
            System.out.println("Fizz!");
        } else if (number % 5 == 0) {
            System.out.println("Buzz!");
        } else {
            System.out.println(number);
        }
    }
}