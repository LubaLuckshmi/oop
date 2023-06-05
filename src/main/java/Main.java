public class Main {
    public static void main(String[] args) {
        VedingMachine apparat = new VedingMachine();
        apparat.addProduct(new Chocolate("Alpen Gold", 10,"темный", "с орехом", 500 ))
                .addProduct(new Product("яблоко", 30))
                .addProduct(new Product("Cola", 15))
                .addProduct(new Cheese("Российский", 10, "твердый",50));

        System.out.println(apparat);
        System.out.println();
        Product foundProduct = apparat.findProduct("яблоко");
        System.out.println(foundProduct);

        System.out.println("+++++++++++++");
        Product saleProduct = apparat.saleProduct("яблоко");
        System.out.println(saleProduct);
        Product saleProduct2 = apparat.saleProduct("Cola");
        System.out.println(saleProduct2);
        System.out.println("Осталось денег");
        System.out.println(apparat.getCash());
        System.out.println();
        System.out.println(apparat);
    }
}
