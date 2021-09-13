package Jeux;

public class JeuPileOuFace extends Jeu {

    public JeuPileOuFace() {
        super("inconnu");
    }

    public JeuPileOuFace(String nomJeu) {
        super.nomJeu = nomJeu;

    }

    public JeuPileOuFace(Jeu autre) {
        super(autre.nomJeu);

    }

    public int calculerGain(int mise) {
        int gain;
        double resultat = Math.random();

        //pile, choix du joueur
        if (resultat < 0.5) {
            gain = 2 * mise;
            System.out.println("\nFelicitation ! vous avez gagné " + mise + " $\n");
        } else {
            gain = 0;

            System.out.println("\nDésolé ! vous avez perdu  " + mise + " $\n");
        }

        return gain;
    }

    public String toString() {
        String chaine = "\n" + super.toString();
        chaine += "je suis un jeu de Pile ou face"
                + "\n votre choix est pile  vous lancez la piece et si pile aparait"
                + "\n vous gagnez l'equivalent de la mise "
                + "\n sinon vous perdez la mise\n ";
        return chaine;
    }

    public String getNomJeu() {
        return super.getNomJeu();
    }

    public void setNomJeu(String nomJeu) {
        super.nomJeu = nomJeu;
    }

}
