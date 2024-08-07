package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
	}
	
	//sem setBoard para que o tabuleiro não possa ser alterado
	
	//protected - somente class do mesmo pacote poderão acessar o tabuleiro de uma peça
	protected Board getBoard() {
		return board;
	}
	
	

}
