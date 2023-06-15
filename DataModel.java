package cellular_automata;

public class DataModel {
	
	private int[][] board;
	
	public DataModel(int x, int y) {
		this.board = new int[x][y];
	}
	
	public int getX() {
		return this.board.length;
	}
	
	public int getY() {
		return this.board[0].length;
	}
	
	public void set(int x, int y, int value) {
		this.board[x][y] = value;
	}
	
	public int get(int x, int y) {
		return this.board[x][y];
	}

}
