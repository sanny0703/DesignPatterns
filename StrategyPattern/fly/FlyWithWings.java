package fly;

public class FlyWithWings implements  FlyBehaviour{
    @Override
    public void performFly() {
        System.out.println("I'm flying with wings");
    }
}
