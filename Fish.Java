public class Fish extends Animal implements Pet {
    private String name;

    public Fish() {
        super(0);
        this.name = "Fishy";
    }

    @Override
    public void eat() {
        System.out.println("Peixe comendo.");
    }

    @Override
    public void play() {
        System.out.println("Peixe nadando brincalhão.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
