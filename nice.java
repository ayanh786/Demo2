//hello

public class nice{

	public nice(){
		System.out.println(getPerfectSquare().ps(169));
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