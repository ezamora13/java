package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Component
public class QuestionProperties {

	@Value("#{question.template}")
    public String template;
}

@Autowired
class TimingProperties {
    
    public int minimum;
}

@Configuration
@Import({QuestionProperties.class, TimingProperties.class})
class Config {

}