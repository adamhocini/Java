public class Main {
    public static void main(String[] args) {
        // Définition du tableau contenant les adresses e-mail
        String[] emails = {
                "fzne@gmail.com",
                "zejnfzj@sfr.com",
                "tom@sfr.com",
                "evan@sfr.com",
                "zefn@gmail.com",
                "helodi@orange.com",
                "hello@sfr.com",
                "ttpv@gmail.com",
                "sttmz@sfr.com",
                "didier@gmail.com"
        };

        // Appel de la fonction pour calculer les % des fournisseurs
        calculateEmailProviderPercentages(emails);
    }

    // Fonction pour calculer les pourcentages des fournisseurs de services de messagerie
    public static void calculateEmailProviderPercentages(String[] emails) {
        // Nombre total d'e-mails
        int totalEmails = emails.length;

        // Compteurs pour les fournisseurs de services de messagerie
        int gmailCount = 0;
        int sfrCount = 0;
        int orangeCount = 0;

        // Parcours de chaque adresse e-mail dans le tableau
        for (String email : emails) {
            if (email.endsWith("@gmail.com")) {
                // Si l'adresse se termine par "@gmail.com", on incrémente le compteur pour Gmail
                gmailCount++;
            } else if (email.endsWith("@sfr.com")) {
                // Si l'adresse se termine par "@sfr.com", on incrémente le compteur pour SFR
                sfrCount++;
            } else if (email.endsWith("@orange.com")) {
                // Si l'adresse se termine par "@orange.com", on incrémente le compteur pour Orange
                orangeCount++;
            }
        }

        // Calcul des pourcentages pour chaque fournisseur
        double gmailPercentage = (double) gmailCount / totalEmails * 100;
        double sfrPercentage = (double) sfrCount / totalEmails * 100;
        double orangePercentage = (double) orangeCount / totalEmails * 100;

        // Affichage des pourcentages correspondants
        System.out.println("Pourcentage de fournisseur de service mail :");
        System.out.println("Gmail : " + gmailPercentage + "%");
        System.out.println("SFR : " + sfrPercentage + "%");
        System.out.println("Orange : " + orangePercentage + "%");
    }
}
