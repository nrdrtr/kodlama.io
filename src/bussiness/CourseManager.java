package bussiness;

import core.logging.Logger;
import dataAccess.abstracts.CourseDao;
import entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private Course[] courses;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Course[] courses, Logger[] loggers) {
		super();
		this.courseDao = courseDao;
		this.courses = courses;
		this.loggers = loggers;
	}

	public void save(Course course) throws Exception {
		if (course.getCoursePrice() < 0) {
			throw new Exception("Bir kursun fiyatı 0 dan küçük olamaz");
		} else {
			courseDao.save(course);
		}

		for (Course kurs : courses) {
			if (kurs.getCourseName() == course.getCourseName()) {
				throw new Exception("aynı isimli kurs mevcut");
			} else {
				courseDao.save(course);
			}

		}
		for (Logger logger : loggers) { 
			logger.log(course.getCourseName());
		}

	}
}
