package com.luvtocode;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SportConfig {

	@Bean
	public Coach swimCoach()
	{
		return new SwimCoach();
	}
}
