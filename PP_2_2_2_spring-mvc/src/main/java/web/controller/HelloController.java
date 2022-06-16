package web.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.config.BeansConfig;
import web.service.CarServiceImpl;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping( "/hello")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);
		return "index";
	}

	@GetMapping("/car")
	public String sendCars(HttpServletRequest request, Model model) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
		CarServiceImpl carService = context.getBean(CarServiceImpl.class);
		model.addAttribute("cars", carService.getItemsByCount(request.getParameter("count")));
		context.close();
		return "cars";
	}
	
}