package com.railway.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UtilTest_r {
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
        ResultSet rs = stmt.executeQuery("SELECT * FROM train");
        //��������ݣ�rs.next()����true
        System.out.println(rs.next());
        while(rs.next()){
        	System.out.println("nnn");
            System.out.println(rs.getString("Tname"));
        }
	}
}
