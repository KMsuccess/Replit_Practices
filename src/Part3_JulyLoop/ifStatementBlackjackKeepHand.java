package Part3_JulyLoop;
/*
in blackjack after the player asks to keep the house 4 things may happen.

1) if the card total is bigger then 21 the player busts.
2)if the house score is bigger then the player, the player loses .
3)if the player score is equal to the house then thers a draw.
4)if the player score is bigger then the house the player wins.

player and house scores are represented by  player and house int variables.
check them using ifs to determine the result.

for example:

player  = 21
 house = 8
output: bust

player  = 7
 house = 10
output: player loss

player  = 4
 house = 4
output: its a tie

player  = 12
 house = 7
output: player wins

 */
import java.util.*;

public class ifStatementBlackjackKeepHand {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int house = s.nextInt();
        int player = s.nextInt();

        //your code here
/*
 Scanner s = new Scanner(System.in);

    int house = s.nextInt();
    int player = s.nextInt();

    //Write your code here:

    boolean bust = player> 21;
    boolean loss = player < house &&  house <= 21;
    boolean itsATie = player == house && house <=21;
    boolean playerWin = player>house;

  if(bust == true){
    System.out.println("bust");
  }
  if(loss){
    System.out.println("player loss");

  }
  if(itsATie ){
    System.out.println("its a tie");
  }
  if(playerWin){
    System.out.println("player wins");
  }

 */


    }
}
