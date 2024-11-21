package javamarathon;

import java.util.Scanner;

public class GameManager {

    private DisplayService display;

    public GameManager(DisplayService display) {
        this.display = display;
    }

    public DisplayService getDisplay() {
        return display;
    }

    public void playGame(Scanner inputSource, String codeToDiscover) {
        try {
            display.printAttemptPrompt();
            String attemptCode = inputSource.nextLine();

            Validator.validateAttemptCode(attemptCode);
            int rightDigitsOnRightPosition = checkRightDigitsOnRightPosition(codeToDiscover, attemptCode);
            if (rightDigitsOnRightPosition == 4) {
                display.printCodeDiscoveredMessage(codeToDiscover, attemptCode);
            } else {
                System.out.println("Kod do odgadnięcia: " + codeToDiscover);
                display.printAttemptResult(rightDigitsOnRightPosition);
                playGame(inputSource, codeToDiscover);
            }
        } catch (CodeDiscoveryAttemptException e) {
            display.printErrorMessage(e.getMessage());
            playGame(inputSource, codeToDiscover);
        }
    }

    private int checkRightDigitsOnRightPosition(String codeToDiscovery, String attemptCode) {
        int rightDigitsOnRightPosition = 0;
        for (int i = 0; i < 4; i++) {
            if (attemptCode.charAt(i) == codeToDiscovery.charAt(i)) {
                rightDigitsOnRightPosition++;
            }
        }
        return rightDigitsOnRightPosition;
    }

}
