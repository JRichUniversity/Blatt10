package Ceasar;

public class TextConverter extends modifyDecorator {
    private String input;
    private int currentIndex;

    public TextConverter(modifyDecorator m, String input) {
        super(m);
        this.input = input;
        this.currentIndex = 0;
    }

    @Override
    public char getChar() throws TextEndException {
        if (currentIndex >= input.length()) {
            throw new TextEndException();
        }
        char c = input.charAt(currentIndex);
        currentIndex++;
        return c;
    }
}
