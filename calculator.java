
class calculator{


	public static void main(String[] args) {
		
		double n1=Integer.parseInt(args[0]);
		String s=args[1];
		char a=s.charAt(0);
		double n2=Integer.parseInt(args[2]);

		
		double n3;
		switch(a)
		{
			case '+':
				System.out.println("Addition ="+(n3=n1+n2));
				break;


			case '-':
				System.out.println("Subtraction ="+(n3=n1-n2));
				break;

			case '*':
			
				System.out.println("Multiplication ="+(n3=n1*n2));
				break;

			case '/':
				System.out.println("Division ="+(n3=n1/n2));
				break;


			default:
				System.out.println("invalid");
				break;



		}


	}
}