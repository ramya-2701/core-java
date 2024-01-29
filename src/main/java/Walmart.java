class Walmart {
    void ProductComp() {
        System.out.println("Great Value");
    }
}

class Products extends Walmart {
    void ProductComp() {
        System.out.println("Great Value products");
    }
    public static void main(String args[]) {
        Walmart w = new Products();
        w.ProductComp();
    }
}