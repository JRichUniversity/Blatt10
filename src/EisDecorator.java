public class EisDecorator implements Eis{
    protected Eis eis;

    public EisDecorator(Eis eis){
        this.eis = eis;
    }

    @Override
    public double getPrice() {
        if(eis != null){
            return eis.getPrice();
        }
        else return 0.0;
    }

    @Override
    public void zeichen(int x, int y) {
        if(eis != null){
            eis.zeichen(x, y);
        }
    }
}
