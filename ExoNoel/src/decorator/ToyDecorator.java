package decorator;

import factory.Toy;

public abstract class ToyDecorator implements Toyy {
    private Toyy toy;

    public ToyDecorator(Toyy toy) {
        this.toy = toy;
    }
    public String getDescription(){
        return toy.getDescription();
    }
}
