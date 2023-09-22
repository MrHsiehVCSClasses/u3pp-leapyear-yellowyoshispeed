package u3pp;
import java.util.Scanner;
import java.text.DecimalFormat;

public class AdvGame {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");
        double time = 5.0;
        boolean isRunning = true;
        boolean isGameRunning = true;
        boolean inRoom1 = false;
        boolean hasPuzzle = false;
        boolean donePuzzle = false;


        while (isGameRunning || isRunning) {
            isRunning = TimeCheck.checkTime(time);
            if (!isRunning) {
                break;
            }
            System.out.println("> You accepted a stupid dare where you bet that you're able to escape the escape room within 5 minutes...");
            System.out.println("Note: Every action can either take 0.4 time OR all 5 :). Choose carefully!");
            System.out.println("# Choices: \n> 1) look around \n> 2) strategize \n> 3) panik! \n> (Q to quit)\n> Time: " + df.format(time));
            String input = sc.nextLine();
            if (input.equals("Q")){
                isGameRunning = false;
                return;
            }
            else if (input.equals("1")){
                isRunning = TimeCheck.checkTime(time);
                if (!isRunning) {
                    break;
                }
                inRoom1 = true;
                while (inRoom1){
                    System.out.println("> You hopefully chose this first... \n> You look around and see a lever, a board with a missing puzzle, and a box\n> What do you do?: ");
                    System.out.println("> 1) flip the lever! \n> 2) examine the puzzle\n> 3) examine the box\n> Q to leave\n> Time: " + df.format(time = time - 0.4));
                    isRunning = TimeCheck.checkTime(time);
                    input = sc.nextLine();
                    if (input.equals("Q")){
                        inRoom1 = false;
                        break;
                    }
                    else if (input.equals("1")){
                        if (donePuzzle){
                            time = time - 0.4;
                            if (time > 0){
                                System.out.println("Congrats You've won the bet! Remaining time: " + df.format(time));
                                isRunning = false;
                                return;
                            }
                            else{
                                return;
                            }
                            
                        }
                        else{
                            System.out.println("> You approach the lever");
                            System.out.println("> You flipped the lever and... Did nothing... Maybe you need something\n> Time: "+ df.format(time = time - 0.4));
                            break;
                        }
                        
                    }
                    else if (input.equals("2")){
                        if (hasPuzzle){
                           System.out.println("> You hear a click! " + df.format(time = time - 0.4));
                           donePuzzle = true;
                        }
                        else{
                            System.out.println("> You can see that you need only 1 more board piece... Wonder where that is?\n > Time: " + df.format(time = time - 0.4));
                            break;
                        }
                        
                        
                    }
                    else if (input.equals("3")){
                        System.out.println("You see a box... What do you do?: \n> 1) Open it! \n> 2) Nah!\n>Time: " + df.format(time = time - 0.4));
                        input = sc.nextLine();
                        if (input.equals("1")){
                            if (!hasPuzzle){
                                System.out.println("> You got a puzzle piece!\n> Time: " + df.format(time = time - 0.4));
                                hasPuzzle = true;
                            }
                            else{
                                System.out.println("> You already have 1 bruh \n> Time: " +df.format);
                            }
                        }
                        else if (input.equals("2")){
                            System.out.println("You left the chest alone \n>Time: " + df.format(time = time - 0.4));
                        }
                    }
                }
                
            }
            else if (input.equals("2")){
                System.out.println("I mean you can't strategize without knowing anything can you? (Press any key to return) Time remaining: " + df.format(time = time - 0.4));
                isRunning = TimeCheck.checkTime(time);
                input = sc.nextLine();
            }
            else{
                if (!isRunning) {
                    break;
                }
                System.out.println("> You panicked for " + time + " minutes like an idiot. Time: " + df.format(time = time - time));
                isRunning = TimeCheck.checkTime(time);
                if (!isRunning) {
                    break;
                }
            }



        }
        if (!isRunning){
            System.out.println("Bad");
        }
    }
}
