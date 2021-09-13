package Main;

import Joueurs.*;
import Casinos.*;
import Jeux.*;

public class TestCasino2 {

    public static void main(String[] args) {

        System.out.println("=============================================================================================");

        CasinoLegal casinoLegal = new CasinoLegal("CASINO  DE TILLEMONT", 5, 100000);

        CasinoIndien casinoIndien = new CasinoIndien("CASINO  DE ROSEMONT", 5, 100000);

        Jeu jeu1 = new JeuDeDe("Jeu de dé");
        Jeu jeu2 = new JeuPileOuFace("Jeu de pile ou face");

        Joueur joueur1 = new JoueurPauvre("salif", 3000);
        JoueurPauvre joueur11 = new JoueurPauvre("ndol", 5);
        JoueurRiche joueur2 = new JoueurRiche("djika", 4000);
        Joueur joueur3 = new JoueurRiche("amy", 500);
        JoueurPauvre joueur5 = new JoueurPauvre("baba", 4500);
        Joueur joueur4 = new JoueurRiche("jules", 9000);
        JoueurPauvre joueur6 = new JoueurPauvre("kate", 4500);
        JoueurPauvre joueur7 = new JoueurPauvre("vibe", 4500);
        Joueur joueur8 = new JoueurRiche("lipou", 9000);
        JoueurPauvre joueur9 = new JoueurPauvre("moli", 4500);

        System.out.println("\nACCES AU " + casinoLegal.getNom());
        joueur11.joindreCasino(casinoLegal);
        joueur1.joindreCasino(casinoLegal);
        joueur2.joindreCasino(casinoLegal);
        joueur3.joindreCasino(casinoLegal);
        joueur4.joindreCasino(casinoLegal);
        joueur5.joindreCasino(casinoLegal);
        joueur6.joindreCasino(casinoLegal);
        joueur7.joindreCasino(casinoLegal);

        System.out.println("=============================================================================================");
        Joueur joueurs[] = new Joueur[5];
        joueurs[0] = new JoueurRiche("ROBERT", 4000);
        joueurs[1] = new JoueurPauvre("ABDOU", 50);
        joueurs[2] = new JoueurRiche("MOUSSA", 5000);
        joueurs[3] = new JoueurPauvre("MALICK", 30);
        joueurs[4] = new JoueurRiche("VINCENT", 7000);
        System.out.println("\nACCES AU " + casinoIndien.getNom());

        for (int i = 0; i < 5; i++) {
            joueurs[i].joindreCasino(casinoIndien);

        }

        System.out.println(casinoLegal);
        System.out.println(casinoIndien);

        Jeu jeux[] = new Jeu[2];
        jeux[0] = new JeuDeDe("jeu de de");
        jeux[1] = new JeuPileOuFace("jeu pile ou face");

        System.out.println("=============================================================================================");
        System.out.println("Expulsion des joueurs les plus pauvre du " + casinoIndien.getNom() + "\n");

        casinoIndien.trierEtExpulser(2);
        System.out.println("============================================================================================");

        System.out.println("Affichage des joueurs présent dans " + casinoIndien.getNom() + "\n");
        for (int i = 0; i < 5; i++) {
            System.out.println(joueurs[i]);
        }

        System.out.println("============================================================================================");

        System.out.println("\nJEUX DES JOUEURS\n");
        casinoLegal.debutSpectacle();
        casinoLegal.finSpectacle();

        joueur1.jouer(jeu1, 500);
        joueur2.jouer(jeu2, 500);
        joueur4.jouer(jeu2, 400);
        joueurs[0].jouer(jeux[0], 100);
        joueur7.jouer(jeu2, 600);

        System.out.println("\nLe capital du casino de " + casinoLegal.getNom() + " est de " + casinoLegal.getCapital());
        System.out.println("\nLe capital du casino de " + casinoIndien.getNom() + " est de " + casinoIndien.getCapital());

        System.out.println("============================================================================================");

        System.out.println("Impots  evaluation et collecte de fonds\n");

        System.out.println(casinoLegal.collecterImpots());
        System.out.println(casinoLegal.payerImpots());
        System.out.println(casinoIndien.payerImpots());
        System.out.println(casinoLegal.evaluationMunicipale());
        joueur11.collecterCheque();

        System.out.println("=============================================================================================");
        System.out.println("Descente de la police dans le casino et joueurs riches saisies par le gouvernement\n");
        casinoIndien.descenteDePolice();
        System.out.println("");
        joueur2.banqueRoute();
        System.out.println("=============================================================================================");

        System.out.println("Comparaison des Casinos et des Joueurs\n");
        casinoLegal.equals(casinoIndien);
        casinoLegal.compareTo(casinoIndien);

        joueur1.equals(joueur2);
        joueur1.compareTo(joueur2);

        CasinoLegal casinoLegalBis = new CasinoLegal(casinoLegal);
        System.out.println(casinoLegalBis);

    }
}
