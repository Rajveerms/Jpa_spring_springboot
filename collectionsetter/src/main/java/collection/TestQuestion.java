package collection;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQuestion {

	public static void main(String[] args) {
		
	ApplicationContext	context = new ClassPathXmlApplicationContext("collec.xml");
		Question que = 	(Question) context.getBean("quest");
			
			que.display();
	}

}
