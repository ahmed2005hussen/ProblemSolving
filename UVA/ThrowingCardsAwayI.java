package UVA;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class ThrowingCardsAwayI {

               /*
   Authour: Ahmed Hussein
   Judge: UVA
   Link: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=1876
*/



    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int x  = sc.nextInt();

        while(x != 0 ){

            Deque<Integer> dq = new LinkedList<>();


            for(int i = 1; i <=x ; i++){

                dq.addLast(i);
            }

            LinkedList<Integer> a = new LinkedList<>();

            while(dq.size()!=1){

                a.addLast(dq.removeFirst());

                int y = dq.removeFirst();
                dq.addLast(y);
            }

            System.out.print("Discarded cards:");
            if (!a.isEmpty()) {
                System.out.print(" ");
                for (int i = 0; i < a.size(); i++) {
                    if (i != 0 ) System.out.print(", ") ;
                    System.out.print(a.get(i));
                }
            }
            System.out.println();
            if(!dq.isEmpty()){
                System.out.println("Remaining card: " +  dq.pollFirst());
            }
            else{
                System.out.println("Remaining card: " + 0);
            }
            x =  sc.nextInt();
        }
    }

}
