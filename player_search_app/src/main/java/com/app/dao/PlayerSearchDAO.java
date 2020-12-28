package com.app.dao;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Player;

public interface PlayerSearchDAO {

public Player getPlayerbyName(String PlayedBy) throws BusinessException;
public Player getPlayerbyChar(String Name) throws BusinessException;
public List<Player> getPlayersbyRank(int Rank) throws BusinessException;
public Player getPlayerbyID(int ID) throws BusinessException;
public List<Player> getAllPlayers() throws BusinessException;
	
	
}
