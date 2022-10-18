package dataAccess.concretes.jdbc;

import dataAccess.abstracts.CourseDao;
import entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void save(Course course) {
		System.out.println("Kurs JDBC ile kaydedildi : " + course.getCourseName());
		
	}

}
