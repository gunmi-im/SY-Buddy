package com.gunmi.sybuddy.usercontroller;

import com.gunmi.sybuddy.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public void signUp(@RequestBody SignUpRequestDto requestDto) {
        userService.signUp(requestDto.getUsername(), requestDto.getPassword(), requestDto.getEmail(), requestDto.getKakaoId(), requestDto.getKakaoName());
    }

    // 로그인, 로그아웃, 회원정보 수정, 회원탈퇴 등의 기능에 대한 메소드 추가
}
