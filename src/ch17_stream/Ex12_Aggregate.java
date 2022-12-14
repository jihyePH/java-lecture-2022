package ch17_stream;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Ex12_Aggregate {

	public static void main(String[] args) {
		int[] intArr = {1,2,5,7,8,10,11,6,4,24};
		
		//짝수의 개수
		long count = Arrays.stream(intArr)
					.filter(n -> n % 2 ==0)
					.count();
		System.out.println("짝수 개수: "+ count);
					
		//합계
		int sum = Arrays.stream(intArr)
				.filter(n -> n % 2 ==0)
				.sum();
		System.out.println("짝수들 합: " + sum);
		
		//짝수의 평균
		double avg = Arrays.stream(intArr)
				.filter(n -> n % 2 ==0)
				.average()
				.getAsDouble();
		System.out.println("짝수들 평균: " + avg);
		
		//짝수의 최대값
		int max = Arrays.stream(intArr)
				.filter(n -> n % 2 ==0)
				.max() 			//OptionalXXX type
				.getAsInt();
		System.out.println("짝수 max값: " + max);
		
		//Optional
		//5의 배수 평균
//		double avg = Arrays.stream(intArr)
//				.filter(n -> n % 5 ==0)
//				.average()
//				.getAsDouble();
		
		//해결방법1
		OptionalDouble optional = Arrays.stream(intArr)
				.filter(n -> n % 5 ==0)
				.average();
		if (optional.isPresent())
			System.out.println("방법1 평균: "+ optional.getAsDouble());
		else
			System.out.println("방법1 평균: 0.0");
		
		//해결방법2
		double average = Arrays.stream(intArr)
				.filter(n -> n % 5 ==0)
				.average()
				.orElse(0.0);
		System.out.println("방법2 평균: "+ average);
		
		//해결방법3
		Arrays.stream(intArr)
		.filter(n -> n % 5 ==0)
		.average()
		.ifPresent(d ->System.out.println("방법3 평균: "+ average));
			
	}

}
