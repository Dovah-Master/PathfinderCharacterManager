/**
 * Created by ros_jdscofield on 10/3/2017.
 */
import java.io.*;

public class Class {
    private String currentClass;
    private int hitPoints;
    private int attackBonus;
    private int fort;
    private int ref;
    private int will;
    private int skillRanks;

    public Class(String setClass) {
        currentClass = setClass;
    }

    public void classHub(PrintStream traitList, int level, Stats ability, PrintStream classSkills, String access) {

        if (currentClass.equals("barbarian")) {
            if (access.equals("traits")){
                barbarianTraits(level, traitList);
            }
            else if (access.equals("ability")){
                barbarianAbility(level, ability);
            }
            else if (access.equals("skills")){
                barbarianSkills(classSkills);
            }
        } else if (currentClass.equals("bard")) {
            if (access.equals("traits")){
                bardTraits(level, traitList);
            }
            else if (access.equals("ability")){
                bardAbility(level, ability);
            }
            else if (access.equals("skills")){
                bardSkills(classSkills);
            }
        } else if (currentClass.equals("cleric")) {
            if (access.equals("traits")){
                clericTraits(level, traitList);
            }
            else if (access.equals("ability")){
                clericAbility(level, ability);
            }
            else if (access.equals("skills")){
                clericSkills(classSkills);
            }
        } else if (currentClass.equals("druid")) {
            if (access.equals("traits")){
                druidTraits(level, traitList);
            }
            else if (access.equals("ability")){
                druidAbility(level, ability);
            }
            else if (access.equals("skills")){
                druidSkills(classSkills);
            }
        } else if (currentClass.equals("fighter")) {
            if (access.equals("traits")){
                fighterTraits(level, traitList);
            }
            else if (access.equals("ability")){
                fighterAbility(level, ability);
            }
            else if (access.equals("skills")){
                fighterSkills(classSkills);
            }
        } else if (currentClass.equals("monk")) {
            if (access.equals("traits")){
                monkTraits(level, traitList);
            }
            else if (access.equals("ability")){
                monkAbility(level, ability);
            }
            else if (access.equals("skills")){
                monkSkills(classSkills);
            }
        } else if (currentClass.equals("paladin")) {
            if (access.equals("traits")){
                paladinTraits(level, traitList);
            }
            else if (access.equals("ability")){
                paladinAbility(level, ability);
            }
            else if (access.equals("skills")){
                paladinSkills(classSkills);
            }
        } else if (currentClass.equals("ranger")) {
            if (access.equals("traits")){
                rangerTraits(level, traitList);
            }
            else if (access.equals("ability")){
                rangerAbility(level, ability);
            }
            else if (access.equals("skills")){
                rangerSkills(classSkills);
            }
        } else if (currentClass.equals("rogue")) {
            if (access.equals("traits")){
                rogueTraits(level, traitList);
            }
            else if (access.equals("ability")){
                rogueAbility(level, ability);
            }
            else if (access.equals("skills")){
                rogueSkills(classSkills);
            }
        } else if (currentClass.equals("sorcerer")) {
            if (access.equals("traits")){
                sorcererTraits(level, traitList);
            }
            else if (access.equals("ability")){
                sorcererAbility(level, ability);
            }
            else if (access.equals("skills")){
                sorcererSkills(classSkills);
            }
        } else if (currentClass.equals("wizard")) {
            if (access.equals("traits")){
                wizardTraits(level, traitList);
            }
            else if (access.equals("ability")){
                wizardAbility(level, ability);
            }
            else if (access.equals("skills")){
                wizardSkills(classSkills);
            }
        }
    }

