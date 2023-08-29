package com.company.service;

public class TextServiceImpl implements TextService {
    @Override
    public void playerMove() {
        System.out.print(" - Ход игрока. Введите количество спичек: ");
    }

    @Override
    public void computerMove(int numberOfMatches) {
        System.out.println(" - Количество выбранных компьютером спичек = " + numberOfMatches);
    }

    @Override
    public void playerLost() {
        System.out.println("Для игрока осталась последняя спичка. Игрок проиграл!");
    }

    @Override
    public void computerLost() {
        System.out.println("для компьютера осталась последняя спичка. Компьютер проиграл!");
    }

    @Override
    public void incorrectNumberOfMatches() {
        System.out.println("Некорректное количство спичек.");
    }

    @Override
    public void numberOfMatchesOnTheTable(int totalNumberOfMatches) {
        System.out.println("На столе осталось " + totalNumberOfMatches + " спичек.");
    }
}
