package decorator;

public class VibratingToy extends ToyDecorator{

    public VibratingToy(Toyy toy) {
        super(toy);
    }

public String getDescription() {
        return super.getDescription() + ", jouet vibrant tel un homme en colère qui tappe dans tous les sens.";
}
}
