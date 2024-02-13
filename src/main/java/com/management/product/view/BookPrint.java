package com.management.product.view;

import com.common.Condition;
import com.management.product.model.dto.BookDTO;
import com.management.product.model.dto.SeasonEventDTO;

import java.util.List;
import java.util.Map;

public class BookPrint {

    public void printEventBook(BookDTO bookDTO) {

        // 0. 이벤트 책 조회
        System.out.println("===== 계절책방 도서 증정 이벤트 =====");
        System.out.println(bookDTO.toString());
    }

    public void printAllBookList(List<BookDTO> allBookList) {

        // 1. 책 전체 조회
        System.out.println("📚  책 목록  📚");
        for (BookDTO book : allBookList) {
            System.out.println(book);
        }
    }

    public void printBookList(List<BookDTO> bookList, Condition condition) {

        // 2. 책 부분 조회
        System.out.println("📚  책 목록  📚");

        String option = "";
        switch (condition.getOption()) {
            case "bookName" : option = "책 제목 검색 결과"; break;
            case "author" : option = "작가 검색 결과"; break;
            case "bookCategory" : option = "장르 검색 결과"; break;
        }

        System.out.println("📚  " + option + " 목록  📚");
        for (BookDTO bookDTO : bookList) {
            System.out.println(bookDTO);
        }
    }

    public void printSeasonEventList(List<SeasonEventDTO> seasonEventList) {

        // 3. 이벤트 당첨자 조회
        System.out.println("🧦계절책방 이벤트 당첨자 목록🧦");
        for (SeasonEventDTO seasonEventDTO : seasonEventList) {
            System.out.println(seasonEventDTO);
        }
    }



    public void printSuccessMessage(String successCode) {
        String successMessage = "";

        switch (successCode) {
            case "registUser":
                successMessage = "계절책방 회원 등록이 완료되었습니다.";
                break;
            case "modifyUser":
                successMessage = "계절책방 회원 수정이 완료되었습니다.";
                break;
            case "deleteUser":
                successMessage = "계절책방 회원 탈퇴가 왼료되었습니다.";
                break;
            case "registBook":
                successMessage = "계절책방 책 등록이 완료되었습니다.";
                break;
            case "modifyBook":
                successMessage = "계절책방 책 수정이 완료되었습니다.";
                break;
            case "deleteBook":
                successMessage = "계절책방 책 삭제가 왼료되었습니다.";
                break;
        }

        System.out.println(successMessage);
        System.out.println("===================================");
    }


    public void printErrorMessage(String errorCode) {
        String errorMessage = "";

        switch (errorCode) {
            case "selectAllBook" :
                errorMessage = "책 조회에 실패했습니다.";
                break;
            case "selectBookList" :
                errorMessage = "검색에 실패했습니다.";
                break;
            case "registUser":
                errorMessage = "계절책방 회원 등록에 실패했습니다.";
                break;
            case "modifyUser":
                errorMessage = "계절책방 회원 수정에 실패했습니다.";
                break;
            case "deleteUser":
                errorMessage = "계절책방 회원 탈퇴에 실패했습니다.";
                break;
            case "registBook":
                errorMessage = "계절책방 책 등록에 실패했습니다.";
                break;
            case "modifyBook":
                errorMessage = "계절책방 책 수정에 실패했습니다.";
                break;
            case "deleteBook":
                errorMessage = "계절책방 책 삭제에 실패했습니다.";
                break;
        }

        System.out.println(errorMessage);
        System.out.println("===================================");
    }


}

