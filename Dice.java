// Week 14 - Dice
public class Dice implements RandomNumber
{
	private int callHistory = 0;

	@Override
	public int getRandomNumber() 
	{
		callHistory++;
		return 1 + (int)(Math.random() * 6);
	}

	@Override
	public int getHistory() 
	{
		return callHistory;
	}

}
