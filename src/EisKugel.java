import static jsTools.Graph.*;
public class EisKugel extends EisDecorator{
    private String name = "";

    public EisKugel(Eis eis, String name) {
        super(eis);
        this.name = name;
    }

    @Override
    public double getPrice(){
        return super.getPrice() + 1.1;
    }

    @Override
    public void zeichen(int x, int y){
        String color = switch (name) {
            case "Vanille" -> "gray";
            case "Schoko" -> "brown";
            case "Heidelbeere" -> "orange";
            case "Zitrone" -> "yellow";
            case "Minze" -> "cyan";
            case "Erdbeere" -> "red";
            default -> "white";
        };
        addCircle(x, y, 100, color);
        super.zeichen(x, y + 200);
    }
}
