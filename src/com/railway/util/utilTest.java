package com.railway.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class utilTest {
		private static final String URL = "jdbc:sqlite::resource:db/RailWay.db";
		private static final String USER = "";
		private static final String PASSWORD = "";
		
		protected static Statement s=null;
		protected static ResultSet rs = null;
		protected static Connection con = null;

		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			//1.������������
	        Class.forName("org.sqlite.JDBC");
	        //2. ������ݿ�����
	        Connection conn = DriverManager.getConnection(URL);
	        //3.�������ݿ⣬ʵ����ɾ�Ĳ�
	        Statement stmt = conn.createStatement();
	        ResultSet rs = stmt.executeQuery("SELECT * FROM orderlist");
	        //��������ݣ�rs.next()����true
	        //System.out.println(rs.next());
	        while(rs.next()){
	        	//System.out.println("nnn");
	            System.out.println(rs.getString("tid")+rs.getString("t_num")+rs.getString("t_price")+rs.getString("start_S")+rs.getString("arrive_S")+rs.getString("date")+rs.getString("t_name")+rs.getString("o_name")+rs.getString("o_phone"));
	        }
		}
	
}
