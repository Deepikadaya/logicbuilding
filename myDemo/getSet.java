package myDemo;

public class getSet {
	String name;
	String empid;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public static void main(String[] args) {
    getSet g=new getSet();
    g.setName("demo user");
    g.setEmpid("122");
    System.out.println("the emp id is :"+g.getEmpid());
    System.out.println("the name is :"+g.getName());

	}

}
