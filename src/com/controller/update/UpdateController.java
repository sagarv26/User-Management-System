package com.controller.update;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.dto.registration.RegistrationDTO;
import com.model.service.update.UpdateService;

@Controller
@RequestMapping("/")
public class UpdateController 
{
	public UpdateController() 
	{
		System.out.println("Update Controller Created...");
	}

	@Autowired
	private UpdateService service;
	
	@RequestMapping(value="/update.do",method=RequestMethod.POST)
	public ModelAndView update(@ModelAttribute RegistrationDTO dto,HttpServletRequest req)
	{
		HttpSession session=req.getSession(false);
		RegistrationDTO rdto=(RegistrationDTO) session.getAttribute("DTOfrmDB");
		int pk=rdto.getId();
		dto.setId(pk);
		RegistrationDTO rdto1 = service.updateService(dto);
		session.setAttribute("DTOfrmDB", rdto1);
		return new ModelAndView("/Account.jsp","update_success","Update of details successfull...");
	}
}
