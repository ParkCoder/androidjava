package 컬렉션;

import java.util.LinkedList;

public class 큐Queue형태 {

	public static void main(String[] args) {
		//Queue-먼저 들어온 것이 먼저 나가는 자료 => LinkedList, PriorityQueue(우선순위큐)
		
		LinkedList milk = new LinkedList();
		milk.add("상한우유");
		milk.add("싱싱우유");
		milk.add("내일우유");
		
		for (int i = 0; i < milk.size(); i++) {
			System.out.println(milk.get(i));
		}
		System.out.println("----------------");
		milk.remove();
		for (int i = 0; i < milk.size(); i++) {
			System.out.println(milk.get(i));
		}
		
		System.out.println("----------------");
		milk.remove();
		for (int i = 0; i < milk.size(); i++) {
			System.out.println(milk.get(i));
		}
		
		System.out.println();
		System.out.println("------Queue 예제------");
		
		
		LinkedList sub = new LinkedList();
		
		sub.add("국어");
		sub.add("수학");
		sub.add("영어");
		sub.add("컴퓨터");
		
		sub.remove();
		System.out.print("1일차 남은과목: ");
		for (int i = 0; i < sub.size(); i++) {
			System.out.print(sub.get(i)+" ");
		}
		System.out.println();
		
		sub.remove();
		System.out.print("2일차 남은과목: ");
		for (int i = 0; i < sub.size(); i++) {
			System.out.print(sub.get(i)+" ");
		}
		System.out.println();
		
		sub.remove();
		System.out.print("3일차 남은과목: ");
		for (int i = 0; i < sub.size(); i++) {
			System.out.print(sub.get(i)+" ");
		}
		
		
	}

}
