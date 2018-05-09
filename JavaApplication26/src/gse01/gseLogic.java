package gse01;

public class gseLogic {

    private ProduktBeskrivelse mango;
    private int tempAntal;
    private double tempPris;
    public void start() {
        Produkt p1 = new Produkt();
        Kurv k1 = new Kurv();

        mango = new ProduktBeskrivelse();
        mango.setProduktID("1234wfafwa");
        mango.setProduktBeskrivels("Det her er en dejlig mango");
        mango.setPris(60.37);
        mango.setLagerAntal(150);
        mango.setStandardmeangde(8);

        mango.getProduktID();
        mango.getProduktBeskrivelse();
        mango.getPris();
        mango.getStandartMeangde();
        mango.getLagerAntal();
        p1.go();
        printBasket(mango);

        tempAntal = (mango.getLagerAntal()) - (Integer.parseInt(p1.antal1));
        mango.setLagerAntal(tempAntal);
        tempPris = ((mango.getPris()) * (Integer.parseInt(p1.antal1)));
        System.out.println("stock left: " + mango.getLagerAntal());
        System.out.println("total price: " + tempPris + " kr");

        k1.kurv1.put(mango.getProduktID(), (Integer.parseInt(p1.antal1)));
        System.out.println("id & quantity: " + k1.kurv1.toString());
    }
    
    public void printBasket(ProduktBeskrivelse mango) {
        System.out.println("Current inventory quantity and description is: ");
//        mango.faaLagerAntal();
//        mango.faaMeangde();
//        mango.faaPris();
//        mango.faaProduktBeskrivelse();
//        mango.faaProduktID();
    }
}
