import java.time.OffsetDateTime;

public class Person {
    // Atributos da classe
    private final String name; // Nome da pessoa (não pode ser alterado após a criação)
    private int age; // Idade da pessoa
    private int lastYearAgeInc = OffsetDateTime.now().getYear(); // Ano da última vez que a idade foi incrementada

    // Construtor da classe
    public Person(String name) {
        this.name = name; // Inicializa o nome
        this.age = 1; // Inicializa a idade com 1
    }

    // Método para obter o nome da pessoa
    public String getName() {
        return name;
    }

    // Método para obter a idade da pessoa
    public int getAge() {
        return age;
    }

    // Atributo estático para teste
    private static String test;

    // Método estático para definir o valor de 'test'
    public static void setTest(String testA) {
        test = testA;
    }

    // Método estático para obter o valor de 'test'
    public static String getTest() {
        return test;
    }

    // Método para incrementar a idade da pessoa
    public void incAge(){
        // Verifica se a idade já foi incrementada este ano
        if (this.lastYearAgeInc >= OffsetDateTime.now().getYear())
        {
            return; // Se já foi incrementada este ano, não faz nada
        }
        else {
            this.age += 1; // Incrementa a idade
            this.lastYearAgeInc = OffsetDateTime.now().getYear(); // Atualiza o ano da última incrementação
        }
    }
}