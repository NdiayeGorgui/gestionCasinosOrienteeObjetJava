package Joueurs;

import Casinos.Casino;
import Jeux.Jeu;
import java.util.Calendar;

public class JoueurPauvre extends Joueur {

    public JoueurPauvre() {
        this("inconnu", 10);
    }

    public JoueurPauvre(Joueur autre) {
        super(autre.nom, autre.capitalJoueur);
    }

    public JoueurPauvre(String nom, int capital) {
        super.nom = nom;
        super.capitalJoueur = capital;
        super.casino = null;
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

    public void collecterCheque() {
        System.out.println("\nJe suis un joueur pauvre, je veux collecter des fonds\n");
        Calendar calendar = Calendar.getInstance();
        if (calendar.get(Calendar.DAY_OF_MONTH) == 1) {
            System.out.println("nous sommes le premier du mois !");
            this.setCapital(this.getCapital() + 700);
            System.out.println("votre nouveau capital est de: " + this.getCapital());
        } else {
            System.out.println("Désolé nous sommes pas le premier du mois !");
        }
    }

    public int compareTo(Object obj) {
        return super.compareTo(obj);
    }

    public String toString() {
        String chaine = "je suis un joueur pauvre";
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
