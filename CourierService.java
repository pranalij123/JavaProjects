import java.util.*;

class  CourierService {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter customer name:");
        String name = sc.nextLine();

        System.out.println("Enter customer mobile number:");
        long mobile = sc.nextLong();

        // Consume the newline character left in the input buffer
        sc.nextLine();

        System.out.println("Enter customer address:");
        String add = sc.nextLine();

        System.out.println("Order placed successfully!");

        System.out.println("Enter delivery executive name:");
        String name1 = sc.nextLine();

        System.out.println("Enter delivery executive mobile number:");
        long mobile1 = sc.nextLong();

        // Consume the newline character left in the input buffer
        sc.nextLine();

        System.out.println("Delivery executive assigned successfully!");

        System.out.println("Has the order been delivered? (yes/no)");
        String ans = sc.nextLine();

        if (ans.equals("yes")) {
            System.out.println("Order delivered successfully!");
        } else {
            System.out.println("Order not delivered yet.");
            System.out.println("Order Status: Order assigned to delivery executive");
        }
        
       
    }
}

/*output:
Enter customer name:
wer
Enter customer mobile number:
976
Enter customer address:
klj
Order placed successfully!
Enter delivery executive name:
bhu
Enter delivery executive mobile number:
4576
Delivery executive assigned successfully!
Has the order been delivered? (yes/no)
yes
Order delivered successfully!
*/

/*note:
When you use nextLong() to read a long value from the scanner, it reads the long value but leaves the newline character (\n) in the input buffer. This newline character is the result of the user pressing Enter after inputting the long value.

When you subsequently call nextLine() to read the address, it reads the remaining newline character in the input buffer from the previous nextLong() call, instead of waiting for the user to input the address. This results in skipping the address input, and the program continues execution without allowing the user to input the address.

To avoid this issue and ensure that the subsequent nextLine() call reads the actual address input from the user, we use sc.nextLine() immediately after reading the long value to consume the leftover newline character in the input buffer. This ensures that the subsequent nextLine() call works as expected and correctly reads the address input from the user.


*/
