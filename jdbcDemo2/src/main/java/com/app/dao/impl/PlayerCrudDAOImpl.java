package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.app.dao.PlayerCrudDAO;
import com.app.dao.dbutil.PostgresqlConnection;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerCrudDAOImpl implements PlayerCrudDAO{

	@Override
	public int createPlayer(Player player) throws BusinessException{

		int c = 0;
		try(Connection connection=PostgresqlConnection.getConnection()){
			String sql = "insert into test.player(Name, id, playedby, Rank) values(?, ?, ?, ?)";
			 PreparedStatement preparedStatement= connection.prepareStatement(sql);
			 
			 preparedStatement.setString(1, player.getName());
			 preparedStatement.setInt(2, player.getId());
			 preparedStatement.setString(3, player.getPlayedby());
			 preparedStatement.setInt(4, player.getRank());
			 
			 c=preparedStatement.executeUpdate();
			 
		} catch(ClassNotFoundException | SQLException e) {
			throw new BusinessException("An Internal error has occured");
		}
return c;
	}

	@Override
	public void deletePlayer(String playedby) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int updatePlayerRank(String playedby, int Rank) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Player getPlayerByCharacter(String Name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		return null;
	}

}
