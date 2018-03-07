package org.bwgl.bootmanager.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {

	public List<Course> findByTopicId(String topicid);

	public Course findByIdAndTopicId(String courseid, String topicid);

}
