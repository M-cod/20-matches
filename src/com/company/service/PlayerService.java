package com.company.service;

import java.util.Scanner;

public class PlayerService {
    private final TextServiceImpl textService = new TextServiceImpl();

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
}
