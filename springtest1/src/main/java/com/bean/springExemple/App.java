package com.bean.springExemple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
     
        // citier au sous de projet
          ApplicationContext context = new FileSystemXmlApplicationContext("applicationContext.xml");
        
        
        // citier dans le meme Dossier vec les classes java 
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        	
        User user = (User) context.getBean("user");
        user.toPrint(user);
        
    }
    
}
