package week3.day2.Assignments;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class ReverseMap {

	public static void main(String[] args) {

		Map<Integer, String> Employee = new TreeMap<Integer, String>(Collections.reverseOrder());
		Employee.put(1, "prakash");
		Employee.put(2, "preethi");
		Employee.put(3, "ram");
		Employee.put(4, "harishma");

		System.out.println(Employee.size());

		System.out.println(Employee);
	}

}
