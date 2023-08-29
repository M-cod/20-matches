package com.company.service;

public class GameControlService {
    private int totalNumberOfMatches = 20;
    private int playerNumber = 1;
    private final ComputerLogicService computerLogicService = new ComputerLogicService();
    private final TextServiceImpl textService = new TextServiceImpl();
    private final PlayerService playerService = new PlayerService();

    public void beginningOfTheGame() {
        boolean flag = true;
        while (totalNumberOfMatches != 1) {
            textService.numberOfMatchesOnTheTable(totalNumberOfMatches);
            if (flag){
                int computerNumber = computerLogicService.computerMove(playerNumber);
                textService.computerMove(computerNumber);
                remove(computerNumber);
                flag = false;
            } else {
                playerNumber = playerService.playersTurn();
                remove(playerNumber);
                flag = true;
            }
        }
        if (flag){
            textService.computerLost();
        } else {
            textService.playerLost();
        }
    }

    public void remove(int numberOfMatches) {
        totalNumberOfMatches -= numberOfMatches;
    }
}
