package runnables;

public class StringSort {
public static void main(String[] args) {
	
	String[] names= {"Manoj", "Abdul", "Rohit", "Pratik", "Jaya"};
	for(int i=0;i<names.length-1;i++) {
		for(int j=i+1;j<names.length;j++) {
			if(names[i].compareTo(names[j])>0) {
				String temp = names[i];
				names[i] = names[j];
				names[j]=temp;
			}
			
		}
	}
	
	for(String name:names) {
		System.out.println(name);
	}
}
}
