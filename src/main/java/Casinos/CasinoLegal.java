package Casinos;

import Jeux.Jeu;
import Jeux.JeuDeDe;
import Jeux.JeuPileOuFace;
import Joueurs.Joueur;

public class CasinoLegal extends Casino {

    public CasinoLegal() {
        this("inconnu", 10, 100000);
        //super();
    }

    public CasinoLegal(Casino autre) {
        super(autre.nomCasino, autre.nbPlaceMax, autre.capital);

    }

    public CasinoLegal(String nomCasino, int nbPlaceMax, int capital) {
        super(nomCasino, nbPlaceMax, capital);
        super.joueurs = new Joueur[nbPlaceMax];
        super.jeux = new Jeu[2];
        super.jeux[0] = new JeuDeDe();
        super.jeux[1] = new JeuPileOuFace();
        super.jeu = new JeuDeDe();
        super.jeu = new JeuPileOuFace();
        super.joueursPresents = 0;
    }

    public int capitalEnGain() {

        int gain;
        gain = super.capital - 100000;

        return gain;
    }

    // on assume que le casino paye l'impot que si son gain en capital est strictement positif 
    @Override
    public double payerImpots() {
        System.out.println("Impots a payer: ");
        if (capitalEnGain() > 0) {
            return capitalEnGain() * 15 / 100;
        }
        return 0;

    }

    public double collecterImpots() {
        System.out.println("Impots collecté: ");
        double collecte = 0;
        for (int i = 0; i < joueursPresents; i++) {
            collecte += joueurs[i].getCapital() * 15 / 100;

        }
        return collecte;
    }

    @Override
    public double evaluationMunicipale() {
        System.out.println("La valeur totale du casino est estimé a: ");
        double valTotal;
        valTotal = 1000 * joueursPresents;

        return valTotal;
    }

    public boolean debutSpectacle() {

        System.out.println("Gregory Charles a commencé le spectacle au Casino! ");

        return false;
    }

    public boolean finSpectacle() {

        System.out.println("Gregory Charles a terminé le spectacle au Casino! ");
        return true;
    }

    public int jouer(int mise) {
        return super.jouer(mise);

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

    public String toString() {
        String chaine = "je suis un casino legal:";
        chaine += "\n" + super.toString();
        return chaine;
    }

    public boolean equals(Casino autre) {
        return super.equals(autre);
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
