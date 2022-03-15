//hello
public class nice {
    public nice(){

       System.out.printf("%.3f%n", getQuotient().remainder(153, 27));
    }

    interface Quotient{

        float remainder(float x, float y);

    }

    public static Quotient getQuotient(){
        return (x, y) -> x/y;
    }

    public static void main(String args[]){
        nice n = new nice();
    }
}