public class Main3 {
    public static void main(String[] args) {

        Client client1 = new Client();

        System.out.println("----- Client Data -----");

        client1.age = 19;
        client1.name = "Joseph";
        client1.number = 155015456;
        client1.credit= 150;

        System.out.println("Age: " + client1.age + "\nName: " + client1.name + "\nNumber: " + client1.number + "\nCredit: $" + client1.credit);

        System.out.println("----- Worker Data -----");

        Worker worker1 = new Worker();
        worker1.age = 27;
        worker1.name = "Anthony";
        worker1.number = 1550457864;
        worker1.wage= 4500;

        System.out.println("Age: " + worker1.age + "\nName: " + worker1.name + "\nNumber: " + worker1.number + "\nWage: $" + worker1.wage);

    }
}

class Person {
    int age;
    String name;
    int number;
}

class Client extends Person {
    int credit;
}

class Worker extends Person {
    int wage;
}