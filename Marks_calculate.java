import java.util.Scanner;
public class Marks_calculate
{
    public static void main(String[] args) 
    {
          Scanner c = new Scanner (System.in);
        System.out.print("Enter Your Marks:");
        int marks = c.nextInt();
        if (marks>=80 && marks<=100) {
            System.out.print("Grade A1");

        }else if(marks>=70 && marks<80){
            System.out.print("Grade A");
        }else if(marks>=60 && marks<70){
            System.out.print("Grade B");
        }else if(marks>=50 && marks<60){
            System.out.print("Grade C");
        }else if(marks>=40){
            System.out.print("Grade D");
        }else if(marks<40){
            System.out.print("Fail");
        }
    }
        
    
} 
