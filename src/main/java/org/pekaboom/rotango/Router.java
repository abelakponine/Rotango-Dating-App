package org.pekaboom.rotango;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.pekaboom.rotango.modules.AppConfig;
import org.pekaboom.rotango.modules.FileLoader;
import org.pekaboom.rotango.modules.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Router {
	
	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	User user = context.getBean(User.class);

	@SuppressWarnings("resource")
	@GetMapping("/")
	public ModelAndView welcome() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("hello", "Hello User!");
		mv.setViewName("index.jsp");
		return mv;
	}

	@SuppressWarnings("resource")
	@GetMapping("/app")
	public ModelAndView app() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("hello", "Hello User!");
		mv.setViewName("index.jsp");
		return mv;
	}

	@GetMapping("/images/{file}")
	@RequestMapping(produces="image/png")
	@ResponseBody
	public String css(HttpServletRequest request, @PathVariable String file) throws IOException {
		StringBuilder pubFiles = new FileLoader().getWebFiles(request, "./images/"+file);
//		System.out.println(pubFiles);
		return pubFiles.toString();
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
