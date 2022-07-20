package com.fastcampus.ch2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//if you insert day,month,year,  it shows day
@Controller
public class YoilTeller {
		//	public static void main(String[] args) {
	@RequestMapping("/getYoil")
		public void main(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//1. input
		String year =request.getParameter("year");
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		
		// 2. excercise
		int yyyy = Integer.parseInt(year);
		int mm = Integer.parseInt(month);
		int dd = Integer.parseInt(day);
		
		Calendar cal = Calendar.getInstance();
		cal.set(yyyy,  mm-1, dd);
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 1.  일요일, 2: 월요일 ...
		char yoil = " MTWTFSS".charAt(dayOfWeek);
		
		
		// 3. Output
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();  // response객체에서 브라우져로의 출력 스트림을 얻는다.
		out.println(year + "year "  + month + "month" + day + "day is ");
		out.println(yoil + "day");
	}
}
