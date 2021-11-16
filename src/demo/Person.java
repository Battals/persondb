package demo;

public class Person implements Personinterface {

String firstName;
String lastName;
int age;

public Person(String firstName, String lastName, int age){

this.firstName = firstName;
this.lastName = lastName;
this.age = age;
}




    @Override
    public String toString() {
        return "Person - " +
                "Fornavn = " + firstName + '\'' +
                ", Efternavn = " + lastName + '\'' +
                ", Alder = " + age +"";
    }




    @Override
    public int compareTo(Person other) {
    int compareResult = this.firstName.compareTo(other.firstName);

    if (compareResult == 0){
        return this.lastName.compareTo(other.lastName);
    } else
        return compareResult;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