    private void barbarianTraits(int level, PrintStream traitList){
        if (level == 1) {
            traitList.println("Fast movement");
            traitList.println("Rage");

        } else if (level == 2) {
            traitList.println("1st Rage power");
            traitList.println("Uncanny dodge");

        } else if (level == 3) {
            traitList.println("Trap sense +1");

        } else if (level == 4) {
            traitList.println("2nd Rage power");

        } else if (level == 5) {
            traitList.println("Improved uncanny dodge");

        } else if (level == 6) {
            traitList.println("3rd Rage power");
            traitList.println("Trap sense +2");

        } else if (level == 7) {
            traitList.println("Damage reduction 1/-");

        } else if (level == 8) {
            traitList.println("4th Rage power");

        } else if (level == 9) {
            traitList.println("Trap sense +3");

        } else if (level == 10) {
            traitList.println("Damage reduction 2/-");
            traitList.println("5th Rage power");

        } else if (level == 11) {
            traitList.println("Greater rage");

        } else if (level == 12) {
            traitList.println("6th Rage power");
            traitList.println("Trap sense +4");

        } else if (level == 13) {
            traitList.println("Damage reduction 3/-");

        } else if (level == 14) {
            traitList.println("Indomitable will");
            traitList.println("7th Rage power");

        } else if (level == 15) {
            traitList.println("Trap sense +5");

        } else if (level == 16) {
            traitList.println("Damage reduction 4/-");
            traitList.println("8th Rage power");

        } else if (level == 17) {
            traitList.println("Tireless rage");

        } else if (level == 18) {
            traitList.println("9th Rage power");
            traitList.println("Trap sense +6");

        } else if (level == 19) {
            traitList.println("Damage reduction 5/-");

        } else if (level == 20) {
            traitList.println("Mighty rage");
            traitList.println("10th Rage power");

        }
    }
    private void bardTraits(int level, PrintStream traitList){
        if (level == 1) {
            traitList.println("Bardic knowledge");
            traitList.println("Bardic performances");
            traitList.println("Cantrips");
            traitList.println("Counter song");
            traitList.println("Distraction");
            traitList.println("Fascinate");
            traitList.println("Inspire courage +1");
        } else if (level == 2) {
            traitList.println("Versatile performance");
            traitList.println("Well-versed");
        } else if (level == 3) {
            traitList.println("Inspire competence");
        } else if (level == 4) {
            traitList.print("");

        } else if (level == 5) {
            traitList.println("Inspire courage +2");
            traitList.println("Lore master 1/day");
        } else if (level == 6) {
            traitList.println("Suggestion");
            traitList.println("2nd Versatile performance");
        } else if (level == 7) {
            traitList.println("Inspire competence +3");
        } else if (level == 8) {
            traitList.println("Dirge of doom");
        } else if (level == 9) {
            traitList.println("Inspire greatness");
        } else if (level == 10) {
            traitList.println("Jack of all trades");
            traitList.println("3rd Versatile performance");
        } else if (level == 11) {
            traitList.println("Inspire competence +4");
            traitList.println("Inspire courage +3");
            traitList.println("Lore master 2/day");
        } else if (level == 12) {
            traitList.println("Soothing performance");
        } else if (level == 13) {
            traitList.print("");
        } else if (level == 14) {
            traitList.println("Frightening tune");
            traitList.println("4th Versatile performance");
        } else if (level == 15) {
            traitList.println("Inspire competence +5");
            traitList.println("Inspire heroics");
        } else if (level == 16) {
            traitList.print("");
        } else if (level == 17) {
            traitList.println("Inspire courage +4");
            traitList.println("Lore master 3/day");
        } else if (level == 18) {
            traitList.println("Mass suggestion");
            traitList.println("5th Versatile performance");
        } else if (level == 19) {
            traitList.println("Inspire competence +6");
        } else if (level == 20) {
            traitList.println("Deadly performance");
        }
    }
    private void clericTraits(int level, PrintStream traitList){
        if (level == 1) {
            traitList.println("Aura");
            traitList.println("Chanel energy 1d6");
            traitList.println("Domains");
            traitList.println("Orisons");
        } else if (level == 2) {
            traitList.print("");
        } else if (level == 3) {
            traitList.println("Channel energy 2d6");
        } else if (level == 4) {
            traitList.print("");
        } else if (level == 5) {
            traitList.println("Channel energy 3d6");
        } else if (level == 6) {
            traitList.print("");
        } else if (level == 7) {
            traitList.println("Channel energy 4d6");
        } else if (level == 8) {
            traitList.print("");
        } else if (level == 9) {
            traitList.println("Channel energy 5d6");
        } else if (level == 10) {
            traitList.print("");
        } else if (level == 11) {
            traitList.println("Channel energy 6d6");
        } else if (level == 12) {
            traitList.print("");
        } else if (level == 13) {
            traitList.println("Channel energy 7d6");
        } else if (level == 14) {
            traitList.print("");
        } else if (level == 15) {
            traitList.println("Channel energy 8d6");
        } else if (level == 16) {
            traitList.print("");
        } else if (level == 17) {
            traitList.println("Channel energy 9d6");
        } else if (level == 18) {
            traitList.print("");
        } else if (level == 19) {
            traitList.println("Channel energy 10d6");
        } else if (level == 20) {
            traitList.print("");
        }
    }
    private void druidTraits(int level, PrintStream traitList){
        if (level == 1) {
            traitList.println("Nature bond");
            traitList.println("Nature sense");
            traitList.println("Orison");
            traitList.println("Wild empathy");
        } else if (level == 2) {
            traitList.println("Woodland stride");
        } else if (level == 3) {
            traitList.println("Trackless step");
        } else if (level == 4) {
            traitList.println("Resist nature's lure");
            traitList.println("Wild shape 1/day");
        } else if (level == 5) {
            traitList.print("");
        } else if (level == 6) {
            traitList.println("Wild shape 2/day");
        } else if (level == 7) {
            traitList.print("");
        } else if (level == 8) {
            traitList.println("Wild shape 3/day");
        } else if (level == 9) {
            traitList.println("Venom immunity");
        } else if (level == 10) {
            traitList.println("Wild shape 4/day");
        } else if (level == 11) {
            traitList.print("");
        } else if (level == 12) {
            traitList.println("Wild shape 5/day");
        } else if (level == 13) {
            traitList.println("A thousand faces");
        } else if (level == 14) {
            traitList.println("Wild shape 6/day");
        } else if (level == 15) {
            traitList.println("Timeless body");
        } else if (level == 16) {
            traitList.println("Wild shape 7/day");
        } else if (level == 17) {
            traitList.print("");
        } else if (level == 18) {
            traitList.println("Wild shape 8/day");
        } else if (level == 19) {
            traitList.print("");
        } else if (level == 20) {
            traitList.println("Wild shape (at will)");
        }
    }
    private void fighterTraits(int level, PrintStream traitList){
        if (level == 1) {
            traitList.println("1st Bonus feat");
        } else if (level == 2) {
            traitList.println("2nd Bonus feat");
            traitList.println("bravery +1");
        } else if (level == 3) {
            traitList.println("Armor training 1");
        } else if (level == 4) {
            traitList.println("3rd Bonus feat");
        } else if (level == 5) {
            traitList.println("Weapon training 1");
        } else if (level == 6) {
            traitList.println("4th Bonus feat");
            traitList.println("bravery +2");
        } else if (level == 7) {
            traitList.println("Armor training 2");
        } else if (level == 8) {
            traitList.println("5th Bonus feat");
        } else if (level == 9) {
            traitList.println("Weapon training 2");
        } else if (level == 10) {
            traitList.println("6th Bonus feat");
            traitList.println("bravery +3");
        } else if (level == 11) {
            traitList.println("Armor training 3");
        } else if (level == 12) {
            traitList.println("7th Bonus feat");
        } else if (level == 13) {
            traitList.println("Weapon training 3");
        } else if (level == 14) {
            traitList.println("8th Bonus feat");
            traitList.println("bravery +4");
        } else if (level == 15) {
            traitList.println("Armor training 4");
        } else if (level == 16) {
            traitList.println("9th Bonus feat");
        } else if (level == 17) {
            traitList.println("Weapon training 4");
        } else if (level == 18) {
            traitList.println("10th Bonus feat");
            traitList.println("bravery +5");
        } else if (level == 19) {
            traitList.println("Armor mastery");
        } else if (level == 20) {
            traitList.println("11th Bonus feat");
            traitList.println("Weapon mastery");
        }
    }
    private void monkTraits(int level, PrintStream traitList){
        if (level == 1) {
            traitList.println("1st Bonus feat");
            traitList.println("flurry of blows (-1/-1)");
            traitList.println("stunning fist");
            traitList.println("unarmed strike (1d6)");
        } else if (level == 2) {
            traitList.println("2nd Bonus feat");
            traitList.println("Evasion");
            traitList.println("flurry of blows (+0/+0)");
        } else if (level == 3) {
            traitList.println("Maneuver training");
            traitList.println("Still mind");
            traitList.println("Fast Movement +10ft");
            traitList.println("flurry of blows (+1/+1)");
        } else if (level == 4) {
            traitList.println("Slow fall 20ft");
            traitList.println("Ki pool (magic)");
            traitList.println("flurry of blows (+2/+2)");
            traitList.println("unarmed strike (1d8)");
        } else if (level == 5) {
            traitList.println("High jump");
            traitList.println("Purity of body");
            traitList.println("flurry of blows (+3/+3)");
        } else if (level == 6) {
            traitList.println("3rd Bonus feat");
            traitList.println("Slow fall 30ft");
            traitList.println("Fast Movement +20ft");
            traitList.println("flurry of blows (+4/+4/–1)");
        } else if (level == 7) {
            traitList.println("wholeness of body");
            traitList.println("Ki pool (cold iron/silver)");
            traitList.println("flurry of blows (+5/+5/+0)");
        } else if (level == 8) {
            traitList.println("Slow fall 40ft");
            traitList.println("flurry of blows (+6/+6/+1/+1)");
            traitList.println("unarmed strike (1d10)");
        } else if (level == 9) {
            traitList.println("Improved evasion");
            traitList.println("Fast Movement +30ft");
            traitList.println("flurry of blows (+7/+7/+2/+2)");
        } else if (level == 10) {
            traitList.println("4th Bonus feat");
            traitList.println("Slow fall 50ft");
            traitList.println("Ki pool (lawful)");
            traitList.println("flurry of blows (+8/+8/+3/+3)");
        } else if (level == 11) {
            traitList.println("Diamond body");
            traitList.println("flurry of blows (+9/+9/+4/+4/–1)");
        } else if (level == 12) {
            traitList.println("Abundant step");
            traitList.println("Slow fall 60ft");
            traitList.println("Fast Movement +40ft");
            traitList.println("flurry of blows (+10/+10/+5/+5/+0)");
            traitList.println("unarmed strike (2d6)");
        } else if (level == 13) {
            traitList.println("Diamond soul");
            traitList.println("flurry of blows (+11/+11/+6/+6/+1)");
        } else if (level == 14) {
            traitList.println("5th Bonus feat");
            traitList.println("Slow fall 70ft");
            traitList.println("flurry of blows (+12/+12/+7/+7/+2)");
        } else if (level == 15) {
            traitList.println("Quivering palm");
            traitList.println("Fast Movement +50ft");
            traitList.println("flurry of blows (+13/+13/+8/+8/+3/+3)");
        } else if (level == 16) {
            traitList.println("Slow fall 80ft");
            traitList.println("Ki pool (adamantine)");
            traitList.println("flurry of blows (+14/+14/+9/+9/+4/+4/–1)");
            traitList.println("unarmed strike (2d8)");
        } else if (level == 17) {
            traitList.println("Timeless body");
            traitList.println("Tongue of the sun and moon");
            traitList.println("flurry of blows (+15/+15/+10/+10/+5/+5/+0)");
        } else if (level == 18) {
            traitList.println("6th Bonus feat");
            traitList.println("Slow fall 90ft");
            traitList.println("Fast Movement +60ft");
            traitList.println("flurry of blows (+16/+16/+11/+11/+6/+6/+1)");
        } else if (level == 19) {
            traitList.println("Empty body");
            traitList.println("flurry of blows (+17/+17/+12/+12/+7/+7/+2)");
        } else if (level == 20) {
            traitList.println("Perfect self");
            traitList.println("Slow fall any distance");
            traitList.println("flurry of blows (+18/+18/+13/+13/+8/+8/+3)");
            traitList.println("unarmed strike (2d10)");
        }
    }
    private void paladinTraits(int level, PrintStream traitList){
        if (level == 1) {
            traitList.println("Aura of good");
            traitList.println("Detect evil");
            traitList.println("Smite evil 1/day");
        } else if (level == 2) {
            traitList.println("Divine grace");
            traitList.println("Lay on hands");
        } else if (level == 3) {
            traitList.println("Aura of courage");
            traitList.println("Divine health");
            traitList.println("1st Mercy");
        } else if (level == 4) {
            traitList.println("Channel positive energy");
            traitList.println("Smite evil 2/day");
        } else if (level == 5) {
            traitList.println("Divine bond");
        } else if (level == 6) {
            traitList.println("2nd Mercy");
        } else if (level == 7) {
            traitList.println("Smite evil 3/day");
        } else if (level == 8) {
            traitList.println("Aura of resolve");
        } else if (level == 9) {
            traitList.println("3rd Mercy");
        } else if (level == 10) {
            traitList.println("Smite evil 4/day");
        } else if (level == 11) {
            traitList.println("Aura of justice");
        } else if (level == 12) {
            traitList.println("4th Mercy");
        } else if (level == 13) {
            traitList.println("Smite evil 5/day");
        } else if (level == 14) {
            traitList.println("Aura of faith");
        } else if (level == 15) {
            traitList.println("5th Mercy");
        } else if (level == 16) {
            traitList.println("Smite evil 6/day");
        } else if (level == 17) {
            traitList.println("Aura of righteousness");
        } else if (level == 18) {
            traitList.println("6th Mercy");
        } else if (level == 19) {
            traitList.println("Smite evil 7/day");
        } else if (level == 20) {
            traitList.println("Holy champion");
        }
    }
    private void rangerTraits(int level, PrintStream traitList){
        if (level == 1) {
            traitList.println("1st Favored enemy");
            traitList.println("Track");
            traitList.println("Wild empathy");
        } else if (level == 2) {
            traitList.println("1st Combat style feat");
        } else if (level == 3) {
            traitList.println("Endurance");
            traitList.println("1st Favored terrain");
        } else if (level == 4) {
            traitList.println("Hunter's bond");
        } else if (level == 5) {
            traitList.println("2nd Favored enemy");
        } else if (level == 6) {
            traitList.println("2nd Combat style feat");
        } else if (level == 7) {
            traitList.println("Woodland stride");
        } else if (level == 8) {
            traitList.println("Swift tracker");
            traitList.println("2nd Favored terrain");
        } else if (level == 9) {
            traitList.println("Evasion");
        } else if (level == 10) {
            traitList.println("3rd Combat style feat");
            traitList.println("3rd Favored enemy");
        } else if (level == 11) {
            traitList.println("Quarry");
        } else if (level == 12) {
            traitList.println("Camouflage");
        } else if (level == 13) {
            traitList.println("3rd Favored terrain");
        } else if (level == 14) {
            traitList.println("4th Combat style feat");
        } else if (level == 15) {
            traitList.println("4th Favored enemy");
        } else if (level == 16) {
            traitList.println("Improved evasion");
        } else if (level == 17) {
            traitList.println("Hide in plain sight");
        } else if (level == 18) {
            traitList.println("5th Combat style feat");
            traitList.println("4th Favored terrain");
        } else if (level == 19) {
            traitList.println("Improved quarry");
        } else if (level == 20) {
            traitList.println("Master hunter");
            traitList.println("5th Favored enemy");
        }
    }
    private void rogueTraits(int level, PrintStream traitList){
        if (level == 1) {
            traitList.println("Trap finding");
            traitList.println("Sneak attack +1d6");
        } else if (level == 2) {
            traitList.println("Evasion");
            traitList.println("1st Rogue talent");
        } else if (level == 3) {
            traitList.println("Trap sense +1");
            traitList.println("Sneak attack +2d6");
        } else if (level == 4) {
            traitList.println("Uncanny dodge");
            traitList.println("2nd Rogue talent");
        } else if (level == 5) {
            traitList.println("Sneak attack +3d6");
        } else if (level == 6) {
            traitList.println("Trap sense +2");
            traitList.println("3rd Rogue talent");
        } else if (level == 7) {
            traitList.println("Sneak attack +4d6");
        } else if (level == 8) {
            traitList.println("Improved uncanny dodge");
            traitList.println("4th Rogue talent");
        } else if (level == 9) {
            traitList.println("Trap sense +3");
            traitList.println("Sneak attack +5d6");
        } else if (level == 10) {
            traitList.println("Advanced talents");
            traitList.println("5th Rogue talent");
        } else if (level == 11) {
            traitList.println("Sneak attack +6d6");
        } else if (level == 12) {
            traitList.println("Trap sense +4");
            traitList.println("6th Rogue talent");
        } else if (level == 13) {
            traitList.println("Sneak attack +7d6");
        } else if (level == 14) {
            traitList.println("7th Rogue talent");
        } else if (level == 15) {
            traitList.println("Trap sense +5");
            traitList.println("Sneak attack +8d6");
        } else if (level == 16) {
            traitList.println("8th Rogue talent");
        } else if (level == 17) {
            traitList.println("Sneak attack +9d6");
        } else if (level == 18) {
            traitList.println("Trap sense +6");
            traitList.println("9th Rogue talent");
        } else if (level == 19) {
            traitList.println("Sneak attack +10d6");
        } else if (level == 20) {
            traitList.println("Master strike");
            traitList.println("10th Rogue talent");
        }
    }
    private void sorcererTraits(int level, PrintStream traitList){
        if (level == 1) {
            traitList.println("Cantrips");
            traitList.println("Eschew materials");
            traitList.println("1st Bloodline power");
        } else if (level == 2) {
            traitList.print("");
        } else if (level == 3) {
            traitList.println("2nd Bloodline power");
            traitList.println("1st Bloodline spell");
        } else if (level == 4) {
            traitList.print("");
        } else if (level == 5) {
            traitList.println("2nd Bloodline spell");
        } else if (level == 6) {
            traitList.print("");
        } else if (level == 7) {
            traitList.println("1st Bloodline feat");
            traitList.println("3rd Bloodline spell");
        } else if (level == 8) {
            traitList.print("");
        } else if (level == 9) {
            traitList.println("3rd Bloodline power");
            traitList.println("4th Bloodline spell");
        } else if (level == 10) {
            traitList.print("");
        } else if (level == 11) {
            traitList.println("5th Bloodline spell");
        } else if (level == 12) {
            traitList.print("");
        } else if (level == 13) {
            traitList.println("2nd Bloodline feat");
            traitList.println("6th Bloodline spell");
        } else if (level == 14) {
            traitList.print("");
        } else if (level == 15) {
            traitList.println("4th Bloodline power");
            traitList.println("7th Bloodline spell");
        } else if (level == 16) {
            traitList.print("");
        } else if (level == 17) {
            traitList.println("8th Bloodline spell");
        } else if (level == 18) {
            traitList.print("");
        } else if (level == 19) {
            traitList.println("3rd Bloodline feat");
            traitList.println("9th Bloodline spell");
        } else if (level == 20) {
            traitList.println("5th Bloodline power");
        }
    }
    private void wizardTraits(int level, PrintStream traitList){
        if (level == 1) {
            traitList.println("Arcane bond");
            traitList.println("Arcane school");
            traitList.println("Cantrips");
            traitList.println("Scribe Scroll");
        } else if (level == 2) {
            traitList.print("");
        } else if (level == 3) {
            traitList.print("");
        } else if (level == 4) {
            traitList.print("");
        } else if (level == 5) {
            traitList.println("1st Bonus feat");
        } else if (level == 6) {
            traitList.print("");
        } else if (level == 7) {
            traitList.print("");
        } else if (level == 8) {
            traitList.print("");
        } else if (level == 9) {
            traitList.print("");
        } else if (level == 10) {
            traitList.println("2nd Bonus feat");
        } else if (level == 11) {
            traitList.print("");
        } else if (level == 12) {
            traitList.print("");
        } else if (level == 13) {
            traitList.print("");
        } else if (level == 14) {
            traitList.print("");
        } else if (level == 15) {
            traitList.println("3rd Bonus feat");
        } else if (level == 16) {
            traitList.print("");
        } else if (level == 17) {
            traitList.print("");
        } else if (level == 18) {
            traitList.print("");
        } else if (level == 19) {
            traitList.print("");
        } else if (level == 20) {
            traitList.println("4th Bonus feat");
        }
    }

