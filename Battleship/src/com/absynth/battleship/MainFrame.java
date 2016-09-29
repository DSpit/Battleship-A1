/**
 * Name:				David Boivin (40004941)
 * COMP249
 * Assignment #:		1
 * Due Date:			September 23, 2026
 */
package com.absynth.battleship;

import java.util.Scanner;

import com.absynth.battleship.data.BattleshipBoard;
import com.absynth.battleship.players.Computer;
import com.absynth.battleship.players.Player;
import com.absynth.battleship.players.User;

/**
 * Main driver for the battleship program.
 * 
 * @author David Boivin (40004941)
 *
 */
public class MainFrame {
	
	public static void main(String[] args){
		
		//makes scanner for human
		Scanner sc = new Scanner(System.in);
		
		//initialize players
		Player human = new User("human", sc);
		Player computer = new Computer("computer");
		
		//initialize board
		BattleshipBoard board = new BattleshipBoard(human, computer);
		
		//ask players to place their pieces
		board.setup();
		
		//main game loop
		while(true){
			
			//human turn
			System.out.println("Human turn: ");
			if(board.playTurn()){
				break;
			}
			
			//display board
			System.out.println(board.toString());
			
			//computer turn
			System.out.println("Computer's turn: ");
			if(board.playTurn()){
				break;
			}
			
			//displays board
			System.out.println(board.toString());

		}
		
		sc.close();
		
		//displays to user end of game
		System.out.println("~ ~ Exit Game ~ ~");
	}
}
