import static jsTools.Graph.*;
public class Waffel extends EisDecorator {
    private String name;
    public Waffel(EisDecorator eis, String name){
        super(eis);
        this.name = name;
    }

    @Override
    public double getPrice(){
        return super.getPrice() + 0.5;
    }

    @Override
    public void zeichen(int x, int y){
        String color = switch (name){
            case "Becher" -> "gray";
            case "Waffel" -> "brown";
            default -> "white";
        };
        addRect(x, y, 100, 100, color);
        super.zeichen(x, y+200);
    }
}
