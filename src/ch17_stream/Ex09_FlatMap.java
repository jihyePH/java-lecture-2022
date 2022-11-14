package ch17_stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex09_FlatMap {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A quick brown fox");
		list.add("jumps over the lazy dog");
		list.forEach(str -> System.out.println(str));
		System.out.println();
		
		//문장Stream -> 단어 Stream 변환
		list.stream()
			.flatMap(str -> Arrays.stream(str.split(" ")))
			.forEach(word-> System.out.println(word));
		System.out.println();
		
		//문자열 숫자목록 Stream -> 숫자 Stream
		List<String> l = Arrays.asList("10, 20, 30", "40, 50");
		l.stream()
			.flatMapToInt(str -> {
				String[] strArr = str.split(", ");
				int[] intArr = new int[strArr.length];
				for (int i = 0; i< strArr.length; i++)
					intArr[i] = Integer.parseInt(strArr[i].trim());
				return Arrays.stream(intArr);
			})
			.forEach(number -> System.out.println(number));
	}

}
