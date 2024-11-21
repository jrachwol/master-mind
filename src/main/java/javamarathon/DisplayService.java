package javamarathon;

public class DisplayService {

    public void printErrorMessage(String message) {
        System.out.println(message);
    }

    public void printWelcomeMessage() {
        System.out.println("Witam w grze Mastermind!");
    }

    public void printGameRules() {
        System.out.println("Do odgadnięcia jest 4-cyfrowy kod. Każda cyfra to liczba od 0 do 9.");
    }

    public void printAttemptPrompt(int codeDiscoveryAttemptNumber) {
        System.out.print("Wprowadź kod do sprawdzenia (próba: " + codeDiscoveryAttemptNumber + "): ");
    }

    public void printAttemptResult(int rightDigitsOnRightPosition, int correctDigitsOnWrongPosition) {
        System.out.println("Odgadnięte cyfry na właściwym miejscu: " + rightDigitsOnRightPosition);
        System.out.println("Odgadnięte cyfry na błędnym miejscu: " + correctDigitsOnWrongPosition);
    }

    public void printCodeDiscoveredMessage(String codeToDiscover, String attemptCode) {
        System.out.print("Brawo, odkryłeś kod!: Kod do odgadnięcia: " + codeToDiscover + " Twój kod: " + attemptCode);
    }


}
