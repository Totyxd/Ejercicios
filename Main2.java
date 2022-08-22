public class Main2 {
    public static void main(String[] args) {

        Persona Juan = new Persona();

        Juan.setAge(19);
        Juan.setName("Juan Carlos");
        Juan.setPhone(381522701);

        System.out.println(Juan.getAge());
        System.out.println(Juan.getName());
        System.out.println(Juan.getPhone());

    }
}


class Persona {
    private int age;
    private String name;
    private int phone_number;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPhone(int phone_number) {
        this.phone_number = phone_number;
    }

    public int getPhone() {
        return this.phone_number;
    }

}