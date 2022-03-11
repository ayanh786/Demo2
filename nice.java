//hello

public class nice{
    public nice(){

    }

    public void printQuotient(float x, float y){

        float remainder = x/y; 
        System.out.printf("%.3f%n", remainder);

    }

    public static void main(String args[]){
        nice n = new nice();
    }
}