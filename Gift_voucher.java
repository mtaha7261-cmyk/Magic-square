import java.util.Scanner;
public class Gift_voucher
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
         System.out.println("Enter Gift Voucher Amount:");
          double balance_amount = sc.nextDouble();
    
        
    
    while(balance_amount>0) {
        System.out.println("Enter Item Price:");
        double Item_Price= sc.nextDouble();
        if (Item_Price<=balance_amount)
        {
            balance_amount = balance_amount - Item_Price;
            System.out.println("Item Purchased");
            System.out.println("Remaining Balance:"+balance_amount);
        } 
        else
        {
            System.out.println("Exceeds Voucher Amount");
            System.out.println("Final Balance:"+balance_amount);
        }
    }

}
}