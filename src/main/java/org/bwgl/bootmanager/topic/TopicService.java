package org.bwgl.bootmanager.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TopicService {
	@Autowired
	private TopicRepository topicRepository;

	List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("JAVA", "JAVA_NAME", "JAVA_DESC"),
			new Topic("SPRING", "SPRING_NAME", "SPRING_DESC"),
			new Topic("CPP", "CPP_NAME", "CPP_DESC")
			)
			);

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	public Topic getTopic(String id) {
//		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
//		topics.add(topic);
		topicRepository.save(topic);
	}

	public void updateTopic(Topic topic, String id) {
		/*for (int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)){
				topics.set(i, topic);
				return;
			}
		}*/
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
//		topics.removeIf(t->t.getId().equals(id));
		topicRepository.delete(id);
	}

}
