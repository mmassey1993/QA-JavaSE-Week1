package library.models;

public interface Manageable {

    void add(Crudable c); // Can take either a person or an item as both belong to crudable interface
    void update(int id, Crudable c);
    void delete(int ID, Crudable c);
    boolean isCorrectType(Crudable c);
    boolean isEmpty();
}
