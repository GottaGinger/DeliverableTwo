import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Guess Heads or Tails");
        String headsOrTailsGuess = input.nextLine();
        System.out.println("Number of Flips");
        double numberOfFlips = input.nextInt();
        double correctCount = 0;

       for(int i=0; i< numberOfFlips; i++) {
           if (Math.random() < 0.5){
               System.out.println("heads");
               if(headsOrTailsGuess.equals("Heads") || headsOrTailsGuess.equals("heads"))
                   correctCount++;
           } else{
               System.out.println("tails");
               if(headsOrTailsGuess.equals("Tails") || headsOrTailsGuess.equals("tails"))
                   correctCount++;
           }
         }
        System.out.println(correctCount);
       System.out.println(correctCount / numberOfFlips * 100);

    }
}