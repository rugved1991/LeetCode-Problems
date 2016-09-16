/*
Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.

The Sudoku board could be partially filled, where empty cells are filled with the character '.'.


A partially filled sudoku which is valid.

Note:
A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.
*/

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0;i<9;i++)
        {
            HashSet<Character> rows=new HashSet();
            HashSet<Character> cols=new HashSet();
            HashSet<Character> cube=new HashSet();
            
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.' && !rows.add(board[i][j]))
                {
                    return false;
                }
                if(board[j][i]!='.' && !cols.add(board[j][i]))
                {
                    return false;
                }
                
                int rowInd=3*(i/3);
                int colInd=3*(i%3);
                
                if(board[rowInd + j/3][colInd + j%3]!='.' && !cube.add(board[rowInd + j/3][colInd + j%3]))
                {
                    return false;
                }
            }
        }
        return true;
    }
}