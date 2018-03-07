package org.bwgl.bootmanager.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	/**
	 * http://localhost:8080/topics
	 * @return
	 */
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return Arrays.asList(
				new Topic("JAVA","JAVA_NAME","JAVA_DESC"),
				new Topic("SPRING","SPRING_NAME","SPRING_DESC"),
				new Topic("CPP","CPP_NAME","CPP_DESC")
				);
	}
}
