package javamarathon;

import java.util.Scanner;

public class GameManager {

    private DisplayService display;
    private int codeDiscoveryAttemptNumber = 1;

    public GameManager(DisplayService display) {
        this.display = display;
    }

    public DisplayService getDisplay() {
        return display;
    }

    public void playGame(Scanner inputSource, String codeToDiscover) {
        try {
            display.printAttemptPrompt(codeDiscoveryAttemptNumber);
            String attemptCode = inputSource.nextLine();

            ValidatonService.validateAttemptCode(attemptCode);
            int rightDigitsOnRightPosition = CheckingService.checkRightDigitsOnRightPosition(codeToDiscover, attemptCode);
            int correctDigitsOnWrongPosition = CheckingService.checkCorrectDigitsOnWrongPosition(attemptCode, codeToDiscover);
            if (rightDigitsOnRightPosition == 4) {
                display.printCodeDiscoveredMessage(codeToDiscover, attemptCode);
            } else {
                display.printAttemptResult(rightDigitsOnRightPosition, correctDigitsOnWrongPosition);
                codeDiscoveryAttemptNumber++;
                playGame(inputSource, codeToDiscover);
            }
        } catch (CodeDiscoveryAttemptException e) {
            display.printErrorMessage(e.getMessage());
            playGame(inputSource, codeToDiscover);
        }
    }
}
