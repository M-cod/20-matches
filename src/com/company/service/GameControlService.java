package com.company.service;

import java.util.Scanner;

public class GameControlService {
    private int totalNumberOfMatches = 20;
    private final ComputerLogicService computerLogicService = new ComputerLogicService();
    private final TextServiceImpl textService = new TextServiceImpl();

    public void beginningOfTheGame() {
        while(totalNumberOfMatches != 1){

        }
        textService.numberOfMatchesOnTheTable(totalNumberOfMatches);
        textService.computerMove(3);
        totalNumberOfMatches -= 3;
        textService.numberOfMatchesOnTheTable(totalNumberOfMatches);
        remove(playersTurn());
        textService.numberOfMatchesOnTheTable(totalNumberOfMatches);
        remove(computerLogicService.computerMove());
        textService.numberOfMatchesOnTheTable(totalNumberOfMatches);

    }



    public int playersTurn() {
        do {
            Scanner scanner = new Scanner(System.in);
            textService.playerMove();
            int numberOfMatches = scanner.nextInt();
            if (numberOfMatches > 0 && numberOfMatches < 4) {
                return numberOfMatches;
            }
            textService.incorrectNumberOfMatches();
        } while (true);
    }

    public void remove(int numberOfMatches) {
        totalNumberOfMatches -= numberOfMatches;
    }
}
