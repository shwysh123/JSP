package C03;

public class SampleDto {
	private	int age;
	private String name;
	private String addr;
	//Getter and Setter
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	//ToString ������
	public String toString() {
		return "SampleDto [age=" + age + ", name=" + name + ", addr=" + addr + "]";
	}
	//��� ���� ������
	public SampleDto(int age, String name, String addr) {
		super();
		this.age = age;
		this.name = name;
		this.addr = addr;
	}
	//�⺻ ������
	public SampleDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
