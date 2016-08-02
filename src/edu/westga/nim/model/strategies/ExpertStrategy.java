package edu.westga.nim.model.strategies;
/**
 * this class will remove 3, 2, or 1 stick dependending on whether it's a multiple of 4
 * When divided by 4, if the remainder is 0, 3 sticks are removed, if there is a remainder of 3, 
 * 2 sticks are removed..and if it's a remainder of 2 or 1 1 stick is reduced.
 * @author Sudarsan Chandrasekhar
 * @version 7/12/2014
 */
public class ExpertStrategy implements NumberOfSticksStrategy {
	/**
	 * returns number of sticks present
	 * @param pileSize size of pile
	 * @return number of sticks
	 */
	@Override
	public int howManySticks(int pileSize) {
		// TODO Auto-generated method stub
		
		if (pileSize % 4 == 0) {
			return 3;
		}
		
		if (pileSize % 4 == 3) {
			return 2;
		}
		
		if (pileSize % 4 == 2) {
			return 1;
		}
		
		if (pileSize % 4 == 1) {
			return 1;
		}
		return 1;
	}

}
