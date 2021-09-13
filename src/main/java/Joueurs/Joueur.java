package Joueurs;

import Casinos.*;
import Jeux.Jeu;

public abstract class Joueur implements Comparable {

    protected String nom;
    protected int capitalJoueur;
    protected Casino casino;
    protected Jeu jeu;

    public Joueur() {
        this("inconnu", 10);
    }

    public Joueur(Joueur autre) {
        this(autre.nom, autre.capitalJoueur);
    }

    public Joueur(String nom, int capital) {
        this.nom = nom;
        this.capitalJoueur = capital;
        this.casino = null;
    }

    public void joindreCasino(Casino casino) {

        if (this.casino == null) {
            if (casino.ajouterJoueur(this)) {
                this.casino = casino;
            }

        } else {
            System.out.println("Je suis déjà dans un casino! Je dois le quitter avant d'en rejoindre un autre.");
        }

    }

    public void quitterCasino(Casino casino) {
        casino.enleverJoueur(nom);
        this.casino = null;
    }

    public void jouer(Jeu jeu, int mise) {
        int cap = this.capitalJoueur;
        if (this.casino == null) {
            System.out.println(this.nom + ": Je ne peux pas jouer, je ne suis pas dans un casino");
        } else if (this.capitalJoueur < mise) {
            System.out.println(this.nom + ": Je n'ai pas assez d'argent pour une telle mise!");
        } else {

            casino.setCapital(casino.getCapital() + mise);
            // System.out.println(this);
            this.capitalJoueur += casino.jouer(mise);
            if (this.capitalJoueur > cap) {
                casino.setCapital(casino.getCapital() - 2 * mise);

            }
            System.out.println("\nvotre nouveau capital est de: " + (capitalJoueur) + " $\n");
            if (this.capitalJoueur <= 0) {
                System.out.println("J'ai perdu tout mon argent, je dois quitter le casino!");
                quitterCasino(casino);
            }
        }

    }

    @Override
    public int compareTo(Object obj) {
        Joueur other = (Joueur) obj;
        // capital=100000;

        if (this.capitalJoueur > other.capitalJoueur) {
            //   System.out.println(this.nom+" est plus riche que "+other.nom);
            return 1;
        } else if (this.capitalJoueur < other.capitalJoueur) {
            // System.out.println(other.nom+" est plus riche que "+this.nom);
            return -1;
        } else if (this.capitalJoueur == other.capitalJoueur) {
            if (this.nom.compareTo(other.nom) > 0) {
                //    System.out.println(this.nom+" est plus riche que "+other.nom);
                return 1;
            } else if (this.nom.compareTo(other.nom) < 0) {
                //     System.out.println(other.nom+" est plus riche que "+this.nom);
                return -1;
            } else {
                //  System.out.println(this.nom+" a le meme capital que "+other.nom);
                return 0;
            }
        } else {
            // System.out.println(this.nom+" a le meme capital que "+other.nom);
            return 0;
        }
    }

    public String toString() {
        String chaine;

        chaine = this.nom;

        if (this.casino == null) {
            chaine += ": Je ne suis pas dans un casino";
        } else {
            chaine += ": Je suis dans le  " + this.casino.getNom() + " avec un capital de " + this.capitalJoueur;
        }

        return chaine;
    }

    public boolean equals(Joueur autre) {
        if (!this.nom.equals(autre.nom)) {
            System.out.println("Les deux Joueurs sont différents");
            return false;
        }

        if (this.capitalJoueur != autre.capitalJoueur) {
            System.out.println("Les deux Joueurs sont différents");
            return false;
        }

        System.out.println("Les deux Joueurs sont identiques");
        return true;
    }

    public String getNomJoueur() {
        return nom;
    }

    public int getCapital() {
        return capitalJoueur;
    }

    public void setCapital(int capital) {
        this.capitalJoueur = capital;

    }

    public Casino getCasino() {
        return casino;
    }

    public void setCasino(Casino casino) {
        this.casino = casino;
    }

    public Jeu getJeu() {
        return jeu;
    }

    public void setJeu(Jeu jeu) {
        this.jeu = jeu;
    }

}
