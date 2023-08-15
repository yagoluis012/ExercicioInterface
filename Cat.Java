public class Cat extends Animal implements Pet {
    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        this("desconhecido");
    }

    @Override
    public void eat() {
        System.out.println("Cat comendo.");
    }

    @Override
    public void play() {
        System.out.println("Gato Brincando.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

