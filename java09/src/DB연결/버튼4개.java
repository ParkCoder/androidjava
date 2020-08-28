package DB연결;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//UI, View 역할
public class 버튼4개 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(500, 500);

		//FlowLayout flow = new FlowLayout();
		//f.setLayout(flow); // = f.setLayout(new FlowLayout());
		

		JButton b1 = new JButton();
		b1.setBounds(0, 0, 484, 57);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//입력한 값을 가지고 와서 DB처리 전담 클래스에게 DB에 저장하라고 데이터를 넘김. control 역할
			DB처리전담 db = new DB처리전담();
			db.create();
			}
		});
		b1.setText("Create");
		JButton b2 = new JButton();
		b2.setBounds(427, 59, 57, 344);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			DB처리전담 db = new DB처리전담();
			db.read();
			}
		});
		b2.setText("read");
		JButton b3 = new JButton();
		b3.setBounds(0, 59, 71, 344);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			DB처리전담 db = new DB처리전담();
			db.update();
			}
		});
		b3.setText("Update");
		JButton b4 = new JButton();
		b4.setBounds(0, 404, 484, 57);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			DB처리전담 db = new DB처리전담();
			db.delete();
			}
		});
		b4.setText("Delete");
		f.getContentPane().setLayout(null);

		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.getContentPane().add(b4);
		f.setVisible(true);

	}

}
