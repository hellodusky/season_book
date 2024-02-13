package com.management.product.view;

import com.management.product.controller.BookController;
import com.management.product.model.dto.BookDTO;
import com.management.product.model.dto.UserDTO;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserMenu {

    public static void registUser() {

        Scanner sc = new Scanner(System.in);
        BookController bookController = new BookController();


        do {
            System.out.println("⊱ ━━━━.⋅ 계절책방 회원등록 ⋅.━━━━ ⊰");
            System.out.println("원하는 번호를 선택해 주세요.");
            System.out.println("===================================");
            System.out.println("1. 회원가입");
            System.out.println("2. 회원수정");
            System.out.println("3. 회원탈퇴");
            System.out.println("9. 책방 입구로 돌아가기");
            System.out.println("===================================");
            System.out.println("원하는 번호를 입력해 주세요 : ");
            int selectMenu = sc.nextInt();

            switch (selectMenu) {
                case 1:
                    bookController.registNewUser(inputNewUserInfo());
                    break;
                case 2:
                    bookController.modifyUserInfo(inputModifyUserInfo());
                    break;
                case 3:
                    bookController.deleteUser(inputUserCode());
                    break;
                case 9:
                    System.out.println("========책방 입구로 이동합니다========");
                    return;
                default:
                    System.out.println("잘못된 번호입니다. 확인 후 다시 입력해 주세요.");
                    break;
            }

        } while (true);

    }

    private static UserDTO inputNewUserInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("회원 등록을 진행합니다.");
        System.out.println("===================================");
        UserDTO userDTO = new UserDTO();
        getUserInfo(userDTO);
        System.out.println("===================================");

        return userDTO;
    }

    private static UserDTO inputModifyUserInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("수정할 회원 코드를 입력해 주세요 : ");
        System.out.println("===================================");
        int userCode = sc.nextInt();

        UserDTO userDTO = new UserDTO();
        userDTO.setUserCode(userCode);

        getUserInfo(userDTO);

        System.out.println("===================================");

        return userDTO;
    }

    private static UserDTO getUserInfo(UserDTO userDTO) {

        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력해 주세요 : ");
        String userName = sc.nextLine();
        System.out.println("생년월일을 입력해 주세요 (ex.980120) : ");
        String userAge = sc.nextLine();
        System.out.println("전화번호를 입력해 주세요 : ");
        String userPhone = sc.nextLine();
        System.out.println("본인과 어울리는 계절을 숫자로 입력해 주세요 (봄:1, 여름:2, 가을:3, 겨울:4) : ");
        int userSeasonCode = sc.nextInt();

        userDTO.setUserName(userName);
        userDTO.setUserAge(userAge);
        userDTO.setUserPhone(userPhone);
        userDTO.setUserSeasonCode(userSeasonCode);

        return userDTO;
    }

    private static Map<String, String> inputUserCode() {

        Scanner sc = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("회원 코드를 입력해 주세요 : ");
        System.out.println("===================================");
        String userCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("userCode", userCode);

        return parameter;

    }
}
