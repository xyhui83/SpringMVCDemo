package com.ivan.springmvc.web.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.ivan.springmvc.web.formbean.UserForm;

//@Component
public class UserValidator implements Validator {

    @Override
    public boolean supports(Class<?> zlass) {
        // 要验证的Model，为假则不验证。
        return UserForm.class.isAssignableFrom(zlass);
//        return false;
    }

    @Override
    public void validate(Object object, Errors errors) {
    	UserForm userVO = (UserForm) object;
        ValidationUtils.rejectIfEmpty(errors, "name", "user.name.required", "name的内容不能为空");
        ValidationUtils.rejectIfEmpty(errors, "password", "user.password.required", "password的内容不能为空");

        int length = userVO.getName().length();
        if (length > 20) {
            errors.rejectValue("name", "user.name.too_long", "用户名不能超过{20}个字符");
        }
        length = userVO.getPassword().length();
        if (length < 6) {
            errors.rejectValue("password", "user.password.too_short", "密码太短，不能少于{6}个字符");
        } else if (length > 20) {
            errors.rejectValue("password", "user.password.too_long", "密码太长，不能长于{20}个字符");
        }
    }

}