package hu.petrik.BejegyzesProjekt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Bejegyzes> bejegyzes = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);


    private static void bejegyzesHozzad(){
        Bejegyzes bejegyzes1 = new Bejegyzes("Radeczky Krisztián Norbert", "Ez az alma nagyon finom!");
        Bejegyzes bejegyzes2 = new Bejegyzes("Szabó Bence", "Adj már nekem is egy almát.");
        bejegyzes.add(bejegyzes1);
        bejegyzes.add(bejegyzes2);
    }
}
