import java.util.*;
public class MazeSolver {
	
	static int[][] maze = {
			{2, 0, 1, 1},
			{1, 1, 0, 1},
			{0, 0, 1, 0}
	};
	//0 = Wall
	//1 = Path
	//2 = Destination

	static LinkedList<Position> path = new LinkedList<Position>();
	public static void main(String[] args) {
		Position p = new Position(3, 0);		
		path.push(p);
		
		maze[path.peek().y][path.peek().x] = 0;
	}
	
}
