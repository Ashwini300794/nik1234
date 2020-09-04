package com.cjc.collectionbasicusingiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List list=new ArrayList();
list.add(5);
list.add(10);
list.add(15);
list.add(20);

Iterator itr = list.iterator();
while(itr.hasNext())
	{
	int x=(int)itr.next();
	System.out.println(x);
}
	}

}
