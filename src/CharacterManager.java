/**
 * Created by ros_jdscofield on 9/20/2017.
 */
import java.util.*;
import java.io.*;

public class CharacterManager {
    private Scanner console = new Scanner(System.in);
    Stats newAbil = new Stats();
    private int TS;
    public CharacterManager() throws FileNotFoundException {
        Scanner totalSaves = new Scanner(new File("totalSaves.txt"));
        TS = totalSaves.nextInt();
    }

    //This method runs through the creation of a character and links each step together (currently unfinished)
    public void newCharacter() throws FileNotFoundException {
        int level = 1;
        int newTS = (TS + 1);
        PrintStream newChar = new PrintStream(new File("Character" + newTS + ".txt"));
        PrintStream traitList = new PrintStream(new File("TraitList" + newTS + ".txt"));
        PrintStream totalSaveChange = new PrintStream(new File("totalSaves.txt"));

        newName(newChar);
        newChar.println(level);
        newStats();

        newRace(newChar, traitList);

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
    public void newStats() throws FileNotFoundException {
        int points = 0;
        int loop = 0;
        while (loop == 0){
            System.out.print("Are you playing on low, standard, high, or epic fantasy? ");
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
    // Lets user pick a race and system will automatically make changes to ability scores and add to trait list
    public void newRace(PrintStream newChar, PrintStream traitList) throws FileNotFoundException {
        System.out.println("Please select a race, you choices are: Dwarf, Elf, Gnome, Half-Elf, Half-Orc, Halfling or Human");
        int loop = 0;
        while (loop == 0) {
            String response = console.next();
            if (response.toLowerCase().equals("dwarf")) {
                loop++;
                newChar.print("Dwarven ");
                newAbil.setStat(2, newAbil.getStat(2) + 2 );
                newAbil.setStat(4, newAbil.getStat(4) + 2 );
                newAbil.setStat(5, newAbil.getStat(5) - 2 );
                traitList.println("Medium");
                traitList.println("Slow and Steady");
                traitList.println("Darkvision");
                traitList.println("Defensive Training");
                traitList.println("Greed");
                traitList.println("Hatred");
                traitList.println("Hardy");
                traitList.println("Stability");
                traitList.println("StoneCunning");
            } else if (response.toLowerCase().equals("elf")) {
                loop++;
                newChar.print("Elven ");
                newAbil.setStat(1, newAbil.getStat(1) + 2 );
                newAbil.setStat(3, newAbil.getStat(3) + 2 );
                newAbil.setStat(2, newAbil.getStat(2) - 2 );
                traitList.println("Medium");
                traitList.println("Normal Speed");
                traitList.println("Low-Light Vision");
                traitList.println("Elven Immunities");
                traitList.println("Elven Magic");
                traitList.println("Keen Senses");
            } else if (response.toLowerCase().equals("gnome")) {
                loop++;
                newChar.print("Gnome ");
                newAbil.setStat(2, newAbil.getStat(2) + 2 );
                newAbil.setStat(5, newAbil.getStat(5) + 2 );
                newAbil.setStat(0, newAbil.getStat(0) - 2 );
                traitList.println("Small");
                traitList.println("Low-Light Vision");
                traitList.println("Defensive Training");
                traitList.println("Gnome Magic");
                traitList.println("Hatred");
                traitList.println("Illusion Resistance");
                traitList.println("Keen Senses");
                traitList.println("Obsessive");
            } else if (response.toLowerCase().equals("half-elf")) {
                loop++;
                newChar.print("Half-Elven ");
                while (loop == 1) {
                    System.out.print("Please Choose a stat (STR, DEX, CON, INT, WIS, or CHA) ");
                    if (response.toUpperCase().equals("STR")) {
                        loop++;
                        newAbil.setStat(0, newAbil.getStat(0) + 2 );
                    } else if (response.toUpperCase().equals("DEX")) {
                        loop++;
                        newAbil.setStat(1, newAbil.getStat(1) + 2 );
                    } else if (response.toUpperCase().equals("CON")) {
                        loop++;
                        newAbil.setStat(2, newAbil.getStat(2) + 2 );
                    } else if (response.toUpperCase().equals("INT")) {
                        loop++;
                        newAbil.setStat(3, newAbil.getStat(3) + 2 );
                    } else if (response.toUpperCase().equals("WIS")) {
                        loop++;
                        newAbil.setStat(4, newAbil.getStat(4) + 2 );
                    } else if (response.toUpperCase().equals("CHA")) {
                        loop++;
                        newAbil.setStat(5, newAbil.getStat(5) + 2 );
                    } else {
                        System.out.println("I'm sorry I didn't catch that");
                    }
                }
                traitList.println("Medium");
                traitList.println("Normal Speed");
                traitList.println("Low-Light Vision");
                traitList.println("Adaptability");
                traitList.println("Elf Blood");
                traitList.println("Elven Immunities");
                traitList.println("Keen Senses");
                traitList.println("Multitalented");
            } else if (response.toLowerCase().equals("half-orc")) {
                loop++;
                newChar.print("Half-Orc ");
                while (loop == 1) {
                    System.out.print("Please Choose a stat (STR, DEX, CON, INT, WIS, or CHA) ");
                    if (response.toUpperCase().equals("STR")) {
                        loop++;
                        newAbil.setStat(0, newAbil.getStat(0) + 2 );
                    } else if (response.toUpperCase().equals("DEX")) {
                        loop++;
                        newAbil.setStat(1, newAbil.getStat(1) + 2 );
                    } else if (response.toUpperCase().equals("CON")) {
                        loop++;
                        newAbil.setStat(2, newAbil.getStat(2) + 2 );
                    } else if (response.toUpperCase().equals("INT")) {
                        loop++;
                        newAbil.setStat(3, newAbil.getStat(3) + 2 );
                    } else if (response.toUpperCase().equals("WIS")) {
                        loop++;
                        newAbil.setStat(4, newAbil.getStat(4) + 2 );
                    } else if (response.toUpperCase().equals("CHA")) {
                        loop++;
                        newAbil.setStat(5, newAbil.getStat(5) + 2 );
                    } else {
                        System.out.println("I'm sorry I didn't catch that");
                    }
                }
                traitList.println("Medium");
                traitList.println("Normal Speed");
                traitList.println("Darkvision");
                traitList.println("Intimidating");
                traitList.println("Orc Blood");
                traitList.println("Orc Ferocity");
            } else if (response.toLowerCase().equals("halfling")) {
                loop++;
                newChar.print("Halfling ");
                newAbil.setStat(1, newAbil.getStat(1) + 2 );
                newAbil.setStat(5, newAbil.getStat(5) + 2 );
                newAbil.setStat(0, newAbil.getStat(0) - 2 );
                traitList.println("Small");
                traitList.println("Fearless");
                traitList.println("Halfling Luck");
                traitList.println("Keen Senses");
                traitList.println("Sure-Footed");
            } else if (response.toLowerCase().equals("human")) {
                loop++;
                newChar.print("Human ");
                while (loop == 1) {
                    System.out.print("Please Choose a stat (STR, DEX, CON, INT, WIS, or CHA) ");
                    if (response.toUpperCase().equals("STR")) {
                        loop++;
                        newAbil.setStat(0, newAbil.getStat(0) + 2 );
                    } else if (response.toUpperCase().equals("DEX")) {
                        loop++;
                        newAbil.setStat(1, newAbil.getStat(1) + 2 );
                    } else if (response.toUpperCase().equals("CON")) {
                        loop++;
                        newAbil.setStat(2, newAbil.getStat(2) + 2 );
                    } else if (response.toUpperCase().equals("INT")) {
                        loop++;
                        newAbil.setStat(3, newAbil.getStat(3) + 2 );
                    } else if (response.toUpperCase().equals("WIS")) {
                        loop++;
                        newAbil.setStat(4, newAbil.getStat(4) + 2 );
                    } else if (response.toUpperCase().equals("CHA")) {
                        loop++;
                        newAbil.setStat(5, newAbil.getStat(5) + 2 );
                    } else {
                        System.out.println("I'm sorry I didn't catch that");
                    }
                }
                traitList.println("Medium");
                traitList.println("Normal Speed");
                traitList.println("Bonus Feat");
                traitList.println("Skilled");
            } else {
                System.out.println("I'm sorry I didn't catch that, please select your race of choice");
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