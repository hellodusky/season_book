package com.management.product.view;

import com.common.Condition;
import com.management.product.controller.BookController;
import com.management.product.model.dto.UserDTO;

import java.util.Scanner;

public class BookMenu {
    public void displayBook() {

        Scanner sc = new Scanner(System.in);
        BookController bookController = new BookController();

        do {
            System.out.println("⊱ ━━━━.⋅ 계절책방 구경하기 ⋅.━━━━ ⊰");
            System.out.println("원하는 번호를 선택해 주세요.");
            System.out.println("===================================");
            System.out.println("1. 책 전체 조회하기");
            System.out.println("2. 책 검색하기");
            System.out.println("3. 계절책방 이벤트 참여");
            System.out.println("4. 계절책방 당첨자 조회");
            System.out.println("9. 책방 입구로 돌아가기");
            System.out.println("===================================");
            System.out.println("원하는 번호를 입력해 주세요 : ");
            int selectMenu = sc.nextInt();

            switch (selectMenu) {
                case 1:
                    bookController.selectAllBookList();
                    break;
                case 2:
                    bookController.selectBookByCondition(inputCategoryCondition());
                    break;
                case 3:
                    bookEvent();
                    break;
                case 4:
                    bookController.bookEventList();
                case 9:
                    System.out.println("========책방 입구로 이동합니다========");
                    return;
                default:
                    System.out.println("잘못된 번호입니다. 확인 후 다시 입력해 주세요.");
                    break;
            }

        } while (true);

    }

    private static Condition inputCategoryCondition() {

        Scanner sc = new Scanner(System.in);
        String option = "";
        String value = "";

        System.out.println("⊱ ━━━━.⋅ 책 검색 조회 ⋅.━━━━ ⊰");
        System.out.println("검색하고 싶은 조건을 선택해 주세요.");
        System.out.println("===================================");
        System.out.println("1. 제목으로 검색");
        System.out.println("2. 작가명으로 검색");
        System.out.println("3. 장르로 검색");
        System.out.println("9. 이전으로");
        System.out.println("===================================");
        System.out.println("원하는 타입 번호를 입력해 주세요 : ");
        int selectMenu = sc.nextInt();

        switch (selectMenu) {
            case 1:
                sc.nextLine();
                option = "bookName";
                System.out.println("조회할 책 제목을 입력해 주세요.");
                value = sc.nextLine();
                break;
            case 2:
                sc.nextLine();
                option = "author";
                System.out.println("조회할 작가명을 입력해 주세요.");
                value = sc.nextLine();
                break;
            case 3:
                sc.nextLine();
                option = "bookCategory";
                System.out.println("조회할 장르를 입력해 주세요. (고전, 인문학, 과학, 소설) : ");
                value = sc.nextLine();
                break;
            case 9:
                System.out.println("======== 책방 입구로 이동합니다 ========");
                break;
            default:
                System.out.println("잘못된 번호입니다. 확인 후 다시 입력해 주세요.");
                break;
        }

        Condition condition = new Condition();
        condition.setOption(option);
        condition.setValue(value);

        return condition;
    }

    private static void bookEvent() {

        Scanner sc = new Scanner(System.in);
        BookController bookController = new BookController();

        System.out.println("⊱ ━━━━.⋅ 계절책방 이벤트 ⋅.━━━━ ⊰");
        System.out.println("회원등록을 완료한 분만 참여가 가능합니다.");
        System.out.println("=============================");
        System.out.println("1. 계속 진행하기");
        System.out.println("9. 이전으로");
        System.out.println("===================================");
        System.out.println("번호를 입력해 주세요 : ");
        int selectMenu = sc.nextInt();
        sc.nextLine();

        switch (selectMenu) {
            case 1:
                System.out.println("회원가입 시 등록한 이름을 입력해 주세요 : ");
                String userName = sc.nextLine();
                UserDTO userDTO = bookController.searchUserByUsername(userName);
                if (userDTO != null) {
                    bookController.eventBookByUsername(userDTO);
                } else {
                    System.out.println("회원이 아니시군요!");
                    break;
                }

            case 9:
                System.out.println("======== 책방 입구로 이동합니다 ========");
                break;
            default:
                System.out.println("잘못된 번호입니다. 확인 후 다시 입력해 주세요.");
                break;
        }
    }
}
