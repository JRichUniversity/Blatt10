package Ceasar;

public class modifyDecorator implements modifier{

    protected modifier m;

    public modifyDecorator(modifier m){
        this.m = m;
    }
    @Override
    public char getChar() throws TextEndException {
        return m.getChar();
    }
}
