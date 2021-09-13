package Jeux;

public class JeuDeDe extends Jeu {

    public JeuDeDe() {
        super("inconnu");
    }

    public JeuDeDe(String nomJeu) {
        super.nomJeu = nomJeu;

    }

    public JeuDeDe(Jeu autre) {
        super(autre.nomJeu);

    }

    public int calculerGain(int mise) {

        int gain;

        int deCasino1;
        int deCasino2;
        int deJoueur1;
        int deJoueur2;

        deCasino1 = (int) (Math.random() * 6) + 1;
        deCasino2 = (int) (Math.random() * 6) + 1;
        deJoueur1 = (int) (Math.random() * 6) + 1;
        deJoueur2 = (int) (Math.random() * 6) + 1;

        if ((deJoueur1 + deJoueur2) > (deCasino1 + deCasino2)) {
            gain = 2 * mise;

            System.out.println("\nFelicitation ! vous avez gagné  " + mise + " $\n");
        } else {
            gain = 0;

            System.out.println("\nDésolé ! vous avez perdu  " + mise + " $\n");
        }

        return gain;
    }

    public String toString() {
        String chaine = "\n" + super.toString();
        chaine += "je suis un jeu de Dé"
                + "\n vous lancez 2 dés et le casino lance 2 dés"
                + "\n vous gagnez l'equivalent de la mise si la somme des chiffres "
                + "\n de vos  lancés de dés est supperieur a celle du casino"
                + "\n par contre vous perdez la mise dans le cas contraitre\n";

        return chaine;
    }

    public String getNomJeu() {
        return super.getNomJeu();
    }

    public void setNomJeu(String nomJeu) {
        super.nomJeu = nomJeu;
    }

}
