package Ceasar;

import jsTools.Input;

public class Main {
    public static void main(String[] args){
        String text = "Ich kam, Ich sah, Ich siegte.";
        System.out.println("Original Text: " + text);
        modifier m = new crypt(new TextConverter(null, text), 3);
        StringBuilder sb = new StringBuilder();
        StringBuilder dsb = new StringBuilder();
        try {
            // Crypt
            for(char c: text.toCharArray()){
                char temp = m.getChar();
                sb.append(temp);
                System.out.print(temp);
            }

            System.out.println();
            // Decrypt
            m = new decrypt(new TextConverter(null, sb.toString()), -3);

            for(char c: sb.toString().toCharArray()) {
                char temp = m.getChar();
                dsb.append(temp);
                System.out.print(temp);
            }
        } catch (TextEndException e){
            System.out.println("Ende der Zeile");
        }
    }
}
