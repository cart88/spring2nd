package org.bwgl.bootmanager.topic;
import org.springframework.data.repository.CrudRepository;
// jpa的约定数据库查询
public interface TopicRepository extends CrudRepository<Topic,String> {

}
