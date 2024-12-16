package hw14_1;

//***************************
//파일명: Client.java
//작성자: 정준영
//작성일: 2024-12-03
//내용: Composite Pattern 적용 테스트
//***************************

public class Client {
	public static void main(String[] args) {
		Directory dir1 = new Directory("root") ;
		Directory dir2 = new Directory("Dir1") ;
		
		File f1 = new File("f1", 100) ;
		File f2 = new File("f2", 200) ;
		File f3 = new File("f3", 300) ;
		File f4 = new File("f4", 400) ;
		
		dir1.addEntry(f1) ;
		dir1.addEntry(dir2) ;
		dir2.addEntry(f2) ;
		dir2.addEntry(f3) ;
		dir1.addEntry(f4) ;

		dir1.print() ;
	}
}



