
import java.util.Scanner;

public class AtmMain {
    public static void main(String[] args) {
        int money=100,input,dollar;
        Scanner scann=new Scanner(System.in);

        System.out.println("Hello,Welcome GreenBank");
        System.out.println("You have " +money+ "$");

        while (money>0){
            System.out.println();
            System.out.println("1-Load Cash");
            System.out.println("2-Get Cash");
            System.out.println("3-Your Current Money Amount");
            System.out.println("4-Exit ");
            System.out.println("What Would you like to :");
            input=scann.nextInt();

            if(input==1){
                System.out.println("Put your amount :");
                dollar=scann.nextInt();
                money=money+dollar;

            } else if (input==2) {
                System.out.println("How Much Do You Need ");
                dollar=scann.nextInt();
                if(dollar>money){
                    System.out.println("Not Enough Cash ");
                }else {
                money=money-dollar;}

            } else if (input==3) {
                System.out.println("Current your total money: "+money);

            } else if (input==4) {
                System.out.println("Thank You;");
                break;
            }else {
                System.out.println("Wrong! please pick 1,2,3 or 4");

            }
        }
        System.out.println("We ara Done :(");
    }

}
