// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class atm {
   public atm() {
   }

   public static void main(String[] var0) {
      int var1 = 100000;
      
      Scanner var4 = new Scanner(System.in);

      while(true) {
         while(true) {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");
            int var5 = var4.nextInt();
            switch (var5) {
               case 1:
                  System.out.print("Enter money to be withdrawn:");
                  int var2 = var4.nextInt();
                  if (var1 >= var2) {
                     var1 -= var2;
                     System.out.println("Please collect your money");
                  } else {
                     System.out.println("Insufficient Balance");
                  }

                  System.out.println("");
                  break;

               case 2:
                  System.out.print("Enter money to be deposited:");
                  int var3 = var4.nextInt();
                  var1 += var3;
                  System.out.println("Your Money has been successfully depsited");
                  System.out.println("");
                  break;

               case 3:
                  System.out.println("Balance : " + var1);
                  System.out.println("");
                  break;
               case 4:
                  System.exit(0);
            }
         }
      }
   }
}
