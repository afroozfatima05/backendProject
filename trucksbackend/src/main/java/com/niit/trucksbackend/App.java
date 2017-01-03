package com.niit.trucksbackend;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.backend.config.AppConfig;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
        
    	
        System.out.println( "Hello World!" );
    }
}
