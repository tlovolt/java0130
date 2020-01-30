package oracleuse;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleMain {

	public static void main(String[] args) {
		try {
			//이 코드는 애플리케이션 전체에서 1번만 수행하면 됩니다.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println("드라이버 클래스 로드 성공");
			
			//데이터베이스 접속
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@211.183.7.61:1521:xe", "user00", "user00");
			System.out.println("접속 성공");
			
			//접속 해제
			con.close();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
