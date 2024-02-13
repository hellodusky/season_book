package com.management.product.view;

import com.management.product.controller.BookController;
import com.management.product.model.dto.BookDTO;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeMenu {
    public void registBook() {

        Scanner sc = new Scanner(System.in);
        BookController bookController = new BookController();


        do {
            System.out.println("⊱ ━━━━.⋅ 계절책방 책 관리 ⋅.━━━━ ⊰");
            System.out.println("원하는 번호를 선택해 주세요.");
            System.out.println("===================================");
            System.out.println("1. 책 등록");
            System.out.println("2. 책 수정");
            System.out.println("3. 책 폐기");
            System.out.println("9. 책방 입구로 돌아가기");
            System.out.println("===================================");
            System.out.println("원하는 번호를 입력해 주세요 : ");
            int selectMenu = sc.nextInt();

            switch (selectMenu) {
                case 1 : bookController.registNewBook(inputNewBookInfo()); break;
                case 2 : bookController.modifyBookInfo(inputModifyBookInfo()); break;
                case 3 : bookController.deleteBook(inputBookCode()); break;
                case 9 : System.out.println("========책방 입구로 이동합니다========"); return;
                default : System.out.println("잘못된 번호입니다. 확인 후 다시 입력해 주세요."); break;
            }

        } while(true);

    }

    private BookDTO inputNewBookInfo() {

        Scanner sc = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("등록할 새로운 책 정보를 입력하세요. ");
        System.out.println("===================================");
        BookDTO bookDTO = new BookDTO();
        getBookInfo(bookDTO);
        System.out.println("===================================");

        return bookDTO;

    }

    private BookDTO inputModifyBookInfo() {

        Scanner sc = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("수정 대상 책 코드를 입력해 주세요 : ");
        System.out.println("===================================");
        int bookCode = sc.nextInt();

        BookDTO bookDTO = new BookDTO();
        bookDTO.setBookCode(bookCode);

        getBookInfo(bookDTO);

        System.out.println("===================================");

        return bookDTO;
    }

    private static BookDTO getBookInfo(BookDTO bookDTO) {

        Scanner sc = new Scanner(System.in);

        System.out.println("책 제목을 입력해 주세요 : ");
        String bookName = sc.nextLine();
        System.out.println("작가를 입력해 주세요 : ");
        String author = sc.nextLine();
        System.out.println("책 카테고리를 입력해 주세요 (고전, 인문학, 과학, 소설) : ");
        String bookCategory = sc.nextLine();
        System.out.println("책에 어울리는 계절을 숫자로 입력해 주세요 : ");
        int seasonCode = sc.nextInt();

        bookDTO.setBookName(bookName);
        bookDTO.setAuthor(author);
        bookDTO.setBookCategory(bookCategory);
        bookDTO.setSeasonCode(seasonCode);

        return bookDTO;

    }

    private static Map<String, Integer> inputBookCode() {

        Scanner sc = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("책 코드를 입력해 주세요 : ");
        System.out.println("===================================");
        int bookCode = sc.nextInt();

        Map<String, Integer> parameter = new HashMap<>();
        parameter.put("bookCode", bookCode);

        return parameter;
    }

}
