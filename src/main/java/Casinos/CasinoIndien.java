package Casinos;

import Jeux.Jeu;
import Jeux.JeuDeDe;
import Jeux.JeuPileOuFace;
import Joueurs.Joueur;

public class CasinoIndien extends Casino {

    public CasinoIndien() {
        this("inconnu", 10, 100000);
    }

    public CasinoIndien(Casino autre) {
        super(autre.nomCasino, autre.nbPlaceMax, autre.capital);

    }

    public CasinoIndien(String nomCasino, int nbPlaceMax, int capital) {
        super(nomCasino, nbPlaceMax, capital);
        super.joueurs = new Joueur[nbPlaceMax];
        super.jeux = new Jeu[2];
        super.jeux[0] = new JeuDeDe();
        super.jeux[1] = new JeuPileOuFace();
        super.jeu = new JeuDeDe();
        super.jeu = new JeuPileOuFace();
        super.joueursPresents = 0;

    }

    @Override
    public double payerImpots() {
        System.out.println("Je suis un casino ilégal je ne paye pas d'impots");
        return 0;

    }

    public void descenteDePolice() {
        if (this == null) {
            System.out.println("Le casino est vide!");
        } else {
            System.out.println("La police est arrivé tout le monde fuit!");
            for (int i = 0; i < joueursPresents; i++) {

                this.joueurs[i].quitterCasino(this);
            }
        }

    }

    public Joueur[] trierJoueur(Joueur[] joueurs) {

        for (int i = 0; i < joueurs.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < joueurs.length; j++) {
                if (joueurs[j].compareTo(joueurs[index]) > 0) {
                    index = j;
                }
            }
            Joueur tmp;

            tmp = joueurs[index];
            joueurs[index] = joueurs[i];
            joueurs[i] = tmp;

        }

        return joueurs;
    }

    public void trierEtExpulser(int n) {
        this.joueurs = joueurs;
        trierJoueur(joueurs);
        for (int i = joueurs.length - 1; i >= n + 1; i--) {

            joueurs[i].quitterCasino(this);
        }
    }

    @Override
    public boolean ajouterJoueur(Joueur joueur) {
        return super.ajouterJoueur(joueur);
    }

    public void enleverJoueur(String nom) {
        super.enleverJoueur(nom);
    }

    public int chercherJoueur(String nomJoueur) {
        return super.chercherJoueur(nomJoueur);
    }

    @Override
    public double evaluationMunicipale() {
        double valTotal;
        valTotal = 1000 * joueursPresents;
        System.out.println("La valeur totale du casino est estimé a: " + valTotal);

        return valTotal;
    }

    public String toString() {
        String chaine = "je suis un casino Indien";
        chaine += "\n" + super.toString();
        return chaine;
    }

    public boolean equals(Casino autre) {
        return super.equals(autre);
    }

    @Override
    public int jouer(int mise) {

        return super.jouer(mise);

    }

    public int compareTo(Object obj) {
        return super.compareTo(obj);
    }

    public String getNom() {
        return super.getNom();
    }

    public int getNbPlaceMax() {
        return super.getNbPlaceMax();
    }

    public int getCapital() {
        return super.getCapital();
    }

    public Joueur[] getJoueurs() {

        return super.getJoueurs();

    }

    public int getJoueursPresents() {
        return super.getJoueursPresents();
    }

    public void setNom(String nomCasino) {
        super.setNom(nomCasino);
    }

    public void setCapital(int capital) {
        super.setCapital(capital);

    }

    public void setJoueursPresents(int joueursPresents) {
        super.setJoueursPresents(joueursPresents);
    }

    public Jeu[] getJeux() {
        return super.getJeux();
    }

    public void setJeux(Jeu[] jeux) {
        super.setJeux(jeux);
    }

}
