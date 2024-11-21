package javamarathon;

import java.util.Scanner;

public class MasterMind {

    public static void main(String[] args) {
        CodeGenerator codeGenerator = new CodeGenerator();
        String codeToDiscover = codeGenerator.getCodeGenerated();
        System.out.println(codeToDiscover);
    }
}
