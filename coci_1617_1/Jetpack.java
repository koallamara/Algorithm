package coci_1617_1;

import java.util.*;

public class Jetpack {
		
	static int n;
	static char[][] maze;
	
	//get column with using jetpack
	static ArrayList<Integer> V = new ArrayList<>();
	
	public static boolean DFS(int i, int j) {
		
		//obstacles
		if(maze[i][j] == 'X') return false;
		//find exit
		if(j == n-1) return true;
		
		//mark to walk
		maze[i][j] = 'X';
		
		//going down
		if(DFS(Math.min(9, i+1), j+1)) return true;
		
		//going up
		if(DFS(Math.max(0, i-1), j+1)) {
			V.add(j);
			return true;
		}
		
		return false;
	}

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//get field
		n = in.nextInt();
		maze = new char[10][n];
		
		for(int i=0; i<10; i++)
			for (int j=0; j<n; j++)
				maze[i][j] = in.next().charAt(0);
		
		DFS(9,0);
		
		Collections.reverse(V);
		
		//결론 출력 필요 
		
	}

}
