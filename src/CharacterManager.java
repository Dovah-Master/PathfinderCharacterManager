/**
 * Created by ros_jdscofield on 9/20/2017.
 */
import java.util.*;
import java.io.*;

public class CharacterManager {
    private Scanner console = new Scanner(System.in);
    private Stats Ability = new Stats();
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
        PrintStream classSkills = new PrintStream(new File("ClassSkills" + newTS + ".txt"));
        PrintStream totalSaveChange = new PrintStream(new File("totalSaves.txt"));

        newName(newChar);
        newChar.println(level);
        newStats();
        newRace(newChar, traitList);
        Class newClass = new Class(newClass(newChar));
        newClass.classHub(traitList, level, Ability, classSkills, "ability");
        newClass.classHub(traitList, level, Ability, classSkills, "skills");
        for (int i = 0; i < 6; i++){
            newChar.println(Ability.getStat(i));
        }
        Scanner currentChar = new Scanner(new File("Character" + newTS + ".txt"));
        Scanner traitListScanner = new Scanner(new File("TraitList" + newTS + ".txt"));
        Scanner classSkillsScanner = new Scanner(new File("ClassSkills" + newTS + ".txt"));
        totalSaveChange.println(newTS);
        TS = newTS;
        System.out.println("Congrats you have finished creating your character!");
        managementHub(currentChar, traitListScanner, classSkillsScanner, newTS);
    }

    private void managementHub(Scanner currentChar, Scanner traitListScan, Scanner classSkillsScan, int fileNum) throws FileNotFoundException {

        PrintStream traitList = new PrintStream(new File("TraitList" + fileNum + ".txt"));
        PrintStream classSkills = new PrintStream(new File("ClassSkills" + fileNum + ".txt"));
        System.out.print("Do you want to view your Character Sheet, level up or exit the program? (Please use keywords view, level, or exit) ");
        int loop = 0;
        while (loop == 0) {
            String response = console.nextLine();
            if (response.toLowerCase().equals("view")) {
                charSheet(currentChar, traitList, classSkills, fileNum);
                currentChar = new Scanner(new File("Character" + fileNum + ".txt"));

            }
            else if (response.toLowerCase().equals("level")) {
                levelUp(currentChar, fileNum);
                currentChar = new Scanner(new File("Character" + fileNum + ".txt"));
            }
            else if (response.toLowerCase().equals("exit")) {
                loop++;
                System.out.println("Goodbye");
            }
            else {
                System.out.println("Sorry I didn't catch that, please use keywords view, level or exit");
            }

        }
    }

    private void levelUp(Scanner currentChar, int fileNum) throws FileNotFoundException {
        String name = currentChar.nextLine();
        int level = (currentChar.nextInt() + 1);
        String race = currentChar.next();
        String currentClass = currentChar.next();
        Class classy = new Class(currentClass);
        int[] midStats = new int[6];
        for (int i = 0; i < 6; i++){
            midStats[i] = (currentChar.nextInt());
        }
        if (level%4 == 0) {
            System.out.println("At this level you get to raise a stat of your choice by one!");
            int loop = 0;
            while (loop == 0) {
                System.out.print("Please Choose a stat (STR, DEX, CON, INT, WIS, or CHA) ");
                String response = console.next();
                if (response.toUpperCase().equals("STR")) {
                    loop++;
                    midStats[0] = ( midStats[0] + 1 );
                } else if (response.toUpperCase().equals("DEX")) {
                    loop++;
                    midStats[1] = ( midStats[1] + 1 );
                } else if (response.toUpperCase().equals("CON")) {
                    loop++;
                    midStats[2] = ( midStats[2] + 1 );
                } else if (response.toUpperCase().equals("INT")) {
                    loop++;
                    midStats[3] = ( midStats[3] + 1 );
                } else if (response.toUpperCase().equals("WIS")) {
                    loop++;
                    midStats[4] = ( midStats[4] + 1 );
                } else if (response.toUpperCase().equals("CHA")) {
                    loop++;
                    midStats[5] = ( midStats[5] + 1 );
                } else {
                    System.out.println("I'm sorry I didn't catch that");
                }
            }
        }
        PrintStream charLevelUp = new PrintStream(new File("Character" + fileNum + ".txt"));
        charLevelUp.println(name);
        charLevelUp.println(level);
        charLevelUp.println(race + " " + currentClass);
        for (int i = 0; i < 6; i++){
            charLevelUp.println(midStats[i]);
        }
        System.out.println("Your character has been successfully leveled up!");
        System.out.println("Now do you want to view your character, level up again or exit the program? (Please use keywords view, level or exit)");

    }

    private void charSheet(Scanner currentChar, PrintStream traitList, PrintStream classSkills, int fileNum) throws FileNotFoundException {
        System.out.println("Character Name: " + currentChar.nextLine());
        int level = currentChar.nextInt();
        System.out.println("Level: " + level);
        System.out.print("Race & Class: " + currentChar.next() + " ");
        String currentClass = currentChar.next();
        System.out.println(currentClass);
        Class classy = new Class(currentClass);
        for (int i = 0; i < 6; i++){
            Ability.setStat(i, currentChar.nextInt());
        }
        classy.classHub(traitList, level, Ability, classSkills, "traits");
        classy.classHub(traitList, level, Ability, classSkills, "skills");
        classy.classHub(traitList, level, Ability, classSkills, "ability");
        Scanner traitListScan = new Scanner(new File("TraitListScan" + fileNum + ".txt"));
        Scanner classSkillsScan = new Scanner(new File("ClassSkillsScan" + fileNum + ".txt"));
        System.out.println("Strength: " + Ability.getStat(0) + " Ability Modifier: " + Ability.statBonus(Ability.getStat(0)));
        System.out.println("Dexterity: " + Ability.getStat(1) + " Ability Modifier: " + Ability.statBonus(Ability.getStat(1)));
        System.out.println("Constitution: " + Ability.getStat(2) + " Ability Modifier: " + Ability.statBonus(Ability.getStat(2)));
        System.out.println("Intelligence: " + Ability.getStat(3) + " Ability Modifier: " + Ability.statBonus(Ability.getStat(3)));
        System.out.println("Wisdom: " + Ability.getStat(4) + " Ability Modifier: " + Ability.statBonus(Ability.getStat(4)));
        System.out.println("Charisma: " + Ability.getStat(5) + " Ability Modifier: " + Ability.statBonus(Ability.getStat(5)));
        System.out.println("Hit Points: " + classy.getHitPoints());
        System.out.println("Base Attack Bonus: " + classy.getAttackBonus());
        System.out.println("Fortitude Save: " + (classy.getFort() + Ability.statBonus(Ability.getStat(2))));
        System.out.println("Reflex Save: " + (classy.getRef() + Ability.statBonus(Ability.getStat(1))));
        System.out.println("Will Save: " + (classy.getWill() + Ability.statBonus(Ability.getStat(4))));
        System.out.println("Total Skill Ranks Available: " + (classy.getSkillRanks() + Ability.statBonus(Ability.getStat(3))*level));
        System.out.println("Skill Proficiencies: ");
        while (classSkillsScan.hasNext()){
            System.out.println("    " + classSkillsScan.nextLine());
        }
        System.out.println("Feats Available: " + level/2);
        System.out.println("Character Traits: ");
        while (traitListScan.hasNext()){
            System.out.println("    " + traitListScan.nextLine());
        }
        System.out.print("Now do you want to view your character again, level up or exit the program? (Please use keywords view, level or exit) ");
    }

    // Assigns a name to new character and makes sure that there is no other character with that name
    private void newName(PrintStream newChar) throws FileNotFoundException {
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
    private void newStats() throws FileNotFoundException {
        int points;
        int loop = 0;
        while (loop == 0){
            System.out.print("Are you playing on low, standard, high, or epic fantasy? ");
            String response = console.next();
            if (response.toLowerCase().equals("low")){
                loop++;
                points = 10;
                Ability.newScore(points);
            }
            else if (response.toLowerCase().equals("standard")){
                loop++;
                points = 15;
                Ability.newScore(points);
            }
            else if (response.toLowerCase().equals("high")){
                loop++;
                points = 20;
                Ability.newScore(points);
            }
            else if (response.toLowerCase().equals("epic")){
                loop++;
                points = 25;
                Ability.newScore(points);
            } else {
                System.out.println("I'm sorry I didn't catch that, please use the keywords low, standard, high, or epic");
            }
        }
    }
    // Lets user pick a race and system will automatically make changes to ability scores and add to trait list
    private void newRace(PrintStream newChar, PrintStream traitList) throws FileNotFoundException {
        System.out.println("Please select a race, you choices are: Dwarf, Elf, Gnome, Half-Elf, Half-Orc, Halfling or Human");
        int loop = 0;
        while (loop == 0) {
            String response = console.next();
            if (response.toLowerCase().equals("dwarf")) {
                loop++;
                newChar.print("Dwarven ");
                Ability.setStat(2, Ability.getStat(2) + 2 );
                Ability.setStat(4, Ability.getStat(4) + 2 );
                Ability.setStat(5, Ability.getStat(5) - 2 );
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
                Ability.setStat(1, Ability.getStat(1) + 2 );
                Ability.setStat(3, Ability.getStat(3) + 2 );
                Ability.setStat(2, Ability.getStat(2) - 2 );
                traitList.println("Medium");
                traitList.println("Normal Speed");
                traitList.println("Low-Light Vision");
                traitList.println("Elven Immunities");
                traitList.println("Elven Magic");
                traitList.println("Keen Senses");
            } else if (response.toLowerCase().equals("gnome")) {
                loop++;
                newChar.print("Gnome ");
                Ability.setStat(2, Ability.getStat(2) + 2 );
                Ability.setStat(5, Ability.getStat(5) + 2 );
                Ability.setStat(0, Ability.getStat(0) - 2 );
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
                System.out.println("This race let's you choose a stat and raise it by two");
                while (loop == 1) {
                    System.out.print("Please Choose a stat (STR, DEX, CON, INT, WIS, or CHA) ");
                    response = console.next();
                    if (response.toUpperCase().equals("STR")) {
                        loop++;
                        Ability.setStat(0, Ability.getStat(0) + 2 );
                    } else if (response.toUpperCase().equals("DEX")) {
                        loop++;
                        Ability.setStat(1, Ability.getStat(1) + 2 );
                    } else if (response.toUpperCase().equals("CON")) {
                        loop++;
                        Ability.setStat(2, Ability.getStat(2) + 2 );
                    } else if (response.toUpperCase().equals("INT")) {
                        loop++;
                        Ability.setStat(3, Ability.getStat(3) + 2 );
                    } else if (response.toUpperCase().equals("WIS")) {
                        loop++;
                        Ability.setStat(4, Ability.getStat(4) + 2 );
                    } else if (response.toUpperCase().equals("CHA")) {
                        loop++;
                        Ability.setStat(5, Ability.getStat(5) + 2 );
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
                System.out.println("This race let's you choose a stat and raise it by two");
                while (loop == 1) {
                    System.out.print("Please Choose a stat (STR, DEX, CON, INT, WIS, or CHA) ");
                    response = console.next();
                    if (response.toUpperCase().equals("STR")) {
                        loop++;
                        Ability.setStat(0, Ability.getStat(0) + 2 );
                    } else if (response.toUpperCase().equals("DEX")) {
                        loop++;
                        Ability.setStat(1, Ability.getStat(1) + 2 );
                    } else if (response.toUpperCase().equals("CON")) {
                        loop++;
                        Ability.setStat(2, Ability.getStat(2) + 2 );
                    } else if (response.toUpperCase().equals("INT")) {
                        loop++;
                        Ability.setStat(3, Ability.getStat(3) + 2 );
                    } else if (response.toUpperCase().equals("WIS")) {
                        loop++;
                        Ability.setStat(4, Ability.getStat(4) + 2 );
                    } else if (response.toUpperCase().equals("CHA")) {
                        loop++;
                        Ability.setStat(5, Ability.getStat(5) + 2 );
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
                Ability.setStat(1, Ability.getStat(1) + 2 );
                Ability.setStat(5, Ability.getStat(5) + 2 );
                Ability.setStat(0, Ability.getStat(0) - 2 );
                traitList.println("Small");
                traitList.println("Fearless");
                traitList.println("Halfling Luck");
                traitList.println("Keen Senses");
                traitList.println("Sure-Footed");
            } else if (response.toLowerCase().equals("human")) {
                loop++;
                newChar.print("Human ");
                System.out.println("This race let's you choose a stat and raise it by two");
                while (loop == 1) {
                    System.out.print("Please Choose a stat (STR, DEX, CON, INT, WIS, or CHA) ");
                    response = console.next();
                    if (response.toUpperCase().equals("STR")) {
                        loop++;
                        Ability.setStat(0, Ability.getStat(0) + 2 );
                    } else if (response.toUpperCase().equals("DEX")) {
                        loop++;
                        Ability.setStat(1, Ability.getStat(1) + 2 );
                    } else if (response.toUpperCase().equals("CON")) {
                        loop++;
                        Ability.setStat(2, Ability.getStat(2) + 2 );
                    } else if (response.toUpperCase().equals("INT")) {
                        loop++;
                        Ability.setStat(3, Ability.getStat(3) + 2 );
                    } else if (response.toUpperCase().equals("WIS")) {
                        loop++;
                        Ability.setStat(4, Ability.getStat(4) + 2 );
                    } else if (response.toUpperCase().equals("CHA")) {
                        loop++;
                        Ability.setStat(5, Ability.getStat(5) + 2 );
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

    //Allows users to select their class of choice
    private String newClass(PrintStream newChar) {
        System.out.println("Please select your class, your choices are:");
        System.out.println("Barbarian, Bard, Cleric, Druid, Fighter, Monk, Paladin, Ranger, Rogue, Sorcerer, or Wizard");
        int loop = 0;
        while (loop == 0) {
            String response = console.next();
            if (response.toLowerCase().equals("barbarian")) {
                loop++;
                newChar.println("Barbarian");
                return "barbarian";
            } else if (response.toLowerCase().equals("bard")) {
                loop++;
                newChar.println("Bard");
                return "bard";
            } else if (response.toLowerCase().equals("cleric")) {
                loop++;
                newChar.println("Cleric");
                return "cleric";
            } else if (response.toLowerCase().equals("druid")) {
                loop++;
                newChar.println("Druid");
                return "druid";
            } else if (response.toLowerCase().equals("fighter")) {
                loop++;
                newChar.println("Fighter");
                return "fighter";
            } else if (response.toLowerCase().equals("monk")) {
                loop++;
                newChar.println("Monk");
                return "monk";
            } else if (response.toLowerCase().equals("paladin")) {
                loop++;
                newChar.println("Paladin");
                return "paladin";
            } else if (response.toLowerCase().equals("ranger")) {
                loop++;
                newChar.println("Ranger");
                return "ranger";
            } else if (response.toLowerCase().equals("rogue")) {
                loop++;
                newChar.println("Rogue");
                return "rogue";
            } else if (response.toLowerCase().equals("sorcerer")) {
                loop++;
                newChar.println("Sorcerer");
                return "sorcerer";
            } else if (response.toLowerCase().equals("wizard")) {
                loop++;
                newChar.println("Wizard");
                return "wizard";
            } else {
                System.out.println("I'm sorry I didn't catch that, please enter the class you want");
            }
        }
        return "";
    }

    // Loads up an already created character, currently can only confirm that it found the character but not do anything with it
    public void loadCharacter() throws FileNotFoundException {
        int loop = 0;
        while (loop == 0) {
            System.out.print("What is the name of the character you are searching for? ");
            String target = console.nextLine();
            for (int i = 1; i <= TS; i++) {
                if (charFinder(i, target) == true) {
                    loop++;
                    Scanner currentChar = new Scanner(new File("Character" + i + ".txt"));
                    Scanner traitList = new Scanner(new File("TraitList" + i + ".txt"));
                    Scanner classSkills = new Scanner(new File("ClassSkills" + i + ".txt"));
                    System.out.println("Your character has been located!");
                    managementHub(currentChar, traitList, classSkills, i);
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