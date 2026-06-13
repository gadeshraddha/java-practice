/*Given a number n, number of apples in a bag. You and your friend are picking one apple turnwise from the bag. It is given that the first attempt is always by you. The person picking the last apple will be the winner. 

If you will win: print "You" (without quotes)
If your friend will win: print "Friend" (without quotes)*/

import java.util.Scanner;

class EvenOddGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        if ( n % 2 == 1) {
            System.out.println("You");
        } else {
            System.out.println("Friend");
        }
        sc.close();
    }
}