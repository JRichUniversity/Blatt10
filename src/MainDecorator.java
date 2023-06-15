public class MainDecorator {
    public static void main(String[] args){
        Eis eis = new Waffel(new EisKugel(new EisKugel(new EisKugel(null, "Vanille"), "Schoko"), "Heidelbeere") , "Waffel");

        System.out.println("Preis:" + eis.getPrice());
        eis.zeichen(100, 100);
    }
}
