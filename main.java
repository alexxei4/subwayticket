import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Metro Ticket Machine!\n Press 1 for the first machine\n Press 2 for the second machine \n Press 3 to exit!");
        int Choice1 = sc.nextInt();
        Brain subway1 = new Brain();
        subway1.setRoute1("N/A");
        subway1.setRoute2("N/A");
        subway1.setcredit1(0);
        subway1.setcredit2(0);
        subway1.setchildnum(0);
        subway1.setadultnum(0);
        subway1.setchildnum2(0);
        subway1.setadultnum2(0);
        subway1.ticketcounter1(false);
        while (Choice1 == 1) {
            System.out.println("Selected Route: " + subway1.getRoute1() + " Child:$2.50 " + "(" + subway1.getchildnum() + ")" + " Adult:$5.00" + "(" + subway1.getadultnum() + ") " + "Credit:$" + subway1.getcredit1());
            System.out.println("1.Select route uptown\n2.Select route downtown\n3.Add Adult\n4.Remove Adult");
            System.out.println("5.Add Child\n6.Remove Child\n7.Insert Quarter\n8.Insert Loonie\n9.Insert Toonie\n10.Print ticket\n11.Leave Machine");
            int Choice1a = sc.nextInt();
            if (Choice1a == 1) {
                subway1.setRoute1("Uptown");
            }
            if (Choice1a == 2) {
                subway1.setRoute1("Downtown");
            }
            if (Choice1a == 3){
                subway1.adultcounter(0);
            }
            if (Choice1a == 4){
                subway1.adultremover(0);
            }
            if (Choice1a == 5){
                subway1.childcounter(0);
            }
            if (Choice1a == 6){
                subway1.childremover(0);
            }
            if (Choice1a == 7){
                subway1.quarter1(0);
            }
            if (Choice1a == 8){
                subway1.loonie1(0);
            }
            if (Choice1a == 9){
                subway1.toonie1(0);
            }
            if (Choice1a == 10){
                if(subway1.ticketcounter1(true);){
                    System.out.println("PRINT SUCCESSFUL, COLLECT YOUR TICKET!");
                }
                if(subway1.ticketcounter1(false);){
                    System.out.println("INSEFFICIENT FUNDS, PLEASE ADD MORE");
                }

            }
            if (Choice1a == 11){
                Choice1 = 2;
            }

        }
        while (Choice1 == 2) {
            System.out.println("Selected Route: " + subway1.getRoute2() + " Child:$3.75 " + "(" + subway1.getchildnum2() + ")" + " Adult:6.25" + "(" + subway1.getadultnum2() + ") " + "Credit:$" + subway1.getcredit2());
            System.out.println("1.Select route Main ST\n2.Select route King ST\n3.Add Adult\n4.Remove Adult");
            System.out.println("5.Add Child\n6.Remove Child\n7.Insert Quarter\n8.Insert Loonie\n9.Insert Toonie\n10.Print ticket\n11.Leave Machine");
            int Choice2a = sc.nextInt();
            if (Choice2a == 1) {
                subway1.setRoute2("Main ST");
            }
            if (Choice2a == 2) {
                subway1.setRoute2("King ST");

            }

        }
        if (Choice1 == 3) {
            System.out.println("GOODBYE");
        }

    }

}