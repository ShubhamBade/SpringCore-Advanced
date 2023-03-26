package practice.coreSpring.streotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpEL {
	//parsing and executing  expression with help of @value annotations
	@Value("#{10+20}")
	private int sum;
	@Value("#{10*10}")
	private int mul;
	@Value("#{5>2? True: False}")
	private boolean result;
	//accessing static method of class
	@Value("#{T(java.lang.Math).sqrt(625)}")
	private int square;
	@Value("#{T(java.lang.Math).pow(2,10)}")
	private int power;
	
	//creating object using expression language
	@Value("#{new java.lang.String('favFunction String')}")
	private String favfunction;
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getMul() {
		return mul;
	}
	public void setMul(int mul) {
		this.mul = mul;
	}
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "SpEL [sum=" + sum + ", mul=" + mul + ", result=" + result + ", square=" + square
				+", Power=" + power +", favString=" + favfunction + "]";
	}
	public int getSquare() {
		return square;
	}
	public void setSquare(int square) {
		this.square = square;
	}
	

}
