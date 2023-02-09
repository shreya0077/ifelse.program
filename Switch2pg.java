
import java.util.Scanner;
class Switch2pg

{
      public static void main(String[] args) {
         
            int marks;
            System.out.println("Enter marks");
            Scanner as= new Scanner(System.in);
            marks=as.nextInt();
            if(marks>90)
            {
                  System.out.println("Topper");
            }
            else if(marks<90 && marks >=60)
            {
                  System.out.println("First");
            }
            else
            {
                  System.out.println("Second");
            }

     }
}



       