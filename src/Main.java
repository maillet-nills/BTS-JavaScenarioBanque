//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    CompteBancaire c = new CompteBancaire("Martin");

    // Ajout d'une méthode pour modifier le solde privé
    c.ModifierSolde(50);

    System.out.println(c.getNom());
    System.out.println(c.getSolde());
}
