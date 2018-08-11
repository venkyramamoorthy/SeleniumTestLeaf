package week4.Homework;
import java.util.ArrayList;
import java.util.List;
public class LongestSequenceCode {
	public static void main(String[] args) {
	int number[] = {-1,2,-3,-4,5,6,7,8,9,-8,9,10};
	int value = number.length;
	List<Integer> listarraytemp = new ArrayList<Integer>();
	List<Integer> listarrayorg = new ArrayList<Integer>();;
	int currlength=0,maxlength=0;
	for(int i=0;i<value;i++)
	{
		if(number[i]>0)
		{
			currlength++;
			listarraytemp.add(number[i]);
		}
		else 
		{
			if(currlength>maxlength)
			{
				maxlength=currlength;
				 listarrayorg = new ArrayList<>(listarraytemp);
			}
			currlength=0;
			listarraytemp.clear();
		}
	}
	if(maxlength>0)
	{
		System.out.println("The max length is : "+maxlength);
		for(int i=0;i<listarrayorg.size();i++)
		{
			System.out.print(" "+listarrayorg.get(i));
		}
	}
	else
	{
		System.out.println("There is no max length");
	}
	}
}