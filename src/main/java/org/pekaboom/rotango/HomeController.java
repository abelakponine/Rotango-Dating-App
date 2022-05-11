package org.pekaboom.rotango;

import org.pekaboom.rotango.modules.AppConfig;
import org.pekaboom.rotango.modules.Profile;
import org.pekaboom.rotango.modules.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	User user = context.getBean(User.class);
	
	@SuppressWarnings("resource")
	@GetMapping("/")
	public String welcome() {
		Profile userProfile = user.getProfile();
		user.setFirstname("Abel2");
		user.setLastname("Akponine");
		userProfile.setProfileUsername("kingabel.a");
		userProfile.setProfilePassword("test1234");
		userProfile.setAboutInfo("Full-stack Software Developer");
		
		return "index.jsp";
	}
	
	@GetMapping("/{screen}")
	@ResponseBody
	public ModelAndView name(@PathVariable String screen) {
		ModelAndView mv = new ModelAndView();
		String result = "You are viewing "+screen;
		mv.addObject("screen", result);
		mv.setViewName("screen.jsp");
		return mv;
	}
}
