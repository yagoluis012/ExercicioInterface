public abstract class Animal {
    protected int pernas;

    protected Animal(int pernas) {
        this.pernas = pernas;
    }

    public abstract void eat();

    public void walk() {
        System.out.println(""Este animal anda com " + pernas + " pernas."");
    }
}
