//hello
interface 

public class nice {
    
    public nice(){
        getQuotient.remainder(33, 159); 
       	System.out.println(getPerfectSquare().ps(169));
    }
    
    interface Quotient{
        void remainder(x, y); 
    }
    public static Quotient getQuotient(){
        float q =  (x, y) -> System.out.printf("%.3f%n", x/y);; 
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