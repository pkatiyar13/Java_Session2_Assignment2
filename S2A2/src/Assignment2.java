
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Prime number between 1 to 100
	int p=0;
	System.out.println("Starting Prime Number Calculation");
	System.out.print("1 ");
	System.out.print("2");
		for(int n=2;n<=100;n++){
			for(int j=2;j<n;j++){
				//System.out.println("n: "+n+" j: "+j);
				if(n%j==0){
					//System.out.println(+p);
					p=0;
					//System.out.println("Break Condition"+p);
					break;
				}
				//System.out.println("Setting");
				p=1;
			}
			//System.out.println("Checking");
			if(p==1)
				System.out.print(" "+n);
		}

	}

}
