package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Reservation;
import mybatis.ReservationMybatis;

public class OrnerController {
	
	
	public String confirm (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		return "/view/orner/comfirm.jsp";	
	}
	public String confirmPro (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		Reservation reserve = new Reservation();
		ReservationMybatis dao = new ReservationMybatis();
		
		reserve.set ..
		reserve.set ..
		reserve.set ..
		reserve.set ..
		reserve.set ..
		
		
		dao.reserveInsert(reserve)
		
		return "/view/main.jsp";	
	}
}
	