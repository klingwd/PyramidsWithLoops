/* 
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
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
		int lines = 5;
		for (int i = 1; i <= lines; i++) {
			
			for (int j = 0; j <= i+lines; j++) {
				System.out.print("");
				System.out.print(j);
			for (int k = i; k <= i; k--) {
				System.out.print(k);
			}
			System.out.println("");
		}
	}
	}}

