// Array Structure :--------
// dataTyepe Arrayname[] = new dataType[size];

// import java.util.*;
// public class Array {
//     public static void main(String args[]) {
//         int marks[] = new int[50];
//         Scanner sc = new Scanner(System.in);
//         marks[0]= sc.nextInt();
//         marks[1]= sc.nextInt();
//         marks[2]= sc.nextInt();
//         System.out.println("physic:" + marks[0]);
//         System.out.println("chemistry :" + marks[1]);
//         System.out.println("maths :" + marks[2]);


//     }
// }

// 99
// 98
// 100
// physic:99
// chemistry :98
// maths :100


// to update in array :-----------------------------------------------------------------------------------------------

// import java.util.*;
// public class Array {
//     public static void main(String args[]) {
//         int marks[] = new int[50];
//         Scanner sc = new Scanner(System.in);
//         marks[0]= sc.nextInt();
//         marks[1]= sc.nextInt();
//         marks[2]= sc.nextInt();
//         System.out.println("physic:" + marks[0]);
//         System.out.println("chemistry :" + marks[1]);
//         System.out.println("maths :" + marks[2]);
//         marks[1]= 90;
//         System.out.println("chemistry :" + marks[1]);

//     }
// }



// calculate of three marks ----------------------------------------------

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
        int percent = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percent:" + percent + "%");

    }
}

// to find length of array = array.length ; marks.length ---------------------------------------


