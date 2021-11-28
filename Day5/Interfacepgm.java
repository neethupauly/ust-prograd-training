package Day5;

interface Bike{
    void name();
    void from();
}
class R15 implements Bike{

    @Override
    public void name() {
        System.out.println("R15");
    }
    @Override
    public void from() {
        System.out.println("Yamaha");

    }
}

class Pulsar implements Bike{

    @Override
    public void name() {
        System.out.println("Pulsar");
    }

    @Override
    public void from() {
        System.out.println("Bajaj");
    }
}

public class Interfacepgm {
    public static void main(String[] args) {
        Bike r15=new R15();
        Pulsar pulsar=new Pulsar();

        r15.name();
        r15.from();

        pulsar.name();
        pulsar.from();
    }
}