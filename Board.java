
public class Board {
	
	private Cell[] allCell = new Cell[81];

	public Board(int[] x) {
		
		for(int i = 0; i < 81; i++) {
			allCell[i] = new Cell();
			allCell[i].setValue(x[i]);
		}
		this.createRows();
		this.createColumns();
		this.createSquares();
	}

	public boolean isSolved() {
	
		int counter = 0;
		int num = 0;
		boolean foundVal = false;
		
		while (counter < 81) {
			
			if (allCell[counter].getHasValue() == false) {

				num = allCell[counter].getValue();
				
				while (num < 9) {
					
					num++;
					allCell[counter].setValue(num);
					
					if (columnIsValid(allCell[counter], counter) && rowIsValid(allCell[counter], counter) && squareIsValid(allCell[counter], counter)) {
					
						counter++;
						foundVal = true;
						break;
					}
				}
				
				
				if (foundVal == false) {
					allCell[counter].setValue(0);
					if (counter != 0) 
						counter--;
				}
			}
			
			else counter++;
			
		}
		
		return true;
		
	}
	
	public void createSquares() {
		
		allCell[0].setSquare(1);
		allCell[1].setSquare(1);
		allCell[2].setSquare(1);
		allCell[3].setSquare(2);
		allCell[4].setSquare(2);
		allCell[5].setSquare(2);
		allCell[6].setSquare(3);
		allCell[7].setSquare(3);
		allCell[8].setSquare(3);
		allCell[9].setSquare(1);
		allCell[10].setSquare(1);
		allCell[11].setSquare(1);
		allCell[12].setSquare(2);
		allCell[13].setSquare(2);
		allCell[14].setSquare(2);
		allCell[15].setSquare(3);
		allCell[16].setSquare(3);
		allCell[17].setSquare(3);
		allCell[18].setSquare(1);
		allCell[19].setSquare(1);
		allCell[20].setSquare(1);
		allCell[21].setSquare(2);
		allCell[22].setSquare(2);
		allCell[23].setSquare(2);
		allCell[24].setSquare(3);
		allCell[25].setSquare(3);
		allCell[26].setSquare(3);
		allCell[27].setSquare(4);
		allCell[28].setSquare(4);
		allCell[29].setSquare(4);
		allCell[30].setSquare(5);
		allCell[31].setSquare(5);
		allCell[32].setSquare(5);
		allCell[33].setSquare(6);
		allCell[34].setSquare(6);
		allCell[35].setSquare(6);
		allCell[36].setSquare(4);
		allCell[37].setSquare(4);
		allCell[38].setSquare(4);
		allCell[39].setSquare(5);
		allCell[40].setSquare(5);
		allCell[41].setSquare(5);
		allCell[42].setSquare(6);
		allCell[43].setSquare(6);
		allCell[44].setSquare(6);
		allCell[45].setSquare(4);
		allCell[46].setSquare(4);
		allCell[47].setSquare(4);
		allCell[48].setSquare(5);
		allCell[49].setSquare(5);
		allCell[50].setSquare(5);
		allCell[51].setSquare(6);
		allCell[52].setSquare(6);
		allCell[53].setSquare(6);
		allCell[54].setSquare(7);
		allCell[55].setSquare(7);
		allCell[56].setSquare(7);
		allCell[57].setSquare(8);
		allCell[58].setSquare(8);
		allCell[59].setSquare(8);
		allCell[60].setSquare(9);
		allCell[61].setSquare(9);
		allCell[62].setSquare(9);
		allCell[63].setSquare(7);
		allCell[64].setSquare(7);
		allCell[65].setSquare(7);
		allCell[66].setSquare(8);
		allCell[67].setSquare(8);
		allCell[68].setSquare(8);
		allCell[69].setSquare(9);
		allCell[70].setSquare(9);
		allCell[71].setSquare(9);
		allCell[72].setSquare(7);
		allCell[73].setSquare(7);
		allCell[74].setSquare(7);
		allCell[75].setSquare(8);
		allCell[76].setSquare(8);
		allCell[77].setSquare(8);
		allCell[78].setSquare(9);
		allCell[79].setSquare(9);
		allCell[80].setSquare(9);
		
	}

