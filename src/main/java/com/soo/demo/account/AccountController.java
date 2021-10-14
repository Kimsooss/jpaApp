package com.soo.demo.account;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AccountController {

	@GetMapping("/sign-up")
	public String singUpForm(Model model) {
		model.addAttribute("signUpForm",new SignUpForm());
		//"signUpForm" 생략가능한데. SignUpForm객체의 이름이 애트리뷰트 이름이됨 camelCase로.
		return "account/sign-up";
	}
	
	@PostMapping("/sign-up")//@ModelAttribute 생략가능 valid는 객체엇 정의한  notblack,length등
	public String signUpSubmit(@Valid @ModelAttribute SignUpForm signUpForm,Errors errors) {
		if(errors.hasErrors()) {
			return "account/sign-up";
		}
		return "redirect:/";
	}
	
}
