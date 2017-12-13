package cn.itcast.activemq.consumer.queue;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.stereotype.Service;

@Service
public class QueueConsumer2 implements MessageListener {
	public void onMessage(Message message) {
		TextMessage textMessage = (TextMessage) message;
		try {
			System.out
					.println("������QueueConsumer2��ȡ��Ϣ:" + textMessage.getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
}
