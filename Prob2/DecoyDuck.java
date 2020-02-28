package Prob2;

public class DecoyDuck extends Duck {
	
	@Override
	public void display()
	{
		System.out.println(" displaying");
	}
	
	@Override
	public void quack()
	{
		System.out.println(" cannot quack");
	}
	public void fly()
	{
		System.out.println(" cannot fly");
	}
	
	}

