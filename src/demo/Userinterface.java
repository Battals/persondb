package demo;

import java.util.Scanner;

public class Userinterface {

    public Database db = new Database();


    public void startbesked() {
        System.out.println("Velkommen til Person-database");
    }
    public void printMenu(){
        System.out.println("""
                Tast 1) For at oprette en person
                Tast 2) For at slette en perosn
                Tast 3) For at se listen af alle personer""");
    }

    public void start() {
        startbesked();

        boolean run = true;
        while (run) {
            printMenu();
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    db.tilføjPerson();
                    break;
                case 2:
                    db.printListeafpersoner();
                    System.out.println("Hvilken personer ønsker du skal fjernes - Indtast personens ID");
                    int remove = scanner.nextInt();
                    db.sletPerson(remove);
                    System.out.println("Person med ID " + remove + " er slettet");
                    break;
                case 3:
                    db.printListeafpersoner();
                    break;

                default:
                    System.out.println("Ukendt kommando");
                    break;

            }

        }

    }
}
