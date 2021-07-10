package com.example.demo;

import org.springframework.context.annotation.*;
import org.springframework.beans.factory.annotation.*;

@Configuration
public class ServicesConfig {
    @Bean
    public UsernameValidator validatorShort(){
    	UsernameValidator usernameValidator= new UsernameValidator();
    	usernameValidator.setMinLength(3);
    	return usernameValidator;
    			
    	
    }
    
    @Autowired
    public UsernameValidator validatorLong(){
    	UsernameValidator usernameValidator= new UsernameValidator();
    	usernameValidator.setMinLength(8);
    	return usernameValidator;
    			
    	
    }

}

class UsernameValidator {
    private int minLength;
    
    public UsernameValidator(int minLength) {
        this.minLength = minLength;
    }
    
    public boolean isUsernameValid(String username) {
        return username.length() >= minLength;
    }

	public void setMinLength(int minLength) {
		this.minLength = minLength;
	}

	public UsernameValidator() {
	
	}
    
    
}