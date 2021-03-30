package club.canghao.card.model;

public class student {
	//学生部分信息
	private String stuNumber;
	private String stuName;
	private String stuPhone;
	private String stuSchool;
	//setter and getter
	public String getStuNumber() {
		return stuNumber;
	}
	public void setStuNumber(String stuNumber) {
		this.stuNumber = stuNumber;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuPhone() {
		return stuPhone;
	}
	public void setStuPhone(String stuPhone) {
		this.stuPhone = stuPhone;
	}
	public String getStuSchool() {
		return stuSchool;
	}
	public void setStuSchool(String stuSchool) {
		this.stuSchool = stuSchool;
	}
	@Override
	public String toString() {
		return "student [stuNumber=" + stuNumber + ", stuName=" + stuName + ", stuPhone=" + stuPhone + ", stuSchool="
				+ stuSchool + "]";
	}
}
