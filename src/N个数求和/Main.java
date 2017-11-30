package N个数求和;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		for (int i = 0; i < count; i++) {
			String num = scanner.next();
			boolean symbol = false;
			if (num.startsWith("-")) {
				symbol = true;
				num = num.substring(1, num.length());
			}
			String[] arrays = num.split("/");
			int topNumber = Integer.parseInt(arrays[0]);
			int downNumber = Integer.parseInt(arrays[1]);
			int integer = 0;
			if (topNumber >= downNumber) {
				integer = topNumber/downNumber;
				topNumber -= (integer * downNumber); 
			}
			
			Main main = new Main();
			
			RationalNumber number = main.new RationalNumber(symbol, integer, main.new Fraction(topNumber, downNumber));
			
		}
		scanner.close();
		
		
		
		
	}

	/**
	 * 有理数
	 * @author rxxy
	 */
	class RationalNumber implements Comparable<RationalNumber>{
		
		public RationalNumber(boolean symbol, int integer, Fraction decimal) {
			super();
			this.symbol = symbol;
			this.integer = integer;
			this.decimal = decimal;
		}

		/**
		 * 符号，默认没有符号
		 */
		private boolean symbol = false;
		/**
		 * 整数部分
		 */
		private int integer;
		/**
		 * 分数部分
		 */
		private Fraction decimal;
		
		public RationalNumber add(RationalNumber rn){
			if ( this.isSymbol() & rn.isSymbol() ) {
				//同号加法
				int integer = this.getInteger() + rn.getInteger();
				Fraction decimal = this.getDecimal().add(rn.getDecimal());
				return new RationalNumber(this.isSymbol(), integer, decimal);
			}else{
				//异号加法
				if (this.isSymbol()) {
					int integer = this.getInteger() - rn.getInteger();
					Fraction decimal = this.getDecimal().minus(rn.getDecimal());
				}
				if (this.compareTo(rn) > 0) {
					
				}else{
					
				}
				
			}
			return rn;
		}
		
		
		public RationalNumber minus(RationalNumber rn){
			
			//todo xxx  
			return new RationalNumber(symbol, integer, decimal);
		}
		
		@Override
		public int compareTo(RationalNumber o) {
			if (this.getInteger() != o.getInteger()) {//整数就可以比较出来
				return this.getInteger() - o.getInteger();
			}else{//比较分数部分
				return this.getDecimal().compareTo(o.getDecimal());
			}
		}
		
		public boolean isSymbol() {
			return symbol;
		}

		public void setSymbol(boolean symbol) {
			this.symbol = symbol;
		}

		public int getInteger() {
			return integer;
		}

		public void setInteger(int integer) {
			this.integer = integer;
		}

		public Fraction getDecimal() {
			return decimal;
		}

		public void setDecimal(Fraction decimal) {
			this.decimal = decimal;
		}

	}
	//分数
	class Fraction implements Comparable<Fraction>{
		
		public Fraction(int topNum, int downNum) {
			super();
			this.topNum = topNum;
			this.downNum = downNum;
		}
		/**
		 * 分子
		 */
		private int topNum;
		/**
		 * 分母
		 */
		private int downNum;
		/**
		 * 无符号分数加法
		 * @param f
		 * @return
		 */
		public Fraction add(Fraction f){
			int topNum = this.getTopNum() * f.getDownNum() + f.getTopNum() * this.getDownNum();
			int downNum = this.getDownNum() * f.getDownNum();
			return simpleFraction(topNum, downNum);
			
		}
		/**
		 * 无符号分数减法
		 * @param f
		 * @return
		 */
		public Fraction minus(Fraction f){
			int topNum;
			int downNum;
			topNum = this.getTopNum() * f.getDownNum() - f.getTopNum() * this.getDownNum();
			downNum = this.getDownNum() * f.getDownNum();
			return simpleFraction(topNum, downNum);
		}
		
		private Fraction simpleFraction(Fraction f){
			return simpleFraction(f.getTopNum(), f.getDownNum());
		}
		/**
		 * 化简分数，化为最简
		 * @param topNum
		 * @param downNum
		 * @return
		 */
		private Fraction simpleFraction(int topNum, int downNum){
			for (int i = 2; i < Math.min(topNum, downNum); i++) {
				if (topNum%i==0 && downNum%i==0) {
					topNum /= i;
					downNum /= i;
					i = 1;
				}
			}
			return new Fraction(topNum, downNum);
		}
		@Override
		public int compareTo(Fraction o) {
			double a = (double)this.getTopNum()/this.getDownNum();
			double b = (double) o.getTopNum()/ o.getDownNum();
			double result = a - b;
			if (result > 0) {
				return 1;
			}else if(result < 0){
				return -1;
			}else{
				return 0;
			}
		}
		
		public int getTopNum() {
			return topNum;
		}
		public void setTopNum(int topNum) {
			this.topNum = topNum;
		}
		public int getDownNum() {
			return downNum;
		}
		public void setDownNum(int downNum) {
			this.downNum = downNum;
		}

	}
}
