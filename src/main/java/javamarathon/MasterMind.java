package javamarathon;

import java.util.Scanner;

public class MasterMind {

    public static void main(String[] args) {
        CodeGenerator codeGenerator = new CodeGenerator();

        Scanner inputSource = new Scanner(System.in);
        GameManager gameManager = new GameManager(new DisplayService());

        String codeToDiscover = codeGenerator.getCodeGenerated();

        gameManager.getDisplay().printWelcomeMessage();
        gameManager.getDisplay().printGameRules();

        gameManager.playGame(inputSource, codeToDiscover);
        inputSource.close();
    }
}
