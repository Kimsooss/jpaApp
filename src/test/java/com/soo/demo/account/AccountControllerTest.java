package com.soo.demo.account;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
@SpringBootTest
@AutoConfigureMockMvc
class AccountControllerTest {

	
	@Autowired private MockMvc mockmvc;
	@DisplayName("회원가입화면 보이즌지 테스트")
	@Test
	void test() throws Exception {
		mockmvc.perform(get("/sign-up"))
		.andExpect(status().isOk())
		.andExpect(view().name("account/sign-up"));
	}

}
