package org.bwgl.bootmanager.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class TopicService {

	List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("JAVA", "JAVA_NAME", "JAVA_DESC"),
			new Topic("SPRING", "SPRING_NAME", "SPRING_DESC"),
			new Topic("CPP", "CPP_NAME", "CPP_DESC")
			)
			);

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		for (int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)){
				topics.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(String id) {
		topics.removeIf(t->t.getId().equals(id));
	}

}
