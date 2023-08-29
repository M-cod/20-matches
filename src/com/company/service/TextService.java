package com.company.service;

public interface TextService {
    void playerMove();
    void computerMove(int numberOfMatches);
    void playerLost();
    void computerLost();
    void incorrectNumberOfMatches();
    void numberOfMatchesOnTheTable(int totalNumberOfMatches);
}
