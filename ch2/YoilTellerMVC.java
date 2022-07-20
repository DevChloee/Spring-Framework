package com.fastcampus.ch2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//if you insert day,month,year,  it shows day
@Controller
public class YoilTellerMVC {  //http://localhost/ch2/getYoilMVC?year=2021&month=10&day=1
		//	public static void main(String[] args) {
	@RequestMapping("/getYoilMVC")
//		public void main(HttpServletRequest request, HttpServletResponse response) throws IOException {
		public ModelAndView main(int year, int month, int day) throws IOException {
		
		ModelAndView mv = new ModelAndView();
		// 1. validation check
//			if(!isValid(year, month, day))
//				return "yoilError";
		
		// 2. calculate day
		char yoil = getYoil(year, month, day);
		
		// 3. save results in model
		mv.addObject("year", year);
		mv.addObject("month", month);
		mv.addObject("day", day);
		mv.addObject("yoil", yoil);
		
		// 4. Specifies the view to display the results in.
		mv.setViewName("yoil");
		
		return mv;
//		return "yoil";	// /WEB-INF/vies/yoil.jsp
		// 3. Output
//		response.setContentType("text/html");
//		response.setCharacterEncoding("utf-8");
//		PrintWriter out = response.getWriter();  // response객체에서 브라우져로의 출력 스트림을 얻는다.
//		out.println(year + "year "  + month + "month" + day + "day is ");
//		out.println(yoil + "day");
	}

private boolean isValid(int year, int month, int day) {
		// TODO Auto-generated method stub
		return true;
	}

private char getYoil(int year, int month, int day) {
	Calendar cal = Calendar.getInstance();
	cal.set(year,  month-1, day);
	 
	int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); 
	return " MTWTFSS".charAt(dayOfWeek);
}
}
