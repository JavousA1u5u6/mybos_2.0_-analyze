package cn.itcast.activemq.producer.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-mq-consumer.xml")
public class ConsumerTest {

	@Test
	public void testConsumerMessage() {
		while (true) {
			// junitÍË³ö£¬·ÀÖ¹½ø³ÌËÀµô
		}
	}
}
