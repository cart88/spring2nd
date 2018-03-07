package org.bwgl.bootmanager.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/topics/{topicid}/courses")
	public List<Course> getAllCourses(@PathVariable String topicid){
		return courseService.getAllCourses(topicid);
	}
	
}
