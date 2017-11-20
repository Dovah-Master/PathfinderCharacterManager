/**
 * Created by ros_jdscofield on 9/20/2017.
 */
import java.util.*;
import java.io.*;

public class PCMMain {
    //This is the main of my project, the code is run from here directs the user to one of the two halfs of the project creating a new character or loading an old one.
    public static void main(String[] args) {
        System.out.println("Welcome to Pathfinder Character Manager!");
        saveOrLoad();
    }
    public static void saveOrLoad() {
        try {
            CharacterManager home = new CharacterManager();

            System.out.print("Are you here to load a character or create a new one? ");
            Scanner console = new Scanner(System.in);
            int loop = 0;
            //home
            while (loop == 0) {
                String answer = console.nextLine();
                if (answer.toUpperCase().charAt(0) == 'N') {
                    home.newCharacter();
                    loop++;
                } else if (answer.toUpperCase().charAt(0) == 'L') {
                    home.loadCharacter();
                    loop++;
                } else {
                    System.out.print("I'm sorry but I don't understand your answer, please use keywords new or load ");
                }
            }
        } catch(FileNotFoundException e) {
        }
    }
}
// this is what I've done so far
// 1) when you select load character you now have the option to go back and create a new character
// 2) when you level up your character you now see your current level
// 3) now answers are more inclusive of different inputs

// this is where I'll track issues since I'm working by self and can't add issues on Github
//
// issue to fix 1
// once you've created your character your prompted with or if you are attempting to load
// "Do you want to view your Character Sheet, level up or exit the program? (Please use keywords view, level, or exit)"
// if you pick view you see your charter and closes (not good)
// if you pick level you level up you are told your current level (good)
// if you pick exit you exit (good)

// issue to fix 2
// when raising a stat by one during level up the program prints "Sorry I didn't catch that, please ..." even though you didn't input anything

// issue to fix 3
// after viewing character you are asked for a new character to search for. If you enter a character that doesn't exist you are kicked out to new or load