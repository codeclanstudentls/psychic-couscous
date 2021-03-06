package com.example.user.rockpaperscissors;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 14/12/2016.
 */
public class RockPaperScissors {

    private WeaponType weaponChosen;

    public WeaponType getWeapon(int input){

            switch(input) {
                case 1:
                    weaponChosen = WeaponType.ROCK;
                    break;
                case 2:
                    weaponChosen = WeaponType.PAPER;
                    break;
                case 3:
                    weaponChosen = WeaponType.SCISSORS;
                    break;
                case 4:
                    weaponChosen = WeaponType.LIZARD;
                    break;
                case 5:
                    weaponChosen = WeaponType.SPOCK;
                    break;
            }
        return weaponChosen;
    }

    public int getWeaponCount(){
        int countArrayLength = WeaponType.values().length;
        return countArrayLength;
    }

    public WeaponType computerChoice(){
        Random rand = new Random();
        int listSize = getWeaponCount();
        int index = rand.nextInt(listSize);
        return selectByIndex(index);
    }

    public WeaponType selectByIndex(int index){
        return WeaponType.values()[index];
    }

    public String compareWeapons(WeaponType playerChoice, WeaponType computerChoice){
        String result = null;

        switch(playerChoice){
            case ROCK:
                result = playerChoiceRock(computerChoice);
                break;
            case PAPER:
                result = playerChoicePaper(computerChoice);
                break;
            case SCISSORS:
                result = playerChoiceScissors(computerChoice);
                break;
            case LIZARD:
                result = playerChoiceLizard(computerChoice);
                break;
            case SPOCK:
                result = playerChoiceSpock(computerChoice);
                break;
        }
        return result;
    }

    public String playerChoiceRock(WeaponType computerChoice){
        String result = null;

        switch(computerChoice) {
            case ROCK:
                result = "Draw";
                break;
            case PAPER:
                result = "Paper beats Rock, you Lose!";
                break;
            case SCISSORS:
                result = "Rock crushes Scissors, you Lose!";
                break;
            case LIZARD:
                result = "Rock crushes Lizard, you Win!";
                break;
            case SPOCK:
                result = "Spock vapourises Rock, you Lose!";
                break;

        }
        return result;
    }

    public String playerChoicePaper(WeaponType computerChoice){
        String result = null;

        switch(computerChoice) {
            case PAPER:
                result = "Draw";
                break;
            case SCISSORS:
                result = "Scissors cuts Paper, you Lose!";
                break;
            case ROCK:
                result = "Paper covers Rock, you Win!";
                break;
            case LIZARD:
                result = "Lizard eats Paper, you Lose!";
                break;
            case SPOCK:
                result = "Paper disproves Spock, you Win!";
                break;
        }

        return result;
    }

    public String playerChoiceScissors(WeaponType computerChoice){
        String result = null;

        switch(computerChoice) {
            case SCISSORS:
                result = "Draw";
                break;
            case PAPER:
                result = "Scissors cuts Paper, you Win!";
                break;
            case ROCK:
                result = "Rock crushes Scissors, you Lose!";
                break;
            case LIZARD:
                result = "Scissors decapitates Lizard, you Win!";
                break;
            case SPOCK:
                result = "Spock smashes Scissors, you Lose!";
                break;
        }

        return result;
    }

    public String playerChoiceLizard(WeaponType computerChoice){
        String result = null;

        switch(computerChoice) {
            case SCISSORS:
                result = "Scissors decapitates Lizard, you Lose!";
                break;
            case PAPER:
                result = "Lizard eats Paper, you Win!";
                break;
            case ROCK:
                result = "Rock crushes Lizard, you Lose!";
                break;
            case LIZARD:
                result = "Draw";
                break;
            case SPOCK:
                result = "Lizard poisons Spock, you Win!";
                break;
        }

        return result;
    }

    public String playerChoiceSpock(WeaponType computerChoice){
        String result = null;

        switch(computerChoice) {
            case SCISSORS:
                result = "Spock smashes Scissors, you Win!";
                break;
            case PAPER:
                result = "Paper disproves Spock, you Lose!";
                break;
            case ROCK:
                result = "Spock vapourises Rock, you Win!";
                break;
            case LIZARD:
                result = "Lizard poisons Spock, you Lose!";
                break;
            case SPOCK:
                result = "Draw";
                break;
        }

        return result;
    }
}






//    public String computerSelectWeapon(){
//        Random rand = new Random();
//        int listSize = getWeaponCount();
//        int index = rand.nextInt(listSize);
//        return selectByIndex(index);
//    }
//
//
//
//
//    public String compareTwoWeapons(String playerChoice, String computerChoice){
//        String result = null;
//
//        if (playerChoice == "Rock"){
//            result = playerChoiceRock(computerChoice);
//        }
//        else if (playerChoice == "Paper"){
//            result = playerChoicePaper(computerChoice);
//        }
//        else if (playerChoice == "Scissors"){
//            result = playerChoiceScissors(computerChoice);
//        }
//        return result;
//    }

//    private ArrayList<String> weapon;

//    public RockPaperScissors(){

//        weapon = new ArrayList<String>();
//        setupWeapons();
//    }

//    public void add(String weaponToAdd){
//        weapon.add(weaponToAdd);
//    }

//    public void setupWeapons(){
//        String[] weaponsToAdd = {
//                "Rock",
//                "Paper",
//                "Scissors"
//        };
//        for (String weapon : weaponsToAdd) {
//            add(weapon);
//        }
//    }

//    public String selectByIndex(int index){
//        return weapon.get(index);
//    }
//    public int getWeaponCount(){
//        int counter = 0;
//        for (WeaponType weapon : WeaponType.values()){
//            counter ++;
//        }
//        return counter;
//    }
//
//
//
//