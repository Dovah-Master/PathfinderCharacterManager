/**
 * Created by ros_jdscofield on 9/20/2017.
 */
import java.util.*;
import java.io.*;

public class Stats{
    private Scanner console = new Scanner(System.in);
    int[] stats = new int[6];
    public Stats(){
        for (int i = 0; i < 6; i++){
            stats[i] = 10;
        }
    }
    //test 11/2
    //Lets people choose what they want their ability score set to
    public void newScore(int points) throws FileNotFoundException {
        int newPoints = points;
        int loop = 0;
        while (loop == 0){
            System.out.println("You have " + newPoints + " points remaining");
            System.out.print("Please Choose a stat (STR, DEX, CON, INT, WIS, or CHA) ");
            String response = console.next();
            if (response.toUpperCase().equals("STR")){
                newPoints = setScore(0, newPoints);
            }
            else if (response.toUpperCase().equals("DEX")){
                newPoints = setScore(1, newPoints);
            }
            else if (response.toUpperCase().equals("CON")){
                newPoints = setScore(2, newPoints);
            }
            else if (response.toUpperCase().equals("INT")){
                newPoints = setScore(3, newPoints);
            }
            else if (response.toUpperCase().equals("WIS")){
                newPoints = setScore(4, newPoints);
            }
            else if (response.toUpperCase().equals("CHA")){
                newPoints = setScore(5, newPoints);
            }

            if (newPoints == 0) {
                loop++;
                System.out.println("Here are your current scores");
                System.out.println("STR: " + stats[0]);
                System.out.println("DEX: " + stats[1]);
                System.out.println("CON: " + stats[2]);
                System.out.println("INT: " + stats[3]);
                System.out.println("WIS: " + stats[4]);
                System.out.println("CHA: " + stats[5]);
                int loop2 = 0;
                while (loop2 == 0) {
                    System.out.print("Is this what you want? ");
                    response = console.next();
                    if (response.toLowerCase().equals("yes")) {
                        loop2++;
                    }
                    else if (response.toLowerCase().equals("no")) {
                        for (int i = 0; i < 6; i++){
                            stats[i] = 10;
                        }
                        newScore(points);
                    } else {
                        System.out.println("Sorry I didn't get that (please answer with yes or no)");
                    }
                }
            }
        }
    }

    //Sets an array to a given value and calculates how much abuility points are used up
    public int setScore(int stat, int points) throws FileNotFoundException {
        points = points + pointCost(stats[stat]);
        System.out.println("What do you want to set your stat to? Pick any value between 7-18");
        int value = console.nextInt();
        if ((value >= 7) && (value <= 18)){
            if (pointCost(value) <= points){
                stats[stat] = value;
                return points - pointCost(value);
            } else {
                System.out.println("I'm sorry but you don't have enough ability score to set it to this");
                return setScore(stat, points);
            }
        } else {
            System.out.println("I'm sorry but you can't pick that value");
            return setScore(stat, points);
        }
    }

    public int getStat(int val) {
        return stats[val];
    }
    public void setStat(int val, int newVal) { stats[val] = newVal; }


    //Returns the point cost of a given value
    public static int pointCost(int value) {
        if (value == 7) {
            return -4;
        }
        if (value == 8) {
            return -2;
        }
        if (value == 9) {
            return -1;
        }
        if (value == 10) {
            return 0;
        }
        if (value == 11) {
            return 1;
        }
        if (value == 12) {
            return 2;
        }
        if (value == 13) {
            return 3;
        }
        if (value == 14) {
            return 5;
        }
        if (value == 15) {
            return 7;
        }
        if (value == 16) {
            return 10;
        }
        if (value == 17) {
            return 13;
        }
        if (value == 18) {
            return 17;
        } else {
            return 0;
        }
    }
}