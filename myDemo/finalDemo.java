package myDemo;

public final class finalDemo {
    int radius=2;
    final double PI_VALUE=3.414;
    double area_circle;
    
    public double area()
    {
        area_circle= PI_VALUE*radius*radius;
        return area_circle;
    }
	public static void main(String[] args) {
		finalDemo obj=new finalDemo();
		System.out.println(obj.area());

	}

}
