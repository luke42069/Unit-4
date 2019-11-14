
package Lesson10InsertDelete;


public class Person implements Comparable{
    private String name, gender;
    private int age;
    
    public Person(String n, String g, int a){
        name = n;
        gender = g;
        age = a;
    }
    
    public String getName(){
        return name;
    }
    public String toString(){
               //Luke: age 17, male
        return name+": age "+age+", "+gender;
    }

    @Override
    public int compareTo(Object t) {
        String othername = ((Person)t).getName();
        return name.compareTo(othername);
    }
}
