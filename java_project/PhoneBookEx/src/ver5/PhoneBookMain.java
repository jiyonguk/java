package ver5;

import java.util.Scanner;

public class PhoneBookMain {

	
	//
	public static void main(String[] args) {
		PhoneBookManager manager = PhoneBookManager.getInstance();		//불필요한 변수 생성과정 분리
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			Menu.showMenu();
			
			int selectNum = sc.nextInt();
			
			sc.nextLine();
			
			switch(selectNum) {
			case MenuInterface.ADD:
				//PhoneInfor info = manager.createInstance();
				//manager.addInfo(info);
				manager.addInfo();
				break;
			case MenuInterface.SEARCH:
				manager.searchInfo();
				break;
			case MenuInterface.DELETE:
				manager.deleteInfo();
				break;
			case MenuInterface.ALL_DATA:
				manager.showAllData();
				break;
			case MenuInterface.EXIT:
				//return;
				System.out.println("프로그램이 종료되었습니다");
				System.exit(0);
				
				break;
			
			}
			
			
//			//사용자의 입력 데이터를 인스턴스 생성
//			info = manager.creatInstance();
//			//정보를 배열에 저장
//			manager.addInfo(info);
//			//전체 리스트 출력
//			manager.showAllData();
//			//이름으로 검색
//			manager.searchInfo();
//			//이름으로 검색후 삭제
//			manager.deleteInfo();
//			//삭제확인
//			manager.showAllData();
//			
//			System.out.println("----------------");
//			
//			//사용자의 입력 데이터를 인스턴스 생성
//			for(int i=0;i<manager.cnt;i++) {
//				
//				manager.pBooks[i].showData();
//				System.out.println("----------------");
//				
//			}
		}

	}

}
