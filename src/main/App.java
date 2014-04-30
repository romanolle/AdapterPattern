package main;

public class App {

	public static void main(String[] args) {
		int[] numbers = new int[]{34, 2, 4, 12, 1};
		for(Integer i:numbers)
			System.out.println(i);
		ISorter s=new SorterAdapter();
		numbers=s.sort(numbers);
		System.out.println();

		for(Integer i:numbers)
			System.out.println(i);
	}

}
