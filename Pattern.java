// import java.util.*;

// public class Pattern {
//     public static void main(String args[]) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of rows: ");
    
//         // Outer loop for rows
//         for (int i = 1; i <= 5; i++) {
//             // Inner loop prints stars equal to the current line number
//             for (int j = 1; j <= i; j++ ) {
            
//                 System.out.print(j); 
//             }
//             // Moves to the next line after printing all stars in the row
//             System.out.println(); 
//         }
        
//         sc.close(); // Good practice to close the scanner
//     }
// }



import java.util.*;

public class Pattern {
    public static void main(String args[]) {
        
        // Outer loop for rows
        for (int i = 5; i >= 1; i--) {
            // Inner loop prints stars equal to the current line number
            for (int j = 5; j >= i; j--) {
            
                System.out.print(j); 
            }
            // Moves to the next line after printing all stars in the row
            System.out.println(); 
        }
        
        
    }
}
