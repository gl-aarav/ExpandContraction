/* Aarav Goyal
 * ExpandContraction.java
 */ 
import java.util.Scanner;
public class ExpandContraction
{
	private String contracted;
	private String expanded;
	private Scanner kb;
	private String quit;
	private String contractedEnding;

	public ExpandContraction( )
	{
		contracted = new String ("");
		expanded = new String ("");
		quit = new String ("");
		kb = new Scanner (System.in);
		contractedEnding= new String ("");
	}

	public static void main(String [] args)
	{
		ExpandContraction ec = new ExpandContraction();
		ec.expandIt();
	}

	public void expandIt ()
	{
		do
		{
			getInput();
			processString();
			printResult();
			System.out.println("Would you like to expand another contraction? Type quit to stop");
			quit = kb.nextLine();
		}while(!quit.equalsIgnoreCase("quit"));
	}

	public void getInput ( )
	{
		System.out.println("What contraction would you like to expand?");
		contracted = kb.nextLine();	
	}

	public void processString ( )
	{
		if (contracted.length() > 3)
		{
			contractedEnding  = contracted.substring(contracted.length()-3, contracted.length());
		
		if (contractedEnding.equals("n\'t"))
		{
			if (contracted.equalsIgnoreCase("can\'t"))
				expanded = "can not";
			else if (contracted.equalsIgnoreCase("won\'t"))
				expanded = "will not";
			else if (contracted.equalsIgnoreCase("shant"))
				expanded = "shall not";
			else
				expanded = contracted.substring(0,contracted.length()-3) + " not";
		}
		}
	}

	public void printResult()
	{
		if (contractedEnding.equals("n\'t"))
			System.out.println("The expanded form of " + contracted + " is " + expanded + "\n\n");
		else
			System.out.println("Error, you did not enter a valid input.");
	}
}
