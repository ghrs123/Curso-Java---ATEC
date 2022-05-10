
public class StudentRecord {
	private String name;
	private double gpa;
	private int ssn;

	public StudentRecord(String name, double gpa, int ssn) {
		this.name = name;
		this.gpa = gpa;
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(int gpa) {
		this.gpa = gpa;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String toString() {
		return "\nNome:"+ name + "\nGPA:" + gpa + "\nSSN:" + ssn;
	}
	
	

}
