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




// print start
// *
// **
// ***
// ****

// public class pattern {
//     public static void main(String args[]) {
//         for(int i = 1; i<= 4; i++) {
//             for(int j = 1; j <= i; j++) {
//                  System.out.print("*");
//             }
//             System.out.println();
//         }
      

//     }
// }




// for printing this 
// *
// **
// ***
// ****
// *****
// ******
// *******
// ********
// *********
// **********

// public class pattern {
//     public static void main(String args[]) {
//         for(int i = 1; i<= 10; i++) {
//             for(int j = 1; j <= i; j++) {
//                  System.out.print("*");
//             }
//             System.out.println();
//         }
      

//     }
// }



// //inverted star 

// public class pattern {
//     public static void main(String args[]) {
//         int n = 10;
//         for(int i = 1; i<=n; i++) {
//             for(int j = 1; j <=n-i+1 ; j++) {
//                  System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// o/p
// *********
// ********
// *******
// ******
// *****
// ****
// ***
// **
// *




// // 1
// // 12
// // 123
// // 1234

// public class pattern {
//     public static void main(String args[]) {
//         int n = 4;
//         for(int i = 1; i<= n; i++) {
//             for(int j = 1; j <= i; j++) {
//                  System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


// public class pattern {
//     public static void main(String args[]) {
//         int n = 4;
//         char ch = 'A';
//         for(int i = 1; i<= n; i++) {
//             for(int j = 1; j <= i; j++) {
//                  System.out.print(ch);
//                  ch++;
//             }
//             System.out.println();
//         }
//     }
// }

// o/p - 
// A
// BC
// DEF
// GHIJ




// now we will do advanve patterrn 

//now we print hollow pattern 

// *****
// *   *
// *   *
// *****

// import java.util.*;

// public class pattern {
// 	public static void main (String[] args) { 
	    
// 		Scanner sc = new Scanner(System.in);
//         System.out.println("Enter: row,col");
// 		int row = sc.nextInt();
// 		int col = sc.nextInt();
		
// 		for(int i = 1; i<=row; i++){
// 		    for(int j=1; j<=col; j++) {
// 		        if(i==1 || i==row || j==1 || j==col) {
// 		            System.out.print("*");
// 		        }
// 		        else{
// 		            System.out.print(" ");
		            
// 		        }
// 		    }
// 		    	System.out.println();
// 		}

// 	}
// }








import java.util.*;

 public class pattern
{
	public static void main (String[] args) {
	    Scanner sc = new Scanner (System.in);
	    System.out.print("Enter row :");
		int  row = sc.nextInt();
		System.out.print("Enter col :");
	    int col = sc.nextInt();
	    
	    for(int i=1; i<=row; i++) {
	        for(int j=1; j<=col; j++) {
	            if(i==1 || i==row || j==1 || j==col) {
	                System.out.print("*");
	                
	            } else {
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	    
	}
	
}





