package org.bwgl.bootmanager.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TopicController {
	@Autowired
	private TopicService topicService;
	/**
	 * http://localhost:8080/topics
	 * @return
	 */
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return topicService.getAllTopics();
	}
	
	/**
	 * http://localhost:8080/topic/JAVA
	 * @param id
	 * @return
	 */
	@RequestMapping("/topic/{id}")
	public Topic getTopic(@PathVariable String id){
		return topicService.getTopic(id);
	}
	
	/**
	 * http://localhost:8080/topics
	 * {"id":"PYTHON", "name":"PYTHON_NAME", "description":"PYTHON_DESC"}
	 * POST
	 * Content-Type   :   application/json
	 * @param topic
	 */
	@RequestMapping(value="/topics",method=RequestMethod.POST)
	public void addTopic(@RequestBody Topic topic){
		topicService.addTopic(topic); 
	}
	
	/**
	 * http://localhost:8080/topic/JAVA
	 * {"id":"JAVA", "name":"JAVA_NAME_change", "description":"JAVA_DESC_change"}
	 * PUT
	 * Content-Type   :   application/json
	 * @param topic
	 * @param id
	 */
	@RequestMapping(value="/topic/{id}",method=RequestMethod.PUT)
	public void updateTopic(@RequestBody Topic topic,@PathVariable String id){
		topicService.updateTopic(topic,id);
	}
	
	/**
	 * http://localhost:8080/topic/JAVA
	 * DELETE
	 * @param id
	 */
	@RequestMapping(value="topic/{id}",method=RequestMethod.DELETE)
	public void deleteTopic(@PathVariable String id){
		topicService.deleteTopic(id);
	}
}
