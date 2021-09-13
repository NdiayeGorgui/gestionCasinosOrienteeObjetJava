package Casinos;

import Jeux.*;
import Joueurs.*;

public abstract class Casino implements Comparable, ImpotsFonciers {

    protected String nomCasino;
    protected Joueur[] joueurs;
    protected Jeu[] jeux;
    protected int joueursPresents;
    protected int nbjeu;
    protected Jeu jeu;
    protected int nbPlaceMax;
    protected int capital;

    public Casino() {
        this("inconnu", 10, 100000);

    }

    public Casino(Casino autre) {
        this(autre.nomCasino, autre.nbPlaceMax, autre.capital);

    }

    public Casino(String nomCasino, int nbPlaceMax, int capital) {
        this.nomCasino = nomCasino;
        this.nbPlaceMax = nbPlaceMax;
        this.capital = capital;
        joueursPresents = 0;
        this.joueurs = new Joueur[nbPlaceMax];
        this.jeux = new Jeu[2];
        this.jeux[0] = new JeuDeDe();
        this.jeux[1] = new JeuPileOuFace();
        this.jeu = new JeuDeDe();
        this.jeu = new JeuPileOuFace();
    }

    public boolean ajouterJoueur(Joueur joueur) {
        if (joueursPresents < nbPlaceMax) {
            if (joueur instanceof JoueurRiche) {
                if (joueur.getCapital() >= 1000) {
                    System.out.println("\nBienvenue " + joueur.getNomJoueur() + " !\n");
                    joueurs[joueursPresents] = joueur;
                    joueursPresents++;
                    return true;
                }
            } else if (joueur instanceof JoueurPauvre) {
                if (joueur.getCapital() >= 10) {
                    System.out.println("\nBienvenue " + joueur.getNomJoueur() + " !\n");
                    joueurs[joueursPresents] = joueur;
                    joueursPresents++;
                    return true;
                }

            }
            System.out.println("\nImpossible pour " + joueur.getNomJoueur() + " de joindre le casino, capital insuffisant\n");
            return false;

        }
        System.out.println("Le casino est plein, impossible pour " + joueur.getNomJoueur() + " d'y accéder\n");
        return false;

    }

    public void enleverJoueur(String nom) {

        int indice = chercherJoueur(nom);
        if (indice >= 0) {

            for (int i = indice; i < joueursPresents - 1; i++) {
                joueurs[i] = joueurs[i + 1];

            }
            joueursPresents--;
            System.out.println(nom + " a quitté le casino");

        } else {
            System.out.println(nom + ": je ne suis pas dans le casino");
        }

    }

    public int jouer(int mise) {

        int gain = -mise;

        gain += jeu.calculerGain(mise);
        return gain;
    }

    public int chercherJoueur(String nomJoueur) {
        int indice = -1;

        for (int i = 0; i < this.joueursPresents; i++) {
            if (this.joueurs[i].getNomJoueur().equals(nomJoueur)) {
                indice = i;
                break;
            }

        }

        return indice;
    }

    public String toString() {
        String chaine;
        chaine = "\nBienvenue au " + nomCasino + " avec un nombre de place max de: " + nbPlaceMax + " et un capital de: " + capital;
        for (int i = 0; i < 2; i++) {
            chaine += "\n" + this.jeux[i];
        }
        if (joueursPresents > 0) {
            chaine += "\nSur un maximum de " + this.joueurs.length + ", il y a " + this.joueursPresents + " joueurs présents dans le casino.";
            chaine += "\nVoici la liste des joueurs présents dans le casino : \n";

            for (int i = 0; i < joueursPresents; i++) {
                chaine += "\n" + joueurs[i];
            }
        } else {
            chaine += "\nLe casino est vide :";
        }
        return chaine;
    }

    public boolean equals(Casino autre) {

        if (this.capital != autre.capital) {
            System.out.println("Les deux Casinos sont différents");
            return false;
        }
        if (!this.nomCasino.equals(autre.nomCasino)) {
            System.out.println("Les deux Casinos sont différents");
            return false;
        }
        if (this.nbPlaceMax != (autre.nbPlaceMax)) {
            System.out.println("Les deux Casinos sont différents");
            return false;
        }

        System.out.println("Les deux Casinos sont identiques");
        return true;
    }

    @Override
    public int compareTo(Object obj) {
        Casino other = (Casino) obj;
        // capital=100000;
        for (int i = 0; i < joueursPresents; i++) {
            capital += joueurs[i].getCapital();
        }
        if (this.capital > other.capital) {
            System.out.println(this.nomCasino + " est plus riche que " + other.nomCasino);
            return 1;
        } else if (this.capital < other.capital) {
            System.out.println(other.nomCasino + " est plus riche que " + this.nomCasino);
            return -1;
        } else {
            System.out.println(this.nomCasino + " a le meme capital que " + other.nomCasino);
            return 0;
        }
    }

    public String getNom() {
        return nomCasino;
    }

    public int getNbPlaceMax() {
        return nbPlaceMax;
    }

    public int getCapital() {
        return capital;
    }

    public Joueur[] getJoueurs() {

        return joueurs;

    }

    public int getJoueursPresents() {
        return joueursPresents;
    }

    public void setNom(String nomCasino) {
        this.nomCasino = nomCasino;
    }

    public void setCapital(int capital) {

        this.capital = capital;
    }

    public void setJoueursPresents(int joueursPresents) {
        this.joueursPresents = joueursPresents;
    }

    public Jeu getJeu() {
        return jeu;
    }

    public void setJeu(Jeu jeu) {
        this.jeu = jeu;
    }

    public Jeu[] getJeux() {
        return jeux;
    }

    public void setJeux(Jeu[] jeux) {
        this.jeux = jeux;
    }

}
