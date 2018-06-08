package demo.corespring;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		//  System.out.println( "Hello World!" );
		//	MessageSevice msg = new MessageSevice();
		//	msg.printMessage();
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("demo/corespring/beanconfig.xml");
		MessageSevice service1=ctx.getBean("msg", MessageSevice.class);
		//MessageSevice service2=ctx.getBean("msg", MessageSevice.class);
		
		service1.printMessage();
	}
}
