package com.app.main;

import java.util.List;
import java.util.Scanner;

import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.service.PlayerSearchService;
import com.app.service.PlayerSearchServiceImpl;

public class PlayerSearchMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to PlayerSearch app v1.0");
		System.out.println("---------------------------------");
		
		int ch = 0;
		PlayerSearchService playerSearchService = new PlayerSearchServiceImpl();
		
		do {
			
		System.out.println("Search Options");
		System.out.println("=====================================");
		System.out.println("1) By Name");
		System.out.println("2) By Character");
		System.out.println("3) By Rank");
		System.out.println("4) By ID");
		System.out.println("5) Search All");
		System.out.println("6) EXIT");
		
		System.out.println("Please make a valid selection: ");
		try{
			ch = Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException e) {}
		
	
		
		switch(ch){
			
		case 1:
			System.out.println("Enter a player name for more details: ");

			String playedby = sc.nextLine();
			Player player=null;
			try {
				player = playerSearchService.getPlayerbyName(playedby);
			} catch (BusinessException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}	
		if(player!=null) {System.out.println("Player found with name: " + playedby + ". Here's the details: \n");}
		System.out.println(player);	
		System.out.println("");
			break;
			
			
		case 2:
			System.out.println("Enter a player's character for more details: ");

			String Name = sc.nextLine();
			Player player1 = null;
			try {
				player1 = playerSearchService.getPlayerbyChar(Name);
			} catch (BusinessException e1) {
				System.out.println(e1.getMessage());
			}
		if(player1!=null) {System.out.println("Player found with Character: " + Name + ". Here's the details: \n");}
		System.out.println(player1);	
		System.out.println("");
			break;
		
			
		case 3:
			System.out.println("Enter the Player's Rank for more details: ");
			try {
			int Rank = Integer.parseInt(sc.nextLine());
			List<Player> playerList = playerSearchService.getPlayersbyRank(Rank);
			if(playerList.size()!=0) {System.out.println("Printing the players in the rank...");}
			System.out.println(playerList);	
			System.out.println("");
			}catch(NumberFormatException e){
				System.out.println("This rank entered isn't in the range.");
			} catch (BusinessException e) {
				System.out.println(e.getMessage());
			}
			break;
			
			
		case 4:
			System.out.println("Enter the ID for more details:");
			try {
				int ID = Integer.parseInt(sc.nextLine());
			Player player2 = playerSearchService.getPlayerbyID(ID);	
			if(player2!=null) {System.out.println("Player found with ID: " + ID + ". Here's the details: \n");}
			System.out.println(player2);	
			System.out.println("");
			
			}catch(NumberFormatException e){System.out.println("The ID can only be numbers");}
				catch (BusinessException e) {System.out.println(e.getMessage());}
		break;
			
			
		case 5:
			System.out.println("Retrieving all players...");
			try {
				List<Player> allPlayersList = playerSearchService.getAllPlayers();
				if(allPlayersList!=null && allPlayersList.size()!=0) {
					System.out.println("There are " + allPlayersList.size() + " player(s).");
					System.out.println();}
			} catch (BusinessException e) {
				System.out.println(e.getMessage());
			}
			break;
			
			
		case 6:
			System.out.println("Thank you for using this service. Goodbye!");
			break;
			
			
		default:
			System.out.println("Error!: Not a valid option. Try again");
			
			
		}
}while(ch!=6);
		
	}
	
}
