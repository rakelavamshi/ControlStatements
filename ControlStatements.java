
public class ControlStatements 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=1;
		if(a>10)
			System.out.println("A is greater than 10");
		else
			System.out.println("A is less than 10 adasf");
		do
		{
			System.out.println("A is now "+a);
			a++;
		}while(a<=10);
		int sw=70;
		switch(sw)
		{
		case 10: System.out.println("in case10");break;
		case 20: System.out.println("case 20");break;
		case 30: System.out.println("case 30 3");break;
		default: System.out.println("in default");
		}
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	}

}
