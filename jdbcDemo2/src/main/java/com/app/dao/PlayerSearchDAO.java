package com.app.dao;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Player;

public interface PlayerSearchDAO {
	public Player getPlayerByName(String Name) throws BusinessException;
	
	public List<Player> getPlayersByRank(int Rank) throws BusinessException;

}
