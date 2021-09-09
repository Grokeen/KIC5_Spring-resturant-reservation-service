package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cafe;
import model.Reservation;
import mybatis.ReservationMybatis;

public class ReservationController extends Action{
	public String main (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		return "/view/main.jsp";
		
	}
	public String search (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		return "/view/reservation/search.jsp";
		
	}
	public String searchPro (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		ReservationMybatis dao = new ReservationMybatis();
		List<Cafe> cafeList =dao.cafeList(String 분류) ;
		
		request.setAttribute("cafeList", cafeList);
		
		return "/view/reservation/searchList.jsp";
		
	}
	
	public String searchList (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		ReservationMybatis dao = new ReservationMybatis();
		Cafe cafe = dao.cafeSelectOne(cafeNum);
		
		
		request.setAttribute("cafe", cafe);
		return "/view/reservation/cafe.jsp";
		
	}
	public String cafe (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	
		
		session에 저장("cafeNum", cafeNum);
		
	return "/view/reservation/reservation.jsp";
	
	}
	public String reservation (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		return "/view/reservation/reservation.jsp";
	}
	public String reservationPro (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		ReservationMybatis dao = new ReservationMybatis();
		
		request.setAttribute("date", date);
		request.setAttribute("date", date);
		request.setAttribute("date", date);
		request.setAttribute("date", date);
		request.setAttribute("date", date);
		
		msg(reserve.tel);
		
		return "/view/orner/confirm.jsp";
	}
	
	


}
