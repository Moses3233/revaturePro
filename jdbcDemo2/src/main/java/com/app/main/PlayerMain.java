package com.app.main;

import java.util.List;

import com.app.dao.PlayerCrudDAO;
import com.app.dao.impl.PlayerCrudDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerMain {

	public static void main(String[] args) {
		
PlayerCrudDAO dao = new PlayerCrudDAOImpl();

/*Player p=new Player("Donkey Kong", 2, "Karot", 6);

try {
	if(dao.createPlayer(p)!=0) {
		System.out.println("Player created successfully.");
	}
} catch (BusinessException e) {
	System.out.println(e.getMessage());
}

*/

/*
try {
	Player player = dao.getPlayerByCharacter("Dr. Mario");
	
	if(player!=null) {
		System.out.println("Details of player with the character " + player.getName());
		System.out.println(player);
	}
} catch (BusinessException e) {
System.out.println(e.getMessage());
}
*/

try {
	List<Player> playerList = dao.getAllPlayers();
	if(playerList!=null && playerList.size()!=0) {
		System.out.println("\n\nFound " + playerList.size() + " number of players in the database. Printing...\n");
		for(Player p:playerList) {
			System.out.println(p);
		}
	}
} catch (BusinessException e) {
System.out.println(e.getMessage());
}
	}

}
