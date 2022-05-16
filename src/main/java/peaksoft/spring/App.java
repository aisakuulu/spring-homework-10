package peaksoft.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ){
        System.out.println();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");


        Person firstPerson =context.getBean("firstPersonBean",Person.class);
        System.out.println(firstPerson);


        Person secondPerson =context.getBean("secondPersonBean",Person.class);
        System.out.println(secondPerson);

        context.close();

    }
}
