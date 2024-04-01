package com.gunmi.sybuddy.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String nickname;
	private String username;
	private String password;
	private String email;
	private String kakaoId; // 카카오 인증 정보
	private String kakaoName; // 카카오 인증 정보

	// 생성자, 게터, 세터 (생략)

	// 회원가입 메서드
	public void signUp(String username, String password, String email, String kakaoId, String kakaoName) {
		// 회원가입 로직 구현
		this.username = username;
		this.password = password;
		this.email = email;
		this.kakaoId = kakaoId;
		this.kakaoName = kakaoName;
		// 회원가입됨 이벤트 발생
		// eventPublisher.publish(new UserSignedUpEvent(this.id, this.username, this.email));
	}

	// 로그인 메서드
	public void logIn() {
		// 로그인 로직 구현
		// 로그인됨 이벤트 발생
		// eventPublisher.publish(new UserLoggedInEvent(this.id, this.username));
	}

	// 로그아웃 메서드
	public void logOut() {
		// 로그아웃 로직 구현
		// 로그아웃됨 이벤트 발생
		// eventPublisher.publish(new UserLoggedOutEvent(this.id, this.username));
	}

	// 회원정보 수정 메서드
	public void updateProfile(String name, String nickname) {
		// 회원정보 수정 로직 구현
		this.name = name;
		this.nickname = nickname;
		// 회원정보수정됨 이벤트 발생
		// eventPublisher.publish(new UserProfileUpdatedEvent(this.id, this.name, this.nickname));
	}

	// 회원탈퇴 메서드
	public void withdraw() {
		// 회원탈퇴 로직 구현
		// 회원탈퇴됨 이벤트 발생
		// eventPublisher.publish(new UserWithdrawnEvent(this.id, this.username));
	}
}
