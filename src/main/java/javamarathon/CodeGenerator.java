package javamarathon;

import java.util.Random;

public class CodeGenerator {

    private Random random = new Random();
    private String codeGenerated;

    public CodeGenerator() {
        this.codeGenerated = generateCode();
    }

    private String generateCode() {
        String code = "";
        for (int i = 0; i < 4; i++) {
            code += random.nextInt(10);
        }
        return code;
    }

    public String getCodeGenerated() {
        return codeGenerated;
    }
}
