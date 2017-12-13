package cn.itcast.activemq.producer.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.activemq.producer.queue.QueueSender;
import cn.itcast.activemq.producer.topic.TopicSender;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-mq.xml")
public class ProducerTest {
	@Autowired
	private QueueSender queueSender;

	@Autowired
	private TopicSender topicSender;

	@Test
	public void testSendMessage() {
		queueSender.send("spring_queue", "你好，传智播客");
		topicSender.send("spring_topic", "你好，黑马程序员");
	}
}
