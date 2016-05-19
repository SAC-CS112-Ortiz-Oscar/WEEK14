// Week 14 - Card

public class Card implements RandomNumber
{
	private int callHistory = 0;
	@Override
	public int getRandomNumber() {
		
		callHistory++;
		return 1 + (int)(Math.random() * 52);
	}
	@Override
	public int getHistory() {
		
		return callHistory;
	}

}
