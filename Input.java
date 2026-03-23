// We use Scanner for taking input from the users

// import java.util.*;
// public class input {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         String input = sc.next();
//         System.out.println(input);
//     }
// }


// next() sirf space tak ya ek word hi leta hai jaise ki pine.
// agar mujhe ek words ye jyda (puri line, sentence , para) ke liye nextLine() use krna hoga.
// next() He is a goog boy  O/P - He
// nextLine() He is a good boy O/P - He is good boy


// import java.util.*;
// public class input {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         String a = sc.nextLine();
//         System.out.println(a);
//     }
// }



// Input from users (sum of a & b)

// import java.util.*;
// public class Input {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a + b;
//         System.out.println(sum);
//     }
// }


// Input from users (subtraction of a & b)

// import java.util.*;
// public class input {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sub = a-b;
//         System.out.println(sub);
//     }
// }



// Input from user(Product of a & b)


// import java.util.*;
// public class input {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int product = a*b;
//         System.out.println(product);
//     }
// }


// Input from user (Area of circle)


// import java.util.*;
// public class input {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         float a = sc.nextFloat();
//         float b = 3.14f * a * a;
//         // 3.14 default me double hota hai Java me
//         // 3.14 ke aage f laga do
//         System.out.println(b);
//     }
// }



// Type Conversion 
// byte > short > int > float > long > double

// import java.util.*;
// public class input {
//     public static void main(String args[]) {
//         // int a = 25;
//         // long b = a;
//         long a = 25;
//         int b = a;    // not possible bcz long to int not possible

//         System.out.println(b);
//     }
// }


// ex-2

// import java.util.*;
// public class input {
//     public static void main(String agrs[]) {
//         Scanner sc = new Scanner(System.in);
//         // int a = sc.nextFloat();
//         //possible lossy conversion from float to int
//         float a = sc.nextInt();    int liya 25 usko float me store kiya toh 25.0 hogaya.
//         System.out.println(a);
//     }
// }



// Type Casting : ( Value jo forcely Assign krna )

// float a = 25.0;
// int b = a;
// forcely krne ke liye 
// int b = (int)a;



// public class input {
//     public static void main(String args[]) {
//         float a = 25.12f;
//         // int b = a;         // possible lossy conversion from float to int
//         int b = (int) a;      // forcly assign ke liye (int) kiye hain.
//         System.out.println(b);
//     }
// }


// public class input {
//     public static void main(String args[]) {
//         float marks = 98.9899f;
//         int marks2 = (int)marks;
//         System.out.println(marks2);

//     }
// }


// Type casting (storing char into int)

// public class input {
//     public static void main(String args[]) {
//         char ch = 'a' ;
//         int number = ch;
//         System.out.println(number);
//     }
// }



public class input {
    public static void main(String args[]) {
        char ch = 'b' ;
        int number = ch;
        System.out.println(number);
    }
}
