package com.app.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.dao.PlayerSearchDAO;
import com.app.dao.dbutil.PostgresqlConnection;
import com.app.dao.impl.PlayerSearchDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerSearchServiceImpl implements PlayerSearchService {
	
	private PlayerSearchDAO playerSearchDAO = new PlayerSearchDAOImpl();
	@Override
	public Player getPlayerbyName(String PlayedBy) throws BusinessException {
		Player player =null;
		
			player = playerSearchDAO.getPlayerbyName(PlayedBy);
			
		return player;
	}

	@Override
	public Player getPlayerbyChar(String Name) throws BusinessException {
		Player player =null;
		
		player = playerSearchDAO.getPlayerbyChar(Name);
		
	return player;
}

	@Override
	public List<Player> getPlayersbyRank(int Rank) throws BusinessException {
		List<Player> rankList = new ArrayList<>();
		try(Connection connection=PostgresqlConnection.getConnection()){
			String sql = "select id, Name, playedby from test.player where Rank = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, Rank);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				Player player = new Player();
				player.setRank(Rank);
				player.setId(resultSet.getInt("id"));
				player.setName(resultSet.getString("Name"));
				player.setPlayedby(resultSet.getString("playedby"));
				
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


	@Override
	public Player getPlayerbyID(int ID) throws BusinessException {
		Player player =null;
		if(ID>0 && ID<100) {
			player = playerSearchDAO.getPlayerbyID(ID);
		}
		else {throw new BusinessException("Entered Player ID: "+ ID + " is invalid.");}
		return player;
	}

	@Override
	public List<Player> getAllPlayers() throws BusinessException {
		List<Player> playerList = playerSearchDAO.getAllPlayers();
		if(playerList!=null && playerList.size()!=0) {
			System.out.println("\n\nFound " + playerList.size() + " number of players in the database. Printing...\n");
			for(Player p:playerList) {
				System.out.println(p);
			}
		}
		else {throw new BusinessException("This list is empty...");}
		return playerList;
	}

}
