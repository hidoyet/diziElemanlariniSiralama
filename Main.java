package diziElemanlariniSiralama;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Dizi ka� elemanl� olacak?");
		int selection=scanner.nextInt();
		int[] array=new int[selection];
		
		for(int i=0;i<array.length;i++) {
			System.out.print(i+1+"'inci eleman� giriniz: ");
			array[i]=scanner.nextInt();
			
		}
		
		scanner.close();
		System.out.print("S�ralama: ");
		Arrays.sort(array);
		for(int i=0;i<array.length;i++) {
					System.out.print(array[i]+" ");

		}
		
			
		
	}

}
