package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Database {
    ArrayList<Person> listeafPersoner = new ArrayList<>();

    public void tilføjPerson(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Hvad er personens fornavn?");
        String fornavn = sc.nextLine();
        System.out.println("Hvad er personens efternavn?");
        String efternavn = sc.nextLine();
        System.out.println("Hvor gammel er personen?");
        int alder = sc.nextInt();
        listeafPersoner.add(new Person(fornavn, efternavn, alder));
        System.out.println("Personen er oprettet");


    }

    public void sletPerson(int id){
        listeafPersoner.remove(id);
        System.out.println("Person" + id + "er slettet");
    }



    public ArrayList<Person> getListeafPersoner() {
        return listeafPersoner;
    }


    public void printListeafpersoner(){
        if (getListeafPersoner().size() == 0){
            System.out.println("Der er ingen personer oprettet");}
        else{
            //Co.sort(listeafPersoner);


            /*for (int i = 0; i < getListeafPersoner().size(); i++){
            System.out.println(getListeafPersoner().get(i));
            System.out.println("Vedkommendes ID - " + i);
            }*/

        }

}}
