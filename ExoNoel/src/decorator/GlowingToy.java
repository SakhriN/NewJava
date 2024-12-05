package decorator;

public class GlowingToy extends ToyDecorator{

    public GlowingToy(Toyy toy) {
        super(toy);
    }

    public String getDescription() {
        return super.getDescription() + ", un jouet qui illumine de 1000 feux.";
    }
}
