package Jeux;

public abstract class Jeu {

    protected String nomJeu;

    public Jeu() {
        this("inconnu");
    }

    public Jeu(String nomJeu) {
        this.nomJeu = nomJeu;

    }

    public Jeu(Jeu autre) {
        this(autre.nomJeu);

    }

    public abstract int calculerGain(int mise);

    public String toString() {
        String chaine;

        chaine = "\n Présentation du jeu:\n"
                + "\n=============================================================================================\n";

        return chaine;
    }

    public boolean equals(Jeu autre) {
        if (!this.nomJeu.equals(autre.nomJeu)) {
            System.out.println("Les deux Jeux sont différents");
            return false;
        }

        System.out.println("Les deux Jeux sont identiques");
        return true;
    }

    public String getNomJeu() {
        return nomJeu;
    }

    public void setNomJeu(String nomJeu) {
        this.nomJeu = nomJeu;
    }

}
