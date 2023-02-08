package kosa.hotel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CustomerManager {
	
	List<Customer> customers = new ArrayList<Customer>();
	Scanner sc = new Scanner(System.in);
	
	public CustomerManager() {}

	public void joinCustomer() { // 회원가입 
		System.out.print("=> 사용하실 아이디를 입력하세요 : ");
		String id = sc.nextLine();
		
		System.out.print("=> 사용하실 비밀번호를 입력하세요 : ");
		String pw = sc.nextLine();
		
		System.out.print("=> 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("=> 전화번를 입력하세요 : ");
		String phoneNo = sc.nextLine();
		
		System.out.print("=> 이메일을 입력하세요 : ");
		String email = sc.nextLine();
		
		customers.add(new Customer(id, pw, name, phoneNo, email));
		
		System.out.println("회원가입이 완료되었습니다.");
	}
	
	public void updateCustomer() { // 회원 수정 
		
	}
	
	public void deleteCustomer() { // 회원 탈퇴 
		
		// 로그인 되어있는지 체크 하는 로직 필요.
		// 로그인 되어있다면 로그인 된 고객 탈퇴 진행?
		System.out.println("정말 탈퇴하시겠습니까?");
		System.out.println("1.예   2.아니오");
		System.out.print("=> 입력(번호) : ");
		
		String menu = sc.nextLine();
		
		switch(menu) {
		case "1" :
			
			break;
			
		case "2" :
			
			break;
			
		default :
			System.out.println("메뉴를 잘못 입력하셨습니다.");
			break;
		}
		
	}
	
	public void login() { // 로그인 
		
		Iterator<Customer> iter = customers.iterator();
		
		while(iter.hasNext()) {
			Customer cs = iter.next();
			int idx = -1;
			
			while(true) {
				System.out.print("=> 아이디를 입력하세요. : ");
				String id = sc.nextLine();
				
				System.out.print("=> 비밀번호를 입력하세요. : ");
				String pw = sc.nextLine();
				
				if (cs.getCusId().equals(id) && cs.getCusPw().equals(pw)) {
					System.out.println("\"" + cs.getCusId() + "\"님 로그인하였습니다.");
					break;
					
				} else if (cs.getCusId().equals(id) && !cs.getCusPw().equals(pw)) {
					System.out.println("비밀번호가 다릅니다.\n");
					
				} else if (!cs.getCusId().equals(id) && cs.getCusPw().equals(pw)) {
					System.out.println("아이디가 다릅니다.\n");
					
				} else {
					System.out.println("로그인 정보를 확인하여주세요.\n");
				}				
			}
		}
	}
	
	public void logout() { // 로그아웃 
		
	}
	
}
