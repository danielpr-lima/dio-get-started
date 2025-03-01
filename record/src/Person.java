// Records são uma forma concisa de definir classes imutáveis em Java.
// Eles automaticamente geram métodos como equals(), hashCode(), toString(), getters, etc.
public record Person(String name, int age) {

    // Bloco de inicialização (construtor compacto).
    // Este bloco é executado antes de qualquer construtor e pode ser usado para validação ou lógica adicional.
    // No entanto, está comentado no código atual.
    /*
    public Person {
        System.out.println("============");
        System.out.println(name);
        System.out.println(age);
        System.out.println("============end");
    }
    */

    // Construtor secundário.
    // Permite criar uma instância de Person apenas com o nome, definindo a idade como 1 por padrão.
    public Person(String name) {
        this(name, 1); // Chama o construtor principal com o nome fornecido e idade 1.
    }

    // Método personalizado para obter informações sobre a pessoa.
    public String getInfo() {
        return "Name: " + name + " age: " + age;
    }
}