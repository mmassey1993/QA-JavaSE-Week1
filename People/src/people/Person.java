package people;

import java.util.ArrayList;

public class Person {
            //One global array list containing all entered people
            static ArrayList<Person> People = new ArrayList();


            String name;
            int age;
            String jobTitle;


            //Constructor which creates variables of name, age and job title
            public Person(String n, int a, String jt){
                this.name = n;
                this.age = a;
                this.jobTitle = jt;
                People.add(this); // Add each new person object to array list People
            }
            @Override
            public String toString(){
                return "Name: " + name + "\nAge: " + age + "\nJobTitle: " + jobTitle + "\n";
            }

            public static Person SearchByName(String name){
                for (Person p : People) {
                    if (name.equals(p.name)){
                        return p;
                    }
                } return null; // if name is not in list, then returning nothing
            }



            public static void main(String[] args) {

                //Creating new objects (instances of class) which utilise the constructor Person above. Each new person object gets their data added to array list People
                Person Michael = new Person("Michael", 24, "Consultant");
                Person abc = new Person ("abc", 100, "def");
                Person Gail = new Person("Gail", 32, "Lawyer");

        /*System.out.println(Michael);
        System.out.println(abc);
        System.out.println(Gail);*/



                //for each loop to print out each object created and stored in the array list People.
        /*for (Person p : People){
            System.out.println(p);
        }*/

                System.out.println(SearchByName("Michael"));


            }

        }

