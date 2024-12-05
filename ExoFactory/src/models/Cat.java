package models;

public class Cat implements Animal{


    @Override
    public void makeSound() {
        System.out.println("Le chat a crié son meilleur MEOOW");
    }



    @Override
    public void takeAShit() {
        int random = (int) (Math.random() * 5);

        switch (random) {
            case 0->{
                System.out.println("Putain, le chat a chié sur le mur");
            }
            case 1->{
                System.out.println("Le chat a chié dans la litière");
            }
            case 2->{
                System.out.println("Le chat a chié sur la table");
            }
            case 3->{
                System.out.println("Le chat a chié en courant");
            }
            default -> {
                System.out.println("Le chat t'a chié dessus !!!!");
            }
        }
    }
}
