public class carpet_cost {
    public static void main(String[] args) {

        
        double length = 120;      // inches
        double breadth = 240;     // inches
        double pricePerSqFt = 200;
        double discountPercent = 10;

    
        double areaSqFt = (length * breadth) / 144;

        
        double priceBeforeDiscount = areaSqFt * pricePerSqFt;
        double discountAmount = (discountPercent / 100) * priceBeforeDiscount;
        double priceAfterDiscount = priceBeforeDiscount - discountAmount;

        
        System.out.println("Price before discount: " + priceBeforeDiscount);
        System.out.println("Price after discount: " + priceAfterDiscount);
    }
}
