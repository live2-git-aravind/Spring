package com.live;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.live.repository.ProductRepository;

public class App 
{
    public static void main( String[] args )
    {
        performIOC();
        testsingleton();
    }

	private static void performIOC() {
		//System.out.println( "Enterprise Spring Project!" );
        //ProductRepository productRepository = new OracleRepository();
    	ProductRepository productRepository = null;
    	//Load  the spring container
    	//The spring container  would use the applicationContext.xml to configure the spring beans
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	productRepository = (ProductRepository)context.getBean("productRepository");
        productRepository .getProducts().forEach(System.out::println);
        ProductRepository mySqlRepository = null; 
        mySqlRepository=context.getBean("mySqlRepository", ProductRepository.class);
        mySqlRepository.getProducts().forEach(System.out::println);
	}
	private static void testsingleton() {
		ProductRepository productRepository = null;
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	productRepository = (ProductRepository)context.getBean("productRepository");
        System.out.println(productRepository);
        
    	productRepository = (ProductRepository)context.getBean("productRepository");
    	System.out.println(productRepository);
        
	}
}
