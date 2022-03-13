import java.util.Scanner;

public class halfDiamond {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a number integer from 1-10");
    
        int count = scan.nextInt();
        
        if(count > 10 || count < 0){
            System.out.println("Invalid entry");
            
        }
        else{
        for(int i = 0; i <= count; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("$");
            }

            System.out.println();

     
        }
        for(int i = count; i > 0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("$");
            }
            System.out.println();
        }
        }
        

    }
    
}
