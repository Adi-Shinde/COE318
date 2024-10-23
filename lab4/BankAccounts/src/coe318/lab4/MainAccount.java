//Aditya Shinde
//COE318
//501189079
//aditya.shinde@torontomu.ca

package coe318.lab4;

public class MainAccount {
    public static void main(String[] args) {
        Account alice = new Account("Alice", 123, 100.00);
        Account bob = new Account("Bob", 789, 0);

        System.out.println(bob);
        System.out.println(alice);
        
        alice.withdraw(15);
        System.out.println(alice);
        
        alice.withdraw(200);  // Should fail due to insufficient balance
        System.out.println(alice);
        
        alice.withdraw(-1);  // Should fail due to invalid amount
        System.out.println(alice);
        
        alice.deposit(150);
        alice.withdraw(200);  // Should succeed now
        System.out.println(alice);
        
        bob.deposit(300);
        System.out.println(bob);
        
        bob.withdraw(100);
        System.out.println(bob);
    }
}
