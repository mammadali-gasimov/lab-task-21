public class Human {
    public String name;
    public String surname;
    public String city;
    public int age;

    public Human(String name, String surname, String city, int age) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.age = age;
    }

    public boolean isStudent() {
        return age >= 18 && age <= 25;
    }
}
