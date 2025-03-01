public class Main {
    public static void main(String[] args) {
        // Cria uma instância de Person usando o construtor secundário
        Person person1 = new Person("Daniel");
        System.out.println(person1.getInfo()); // Saída: Name: Daniel age: 1

        // Cria uma instância de Person usando o construtor principal
        Person person2 = new Person("Ingrid", 30);
        System.out.println(person2.getInfo()); // Saída: Name: Ingrid age: 30
    }
}