package dataAccess.concretes.hibernate;

import dataAccess.abstracts.CourseDao;
import entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void save(Course course) {
		System.out.println("Kurs Hibernate ile kaydedildi : " + course.getCourseName());
	}

}
