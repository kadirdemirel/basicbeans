package training.basicbeans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import training.basicbeans.entities.concretes.SocialMedia;

@SpringBootApplication
public class BasicbeansApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(BasicbeansApplication.class, args);
		for (String applicationName:applicationContext.getBeanDefinitionNames()) {
			System.out.println(applicationName);
		}
		SocialMedia socialMedia=applicationContext.getBean("socialMedia",SocialMedia.class);
		socialMedia.show();
    }

	@Bean
	public String getName() {
		return "Kadir";
	}



}
