package com.app.dao;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Player;

public interface PlayerCrudDAO {
	
public int createPlayer(Player player) throws BusinessException;
public void deletePlayer(String playedby) throws BusinessException;
public int updatePlayerRank(String playedby, int Rank) throws BusinessException;
public Player getPlayerByCharacter(String Name) throws BusinessException;
public List<Player> getAllPlayers() throws BusinessException;

}
