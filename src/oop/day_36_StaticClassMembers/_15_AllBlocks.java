package oop.day_36_StaticClassMembers;

public class _15_AllBlocks {

	public _15_AllBlocks(int x) {
		System.out.println("One Argument Constructor");
	}

	public _15_AllBlocks() {
		System.out.println("No argument constructor");
	}

	static {
		System.out.println("Firsrt Static Init - It will not work in next obj");
	}

	{
		System.out.println("First Instnce Init");
	}

	{
		System.out.println("Second Instance Init");
	}

	static {
		System.out.println("Second Static Init - It will not work in next obj");
	}
}
