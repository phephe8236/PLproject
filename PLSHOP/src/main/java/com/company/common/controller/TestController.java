package com.company.common.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.company.common.service.UserService;
import com.company.common.vo.UserVo;

@Controller
public class TestController {
	
	private Log log = LogFactory.getLog(this.getClass());
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/interceptorTest.do")
    public ModelAndView interceptorTest(@ModelAttribute("userVo") UserVo userVo, Model model ) throws Exception{
         
        ModelAndView mv = new ModelAndView("");
        log.debug("인터셉터 테스트입니다!");
        
        
        userService.insertUser(userVo);
        
        return mv;
    }
	
		

}
