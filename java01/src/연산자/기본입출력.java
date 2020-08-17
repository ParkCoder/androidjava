package 연산자;
import javax.swing.JOptionPane;

public class 기본입출력 {

	public static void main(String[] args) {
		/*창을 띄워서 입력을 받아보자
		   창을 띄워서 출력을 해보자
		   자주 사용하는 것은 부품의 대문자를 그대로 쓴다!
		   특정한 일을 전담하는 부품을 만들어, 특정한 처리를 할때 부품을 지정함.*/
		
		String name = JOptionPane.showInputDialog("당신의 이름은");
		//변수name = 입력받은 값을 저장 중
		
		
		System.out.println("당신의 이름은 "+name);
		//저장되어있던 name 값을 출력
		
		
		String age = JOptionPane.showInputDialog("당신의 나이는 ");
		//age에 입력 받은 값을 저장 중 
		
		/*키보드를 입력한 데이터 타입은 무조건 String
		  String 으로 저장되니 데이터를 int/String 쓸지는 내가 결정!
		   계산의 유무에 따라.. 계산하는 경우 int로 변환 해주어야함*/
		
		
		//숫자로 바꿔보자!!!!
		int age2 = Integer.parseInt(age);
		//저장 중인 age값을 정수로 변환
		int lastAge = age2 - 1;
		//정수로 변환된 age2에서 1을 뺀값은 lastAge로 저장
		
		System.out.println("당신의 작년 나이는 " + lastAge);
		//저장 중인 lastAge를 출력
		
		
		}

}




