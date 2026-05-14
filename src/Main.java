import java.util.Scanner;
 public class Main {
     public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         int choice;
         char  option;

         do{

             System.out.printf("===============================");
             System.out.printf("\n|  Choose Your Opreration      |");
             System.out.printf("\n|  ======================      |");
             System.out.printf("\n|  1 =======> +                |");
             System.out.printf("\n|  2 =======> -                |");
             System.out.printf("\n|  3 =======> *                |");
             System.out.printf("\n|  4 =======> /                |");
             System.out.printf("\n|  Enter Y to Exit...          |");
             System.out.printf("\n| *NB Use the corresponding    |");
             System.out.printf("\n|  Number NOT the sign!        |");
             System.out.printf("\n===============================");

             System.out.printf("\nEnter your first number: ");
             int num1 = input.nextInt();
             System.out.printf("Enter your second number: ");
             int num2 = input.nextInt();

             System.out.printf("Input your choice: ");
             choice = input.nextInt();
             int ans = 0;

             switch(choice){
                 case 1:
                     ans = num1 + num2;
                     break;
                 case 2:
                     ans =  num1 - num2;
                     break;
                 case 3:
                     ans = num2 * num1;
                     break;
                 case 4:
                     if(num2==0){
                         System.out.printf("\ncan not divide by zero");
                     }
                     else{
                         ans = num1 / num2;
                     }
                     break;
             }
             System.out.print(ans);
             System.out.printf("\nDo you want to Exit? 'y' or 'n: ");
             option = input.next().charAt(0);
         }
         while(option != 'y' && option != 'Y');
     }
 }