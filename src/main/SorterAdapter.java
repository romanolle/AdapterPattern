package main;

import java.util.ArrayList;
import java.util.List;

public class SorterAdapter implements ISorter {

	@Override
	public int[] sort(int[] array) {
		NumberSorter ns=new NumberSorter();
		List<Integer> l=new ArrayList<>();
		for(Integer i:array)
		{
			l.add(i);
		}
		l=ns.sort(l);
		for(int i=0;i<l.size();i++)
		{
			array[i]=l.get(i);
		}
		return array;
	}

}
