class Article {
    // attributs / champs
    private int reference;
    private String designation;
    private double prix;

    // accessible depuis la classe, le package et les classes Article
    public Article(int reference, String designation, double prix) {
        this.reference = reference;
        this.designation = designation;
        this.prix = prix;
    }

    // methodes
    public void setReference(int reference) {
        this.reference = reference;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setPrix (double prix) {
        this.prix = prix;
    }

    public String toString() {
        return "Article [reference=" + reference + ", designation=" + designation + ", prix=" + prix + "]";
    }

    public static void main(String[] args) {
        // Création d'un article et affichage de ses caractéristiques
        Article article = new Article(1234, "Iphone 14 pro MAX", 1499.99);
        System.out.println(article);
    }

}