package org.bwgl.bootmanager.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	List<Topic> topics = Arrays.asList(
			new Topic("JAVA", "JAVA_NAME", "JAVA_DESC"),
			new Topic("SPRING", "SPRING_NAME", "SPRING_DESC"),
			new Topic("CPP", "CPP_NAME", "CPP_DESC")
			);

	public List<Topic> getAllTopics() {
		return topics;
	}

}
