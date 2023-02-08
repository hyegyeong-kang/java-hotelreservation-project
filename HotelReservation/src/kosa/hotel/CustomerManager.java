package kosa.hotel;

import java.util.Scanner;

public class CustomerManager {
	
	Customer customer = new Customer();
	Scanner sc = new Scanner(System.in);
	
	public CustomerManager() {}

	public void joinCustomer() { // 회원가입 
		System.out.print("사용하실 아이디를 입력하세요 : ");
		String id = sc.nextLine();
		
		System.out.print("사용하실 비밀번호를 입력하세요 : ");
		String pw = sc.nextLine();
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("전화번를 입력하세요 : ");
		String phoneNo = sc.nextLine();
		
		System.out.print("이메일을 입력하세요 : ");
		String email = sc.nextLine();
		
		customer = new Customer(id, pw, name, phoneNo, email);
		
		System.out.println("회원가입이 완료되었습니다.");
	}
	
	public void updateCustomer() { // 회원 수정 
		
	}
	
	public void deleteCustomer() { // 회원 탈퇴 
		
	}
	
	public void login() { // 로그인 
		
	}
	
	public void logout() { // 로그아웃 
		
	}
	
}
