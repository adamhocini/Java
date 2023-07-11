import java.util.Random;
import java.util.Scanner;

class JustePrix {
    public static void main(String[] args) {
        Random random = new Random();
        int nombreAleatoire = random.nextInt(100) + 1; // Génère un nombre aléatoire entre 1 et 100
        int nombreTentatives = 0;
        long debutJeu = System.currentTimeMillis(); // Heure de début du jeu

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans le jeu du Juste Prix !");
        System.out.println("Devinez le nombre entre 1 et 100.");

        while (true) {
            System.out.print("Entrez votre proposition : ");
            int proposition = scanner.nextInt();
            nombreTentatives++;

            if (proposition < nombreAleatoire) {
                System.out.println("Plus grand !");
            } else if (proposition > nombreAleatoire) {
                System.out.println("Plus petit !");
            } else {
                long finJeu = System.currentTimeMillis(); // Heure de fin du jeu
                long tempsTotal = finJeu - debutJeu; // Calcul du temps écoulé en millisecondes
                double tempsEnSecondes = tempsTotal / 1000.0; // Conversion en secondes

                System.out.println("Bravo, vous avez trouvé le juste prix en " + nombreTentatives + " tentatives !");
                System.out.println("Temps écoulé : " + tempsEnSecondes + " secondes.");
                break;
            }
        }

        scanner.close();
    }
}
