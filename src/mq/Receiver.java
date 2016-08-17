package mq;

import javax.jms.*;

import org.apache.activemq.ActiveMQConnectionFactory;

public class Receiver {  
    public static void main(String[] args) throws JMSException {  
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");  
        Connection connection = connectionFactory.createConnection();  
        connection.start();  
  
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);  
        Destination destination = session.createQueue("myQueue");  
        MessageConsumer consumer = session.createConsumer(destination);  
        consumer.setMessageListener(new MessageListener() {  
            public void onMessage(Message message) {  
                TextMessage tm = (TextMessage) message;  
                try {  
                    System.out.println("Received message: " + tm.getText());  
                } catch (JMSException e) {  
                    e.printStackTrace();  
                }  
            }  
        });  
          
//      session.close();  
//      connection.stop();  
//      connection.close();  
    }  
}  