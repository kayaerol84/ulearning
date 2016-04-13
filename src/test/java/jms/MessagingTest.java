package jms;

import static org.junit.Assert.*;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TemporaryQueue;
import javax.jms.TextMessage;

import javax.annotation.Resource; 

import org.junit.Test;
import org.junit.runner.RunWith;

//@RunWith(Arquillian.class) 
public class MessagingTest {

    private static final long QUALITY_OF_SERVICE_THRESHOLD_MS = 5 * 60 * 1000; 

    @Resource(mappedName = "/queue/test") 
    Queue testQueue;
    
    @Resource(mappedName = "/ConnectionFactory") 
    ConnectionFactory factory; 

    
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	/*@Deployment 
    public static JavaArchive createDeployment() { 
        return ShrinkWrap.create(JavaArchive.class).addClass(MessageEchoBean.class); 
    } */
	
	@Test
	public void shouldBeAbleToSendMessage() throws Exception {
	    String messageBody = "ping";

	    Connection connection = null;
	    Session session = null;
	    try {
	        connection = factory.createConnection();
	        session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

	        TemporaryQueue tempQueue = session.createTemporaryQueue();
	        MessageProducer producer = session.createProducer(testQueue);
	        MessageConsumer consumer = session.createConsumer(tempQueue);

	        connection.start();

	        Message request = session.createTextMessage(messageBody);
	        request.setJMSReplyTo(tempQueue);

	        producer.send(request);
	        Message response = consumer.receive(QUALITY_OF_SERVICE_THRESHOLD_MS);
	        assertNotNull(response);
	        String responseBody = ((TextMessage) response).getText();

	        assertEquals("Should have responded with same message", messageBody, responseBody);
	    } finally {
	        if (connection != null) {
	            connection.close();
	        }
	    }
	}


}
