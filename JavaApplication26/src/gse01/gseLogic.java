package gse01;

public class gseLogic {

    private ProduktDescription mango;
    private int tempAntal;
    private double tempPris;
    public void start() {
        Product p1 = new Product();
        Basket k1 = new Basket();

        mango = new ProduktDescription();
        mango.setProductID("1234wfafwa");
        mango.setProduktDescription("Det her er en dejlig mango");
        mango.setPrice(60.37);
        mango.setWarehouseQuantity(150);
        mango.setStandardQuantity(8);

        mango.getProductID();
        mango.getProduktDescription();
        mango.getPrice();
        mango.getWarehouseQuantity();
        mango.getStandardQuantity();
        p1.go();
        printBasket(mango);

        tempAntal = (mango.getWarehouseQuantity()) - (Integer.parseInt(p1.antal1));
        mango.setWarehouseQuantity(tempAntal);
        tempPris = ((mango.getPrice()) * (Integer.parseInt(p1.antal1)));
        System.out.println("stock left: " + mango.getWarehouseQuantity());
        System.out.println("total price: " + tempPris + " kr");

        k1.kurv1.put(mango.getProductID(), (Integer.parseInt(p1.antal1)));
        System.out.println("id & quantity: " + k1.kurv1.toString());
    }
    
    public void printBasket(ProduktDescription mango) {
        System.out.println("Current inventory quantity and description is: ");
//        mango.faaLagerAntal();
//        mango.faaMeangde();
//        mango.faaPris();
//        mango.faaProduktBeskrivelse();
//        mango.faaProduktID();
    }
}
