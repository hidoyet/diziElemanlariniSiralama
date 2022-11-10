package diziElemanlariniSiralama;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Dizi kaç elemanlı olacak?");
		int selection=scanner.nextInt();
		int[] array=new int[selection];
		
		for(int i=0;i<array.length;i++) {
			System.out.print(i+1+"'inci elemanı giriniz: ");
			array[i]=scanner.nextInt();
			
		}
		
		scanner.close();
		System.out.print("Sıralama: ");
		Arrays.sort(array);
		for(int i=0;i<array.length;i++) {
					System.out.print(array[i]+" ");

		}
		
			
		
	}

}
