package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chesMatch = new ChessMatch();
		Interface.printBoard(chesMatch.getPieces());
		
		
	}

}
