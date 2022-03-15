//hello
import java.awt.print.*;
public class nice {

    public nice(){
        Quotient q =  (x, y) -> System.out.printf("%.3f%n", x/y);
        q.remainder(200, 23);
       	System.out.println(getPerfectSquare().ps(169));
    }

    interface Quotient{
        void remainder(float x, float y);
    }

    interface PerfectSquare{
		boolean ps(int num);
	}
    public static PerfectSquare getPerfectSquare(){
		return (num) -> Math.sqrt(num)-Math.floor(Math.sqrt(num))==0;
	}

    public static void main(String args[]){
        nice n = new nice();
    }
}