/**
 * Created by ros_jdscofield on 9/20/2017.
 */
import java.util.*;
import java.io.*;

public class CharacterManager {
    private Scanner console = new Scanner(System.in);
    private int TS;
    public CharacterManager() throws FileNotFoundException {
        Scanner totalSaves = new Scanner(new File("totalSaves.txt"));
        TS = totalSaves.nextInt();
    }
    //This method runs through the creation of a character and links each step together (currently unfinished)
    public void newCharacter() throws FileNotFoundException {
        int newTS = (TS + 1);
        PrintStream newChar = new PrintStream(new File("Character"+newTS+".txt"));
        PrintStream totalSaveChange = new PrintStream(new File("totalSaves.txt"));

        newName(newChar);
        Stats newAbil = new Stats();
        newStats(newAbil);

        newChar.println("0");
        for (int i = 0; i < 6; i++){
            newChar.println(newAbil.getStat(i));
        }
        totalSaveChange.println(newTS);
        TS = newTS;
    }
    // Assigns a name to new character and makes sure that there is no other character with that name
    public void newName(PrintStream newChar) throws FileNotFoundException {
        int loop = 1;
        while (loop == 1) {
            loop = 0;
            System.out.print("What do you want to name your character? ");
            String name = console.nextLine();
            for (int i = 1; i <= TS; i++) {
                if (charFinder(i, name) == true) {
                    System.out.println("I'm sorry but there is already a character with that name.");
                    loop++;
                }
            }
            if (loop == 0) {
                newChar.println(name);
            }
        }
    }
    // Connects with the Stats Class and assigns the stats to the character
    public void newStats(Stats newAbil) throws FileNotFoundException {
        int points = 0;
        int loop = 0;
        while (loop == 0){
            System.out.print("Are you playing on low, standard, high, or epic fantacy? ");
            String response = console.next();
            if (response.toLowerCase().equals("low")){
                loop++;
                points = 10;
                newAbil.newScore(points);
            }
            else if (response.toLowerCase().equals("standard")){
                loop++;
                points = 15;
                newAbil.newScore(points);
            }
            else if (response.toLowerCase().equals("high")){
                loop++;
                points = 20;
                newAbil.newScore(points);
            }
            else if (response.toLowerCase().equals("epic")){
                loop++;
                points = 25;
                newAbil.newScore(points);
            } else {
                System.out.println("I'm sorry I didn't catch that, please use the keywords low, standard, high, or epic");
            }
        }
    }

    // Loads up an already created character, currently can only comfirm that it found the character but not do anything with it
    public void loadCharacter() throws FileNotFoundException {
        int loop = 0;
        while (loop == 0) {
            System.out.print("What is the name of the character you are searching for? ");
            String target = console.nextLine();
            for (int i = 1; i <= TS; i++) {
                if (charFinder(i, target) == true) {
                    loop++;
                    System.out.println("Target found");
                }
            }
            if (loop == 0) {
                System.out.println("Sorry I couldn't find any character with that name");
            }
        }
    }

    //This looks through all of the created txt files to find one with a specific name
    private static boolean charFinder(int fileNum, String target) throws FileNotFoundException {
        Scanner search = new Scanner(new File("Character"+fileNum+".txt"));
        if (search.nextLine().equals(target)) {
            return true;
        } else {
            return false;
        }
    }
}