package org.slipp.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	
	private List<UserVO> users = new ArrayList<UserVO>();

	@PostMapping("/create")
	public String createPOST(UserVO user) throws Exception {
		System.out.println("user ====> " + user);
		users.add(user);
		return "redirect:/list";
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("user", users);
		return "list";
	}

}
