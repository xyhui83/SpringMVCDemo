package com.ivan.springmvc;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ivan.springmvc.web.formbean.UserForm;

@Controller
@RequestMapping("user")
public class UserController {
	
//	@Autowired
//	private Validator validator;

//	@RequestMapping(value="/login",method=RequestMethod.POST)
//	protected String loginSubmit(UserForm user,BindingResult result,Model model) {
//		this.validator.validate(user, result);//添加验证  
//        if (result.hasErrors()) {  
//            model.addAttribute("user", user);// 把user对象返回到页面， 这样不至于表单被清空了  
//            return "login";  
//        }
//		return "success";
//	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	protected String loginSubmit(@Valid @ModelAttribute("userForm") UserForm user,BindingResult result,Model model) {
      if (result.hasErrors()) {  
          model.addAttribute("user", user);// 把user对象返回到页面， 这样不至于表单被清空了  
          return "login";  
      }  
		return "success";
	}
}
