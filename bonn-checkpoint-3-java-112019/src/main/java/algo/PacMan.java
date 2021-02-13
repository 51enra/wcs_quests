package algo;

public class PacMan {

    /**
     *
     * @param grid, eg: {
     *     {'o', '.', '.'},
     *     {' ', 'x', ' '},
     *     {'.', '.', 'o'}
     * }
     * @param level, eg: 2
     * @return score, eg: 224
     */
	
    public static int play(char[][] grid, int level) {
    	
    	int score = 0;
    	
    	for (char[] row : grid) {
    		for (char element : row) {
    			switch (element) {
    			case ' ':
    				break;
    			case '.':
    				score = score + 1;
    				break;
    			case 'o':
    				score = score + 10;
    				break;
    			case 'x':
    				score = score + 100 * level;
    				break;
    			default:
    				System.out.println("Illegal Character!");
    			}
    		}
    	}

        return score;
    }   
    
}
