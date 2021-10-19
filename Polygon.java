interface Polygon
{
	void Circle();
	void Rectangle();
	void Triangle();
	void Square();
}
class Test implements Polygon
{
	public void Rectangle()
	{
		int l=20;
		int b=30;
		 int area=l*b;
		System.out.println("Area of rectangle is:"+area);
	}
	public void Triangle()
	{
		float c=4,h=13,run;
		float area=(c*h)/2;
		System.out.println("Area of Triangle is:"+area);
	}
	public void Circle()
	{
	int r=10;
	int area=(22*r*r)/7;
	System.out.println("Area of Circle is:"+area);
	}
	public void Square()
	{
	int n=10;
	int area=n*n;
	System.out.println("Area of Square is:"+area);
	
	}
	
}
public class Interface1 {
	public static void main(String []args)
	{
		Polygon p=new Test();
		p.Rectangle();
		p.Triangle();
		p.Circle();
		p.Square();
	}

}
