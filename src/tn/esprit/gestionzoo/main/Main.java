package tn.esprit.gestionzoo.main;


import tn.esprit.gestionzoo.entities.*;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int nbrCages = 20;
//        String zooName = "my Zoo";
//        System.out.printf("%s comporte %d cages.%n", zooName, nbrCages);
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Donnez le nombre de cages : ");
//        nbrCages = scanner.nextInt();
//        scanner.nextLine();
//        System.out.print("Donnez le nom du zoo : ");
//        zooName = scanner.nextLine();
//        System.out.printf("%s comporte %d cages.%n", zooName, nbrCages);
//        scanner.close();
        /////////////////////////////////////////////////
        Animal lion = new Animal("lion", "max", 14, true);

        Zoo myZoo = new Zoo("myzoo", "caf");
        Zoo belle = new Zoo("beja", "111");
//        System.out.println(myZoo.displayZoo());
//        System.out.println(myZoo);
//        System.out.println(myZoo.toString());
//        System.out.println(lion.toString());
//          myZoo.addAnimal(lion);
//          myZoo.addAnimal(lion);
//          System.out.println(myZoo);
//          System.out.println(Zoo.comparerZoo(belle,myZoo));
        System.out.println(myZoo.isZooFull());


        System.out.println("-------------------------------------------------------");
        Aquatic aquatic = new Aquatic("fish", "morjen", 2, true, "aaa");
        Tresstrial tresstrial = new Tresstrial("poila", "koko", 4, true, 2);
        Dolphin dolphin = new Dolphin("delpha", "momo", 5, true, "rr", 17.5f);
        Penguin penguin = new Penguin("ccocoo", "aaccaa", 3, true, "Orrcean", 27.3f);

        System.out.println(aquatic);
        System.out.println(tresstrial);
        System.out.println(dolphin);
        System.out.println(penguin);

        aquatic.swim();
        dolphin.swim();
        penguin.swim();

    }
}
