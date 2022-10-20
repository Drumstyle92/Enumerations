/**
 * @author Drumstyle92
 * class that contains the core of the program.
 */
public class Test {
    /**
     * @param args main parameter.
     * main method that contains a for loop that displays the months with y and without.
     */
    public static void main(String[] args) {
       // months with the final y and without
        System.out.println("--------------Month--------------------");
        for(int i = 0; i < Month.values().length ; ++i){
            if(Month.values()[i].toString().endsWith("y")){
                System.out.println("-Ends with (y)- " + Month.values()[i]);
                System.out.println("---------------------------------------");
            }else{
                System.out.println("-Doesn't end with (y)- " + Month.values()[i]);
                System.out.println("---------------------------------------");
            }
        }
    }
}
