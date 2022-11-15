package ch18_io.object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ObjectStream {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("/temp/object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//객체생성
		Member m1 = new Member("fall", "단풍이");
		Product p1 = new Product("노트북", 1500000);
		int[] arr1 = {1,2,3};
		
		//객체직렬화 해서 파일저장
		oos.writeObject(m1);
		oos.writeObject(p1);
		oos.writeObject(arr1);
		
		oos.flush(); oos.close(); fos.close();
		
		FileInputStream fis = new FileInputStream("/temp/object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//파일을 읽고 역직렬화해서 객체로 복원
		Member m2 = (Member) ois.readObject();
		Product p2 = (Product) ois.readObject();
		int[] arr2 = (int[]) ois.readObject();
		
		ois.close(); fis.close();
		
		System.out.println(m2);
		System.out.println(p2);
		System.out.println(Arrays.toString(arr2));
	}

}
