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
	 * PUT
	 * Content-Type   :   application/json
	 * @param topic
	 */
	@RequestMapping(value="/topics",method=RequestMethod.PUT)
	public void addTopic(@RequestBody Topic topic){
		topicService.addTopic(topic); 
	}
}
