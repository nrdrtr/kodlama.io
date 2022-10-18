package entities;

public class Instructor {

	int instructorId;
	String instructorName;

	public Instructor(int instructorId, String instructorName) {
		super();
		this.instructorId = instructorId;
		this.instructorName = instructorName;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

}
