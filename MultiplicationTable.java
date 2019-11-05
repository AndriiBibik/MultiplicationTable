/**
 *
 * @author Andy
 */
public class MultiplicationTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String helloText = "I'm the cool mathematician and I can show you multiplication"
                + "by one click!";
        System.out.println(helloText);
        System.out.println("");
        
        int row;
        int column;
        
        for(row = 1; row <= 13; row++) {
            String rowText = "";
            for(column = 1; column <= 13; column++) {
                rowText += String.format("%1$5s", "" + row*column);
            }
            System.out.println(rowText);
        } 
    }
    
}
