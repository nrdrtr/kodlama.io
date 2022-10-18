package dataAccess.concretes.hibernate;

import dataAccess.abstracts.InstructorDao;
import entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void save(Instructor instructor) {

		System.out.println("Egitmen Hibernate ile kaydedildi." + instructor.getInstructorName());
	}

}
