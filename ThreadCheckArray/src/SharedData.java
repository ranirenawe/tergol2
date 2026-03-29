import java.util.ArrayList;

/**
 * @author ranirenawe
 * @author fadikazoura
 * This class represents shared data used between threads.
 * It contains an integer array, a boolean array, and flags
 * for synchronization between threads.
 */
public class SharedData 
{
    private ArrayList<Integer> array;
    private boolean [] winArray;
    private boolean flag;
    private final int b;
	
	/**
	 * Constructs a SharedData object.
	 * @param array the integer array
	 * @param b an integer value
	 */
    public SharedData(ArrayList<Integer> array1, int b) {
        this.array = array1;
        this.b = b;
    }

	/**
	 * Returns the win array.
	 * @return boolean array representing wins
	 */
    public boolean[] getWinArray() 
    {
        return winArray;
    }

	/**
	 * Sets the win array.
	 * @param winArray the boolean array to set
	 */
    public void setWinArray(boolean [] winArray) 
    {
        this.winArray = winArray;
    }

	/**
	 * Returns the integer array.
	 * @return the array
	 */
    public ArrayList<Integer> getArray() 
    {
        return array;
    }

	/**
	 * Returns the value of b.
	 * @return integer b
	 */
    public int getB() 
    {
        return b;
    }

	/**
	 * Returns the flag value.
	 * @return true if flag is set, otherwise false
	 */
    public boolean getFlag() 
    {
        return flag;
    }

	/**
	 * Sets the flag value.
	 * @param flag the value to set
	 */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }

}
