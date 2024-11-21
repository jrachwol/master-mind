package javamarathon;

public class CheckingService {

    public static int checkRightDigitsOnRightPosition(String codeToDiscovery, String attemptCode) {
        int rightDigitsOnRightPosition = 0;
        for (int i = 0; i < 4; i++) {
            if (attemptCode.charAt(i) == codeToDiscovery.charAt(i)) {
                rightDigitsOnRightPosition++;
            }
        }
        return rightDigitsOnRightPosition;
    }

    public static int checkCorrectDigitsOnWrongPosition(String attemptCode, String codeToDiscovery) {
        int correctDigitsOnWrongPosition = 0;
        for (int i = 0; i < 4; i++) {
            if (attemptCode.charAt(i) == codeToDiscovery.charAt(i)) {
                attemptCode = attemptCode.substring(0, i) + '-' + attemptCode.substring(i + 1);
                codeToDiscovery = codeToDiscovery.substring(0, i) + '-' + codeToDiscovery.substring(i + 1);
            }
        }
        for (int i = 0; i < 4; i++) {
            if (attemptCode.charAt(i) != '-') {
                for (int j = 0; j < 4; j++) {
                    if (attemptCode.charAt(i) == codeToDiscovery.charAt(j)) {
                        correctDigitsOnWrongPosition++;
                        codeToDiscovery = codeToDiscovery.substring(0, j) + '-' + codeToDiscovery.substring(j + 1);
                        break;
                    }
                }
            }
        }
        return correctDigitsOnWrongPosition;
    }


}
