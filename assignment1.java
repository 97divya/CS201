import java.util.*; 

public class assignment1 {
    public static int gasPrice(int x, int y, int z){
        return x * y * z; 
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in); 
        
        System.out.println("Enter gas ");
        int g = in.nextInt(); 
        System.out.println("Enter mileage ");
        int m = in.nextInt(); 
        System.out.println("Enter price ");
        int p = in.nextInt(); 

        System.out.println("Gas: " + g + " milleage:" + m + " price:" + p); 
        System.out.println("Total price: "+ gasPrice(g, m, p)); 

        in.close(); 
    }
}