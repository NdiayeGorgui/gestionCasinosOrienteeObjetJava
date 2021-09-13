package Joueurs;

import Casinos.Casino;
import Jeux.Jeu;

public class JoueurRiche extends Joueur {

    public JoueurRiche() {
        this("inconnu", 1000);
    }

    public JoueurRiche(Joueur autre) {
        super(autre.nom, autre.capitalJoueur);
    }

    public JoueurRiche(String nom, int capital) {
        super.nom = nom;
        super.capitalJoueur = capital;
        super.casino = null;
    }

    public void banqueRoute() {
        if (this.casino != null) {
            this.capitalJoueur = 0;
            System.out.println("je suis un joueur riche et tout mon capital a été saisi par le gouvernement");
            this.quitterCasino(casino);
        }

    }

    public void joindreCasino(Casino casino) {
        super.joindreCasino(casino);

    }

    public void quitterCasino(Casino casino) {
        super.quitterCasino(casino);
    }

    public void jouer(Jeu jeu, int mise) {
        super.jouer(jeu, mise);
    }

    public int compareTo(Object obj) {
        return super.compareTo(obj);
    }

    public String toString() {
        String chaine = "je suis un joueur riche";
        chaine += "\n" + super.toString();
        return chaine;
    }

    public boolean equals(Joueur autre) {
        return super.equals(autre);
    }

    public String getNomJoueur() {
        return super.getNomJoueur();
    }

    public void setNomJoueur(String nom) {
        super.nom = nom;
    }

    public int getCapital() {
        return super.getCapital();
    }

    public void setCapital(int capital) {
        super.capitalJoueur = capital;
    }

    public Casino getCasino() {
        return super.getCasino();
    }

    public void setCasino(Casino casino) {
        super.casino = casino;
    }

}
