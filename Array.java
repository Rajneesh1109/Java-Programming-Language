// Array Structure :--------
// dataTyepe Arrayname[] = new dataType[size];

import java.util.*;
public class Array {
    public static void main(String args[]) {
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);
        marks[0]= sc.nextInt();
        marks[1]= sc.nextInt();
        marks[2]= sc.nextInt();
        System.out.println("physic:" + marks[0]);
        System.out.println("chemistry :" + marks[1]);
        System.out.println("maths :" + marks[2]);


    }
}