package sequence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sequence.config.SequenceGeneratorConfiguration;

@SpringBootApplication
public class Spring5RecipesApplication {

	public static void main(String[] args) {
		//For practice 2-2
		ApplicationContext context = new AnnotationConfigApplicationContext("sequence");
		
		SequenceDAO sequenceDao = context.getBean(SequenceDAO.class);
		
		System.out.println(sequenceDao.getNextValue("IT"));
		System.out.println(sequenceDao.getNextValue("IT"));
		
		
		
		/* For practice 2-1
		ApplicationContext context = new AnnotationConfigApplicationContext(SequenceGeneratorConfiguration.class);
		SequenceGenerator generator = context.getBean(SequenceGenerator.class);
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		
		//SpringApplication.run(Spring5RecipesApplication.class, args); */
	}

}

