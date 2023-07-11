public class Main {
    public static void main(String[] args) {
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

        int totalEmails = emails.length;
        int gmailCount = 0;
        int sfrCount = 0;
        int orangeCount = 0;

        for (String email : emails) {
            if (email.endsWith("@gmail.com")) {
                gmailCount++;
            } else if (email.endsWith("@sfr.com")) {
                sfrCount++;
            } else if (email.endsWith("@orange.com")) {
                orangeCount++;
            }
        }

        double gmailPercentage = (double) gmailCount / totalEmails * 100;
        double sfrPercentage = (double) sfrCount / totalEmails * 100;
        double orangePercentage = (double) orangeCount / totalEmails * 100;

        System.out.println("Pourcentage de fournisseur de service mail :");
        System.out.println("Gmail : " + gmailPercentage + "%");
        System.out.println("SFR : " + sfrPercentage + "%");
        System.out.println("Orange : " + orangePercentage + "%");
    }
}
