public class Product {
    float price;
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public float getPrice(int quantity) {
        return price * quantity;
    }
    public static void main(String[] args){
        Product p=new Product();
        p.setPrice(6);
        System.out.println(p.getPrice(5));
    }
}