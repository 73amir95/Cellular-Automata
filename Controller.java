package cellular_automata;

public class Controller {
	
	private DataModel board = new DataModel(40, 40);
	
	public DataModel pattern1() {
		DataModel current = this.board;
		DataModel next = new DataModel(40, 40);
		current.set(20, 20, 1);
		current.set(20, 21, 1);
		current.set(21, 20, 1);
		current.set(21, 21, 1);
		
		int gen = 1;								//setting number of generations
		for (int z = 0; z < gen; z++) {
			for (int x = 1; x < next.getX() - 1; x++) {
				for (int y = 1; y < next.getY() - 1; y++) {
					int neighbors = 0;
					for (int i = -1; i <= 1; i++) {
						for (int j = -1; j <= 1; j++) {
							neighbors = neighbors + current.get(x + i, y + j);
						}
					}

					neighbors = neighbors - current.get(x, y);

					if ((current.get(x, y) == 0) && (neighbors == 3)) {
						next.set(x, y, 1);
					} else if ((current.get(x, y) == 1) && (neighbors == 2 || neighbors == 3)) {
						next.set(x, y, 1);
					} else if ((current.get(x, y) == 1) && (neighbors < 2 || neighbors > 3)) {
						next.set(x, y, 0);
					} else {
						next.set(x, y, current.get(x, y));
					}
				}
			}

			for (int a = 0; a < next.getX(); a++) {
				for (int b = 0; b < next.getY(); b++) {
					current.set(a, b, next.get(a, b));
				}
			}
		}
		return next;
	}
	
	public DataModel pattern2() {
		DataModel current = this.board;
		DataModel next = new DataModel(40, 40);
		current.set(17, 18, 1);
		current.set(17, 19, 1);
		current.set(17, 20, 1);
		current.set(17, 21, 1);
		current.set(18, 21, 1);
		current.set(19, 21, 1);
		current.set(20, 20, 1);
		current.set(18, 17, 1);
		current.set(20, 17, 1);
		
		int gen = 1;							//setting number of generations
		for (int z = 0; z < gen; z++) {
			for (int x = 1; x < next.getX() - 1; x++) {
				for (int y = 1; y < next.getY() - 1; y++) {
					int neighbors = 0;
					for (int i = -1; i <= 1; i++) {
						for (int j = -1; j <= 1; j++) {
							neighbors = neighbors + current.get(x + i, y + j);
						}
					}

					neighbors = neighbors - current.get(x, y);

					if ((current.get(x, y) == 0) && (neighbors == 3)) {
						next.set(x, y, 1);
					} else if ((current.get(x, y) == 1) && (neighbors == 2 || neighbors == 3)) {
						next.set(x, y, 1);
					} else if ((current.get(x, y) == 1) && (neighbors < 2 || neighbors > 3)) {
						next.set(x, y, 0);
					} else {
						next.set(x, y, current.get(x, y));
					}
				}
			}

			for (int a = 0; a < next.getX(); a++) {
				for (int b = 0; b < next.getY(); b++) {
					current.set(a, b, next.get(a, b));
				}
			}
		}
		return next;
	}
	
	public DataModel pattern3() {
		DataModel current = this.board;
		DataModel next = new DataModel(40, 40);
		current.set(15, 21, 1);
		current.set(16, 20, 1);
		current.set(17, 20, 1);
		current.set(17, 21, 1);
		current.set(17, 22, 1);
		current.set(21, 20, 1);
		current.set(21, 19, 1);
		current.set(22, 19, 1);
		current.set(22, 20, 1);
		
		int gen = 1;							//setting number of generations
		for (int z = 0; z < gen; z++) {
			for (int x = 1; x < next.getX() - 1; x++) {
				for (int y = 1; y < next.getY() - 1; y++) {
					int neighbors = 0;
					for (int i = -1; i <= 1; i++) {
						for (int j = -1; j <= 1; j++) {
							neighbors = neighbors + current.get(x + i, y + j);
						}
					}

					neighbors = neighbors - current.get(x, y);

					if ((current.get(x, y) == 0) && (neighbors == 3)) {
						next.set(x, y, 1);
					} else if ((current.get(x, y) == 1) && (neighbors == 2 || neighbors == 3)) {
						next.set(x, y, 1);
					} else if ((current.get(x, y) == 1) && (neighbors < 2 || neighbors > 3)) {
						next.set(x, y, 0);
					} else {
						next.set(x, y, current.get(x, y));
					}
				}
			}

			for (int a = 0; a < next.getX(); a++) {
				for (int b = 0; b < next.getY(); b++) {
					current.set(a, b, next.get(a, b));
				}
			}

		}
		return next;
	}
	
	public int get(int x, int y) {
		return this.board.get(x, y);
	}
	
	public int getX() {
		return this.board.getX();
	}
	
	public int getY() {
		return this.board.getY();
	}
	
}
