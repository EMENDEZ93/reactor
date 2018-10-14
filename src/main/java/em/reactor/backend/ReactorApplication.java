package em.reactor.backend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class ReactorApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(ReactorApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ReactorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Flux<String> programingLanguage = Flux.just("Java", "Python", "C#") 
				.doOnNext( System.out::println );

		programingLanguage.subscribe(log::info);
		
	}
}