    private void barbarianAbility(int level, Stats ability){
        hitPoints = (12  + ability.statBonus(ability.getStat(2))) + (6 + ability.statBonus(ability.getStat(2)) * (level-1));
        attackBonus = (level);
        fort = (level/2 + 2);
        ref = (level/3);
        will = (level/3);
    }
    private void bardAbility(int level, Stats ability){
        hitPoints = (8 + ability.statBonus(ability.getStat(2))) + (4 + ability.statBonus(ability.getStat(2)) * (level-1));
        attackBonus = (int)(level - (level/4.0));
        fort = (level/3);
        ref = (level/2 + 2);
        will = (level/2 + 2);
    }
    private void clericAbility(int level, Stats ability){
        hitPoints = (8 + ability.statBonus(ability.getStat(2))) + (4 + ability.statBonus(ability.getStat(2)) * (level-1));
        attackBonus = (int)(level - (level/4.0));
        fort = (level/2 + 2);
        ref = (level/3);
        will = (level/2 + 2);
    }
    private void druidAbility(int level, Stats ability){
        hitPoints = (8 + ability.statBonus(ability.getStat(2))) + (4 + ability.statBonus(ability.getStat(2)) * (level-1));
        attackBonus = (int)(level - (level/4.0));
        fort = (level/2 + 2);
        ref = (level/3);
        will = (level/2 + 2);
    }
    private void fighterAbility(int level, Stats ability){
        hitPoints = (10 + ability.statBonus(ability.getStat(2))) + (5 + ability.statBonus(ability.getStat(2)) * (level-1));
        attackBonus = (level);
        fort = (level/2 + 2);
        ref = (level/3);
        will = (level/3);
    }
    private void monkAbility(int level, Stats ability){
        hitPoints = (8 + ability.statBonus(ability.getStat(2))) + (4 + ability.statBonus(ability.getStat(2)) * (level-1));
        attackBonus = (int)(level - (level/4.0));
        fort = (level/2 + 2);
        ref = (level/2 + 2);
        will = (level/2 + 2);
    }
    private void paladinAbility(int level, Stats ability){
        hitPoints = (10 + ability.statBonus(ability.getStat(2))) + (5 + ability.statBonus(ability.getStat(2)) * (level-1));
        attackBonus = (level);
        fort = (level/2 + 2);
        ref = (level/3);
        will = (level/2 + 2);
    }
    private void rangerAbility(int level, Stats ability){
        hitPoints = (10 + ability.statBonus(ability.getStat(2))) + (5 + ability.statBonus(ability.getStat(2)) * (level-1));
        attackBonus = (level);
        fort = (level/2 + 2);
        ref = (level/2 + 2);
        will = (level/3);
    }
    private void rogueAbility(int level, Stats ability){
        hitPoints = (8 + ability.statBonus(ability.getStat(2))) + (4 + ability.statBonus(ability.getStat(2)) * (level-1));
        attackBonus = (int)(level - (level/4.0));
        fort = (level/3);
        ref = (level/2 + 2);
        will = (level/3);
    }
    private void sorcererAbility(int level, Stats ability){
        hitPoints = (6 + ability.statBonus(ability.getStat(2))) + (3 + ability.statBonus(ability.getStat(2)) * (level-1));
        attackBonus = (level/2);
        fort = (level/3);
        ref = (level/3);
        will = (level/2 + 2);
    }
    private void wizardAbility(int level, Stats ability){
        hitPoints = (6 + ability.statBonus(ability.getStat(2))) + (3 + ability.statBonus(ability.getStat(2)) * (level-1));
        attackBonus = (level/2);
        fort = (level/3);
        ref = (level/3);
        will = (level/2 + 2);
    }

