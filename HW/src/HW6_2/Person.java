package HW6_2;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getName() {
        if (gender.equals("male")) return "Mr. " + this.name + " is " + this.age + " years old.";
        return "Mrs. " + this.name + " is " + this.age + " years old.";
    }

    public static void main(String[] args) {
        Person person = new Person("Garret", 36, "male");
        person.setName("Anna");
        person.setAge(36);
        person.setGender("female");
        System.out.println(person.getName());
    }
}
