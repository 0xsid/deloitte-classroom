package runnables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionDemo2 {

	
	public static void main(String[] args){

		List<Integer> list = Arrays.asList(5,6,7,8,9,2,3,4,5);
        int sum = list.stream().filter((i)->i%2!=0).map((i)->i*i).reduce(0,(s,c)->s+c);
       Collections.sort(list);
        list.forEach(System.out::println);
        System.out.println("sum: " + sum);
        
        
        List<String> items = Arrays.asList("Abhi", "abhishek", "Upamanyu", "Rishabh");
        items.stream().filter(s->s.length()>4).map(s->s.toUpperCase()).forEach(s->System.out.println(s)); 

	System.out.println();
	System.out.println("Using anonymous class implementation");
		/*Anonymous Inner Class Implementation*/
		items.
			stream().
				filter(new Predicate<String>() {
					@Override
					public boolean test(String t) {
						return t.length()>4;
					}
					
				}).
					map(new Function<String, String>() {
						@Override
						public String apply(String t) {
							return t.toUpperCase();
						}
						
					}).
						forEach(new Consumer<String>() {
							@Override
							public void accept(String t) {
								System.out.println(t);
							}
						});
		
		
		List<Integer> years = Arrays.asList(2020,2019,2018,2017,2016,2015,2014,2013,2012);
		years.stream().filter(s->((s%4==0)&&(s%100!=0))||(s%400==0)).map(s->s).forEach(s->System.out.println(s));
	
		System.out.println();
	
	Map<String, String> trainees = new HashMap<>();
	trainees.put("Hashir","Jamshedpur");
	trainees.put("Siddharth Sahoo", "Cuttack");
	trainees.put("Siddharth Badyal", "Jammu");
	
	for(String key:trainees.keySet()) {
		System.out.println("Name: "+ key+" Location: "+trainees.get(key));
	}
	System.out.println();
	trainees.forEach((k,v)->System.out.println("Name: "+k+" Location: "+v));
	
	Map<Character,Integer> charOcc = new HashMap<>();
	
	String str = "Rohit Shetty";
	System.out.println(str);
	for(char c:str.toCharArray()) {
	if(charOcc.containsKey(c)) {
		int oc = charOcc.get(c)+1;
		charOcc.put(c,oc);
	}	
	else 
		charOcc.put(c,1);
	}
	charOcc.forEach((c,oc)->System.out.println("char: "+c+" occurence:  "+oc));
	
	
	Map<String,String> emailMap = new HashMap<>();
	//List<String> domains = Arrays.asList("deloitte","hotmail","aol","gmail","others");
	
	
	Scanner sc = new Scanner(System.in);
	boolean keepLooping=true;
	while(keepLooping) {
	System.out.println("Enter Email or type \'Quit\' to stop: ");
	String emailString = sc.nextLine();
	if(emailString.toUpperCase().equals("QUIT")) {
		keepLooping=false;
		break;
	}
	else
	{
	  String domain =emailString.substring(emailString.lastIndexOf("@")+1, emailString.lastIndexOf("."));
	  emailMap.put(emailString,domain);
	}
	}
	HashSet<String> domains = new HashSet<>();
	//emailMap.forEach((dom,em)->System.out.println(dom+"\t"+em));
	emailMap.values().forEach(val->domains.add(val));
	
	
	//int refCount=0;
	for(String head:domains) {
		System.out.print(head+"\t\t");
		for(String key:emailMap.keySet()) {
		if(emailMap.get(key).equals(head)) {
			System.out.print(key+"\t");
			//refCount++;
		}
		}
		System.out.println();
	}
	
	
	}
}
