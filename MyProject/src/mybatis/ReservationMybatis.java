package mybatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import model.Cafe;
import model.Reservation;
import util.MybatisConnection;

public class ReservationMybatis {
	
	private static final String NS = "member.";
	private Map<String, Object>map = new HashMap<String,Object>();
	
	public int cafeSelectOne(int cafeNum) {
		SqlSession session = MybatisConnection.getConnection();
   	 	
		try {
			
			return session.selectOne(NS+"cafeSelectOne",cafeNum);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			MybatisConnection.close(session);
		}
		
		return 0;
	}
	
	
     public List<Cafe> cafeList(String 분류,String 분류2) {
    	SqlSession session = MybatisConnection.getConnection();
    	map.clear();
    	map.put("cafekind", 분류);
    	map.put("cafelocation", 분류2);
    	
 		try {
 			
 			return session.selectList(NS+"cafeList", map);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			MybatisConnection.close(session);
		}
 		return null;
	}
    
     public int reserveInsert(Reservation reserve) {
    	 SqlSession session = MybatisConnection.getConnection();
    	 int a = 0 ;
    	 a = session.selectOne(NS+"seqNextval");
    	
    	 reserve.setReservenum(a);
    	 
  		try {
  			session.selectList(NS+"reservationInsert", reserve);
  			return 1;
 		} catch (Exception e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		} finally {
 			MybatisConnection.close(session);
 		}
    	 return 0;
     }
     public int reserveDelete(Reservation reserve) {
    	 SqlSession session = MybatisConnection.getConnection();
    	 int a = 0 ;
    	 a = reserve.getReservenum();
    	 
  		try {
  			session.selectList(NS+"reservationInsert", a);
  			return 1;
 		} catch (Exception e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		} finally {
 			MybatisConnection.close(session);
 		}
    	 return 0;
     }
     
     
}
