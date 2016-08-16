package mq;

import javax.jms.*;

import org.apache.activemq.ActiveMQConnectionFactory;

public class Sender {  
    public static void main(String[] args) throws JMSException {  
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");  
        Connection connection = connectionFactory.createConnection();  
        connection.start();  
  
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);  
        Destination destination = session.createQueue("myQueue");  
          
        MessageProducer producer = session.createProducer(destination);  
        producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);  
  
        while(true) {  
            TextMessage message = session.createTextMessage();  
            message.setText("message_" + System.currentTimeMillis());  
            producer.send(message);  
            System.out.println("Sent message: " + message.getText());  
  
            try {  
                Thread.sleep(1000);  
            } catch (InterruptedException e) {  
                e.printStackTrace();  
            }  
        }  
  
    }  
}  
