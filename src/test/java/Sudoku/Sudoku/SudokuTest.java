package Sudoku.Sudoku;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class SudokuTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SudokuTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( SudokuTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testcheckConstraint()
    {
        Sudoku sudoku = new Sudoku();
        int[][] board = {
                {9, 0, 0, 0, 0, 0, 5, 1, 3}};
        int row = 0;
        int column = 0;
        boolean[] constraint = {false, false, false, false, false, false, false, false, true};
        
        boolean result = sudoku.checkConstraint(board, row, constraint, column);
        
        assertEquals(result, false);
    }
}
