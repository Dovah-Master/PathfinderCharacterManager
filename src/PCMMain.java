/**
 * Created by ros_jdscofield on 9/20/2017.
 */
import java.util.*;
import java.io.*;

public class PCMMain {
    //This is the main of my project, the code is run from here directs the user to one of the two halfs of the project creating a new character or loading an old one.
    public static void main(String[] args) throws FileNotFoundException {
        CharacterManager home = new CharacterManager();
        System.out.print("Welcome to Pathfinder Character Manager! Are you here to load a character or create a new one? ");
        Scanner console = new Scanner(System.in);
        int loop = 0;
        //home
        while (loop == 0) {
            String answer = console.nextLine();
            if (answer.indexOf("new") >= 0) {
                home.newCharacter();
                loop++;
            }
            else if (answer.indexOf("load") >= 0) {
                home.loadCharacter();
                loop++;
            } else {
                System.out.print("I'm sorry but I don't understand your answer, please use keywords new or load ");
            }
        }
    }
}