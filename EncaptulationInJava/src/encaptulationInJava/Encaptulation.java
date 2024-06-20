package encaptulationInJava;

class Person
{
	private String name;
	private int age;
	private long mobileNo;
	private String address;
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public void setMobileNo(long mobileNo)
	{
		this.mobileNo=mobileNo;
	}
	
	public void setAddress(String address)
	{
		this.address=address;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	 
	public long getMobileNo()
	{
		return mobileNo;
	}
	 
	public String getAddress()
	{
		return address;
	}
}

public class Encaptulation 
{

	public static void main(String[] args) 
	{
		Person p=new Person();
		p.setName("Yogesh");
		p.setAge(26);
		p.setMobileNo(7011004402l);
		p.setAddress("Bengaluru");
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getMobileNo());
		System.out.println(p.getAddress());

	}

}
