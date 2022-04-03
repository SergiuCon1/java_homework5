package ru.netology.sqr;

public class SQRService {
    public int calculateCountOfSquares(int minBorder, int maxBorder) {
        int currentSquares = 0;

        for (int j = 10; j <= 99; j++) {
            if (minBorder <= Math.pow(j, 2) && maxBorder >= Math.pow(j, 2)) {
                currentSquares = currentSquares + 1;
            }
        }
        return currentSquares;
    }
}