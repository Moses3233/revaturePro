package com.app.dao;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Player;

public interface PlayerCrudDAO {
	
public int createPlayer(Player player) throws BusinessException;
public void deletePlayer(String playedby);
public int updatePlayerRank(String playedby, int Rank);
public Player getPlayerByCharacter(String Name);
public List<Player> getAllPlayers();

}
