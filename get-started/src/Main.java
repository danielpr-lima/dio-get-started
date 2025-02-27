public class Main {

    public static void main(String[] args) {
        // Cria duas instâncias da classe Person
        var male = new Person("Daniel" );
        var female = new Person("Ingrid");

        // Exibe o nome e a idade das instâncias criadas
        System.out.println("faMale name: " + male.getName() + " age: "+ male.getAge());
        System.out.println("faMale name: " + female.getName() + " age: "+ female.getAge());

        // Define o valor do atributo estático 'test' e exibe
        Person.setTest("Teste");
        System.out.println("faMale name: " + female.getName() + " age: "+ Person.getTest());
    }
}