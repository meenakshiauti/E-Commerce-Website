package com.UtilsLayer;

import java.util.ArrayList;
import java.util.Set;

import com.BaseLayer.BaseClass;

public class HandleWindow extends BaseClass {

	public String handleTwoWindowsByUsingSet(String parent, Set<String> allWindow)

	{
		
		for(String a:allWindow)
		{
			if(!(a.equals(parent)))
			{
				driver.switchTo().window(a);
				return driver.getWindowHandle();
			}
		}
		return null;
	}
	
	
	public String handleThreeWindowsBySet(String parent, String child1, Set<String> allWindow)
	{
		for(String abc:allWindow)
		{
			if(!(abc.contains(child1))&&(!(abc.contains(parent))))
			{
				driver.switchTo().window(abc);
				return driver.getWindowHandle();
			}
		}
		
		return null;
		
	}
	
	public void handleWindowByArrayList(String Parent,Set<String> allWindow,int index)
	{
		ArrayList<String> arr=new ArrayList<String>(allWindow);
		
		driver.switchTo().window(arr.get(index));
	}

}
