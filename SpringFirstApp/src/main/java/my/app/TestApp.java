package my.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String arg[]) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("config.xml");
		OracleCon con = ap.getBean("db", OracleCon.class);
		System.out.println(con);
	}
}
