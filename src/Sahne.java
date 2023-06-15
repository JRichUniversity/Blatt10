import static jsTools.Graph.*;

public class Sahne extends EisDecorator{
    public Sahne(Eis eis) {
        super(eis);
    }

    @Override
    public double getPrice(){
        return super.getPrice() + 0.5;
    }

    @Override
    public void zeichen(int x, int y){
        String color = "gray";
        addTriangle(x, y, 100, 100, 100, color);
        super.zeichen(x, y+200);
    }
}
