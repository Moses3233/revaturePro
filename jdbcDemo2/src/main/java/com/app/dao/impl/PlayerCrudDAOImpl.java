package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
	public void deletePlayer(String playedby) throws BusinessException {
	
		try(Connection connection=PostgresqlConnection.getConnection()){
			String sql = "delete from test.player where  playedby =?";
			 PreparedStatement preparedStatement= connection.prepareStatement(sql);
			/* 
			 preparedStatement.setString(1, player.getName());
			 preparedStatement.setInt(2, player.getId());
			 preparedStatement.setString(3, player.getPlayedby());
			 preparedStatement.setInt(4, player.getRank());
			 */
			 preparedStatement.executeUpdate(sql);
			 
		} catch(ClassNotFoundException | SQLException e) {
			throw new BusinessException("An Internal error has occured");
		}
		
	}

	@Override
	public int updatePlayerRank(String playedby, int Rank) throws BusinessException {
		int c = 0;
		
		try(Connection connection=PostgresqlConnection.getConnection()){
			String sql = "update test.player set Rank=? where playedby = ?";
			 PreparedStatement preparedStatement= connection.prepareStatement(sql);
			c=preparedStatement.executeUpdate(sql);
		} catch(ClassNotFoundException | SQLException e) {
			throw new BusinessException("An Internal error has occured");
		}
		
		return c;
	}

	@Override
	public Player getPlayerByCharacter(String Name) throws BusinessException {
		Player player = null;
		try(Connection connection=PostgresqlConnection.getConnection()){
			String sql = "select id,playedby,Rank from test.player where Name = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, Name);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				player = new Player();
				player.setName(Name);
				player.setId(resultSet.getInt("id"));
				player.setPlayedby(resultSet.getString("playedby"));
				player.setRank(resultSet.getInt("Rank"));
			}else {
				throw new BusinessException("No Player with the name: " + Name);
			}
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("An Internal error has occured");
		}
			return player;
	}


	@Override
	public List<Player> getAllPlayers() throws BusinessException {
		List<Player> playersList = new ArrayList<>();
		try(Connection connection=PostgresqlConnection.getConnection()){
			String sql = "select Name,id,playedby,Rank from test.player";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player = new Player();
				player.setName(resultSet.getString("Name"));
				player.setId(resultSet.getInt("id"));
				player.setPlayedby(resultSet.getString("playedby"));
				player.setRank(resultSet.getInt("Rank"));
				playersList.add(player);
			}
			if(playersList.size()==0){
				throw new BusinessException("No Player in the Database.");
			}
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("An Internal error has occured");
		}
		return playersList;
	}

}
