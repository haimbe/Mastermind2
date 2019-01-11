package Mastermind2;

import java.util.Scanner;

public abstract  class Combinaison {

    Scanner sc = new Scanner(System.in);
    int combiChoisie[] = new int[4];

    public void getInput() {

        System.out.println("Rentre votre premier chiffre");
        int combiChoisie[ 0] =sc.nextInt();

        System.out.println("Rentre votre second chiffre");
        int combiChoisie[ 1] =sc.nextInt();

        System.out.println("Rentre votre troisième chiffre");
        int combiChoisie[ 2] =sc.nextInt();

        System.out.println("Rentre votre quatrième chiffre");
        int combiChoisie[ 3] =sc.nextInt();

        return combiChoisie[];

    }

    public int[] getCombiChoisie() {
        return combiChoisie;
    }

    public void verificationComputer() {

        intp combiChoisie[];


        Combinaison computer = new Combinaison() {
            @Override
            public void getInput() {
                super.getInput();
            }
        };

        Combinaison j1 = new Combinaison() {
            @Override
            public void getInput() {
                super.getInput();
            }
        };

        while (computer.combiChoisie[]!=j1.combiChoisie[]){

            char resultat[] = new char[4];


            for (int i = 0; i < 4; i++) {

                if (j1.combiChoisie[i] > computer.combiChoisie[i]) {
                    resultat[i] = '+';
                } else if (j1.combiChoisie[i] < computer.combiChoisie[i]) {
                    resultat[i] = '-';
                } else if (j1.combiChoisie[i] == computer.combiChoisie[i]) {
                    resultat[i] = '-';
                }
            }


            Combinaison j1 = new Combinaison() {
                @Override
                public void getInput() {
                    super.getInput();
                }
            };


        }

        System.out.println("Vous avez trouvé la bonne combinaison de l'ordinateur");

    }

    public void verificationHuman() {

        int combiChoisie[], j1CombiEntree, j2CombiEntree;


        Combinaison j1Combi = new Combinaison() {
            @Override
            public void getInput() {
                super.getInput();
            }
        };

        Combinaison j2Combi = new Combinaison() {
            @Override
            public void getInput() {
                super.getInput();
            }
        };

        while ((j1Combi.combiChoisie[]!=j2CombiEntree.combiChoisie[]) &&(j2Combi.combiChoisie[]!=
        j1CombiEntree.combiChoisie[])){

            char resultat[] = new char[4];
            Combinaison j2CombiEntree = new Combinaison() {
                @Override
                public void getInput() {
                    super.getInput();
                }
            };

            for (int i = 0; i < 4; i++) {

                if (j1.combiChoisie[i] < j2CombiEntree.combiChoisie[i]) {
                    resultat[i] = '+';
                } else if (j1.combiChoisie[i] > j2CombiEntree.combiChoisie[i]) {
                    resultat[i] = '-';
                } else if (j1.combiChoisie[i] == j2CombiEntree.combiChoisie[i]) {
                    resultat[i] = '-';
                }
            }

            if (j1Combi.combiChoisie[]=j2CombiEntree.combiChoisie[]){
                System.out.println("Le joueur 2 a gagné");
            }
                else{

                Combinaison j1CombiEntree = new Combinaison() {
                    @Override
                    public void getInput() {
                        super.getInput();
                    }
                };

                for (int i = 0; i < 4; i++) {

                    if (j2.combiChoisie[i] < j1CombiEntree.combiChoisie[i]) {
                        resultat[i] = '+';
                    } else if (j2.combiChoisie[i] > j1CombiEntree.combiChoisie[i]) {
                        resultat[i] = '-';
                    } else if (j2.combiChoisie[i] == j1CombiEntree.combiChoisie[i]) {
                        resultat[i] = '-';
                    }
                }

                if (j2Combi.combiChoisie[]=j1CombiEntree.combiChoisie[]){
                    System.out.println("Le joueur 1 a gagné");
                }


            }


        }

    }
}
