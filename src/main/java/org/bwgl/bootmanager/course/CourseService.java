package org.bwgl.bootmanager.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	public List<Course> getAllCourses(String topicid) {
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicid).forEach(courses::add);
		return courses;
	}
	
	/**
	 * And	findByNameAndPwd	where name= ? and pwd =?
	 * Or	findByNameOrSex	where name= ? or sex=?
	 * Is,Equals	findById,findByIdEquals	where id= ?
	 * Between	findByIdBetween	where id between ? and ?
	 * LessThan	findByIdLessThan	where id < ?
	 * LessThanEquals	findByIdLessThanEquals	where id <= ?
	 * GreaterThan	findByIdGreaterThan	where id > ?
	 * GreaterThanEquals	findByIdGreaterThanEquals	where id > = ?
	 * After	findByIdAfter	where id > ?
	 * Before	findByIdBefore	where id < ?
	 * IsNull	findByNameIsNull	where name is null
	 * isNotNull,NotNull	findByNameNotNull	where name is not null
	 * Like	findByNameLike	where name like ?
	 * NotLike	findByNameNotLike	where name not like ?
	 * StartingWith   findByNameStartingWith	where name like '?%'
	 * EndingWith	findByNameEndingWith	where name like '%?'
	 * Containing	findByNameContaining	where name like '%?%'
	 * OrderBy	findByIdOrderByXDesc	where id=? order by x desc
	 * Not	findByNameNot	where name <> ?
	 * In	findByIdIn(Collection<?> c)	where id in (?)
	 * NotIn	findByIdNotIn(Collection<?> c)	where id not  in (?)
	 * True	findByAaaTue  where aaa = true
	 * False	findByAaaFalse	where aaa = false
	 * IgnoreCase	findByNameIgnoreCase	where UPPER(name)=UPPER(?)
	 * @param topicid
	 * @param courseid
	 * @return
	 */
	public Course getCourse(String topicid, String courseid) {
		return courseRepository.findByIdAndTopicId(courseid,topicid);
	}
	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse( String id) {
		courseRepository.delete(id);
	}
	
	

}
