package 클래스만들기;

public class Bbs {
	
	@Override
	public String toString() {
		return id + " ," + title + " ," + content + " ," + writer ;
	}
	public int id;
	public String title;
	public String content;
	public String writer;
	
	public void 글을쓰다() {
		System.out.println("글쓰기완료");
	}
	public void 글을삭제하다() {
		System.out.println("삭제완료");
	}
	public void 글을읽다() {
		System.out.println("읽기완료");
	}
	public void 글을수정하다() {
		System.out.println("수정완료");
	}
	
}
