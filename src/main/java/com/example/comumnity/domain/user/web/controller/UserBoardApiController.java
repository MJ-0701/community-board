package com.example.comumnity.domain.user.web.controller;


import com.example.comumnity.domain.board.service.BoardService;
import com.example.comumnity.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api/v1/user/board")
@RestController
public class UserBoardApiController {

    private final UserService userService;
    private final BoardService boardService;
}
