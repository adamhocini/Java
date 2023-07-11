import java.util.Random;

class NombreAleatoire {
    public static void main(String[] args) {
        Random random = new Random();
        int essais = 0;

        while (true) {
            // Génére trois nombres aléatoires entre 0 et 1000
            int nombre1 = random.nextInt(1001);
            int nombre2 = random.nextInt(1001);
            int nombre3 = random.nextInt(1001);
            essais++; // Incrémente le nombre d'essais à chaque itération

            // Vérifie si les nombres forment la combinaison recherchée
            if (nombre1 % 2 == 0 && nombre2 % 2 == 0 && nombre3 % 2 != 0) {
                // System.out.println est utilisé pour imprimer un argument qui lui est passé
                System.out.println("Combinaison trouvée !");
                System.out.println("Nombre 1 : " + nombre1);
                System.out.println("Nombre 2 : " + nombre2);
                System.out.println("Nombre 3 : " + nombre3);
                break; // Sortie de la boucle si la combinaison est trouvée
            }
        }

        System.out.println("Nombre d'essais nécessaires : " + essais);
    }
}
