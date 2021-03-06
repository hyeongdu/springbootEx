package com.study.springboot;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class ContentValidator implements Validator {

	
	@Override
	
	public boolean supports(Class<?> arg0) {
		return ContentDto.class.isAssignableFrom(arg0);
		//Validator가 검증 할 수 있는 클래스인지 판단하는 메서드 
	}
	
	@Override // 검증 로직이 이루어지는 메서드 
	public void validate(Object obj, Errors errors) {
		ContentDto dto = (ContentDto)obj;
//		
//		String sWriter = dto.getWriter();
//		if(sWriter == null || sWriter.trim().isEmpty()) {
//			System.out.println("Writer is null or empty");
//			errors.rejectValue("writer", "필수 입력 사항 입니다.");
//		}
		
		
		//rejectIfEmptyOrWhitespace-값이 null이거나 길이가 0이거나 값이 공백 문자로 구성되었을 경우 에러 코드 추가 
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "writer", "필수 입력 사항입니다"); //에러,필드,메세지
		String sWriter = dto.getWriter();
		if(sWriter.length()<3) {
			errors.rejectValue("writer","너무 짧아용");
		}
		
//		String sContent = dto.getContent();
//		if(sContent == null || sContent.trim().isEmpty()) {
//			System.out.println("Writer is null or empty");
//			errors.rejectValue("content", "필수 입력 사항 입니다.");
//			
//		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "content", "필수 입력 사항입니다");
	}
}
