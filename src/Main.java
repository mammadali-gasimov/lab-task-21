import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Human[] humans = new Human[9];

    public static void main(String[] args) {
        for (int i = 0; i < humans.length; i++) {
            humans[i] = getData();
            if (i < 4) {
                System.out.println("The person is student: " + humans[i].isStudent());
            }
        }

        System.out.println("Enter city name:");
        getCountByCity(scanner.nextLine());
    }

    public static Human getData() {
        System.out.println("Enter name:");
        String name = scanner.nextLine();

        System.out.println("Enter surname:");
        String surname = scanner.nextLine();

        System.out.println("Enter age:");
        int age = scanner.nextInt();

        System.out.println("Enter city:");
        scanner.nextLine();
        String city = scanner.nextLine();

        return new Human(name, surname, city, age);
    }

    public static void getCountByCity(String city) {
        for (Human human : humans) {
            if (human.city.toLowerCase().contains(city.toLowerCase())) {
                System.out.println("Name is: " + human.name + " lives in " + human.city + ".");
            }
        }
    }
}