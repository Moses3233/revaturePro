package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.dao.PlayerSearchDAO;
import com.app.dao.dbutil.PostgresqlConnection;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerSearchDAOImpl implements PlayerSearchDAO{

	@Override
	public Player getPlayerByName(String PlayedBy) throws BusinessException {
		Player player = null;
		try(Connection connection=PostgresqlConnection.getConnection()){
		String sql = "select id, Name, Rank from test.player where playedby = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, PlayedBy);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if(resultSet.next()) {
			player = new Player();
			player.setPlayedby(PlayedBy);
			player.setId(resultSet.getInt("id"));
			player.setName(resultSet.getString("Name"));
			player.setRank(resultSet.getInt("Rank"));
		}else {
			throw new BusinessException("No Player with the name: " + PlayedBy);
		}
		
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("An Internal error has occured");
		}
		return player;
	}

	@Override
	public List<Player> getPlayersByRank(int Rank) throws BusinessException {
			List<Player> rankList = new ArrayList<>();
			try(Connection connection=PostgresqlConnection.getConnection()){
				String sql = "select id, Name, Rank from test.player where playedby = ?";
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet resultSet = preparedStatement.executeQuery();
				
				while(resultSet.next()) {
					Player player = new Player();
					player.setPlayedby(resultSet.getString("playedby"));
					player.setId(resultSet.getInt("id"));
					player.setName(resultSet.getString("Name"));
					player.setRank(resultSet.getInt("Rank"));
					rankList.add(player);
				}
				if(rankList.size()==0){
					throw new BusinessException("No Players in the database");
				}
				
				} catch (ClassNotFoundException | SQLException e) {
					throw new BusinessException("An Internal error has occured");
				}
		return rankList;
	}

}
