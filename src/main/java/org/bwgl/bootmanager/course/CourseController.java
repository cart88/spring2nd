package org.bwgl.bootmanager.course;

import java.util.List;

import org.bwgl.bootmanager.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	/**
	 * http://localhost:8080/topics/PYTHON/courses
	 * GET
	 * @param topicid
	 * @return
	 */
	@RequestMapping("/topics/{topicid}/courses")
	public List<Course> getAllCourses(@PathVariable String topicid){
		return courseService.getAllCourses(topicid);
	}
	
	/**
	 * http://localhost:8080/topics/PYTHON/course/1
	 * GET
	 * @param topicid
	 * @param courseid
	 * @return
	 */
	@RequestMapping("/topics/{topicid}/course/{courseid}")
	public Course getCourse(@PathVariable String topicid,@PathVariable String courseid){
		return courseService.getCourse(topicid,courseid);
	}
	
	/**
	 * http://localhost:8080/topics/PYTHON/courses/
	 * POST
	 * { "id": "1", "name": "111", "description": "111" }
	 * @param course
	 * @param topicid
	 */
	@RequestMapping(value="/topics/{topicid}/courses/",method=RequestMethod.POST)
	public void addCourse(@RequestBody Course course,@PathVariable String topicid){
		course.setTopic(new Topic(topicid,"",""));
		courseService.addCourse(course);
	}
	
}
