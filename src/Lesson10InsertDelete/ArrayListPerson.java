
package Lesson10InsertDelete;

import java.util.ArrayList;


public class ArrayListPerson {

    
    public static void main(String[] args) {
       ArrayList<Person> peeps = new ArrayList();
       /*
       .add(item); - add to end of list 
       .add(loc,item); - add to specific location
       
       .get(); - retrieve a copy of item 
       .indexOf(item); - show loc of item in arraylist
       .size(); - number of items in list
       
       .set(loc,item); - set loc to new item
       .remove(item); - search for item and remove it
       .remove(location) - remove item at set location
       */
       
        peeps.add(new Person("Andy","male",23));
        peeps.add(new Person("Cindy","female",31));
        peeps.add( new Person("Fred","male",69));
        peeps.add(new Person("Jauquauviua","female",18));
        
        showPeople(peeps);
        System.out.println("insert meg female age 27");
        //wghere doe sit go
        Person p = new Person("Meg","Female",27);
        int loc = findInsertPoint(peeps, p);
        peeps.add(loc,p);
        
        System.out.println("Inserting LENARD and PENIS");
        p = new Person("LENARD","male",38);
        loc = findInsertPoint(peeps,p);
        peeps.add(loc,p);
        
        //add PENEy to the end and sort the ArrayList
        p = new Person("PENEY","female",35);
        loc = findInsertPoint(peeps,p);
        peeps.add(loc,p);
        showPeople(peeps);
        
        System.out.println("Removing Fred");
        p = new Person("Fred","male",54);
        loc = search(peeps,p);
        peeps.remove(loc);
        showPeople(peeps);
    }
    
    public static void showPeople(ArrayList arr) {
        for (int i = 0; i < arr.size(); i++) {
   
         System.out.println(arr.get(i));
        }
        System.out.println("\n0----------------------------0\n");
    }
    
    public static int findInsertPoint(ArrayList a, Object searchValue) {
        int left = 0;
        int right = a.size() - 1;
        int midpoint = 0;

        while (left <= right) {
            midpoint = (left + right) / 2;

            int result = ((Comparable) a.get(midpoint)).compareTo(searchValue);    

            if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        if (((Comparable) a.get(midpoint)).compareTo(searchValue) < 0) {
            midpoint++;
        }
        return midpoint;
    }
    
    public static int search(ArrayList a, Object searchValue) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int midpoint = (left + right) / 2;
            int result = ((Comparable) a.get(midpoint)).compareTo(searchValue);
            if (result == 0) {
                return midpoint;
            } else if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        return -1;

    }
}
