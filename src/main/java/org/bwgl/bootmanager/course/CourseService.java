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

}
