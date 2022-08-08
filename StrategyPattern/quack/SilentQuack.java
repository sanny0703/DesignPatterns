package quack;

public class SilentQuack implements QuackBehaviour{
    @Override
    public void performQuack() {
        System.out.println("I can't Quack");
    }
}
