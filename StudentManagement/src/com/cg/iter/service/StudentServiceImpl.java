package com.cg.iter.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.iter.bean.Student;
import com.cg.iter.dao.StudentDao;

public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studDao;

	@Override
	public boolean create(Student stud) {
		
		return studDao.create(stud);
	}
	@Override
	public Student getStudent(int id) {
		return studDao.getstudent(id);
	}

	@Override
	public boolean update(Student stud) {
		return studDao.update(stud);
	}

	@Override
	public boolean delete(Student stud) {
		return studDao.delete(stud);
	}


}
