/*
 * Nolan Blevins
 * March 16 2022
 * CSCE 146 Lab 04
 * Reverse Polish Calculator
 */
public class ReversePolishCalculator
{
	private StackI<Integer> ValueStack;
	
	public int calculate(String aString)
	{
		ValueStack = new LLStack<Integer>();

		String[] aStr = aString.split("\s");
		int pushInt [] = new int[aStr.length];
		
		for(int i = 0; i < aStr.length; i++)
		{
			//ValueStack.print();

			// Pops 2 values off adds them together and then pushes them back onto stack
			if(aStr[i].equals("+"))
			{
				if(ValueStack.size() <= 1)
				{
					System.out.println("This was not properly formatted. There were too many operators and not enough numbers");
					return 0;
				}
				if(ValueStack.size() > 1)
				{
					int x = ValueStack.pop();
					int y = ValueStack.pop();
					int z = x + y;
					ValueStack.push(z);
				}
			}
			// Pops 2 values off subtracts second value from first and pushes onto stack
			if(aStr[i].equals("-"))
			{
				if(ValueStack.size() <= 1)
				{
					System.out.println("This was not properly formatted. There were too many operators and not enough numbers");
					return 0;
				}
				if(ValueStack.size() > 1)
				{
					int x = ValueStack.pop();
					int y = ValueStack.pop();
					int z = y - x;
					ValueStack.push(z);
				}
			}
			// Pops 2 values off divides second value by first value as long as it isn't 0 and then pushes onto stack
			if(aStr[i].equals("/"))
			{
				if(ValueStack.size() <= 1)
				{
					System.out.println("This was not properly formatted. There were too many operators and not enough numbers");
					return 0;
				}
				if(ValueStack.size() > 1)
				{
					int x = ValueStack.pop();
					int y = ValueStack.pop();
					if(x == 0)
					{
						System.out.println("cannot divide by 0");
						return 0;
					}
					int z = y/x;
					ValueStack.push(z);
				}
			}
			// Pops 2 values off multiplies them together and then pushes onto stack
			if(aStr[i].equals("*"))
			{
				if(ValueStack.size() <= 1)
				{
					System.out.println("This was not properly formatted. There were too many operators and not enough numbers");
					return 0;
				}
				if(ValueStack.size() > 1)
				{
					int x = ValueStack.pop();
					int y = ValueStack.pop();
					int z = y*x;
					ValueStack.push(z);
				}
			}
			try
			{
				pushInt[i] = Integer.parseInt(aStr[i]);
				int pushVal = pushInt[i];
				ValueStack.push(pushVal);
				
				if(ValueStack.size() > aStr.length - i)
				{
					System.out.println("This was not properly formatted. There were too many numbers and not enough operators");
					return 0;
				}
				
			}
			catch(Exception e)
			{
				if(!aStr[i].equals("+") && !aStr[i].equals("*") && !aStr[i].equals("-") && !aStr[i].equals("/")) // checks if input is not allowed value
				{
					System.out.println("Not a valid operator");
					return 0;
				}
				if(ValueStack.size() == 1 && i == aStr.length) 
				{
					int EndValue = ValueStack.peek();
					return EndValue;
				}
				
				
			}
		}
		int EndValue = ValueStack.peek();
		return EndValue;
	}
	

	
}
