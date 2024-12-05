package models;

public class Dog implements Animal{



    @Override
    public void makeSound() {
        System.out.println("Le chien a crié son meilleur WOOOUF");
    }

    @Override
    public void takeAShit() {
        int random = (int) (Math.random() * 5);

        switch (random) {
            case 0->{
                System.out.println("Putain, le chien a chié sur le canapé");
            }
            case 1->{
                System.out.println("Le chien a chié devant la porte");
            }
            case 2->{
                System.out.println("Le chien a chié sur la table");
            }
            case 3->{
                System.out.println("Le chien a chié en courant");
            }
            default -> {
                System.out.println("Le chien t'a chié dessus !!!!");
            }
        }
    }
}
