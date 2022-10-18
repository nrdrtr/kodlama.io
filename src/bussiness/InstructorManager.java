package bussiness;

import core.logging.Logger;
import dataAccess.abstracts.InstructorDao;
import entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		super();
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	public void save(Instructor instructor) {
		 for(Logger logger:loggers) {
			 logger.log(instructor.getInstructorName() + ": isimli öğretmen kaydedildi.");
		 }
		 instructorDao.save(instructor);
	}

	

 
}