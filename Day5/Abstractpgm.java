package Day5;

abstract  class Fruits {
    abstract void name();

    abstract void colour();

    void from() {
        System.out.println("From plants and trees");
    }
}

class Apple extends Fruits{


    void from() {
        System.out.println("From Apple trees");}

    void name() {
        System.out.println("Apple");
    }

    void colour() {
        System.out.println("Red");
    }
}

class Plum extends Fruits{

    void from() {
        System.out.println("From plum trees");}

    @Override
    void name() {
        System.out.println("Plum");
    }

    @Override
    void colour() {
        System.out.println("Red");
    }
}

public class Abstractpgm{
    public static void main(String[] args) {
        Fruits apple = new Apple();
        Fruits plum= new Plum();

        apple.from();
        apple.name();
        apple.colour();
        System.out.println("\n");
        plum.from();
        plum.name();
        plum.colour();


    }
}

