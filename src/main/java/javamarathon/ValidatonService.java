package javamarathon;

public class ValidatonService {

    public static void validateAttemptCode(String attemptCode) throws CodeDiscoveryAttemptException {
        if (attemptCode.length() != 4) {
            throw new CodeDiscoveryAttemptException("Kod musi składać się z dokładnie 4 cyfr.");
        }
        for (int i = 0; i < 4; i++) {
            char c = attemptCode.charAt(i);
            if (c < '0' || c > '9') {
                throw new CodeDiscoveryAttemptException("Kod może zawierać tylko cyfry od 0 do 9.");
            }
        }
    }
}