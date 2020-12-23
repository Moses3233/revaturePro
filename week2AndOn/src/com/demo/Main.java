package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		//System.out.println("Hello World with Maven");
		
		Connection connection = null;
		
		
		try {
			//Step 1 - Load Driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded Successfully");
			//Step 2 - Open Connection(url,username,password)
			String url="jdbc:postgresql://localhost:5432/postgres";
			String username="postgres";
			String password="postgres";
			connection=DriverManager.getConnection(url, username, password);
			System.out.println("Connection Success");
			//Step 3 - Create Statement
			Statement statement=connection.createStatement();
			String sql="select Name,id,playedby,Rank from test.player order by Name desc";
			//Step 4 - Execute Query
			ResultSet resultSet=statement.executeQuery(sql);
			System.out.println("Query executed");
			//Step 5 - Process Results
			while(resultSet.next()) {
				System.out.print("  Name  : "+resultSet.getString("name"));
				System.out.print("  ID  : "+resultSet.getInt("id"));
				System.out.print("  Played By  : "+resultSet.getString("playedby"));
				System.out.print("  Rank : "+resultSet.getInt("rank"));
				System.out.println();
			}
			System.out.println("Results Processed");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			try {
				//Step 6 - CLose Connection
				connection.close();
				System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
		
		
	}
	
}
