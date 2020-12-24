package com.app.main;

import com.app.dao.PlayerCrudDAO;
import com.app.dao.impl.PlayerCrudDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerMain {

	public static void main(String[] args) {
		
PlayerCrudDAO dao = new PlayerCrudDAOImpl();

Player p=new Player("Donkey Kong", 2, "Karot", 6);

try {
	if(dao.createPlayer(p)!=0) {
		System.out.println("Player created successfully.");
	}
} catch (BusinessException e) {
	System.out.println(e.getMessage());
}


	}

}
