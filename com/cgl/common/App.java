/*
To compile
javac -classpath ../../../:../../../spring-3.2.0/libs/spring-context-3.2.0.RELEASE.jar:../../../spring-3.2.0/libs/spring-core-3.2.0.RELEASE.jar:../../../spring-3.2.0/libs/spring-beans-3.2.0.RELEASE.jar App.java

To run
(also need org/apache/commons/logging/LogFactory)
java -classpath .:./spring-3.2.0/libs/spring-context-3.2.0.RELEASE.jar:./spring-3.2.0/libs/spring-core-3.2.0.RELEASE.jar:./spring-3.2.0/libs/spring-beans-3.2.0.RELEASE.jar com/cgl/common/App
*/

package com.cgl.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
    	  new ClassPathXmlApplicationContext(new String[] {"Spring-Customer.xml"});

    	Customer cust = (Customer)context.getBean("CustomerBean");
    	System.out.println(cust);
     
    }
}
