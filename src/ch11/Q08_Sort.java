package ch11;

import java.util.Arrays;
/*
 * Bubble sort + select sort
 */
public class Q08_Sort {

	public static void main(String[] args) {
		int[]a = {32, 38, 79, 75, 47, 56};
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length - 1; i++) {
			for (int k =i+1; k< a.length; k++) {
				if (a[i]> a[k]) { 		//오름차순
					int tmp = a[i];
					a[i]= a[k];
					a[k] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
