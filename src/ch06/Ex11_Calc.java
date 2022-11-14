package ch06;

public class Ex11_Calc {

	public static void main(String[] args) {
		 Calc calc = new Calc(1.2, 3.4);
		 double res = calc.add();
		 System.err.println(res);
		 
		 System.out.println(new Calc(2.5, 4.6).add());
		 System.out.println(new Calc(2.5, 4.6).sub());
		 System.out.println(new Calc(2.5, 4.6).mul());
		 System.out.println(new Calc(2.5, 4.6).div());
	}

}

class Calc { 		//안쓰면 default 생략되어있음
	double x;					//field - this.x, this.y라고많이씀
	double y;
	
	 Calc(double x, double y){  		//생성자
		this.x = x;
		this.y = y;
	}
	double add() { 				 //method
		return this.x + this.y;
	}
	double sub() {
		return this.x - this.y;
	}
	double mul() {
		return this.x*this.y;
	}
	double div() {
		return this.x/ this.y;
	}
}