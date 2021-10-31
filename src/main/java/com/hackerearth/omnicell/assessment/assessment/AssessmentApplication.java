package com.hackerearth.omnicell.assessment.assessment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "com.hackerearth.omnicell.assessment.assessment", "com.hackerearth.omnicell.assessment.assessment.config", 
			"com.hackerearth.omnicell.assessment.assessment.controller", "com.hackerearth.omnicell.assessment.assessment.dto", "com.hackerearth.omnicell.assessment.assessment.service"
})
@EntityScan(basePackages = { "com.hackerearth.omnicell.assessment.assessment.service"
		
})
@EnableJpaRepositories(basePackages = { "com.hackerearth.omnicell.assessment.assessment.service"
})
public class AssessmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssessmentApplication.class, args);
	}

}
