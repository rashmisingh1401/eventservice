package ibm.com.cloud.event;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import ibm.com.cloud.event.model.Event;
import ibm.com.cloud.event.repository.EventRepository;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
public class EventApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventApplication.class, args);
	}

	@Bean
	public Docket swaggerPersonApi10() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
					.apis(RequestHandlerSelectors.basePackage("ibm.com.cloud.event.controller"))
					.paths(PathSelectors.any())
				.build()
				.apiInfo(new ApiInfoBuilder().version("1.0").title("Event API").description("Documentation Event API v1.0").build());
	}
	
	@Bean
	EventRepository repository() {
		EventRepository repository = new EventRepository();
		repository.add(new Event("John Smith", "14011999", "johnsmit@gmail.com", "October"));
		repository.add(new Event("Darren Hamilton", "14011999", "johnsmit@gmail.com", "October"));
		repository.add(new Event("Tom Scott", "14011999", "johnsmit@gmail.com", "March"));
		/*
		 * repository.add(new Event(1L, 2L, "Anna London", 39, "Analyst"));
		 * repository.add(new Event(1L, 2L, "Patrick Dempsey", 27, "Developer"));
		 * repository.add(new Event(2L, 3L, "Kevin Price", 38, "Developer"));
		 * repository.add(new Event(2L, 3L, "Ian Scott", 34, "Developer"));
		 * repository.add(new Event(2L, 3L, "Andrew Campton", 30, "Manager"));
		 * repository.add(new Event(2L, 4L, "Steve Franklin", 25, "Developer"));
		 * repository.add(new Event(2L, 4L, "Elisabeth Smith", 30, "Developer"));
		 */
		return repository;
	}
	
}
