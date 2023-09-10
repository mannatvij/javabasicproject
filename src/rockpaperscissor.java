import com.sun.source.tree.WhileLoopTree;

import java.util.*;
import java.util.random.RandomGenerator;
public class rockpaperscissor {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int tie = 0;
        int win = 0;
        int lost = 0;
        while (i < 3) {
            System.out.println("Enter a number from 0,1,2,where 0=rock,1=paper,2=scissor\n where a is you, and b is the computer!");
            int a = sc.nextInt();
            Random ra = new Random();
            int b = ra.nextInt(3);

            switch (a) {
                case 0:
                    System.out.println("Rock");
                    break;
                case 1:
                    System.out.println("paper");
                    break;
                case 2:
                    System.out.println("Scissor");
                    break;
                default:
                    System.out.println("Not valid");
            }
            switch (b) {
                case 0:
                    System.out.println("Rock");
                    break;
                case 1:
                    System.out.println("paper");
                    break;
                case 2:
                    System.out.println("Scissor");
                    break;
                default:
                    System.out.println("Not valid");

            }

            if (a == 0 && b == 0) {
                System.out.println("Tie");
                tie = tie + 1;
            } else if (a == 0 && b == 1) {
                System.out.println("b wins a point");
                lost = lost + 1;
            } else if (a == 0 && b == 2) {
                System.out.println("a wins a point");
                win = win + 1;
            } else if (a == 1 && b == 0) {
                System.out.println("a wins a point");
                win = win + 1;
            } else if (a == 1 && b == 1) {
                System.out.println(" tie");
                tie = tie + 1;
            } else if (a == 1 && b == 2) {
                System.out.println("b wins a point");
                lost = lost + 1;
            } else if (a == 2 && b == 0) {
                System.out.println(" b wins a point");
                lost = lost + 1;
            } else if (a == 2 && b == 1) {
                System.out.println("a wins a point");
                win = win + 1;
            } else if (a == 2 && b == 2) {
                System.out.println("tie");
                tie = tie + 1;
            }
            i++;
        }


            if (win >= 2) {
                System.out.println("You won!");
            } else if (tie >= 2) {
                System.out.println("tie it is ");
            } else if (lost >= 2) {
                System.out.println("you lost");
            }
            else {
                System.out.println("No one wins. no decision taken");
            }


        }
    }








