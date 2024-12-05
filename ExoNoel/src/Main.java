import decorator.GlowingToy;
import decorator.PlainToy;
import decorator.Toyy;
import decorator.VibratingToy;
import factory.FigurineFactory;
import factory.MiniCarFactory;
import factory.Toy;
import factory.ToyFactory;
import observer.LutinObservateur;
import observer.MonLutinObservateur;
import observer.SantaCity;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SantaCity santaCity = new SantaCity();
        Toyy jouet = new PlainToy();

        jouet.getDescription();

        Toyy jouetIllumine = new GlowingToy(jouet);
        System.out.println(jouetIllumine.getDescription());
        Toyy jouetVibrant = new VibratingToy(jouetIllumine);
        System.out.println(jouetVibrant.getDescription());


        LutinObservateur monLutinObservateur1 = new MonLutinObservateur("Didier");
        LutinObservateur monLutinObservateur2 = new MonLutinObservateur("Nassim");

        santaCity.addLutin(monLutinObservateur1);
        santaCity.addLutin(monLutinObservateur2);

        ToyFactory figurineFactory = new FigurineFactory();
        Toy figurine = figurineFactory.createToy();
        figurine.plays();
        santaCity.notifyLutin("Quelqu'un joue avec votre figurine.");
        santaCity.removeLutin(monLutinObservateur1);
        ToyFactory minicarFactory = new MiniCarFactory();
        Toy minicar = minicarFactory.createToy();
        minicar.plays();
        santaCity.notifyLutin("Quelqu'un joue avec votre petite voiture.");




    }
}