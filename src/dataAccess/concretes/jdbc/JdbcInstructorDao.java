package dataAccess.concretes.jdbc;

import dataAccess.abstracts.InstructorDao;
import entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void save(Instructor instructor) {
		System.out.println("Egitmen JDBC ile kaydedildi : " + instructor.getInstructorName());
		
	}

}
