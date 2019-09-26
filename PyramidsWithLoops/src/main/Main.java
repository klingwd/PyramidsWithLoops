/* 
 * William Kling
 * klingwd@mail.uc.edu
 * Printing pyramids using loops. It kind-of works. 
 * What I really want is
        1
       222
      33333
     4444444
    555555555 
*/
package main;

public class Main {

	public static void main(String[] args) {
		int lines = 5;  // Number of Lines you want in Pyramid 
		int k = 0;
		
	    for(int i = 1; i <= lines; i++, k = 0) {   // "i" needs to be <= the number of lines and not < or else you will only have 4 lines 
	        	
	            for(int j= 0; j < lines - i; j++) { // lines - i to format correctly 
	                System.out.print(" "); 
	            }
	            while(k != 2 * i - 1) {     // k not equal to 2, multiples by 1 
	                System.out.print(i);
	                k++;  // adds 1 to the variable k
	            }
	            System.out.println();
	        }
	    }
	}

