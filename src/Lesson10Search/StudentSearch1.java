
package Lesson10Search;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StudentSearch1 {

    
    public static void main(String[] args) {
        ISSStudent iss[] = new ISSStudent[100];
        String n, a;
        int id;
        Scanner input = new Scanner(System.in);
        
        try {
            Scanner scan = new Scanner(new File("studata.txt"));
            for (int i = 0; i < iss.length; i++) {
                n = (scan.nextLine());
                a = scan.nextLine();
                id = Integer.parseInt(scan.nextLine());
                iss[i] = new ISSStudent(n,a,id);
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        
        System.out.println("Enter an ID to search: ");
        int sid = input.nextInt();
        //create temp student to search
        ISSStudent temp = new ISSStudent("","",sid);
        int loc = binarySearch(iss,temp);
        if(loc>-1)
            System.out.println(iss[loc]);
    }
    
    public static int binarySearch(Object[] a, Object searchValue) {
        int attempts = 0;
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int midpoint = (left + right) / 2;
            int result = ((Comparable) a[midpoint]).compareTo(searchValue);
            attempts++;
            if (result == 0) {
                System.out.println("binary took "+attempts+" attempt to return");
                return midpoint;
            } else if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        System.out.println("binra ytook "+attempts+" attempt to return");
        return -1;
        

    }
    
}
