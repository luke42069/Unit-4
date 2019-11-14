
package Lesson10Assignments;

import Lesson10Sort.*;


public class ISSStudent implements Comparable{
    private String name, address;
    private int id;
    
    public ISSStudent(String n, String a, int i){
        name = n;
        address = a; 
        id = i;
    }
    
    public String toString(){
        String str= "Name: "+name;
        str+="\nAddress: "+address;
        str+="\nID: "+id+"\n----------";
        return str;
    }
    
    public int getID(){
        return id;
    }
    
    public String getName(){
        return name;
    }

    @Override
    public int compareTo(Object t) {
        if(this.id > ((ISSStudent)t).getID())
            return 1;
        else if(this.id<((ISSStudent)t).getID())
            return -1;
        else return 0;
    }
}             
