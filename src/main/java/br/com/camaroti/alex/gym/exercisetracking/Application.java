package br.com.camaroti.alex.gym.exercisetracking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
//		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
//		TrackingDataProvider bean = run.getBean(TrackingDataProvider.class);
//		bean.save(TrackingModel.builder().score(3).build());
	}

}
