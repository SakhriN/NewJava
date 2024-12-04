package ihm;

import animals.Bird;
import animals.Enclosure;
import animals.Mammal;
import animals.ZooManager;

import java.util.Scanner;

public class ConsoleMenu {
    public int choice=10;

    public void main(){

        Scanner scanner = new Scanner(System.in);
        ZooManager manager = new ZooManager();
        while(choice!=0){
            System.out.println("1. Créer un mammifère");
            System.out.println("2. Créer un oiseau");
            System.out.println("3. Créer un enclos");
            System.out.println("4. Voir les animaux d'un enclos");
            System.out.println("0. Fermer");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 1 :

                    System.out.println("Choisissez le nom de votre mammifère.");
                    String mname = scanner.nextLine();
                    System.out.println("Choisissez l'espèce de votre mammifère.");
                    String mspecies = scanner.nextLine();
                    Mammal mammal = manager.CreateMammal(mspecies, mname);
                    break;

                    case 2:

                        System.out.println("Choisissez le nom de votre mammifère.");
                        String bname = scanner.nextLine();
                        System.out.println("Choisissez l'espèce de votre mammifère.");
                        String bspecies = scanner.nextLine();
                        Bird bird = manager.CreateBird(bspecies, bname);

                        break;

                case 3:
                    System.out.println("Choisissez le nom de votre enclos.");
                    String ename = scanner.nextLine();
                    Enclosure enclosure = manager.CreateEnclosure(ename);
                    break;

                        case 0:
                            System.out.println("Bonne journée.");
                            break;


                            default:
                                System.out.println("Commande incorrecte.");
                                break;

            }

        }

    }







}
