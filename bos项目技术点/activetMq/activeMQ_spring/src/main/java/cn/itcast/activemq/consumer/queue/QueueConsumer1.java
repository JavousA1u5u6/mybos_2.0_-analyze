package cn.itcast.activemq.consumer.queue;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.stereotype.Service;

@Service
public class QueueConsumer1 implements MessageListener {
	public void onMessage(Message message) {
		TextMessage textMessage = (TextMessage) message;
		try {
			System.out
					.println("消费者QueueConsumer1获取消息:" + textMessage.getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
}
