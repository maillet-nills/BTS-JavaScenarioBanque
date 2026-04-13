public class CompteBancaire {
    private String nom;
    private float solde;

    public CompteBancaire(String nom){
        setNom(nom);
        this.solde = 0;
    }

    public void setNom(String nom) {
        if (nom != "") {
            this.nom = nom;
        }else {
            System.out.println("Le nom ne peut être vide.");
        }
    }

    public void ModifierSolde(float x){
        if (x >= 0){
            solde = x;
            System.out.println("Le solde a bien été mis à jour.");
        }else {
            System.out.println("Le solde ne doit pas être négatif.");
        }
    }

    public String getNom() {
        return nom;
    }

    public float getSolde() {
        return solde;
    }
}
