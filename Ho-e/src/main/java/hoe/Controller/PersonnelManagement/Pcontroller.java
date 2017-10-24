package hoe.Controller.PersonnelManagement;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Pcontroller {

	@RequestMapping("/list.do")
	public ModelAndView giftSelectAll() {
		ModelAndView mav = new ModelAndView();


		mav.setViewName("PersonnelManagement/list");

		return mav;
	}
}
