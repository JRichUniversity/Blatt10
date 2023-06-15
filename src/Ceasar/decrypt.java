package Ceasar;

public class decrypt extends modifyDecorator{
    private int amount;
    String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public decrypt(modifyDecorator m, int a){
        super(m);
        amount = a;
    }

    public char getChar() throws TextEndException{
        char c = super.getChar();
        if(c != Character.MAX_VALUE){
            if(Character.isLetter(c)){
                if(uppercaseLetters.indexOf(c) != -1){
                    c = (char) (((c - 'A' - amount + 26) % 26) + 'A');
                } else {
                    c = (char) (((c - 'a' - amount + 26) % 26) + 'a');
                }
            }
        } else throw new TextEndException();
        return c;
    }
}
