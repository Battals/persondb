package demo;

public interface Personinterface extends Comparable {
    @Override
    String toString();

    int compareTo(Person other);
}
