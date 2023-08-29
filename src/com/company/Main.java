package com.company;

import com.company.service.GameControlService;

public class Main {

    public static void main(String[] args) {
        GameControlService gameControlService = new GameControlService();
        gameControlService.beginningOfTheGame();
    }
}
