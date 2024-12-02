import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    static int choix = 10;

    public void Intro()
    {

        System.out.println("Bonjour dans ce merveilleux programme" +
                "\n Merci de sélectionner l'action nécessaire :" +
                "\n 1. Ajouter un contact." +
                "\n 2. Voir l'annuaire." +
                "\n 0. Quitter");
    }



    public static void main(String[] args) {
        Scanner code = new Scanner(System.in);

while(choix!=0){
    Main.Intro();
    int choix = code.nextInt();
    code.nextLine();

    switch (choix){
        case 1:
            System.out.println("Choisissez le nom du nouveau contact :");
            String nom = code.nextLine();
            System.out.println("Merci de nous donner le numéro de téléphone");
            String phone = code.nextLine();
            Person person = new Person();

            ;

            break;
            case 2:

                break;
                case 0:
                    break;
                    default:
                        break;

    }


}


};
}