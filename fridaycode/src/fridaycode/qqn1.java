package fridaycode;

import java.util.Scanner;

class Box{
	float width,height,depth;
	Box(float width,float height,float depth)
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	double volume()
	{
		return width*height*depth;
	}
}

public class qqn1 {
	public static void main(String[] args)
	{
		System.out.println("enter height");
		Scanner sc=new Scanner(System.in);
		float height=sc.nextFloat();
		System.out.println("enter width");
		float width=sc.nextFloat();
		System.out.println("enter depth");
		float depth=sc.nextFloat();
		Box b=new Box(width,height,depth);
		System.out.println(b.volume());
		
	}

}