    private void barbarianSkills(PrintStream classSkills){
        skillRanks = 4;
        classSkills.println("Acrobatics");
        classSkills.println("Climb");
        classSkills.println("Craft");
        classSkills.println("Handle Animal");
        classSkills.println("Intimidate");
        classSkills.println("Knowledge nature");
        classSkills.println("Perception");
        classSkills.println("Ride");
        classSkills.println("Survival");
        classSkills.println("Swim");
    }
    private void bardSkills(PrintStream classSkills){
        skillRanks = 6;
        classSkills.println("Acrobatics");
        classSkills.println("Appraise");
        classSkills.println("Bluff");
        classSkills.println("Climb");
        classSkills.println("Craft");
        classSkills.println("Diplomacy");
        classSkills.println("Disguise");
        classSkills.println("Escape Artist");
        classSkills.println("Intimidate");
        classSkills.println("Knowledge arcana");
        classSkills.println("Knowledge dungeoneering");
        classSkills.println("Knowledge engineering");
        classSkills.println("Knowledge geography");
        classSkills.println("Knowledge history");
        classSkills.println("Knowledge local");
        classSkills.println("Knowledge nature");
        classSkills.println("Knowledge nobility");
        classSkills.println("Knowledge planes");
        classSkills.println("Knowledge religion");
        classSkills.println("Linguistics");
        classSkills.println("Perception");
        classSkills.println("Perform");
        classSkills.println("Profession");
        classSkills.println("Sense Motive");
        classSkills.println("Sleight of Hand");
        classSkills.println("Spellcraft");
        classSkills.println("Stealth");
        classSkills.println("Use Magic Devise");

    }
    private void clericSkills(PrintStream classSkills){
        skillRanks = 2;
        classSkills.println("Appraise");
        classSkills.println("Craft");
        classSkills.println("Diplomacy");
        classSkills.println("Heal");
        classSkills.println("Knowledge arcana");
        classSkills.println("Knowledge history");
        classSkills.println("Knowledge nobility");
        classSkills.println("Knowledge planes");
        classSkills.println("Knowledge religion");
        classSkills.println("Linguistics");
        classSkills.println("Profession");
        classSkills.println("Sense Motive");
        classSkills.println("Spellcraft");
    }
    private void druidSkills(PrintStream classSkills){
        skillRanks = 4;
        classSkills.println("Climb");
        classSkills.println("Craft");
        classSkills.println("Fly");
        classSkills.println("Handle Animal");
        classSkills.println("Heal");
        classSkills.println("Knowledge geography");
        classSkills.println("Knowledge nature");
        classSkills.println("Perception");
        classSkills.println("Profession");
        classSkills.println("Ride");
        classSkills.println("Spellcraft");
        classSkills.println("Survival");
        classSkills.println("Swim");
    }
    private void fighterSkills(PrintStream classSkills){
        skillRanks = 2;
        classSkills.println("Climb");
        classSkills.println("Craft");
        classSkills.println("Handle Animal");
        classSkills.println("Intimidate");
        classSkills.println("Knowledge dungeoneering");
        classSkills.println("Knowledge engineering");
        classSkills.println("Profession");
        classSkills.println("Ride");
        classSkills.println("Survival");
        classSkills.println("Swim");
    }
    private void monkSkills(PrintStream classSkills){
        skillRanks = 4;
        classSkills.println("Acrobatics");
        classSkills.println("Climb");
        classSkills.println("Craft");
        classSkills.println("Escape Artist");
        classSkills.println("Intimidate");
        classSkills.println("Knowledge history");
        classSkills.println("Knowledge religion");
        classSkills.println("Perception");
        classSkills.println("Perform");
        classSkills.println("Profession");
        classSkills.println("Ride");
        classSkills.println("Sense Motive");
        classSkills.println("Stealth");
        classSkills.println("Swim");
    }
    private void paladinSkills(PrintStream classSkills){
        skillRanks = 2;
        classSkills.println("Craft");
        classSkills.println("Diplomacy");
        classSkills.println("Handle Animal");
        classSkills.println("Heal");
        classSkills.println("Knowledge nobility");
        classSkills.println("Knowledge religion");
        classSkills.println("Profession");
        classSkills.println("Ride");
        classSkills.println("Sense Motive");
        classSkills.println("Spellcraft");
    }
    private void rangerSkills(PrintStream classSkills){
        skillRanks = 6;
        classSkills.println("Climb");
        classSkills.println("Craft");
        classSkills.println("Handle Animal");
        classSkills.println("Heal");
        classSkills.println("Intimidate");
        classSkills.println("Knowledge dungeoneering");
        classSkills.println("Knowledge geography");
        classSkills.println("Knowledge nature");
        classSkills.println("Perception");
        classSkills.println("Profession");
        classSkills.println("Ride");
        classSkills.println("Spellcraft");
        classSkills.println("Stealth");
        classSkills.println("Survival");
        classSkills.println("Swim");
    }
    private void rogueSkills(PrintStream classSkills){
        skillRanks = 8;
        classSkills.println("Acrobatics");
        classSkills.println("Appraise");
        classSkills.println("Bluff");
        classSkills.println("Climb");
        classSkills.println("Craft");
        classSkills.println("Diplomacy");
        classSkills.println("Disable Devise");
        classSkills.println("Disguise");
        classSkills.println("Escape Artist");
        classSkills.println("Intimidate");
        classSkills.println("Knowledge dungeoneering");
        classSkills.println("Knowledge local");
        classSkills.println("Linguistics");
        classSkills.println("Perception");
        classSkills.println("Perform");
        classSkills.println("Profession");
        classSkills.println("Sense Motive");
        classSkills.println("Sleight of Hand");
        classSkills.println("Stealth");
        classSkills.println("Swim");
        classSkills.println("Use Magic Device");
    }
    private void sorcererSkills(PrintStream classSkills){
        skillRanks = 2;
        classSkills.println("Appraise");
        classSkills.println("Bluff");
        classSkills.println("Craft");
        classSkills.println("Fly");
        classSkills.println("Intimidate");
        classSkills.println("Knowledge arcana");
        classSkills.println("Profession");
        classSkills.println("Spellcraft");
        classSkills.println("Use Magic Device");
    }
    private void wizardSkills(PrintStream classSkills){
        skillRanks = 2;
        classSkills.println("Appraise");
        classSkills.println("Craft");
        classSkills.println("Fly");
        classSkills.println("Knowledge arcana");
        classSkills.println("Knowledge dungeoneering");
        classSkills.println("Knowledge engineering");
        classSkills.println("Knowledge geography");
        classSkills.println("Knowledge history");
        classSkills.println("Knowledge local");
        classSkills.println("Knowledge nature");
        classSkills.println("Knowledge nobility");
        classSkills.println("Knowledge planes");
        classSkills.println("Knowledge religion");
        classSkills.println("Linguistics");
        classSkills.println("Profession");
        classSkills.println("Spellcraft");

    }

    public int getHitPoints() { return hitPoints; }
    public int getAttackBonus() { return attackBonus; }
    public int getFort() { return fort; }
    public int getRef() { return ref; }
    public int getWill() { return will; }
    public int getSkillRanks() { return skillRanks; }
}