	public void createRows() {
		
		for (int x = 0; x < 9; x++) {
			allCell[x].setRow(1);
		}
		for (int x = 9; x < 18; x++) {
			allCell[x].setRow(2);
		}
		for (int x = 18; x < 27; x++) {
			allCell[x].setRow(3);
		}
		for (int x = 27; x < 36; x++) {
			allCell[x].setRow(4);
		}
		for (int x = 36; x < 45; x++) {
			allCell[x].setRow(5);
		}
		for (int x = 45; x < 54; x++) {
			allCell[x].setRow(6);
		}
		for (int x = 54; x < 63; x++) {
			allCell[x].setRow(7);
		}
		for (int x = 63; x < 72; x++) {
			allCell[x].setRow(8);
		}
		for (int x = 72; x < 81; x++) {
			allCell[x].setRow(9);
		}
	}
	
	public void createColumns() {
		
		for(int x = 0; x < 81; x += 9) {
			allCell[x].setColumn(1);
		}
		for(int x = 1; x < 81; x += 9) {
			allCell[x].setColumn(2);
		}
		for(int x = 2; x < 81; x += 9) {
			allCell[x].setColumn(3);
		}
		for(int x = 3; x < 81; x += 9) {
			allCell[x].setColumn(4);
		}
		for(int x = 4; x < 81; x += 9) {
			allCell[x].setColumn(5);
		}
		for(int x = 5; x < 81; x += 9) {
			allCell[x].setColumn(6);
		}
		for(int x = 6; x < 81; x += 9) {
			allCell[x].setColumn(7);
		}
		for(int x = 7; x < 81; x += 9) {
			allCell[x].setColumn(8);
		}
		for(int x = 8; x < 81; x += 9) {
			allCell[x].setColumn(9);
		}	
	}
	
	public boolean rowIsValid(Cell current, int place) {
		
		int x = 0;
		int y = 0;
		boolean valid = true;
		
		if (current.getRow() == 1)
		{
			x = 0;
			y = 8;
		}
		else if (current.getRow() == 2)
		{
			x = 9;
			y = 17;
		}
		else if (current.getRow() == 3)
		{
			x = 18;
			y = 26;
		}
		else if (current.getRow() == 4)
		{
			x = 27;
			y = 35;
		}
		else if (current.getRow() == 5)
		{
			x = 36;
			y = 44;
		}
		else if (current.getRow() == 6)
		{
			x = 45;
			y = 53;
		}
		else if (current.getRow() == 7)
		{
			x = 54;
			y = 62;
		}
		else if (current.getRow() == 8)
		{
			x = 63;
			y = 71;
		}
		else if (current.getRow() == 9)
		{
			x = 72;
			y = 80;
		}
		else
		{
			System.out.println("not a valid row");
		}
		
		
		while (x <= y)
		{
			if (x != place && allCell[x].getValue() == current.getValue())
			{
				valid = false;
			}
			x++;
		}

		return valid;
	}
	
	public boolean columnIsValid(Cell current, int place) {
		
		int x = 0; 
		int y = 0;
		boolean valid = true;
		
		if (current.getColumn() == 1)
		{
			x = 0;
			y = 72;
		}
		else if (current.getColumn() == 2)
		{
			x = 1;
			y = 73;
		}
		else if (current.getColumn() == 3)
		{
			x = 2;
			y = 74;
		}
		else if (current.getColumn() == 4)
		{
			x = 3;
			y = 75;
		}
		else if (current.getColumn() == 5)
		{
			x = 4;
			y = 76;
		}
		else if (current.getColumn() == 6)
		{
			x = 5;
			y = 77;
		}
		else if (current.getColumn() == 7)
		{
			x = 6;
			y = 78;
		}
		else if (current.getColumn() == 8)
		{
			x = 7;
			y = 79;
		}
		else if (current.getColumn() == 9)
		{
			x = 8;
			y = 80;
		}
		else
		{
			System.out.println("not a valid row");
		}
		
		while (x <= y)
		{
			if (x != place && allCell[x].getValue() == current.getValue())
			{
				valid = false;
			}
			x = x + 9;
		}
		
		return valid;
	}
	
	public boolean squareIsValid(Cell current, int place) {
		
		boolean valid = true;
		
		for (int x = 0; x < 81; x++)
		{
			if (current.getSquare() == allCell[x].getSquare() && place != x)
			{
				if (current.getValue() == allCell[x].getValue()) {
					valid = false;
				}
			}
		}
		
		return valid;
	}
	
	public String getSolution() {
		
		String solution = "";
	
		for(int i = 0; i < 81; i++) {
			solution += (allCell[i].getValue() + "  ");
			if ((i+1) % 9 == 0) {
				solution += "\n";
			}
		}
		return solution;
	}
	
}
