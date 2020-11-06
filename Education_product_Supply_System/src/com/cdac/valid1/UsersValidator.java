package com.cdac.valid1;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.cdac.dto.Users;

@Service
public class UsersValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.equals(Users.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName","unmKey", "user name required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userPass", "passKey","password required");
		
		Users userlogin = (Users)target;
		if(userlogin.getUserPass()!=null) {
			if(userlogin.getUserPass().length()<3) { 
				errors.rejectValue("userPass", "passKey", "password should contain more 2 chars");
			}
		}
		
		
	}
	
}
