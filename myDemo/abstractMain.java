package myDemo;

public class abstractMain {

	public static void main(String[] args) {
		abstractClass obj1=new abstractExtend();
        abstractExtend obj2=new abstractExtend();
        
        obj1.pen();
        obj1.book();
        obj2.note();
        obj2.book();
	}

}
