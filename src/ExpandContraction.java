/* Aarav Goyal
 * Period: 6
 * ExpandContraction.java
 */ 
import java.util.Scanner;
public class ExpandContraction
{
	private String contracted;
	private String expanded;
	private Scanner kb;
	private String quit;

	public ExpandContraction( )
	{
		contracted = new String ("");
		expanded = new String ("");
		quit = new String ("");
		kb = new Scanner (System.in);
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
		int contractedLength = contracted.length();
		String contractedEnding  = contracted.substring(contracted.length()-3, contracted.length());

		if (contracted.equalsIgnoreCase("can\'t"))
			expanded = "can not";
		else if (contracted.equalsIgnoreCase("won\'t"))
			expanded = "will not";
		else if (contracted.equalsIgnoreCase("shant"))
			expanded = "shall not";
		else
		{
			if (contractedEnding.equals("n\'t"))
				expanded = contracted.substring(0,contractedLength-3) + " not";
		}
	}

	public void printResult()
	{
		System.out.println("The expanded form of " + contracted + " is " + expanded + "\n\n");
	}
}


