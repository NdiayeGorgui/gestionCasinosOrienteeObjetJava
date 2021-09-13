# Enonce
Votre Casino fonctionne à merveille et vous commencez à récolter les fruits de votre dur labeur.
Comme tout individu au service du capitalisme, vous voulez étendre votre emprise et augmenter
vos revenus. Vous décidez de scinder la population en plusieurs types de joueurs, d'offrir deux types
de casinos ainsi que de nouveaux jeux.
Vous ne reécrirez pas tout le code à partir de 0, puisque vous maitrisez maintenant l'héritage!
Votre programme a dèja les classes suivantes: Joueur, Casino, Jeu et TestCasino. Vous devez
transformer Joueur, Casino et Jeu en des classes abstraites.
S'ajouteront les classes TestCasino2, JoueurPauvre, JoueurRiche, CasinoLegal, CasinoIndien,
PileOuFace ainsi qu'un autre jeu de votre choix.
Ces classes se retrouvent dans les paquetages Joueurs, Casinos, Jeux et Main.

1. La classe Casino:
* A un nouvel attribut: int capital. Le capital initial est de 100 000$ . Chaque fois qu'un
joueur mise, le capital est augmentée. Chaque fois qu'un joueur gagne, le capital est
diminuée.
*  implémente l'interface déja existante Comparable. Un casino est plus grand qu'un
autre si la somme du capital des joueurs présents est plus grande que celle de l'autre.
* implémente l'interface que vous écrivez ImpotsFonciers qui contient les méthodes suivantes:
  * payerImpots() : implémenté dans chacun des Casinos.
  * evaluationMunicipale : Un inspecteur vient évaluer la valeur totale du Casino :
1000$ multiplie par le nombre de joueurs présents dans le casino.
* La classe Casino ne doit pas avoir deux tableaux (un de joueurs riches et un de joueurs
pauvres): il doit seulement y avoir un tableau de Joueur (pensez au polymorphisme!).
* Pour entrer dans un Casino, un joueurPauvre doit avoir au moins 10$, alors qu'un
JoueurRiche doit avoir au moins 1000$. Cette vérifcation doit se faire dans la méthode
ajouterJoueur de Casino.
2. La classe Joueur implémente l'interface Comparable. Un joueur est plus grand qu'un autre si son capital est plus grand.
Si les deux joueurs ont le meme capital, c'est l'ordre alphabétique de leur nom qui décidera.
3. CasinoLegal hérite de Casino et offre en plus les méthodes suivantes:
* collecterImpots() : Le casino collecte 15% du capital de chacun des joueurs présents et
ne leur ore rien en compensation.
* debutSpectacle() et finSpectacle() : Gréegory Charles fait un spectacle au Casino! Personne ne veut peut manquer ca!
Lorsque debutSpetacle() est appelée, aucun joueur ne peut jouer au Casino tant que
finSpectacle() n'est pas appelée.
* implémente l'interface ImpotsFonciers de la manière suivante:
  * payerImpots() : Le Casino paie des impots représentant 15 % de son gain en capital
depuis sa mise en oeuvre ou la dernière fois qu'il a payé des impots. Un Casino
gagne de l'argent lorsq'un Joueur en perd.
* Vous devez fournir au moins deux constructeurs, le constructeur par copie, les accesseurs
et les mutateurs que vous jugez pertinents, la méthode toString et la méthode equals.
Vous ne devez pas nécessairement écrire toutes ces méthodes, pensez aux
principes de l'héritage.
4. CasinoIndien hérite de Casino et offre en plus les méthodes suivantes:
* descenteDePolice() : Tous les joueurs présents quittent le casino pour ne pas se faire
arreter.
* trierEtExpulser(int n) : Le tableau de joueurs est trié selon le capital, du plus grand au
plus petit. Les n joueurs ayant le plus petit capital sont expulsés du casino.
Vous choisissez l'algorithme de tri de votre choix 1.
* implémente l'interface ImpotsFonciers de la manière suivante:
  * payerImpots() : Le Casino ne paie rien. Il a 1 % de chance de voir 50% de son
capital saisi par Revenu Québec.
* Vous devez fournir au moins deux constructeurs, le constructeur par copie, les accesseurs
et les mutateurs que vous jugez pertinents, la mthéode toString et la méthode equals.
Vous ne devez pas nécessairement écrire toutes ces méthodes, pensez aux
principes de l'héritage.
5. JoueurPauvre hérite de Joueur et offre en plus les méthodes suivantes
* collecterCheque() : Si nous sommes le premier du mois, le joueur peut collecter un
chéque! Son capital augmente de 700$.
* Vous devez fournir au moins deux constructeurs, le constructeur par copie, les accesseurs
et les mutateurs que vous jugez pertinents, la méthode toString et la méthode equals.
Vous ne devez pas nécessairement ecrire toutes ces méthodes, pensez aux
principes de l'héritage.
6. JoueurRiche hérite de Joueur et offre en plus plus les méthodes suivantes
* banqueRoute() : Les investissements à l'étranger du joueur sont saisis par le gouvernement et ses comptes dans les paradis fiscaux sont fermés. Le capital tombe à 0 et le
joueur quitte le casino, s'il est dans un casino.
* Vous devez fournir au moins deux constructeurs, le constructeur par copie, les accesseurs
et les mutateurs que vous jugez pertinents, la méthode toString et la méthode equals.
Vous ne devez pas nécessairement écrire toutes ces méthodes, pensez aux
principes de l'héritage.
7. Dans la classe Jeu, la méthode calculerGains(mise) doit etre abstraite.
* Ici, vous implémentez le jeu de hasard de votre choix, avec la
table des gains que vous voulez. Vous devez utiliser au moins un nombre aléatoire.
* La méthode toString() affiche les régles du jeu.