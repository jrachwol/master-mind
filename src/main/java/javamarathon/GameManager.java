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
            boolean codeFound = false;
            if (codeFound) {
                // TODO - display success message and exit game
            } else {
                playGame(inputSource, codeToDiscover);
            }
        } catch (CodeDiscoveryAttemptException e) {
            display.printErrorMessage(e.getMessage());
            playGame(inputSource, codeToDiscover);
        }
    }
}
