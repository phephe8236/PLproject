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
public class UserController {
	
	private Log log = LogFactory.getLog(this.getClass());
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/userlogin.do")
    public ModelAndView user(@ModelAttribute("userVo") UserVo userVo, Model model ) throws Exception{
         
        ModelAndView mv = new ModelAndView("main");
        log.debug("인터셉터 테스트입니다!");
       log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + userVo.getId());
       log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + userVo.getPassword());
       
       userVo.setId("소레이죠");
       userVo.setPassword("123");
        userService.insertUser(userVo);
        
//       List list = userService.selectUserList();
          
//       System.out.println("list : " + list);
       
       
        return mv;

    }
	

}
