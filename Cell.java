
public class Cell {
	
	private boolean hasValue;
	private int row;
	private int column;
	private int value;
	private int square;
	
	public Cell() {
		hasValue = false;
		row = 0;
		column = 0;
		value = 0;
		square = 0;
	}
	
	public void setValue(int x) {
		
		this.value = x;
		
		if (value != 0) {
			hasValue = true;
		}
		else hasValue = false;
	}
	
	public void setRow(int r) {
		row = r;
	}
	
	public void setColumn(int c) {
		column = c;
	}
	
	public void setSquare(int s) {
		square = s;
	}
	
	public int getRow() {
		return row;
	}
	
	public int getColumn() {
		return column;
	}
	
	public int getSquare() {
		return square;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean getHasValue() {
		return hasValue;
	}
		
}
