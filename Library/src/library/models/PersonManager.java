package library.models;

import java.util.ArrayList;
import java.util.List;

public class PersonManager implements Manageable{
    private List<Person> personList;

    public PersonManager(){
        personList = new ArrayList<>();
    }


    @Override
    public void add(Crudable c) {
        personList.add((Person) c);
    }

    @Override
    public void update(int ID, Crudable c) {
        int pos = ;
            if (pos != null) {
                pos.setName(((Person) c).getName());
            }
    }

    @Override
    public void delete(int ID, Crudable c) {
        for (Item i : personList){

        }
    }

    @Override
    public boolean isCorrectType(Crudable c) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
