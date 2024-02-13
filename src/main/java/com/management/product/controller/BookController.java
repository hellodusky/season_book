package com.management.product.controller;

import com.common.Condition;
import com.management.product.model.dto.BookDTO;
import com.management.product.model.dto.SeasonEventDTO;
import com.management.product.model.dto.UserDTO;
import com.management.product.model.service.BookService;
import com.management.product.view.BookPrint;

import java.awt.print.Book;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookController {

    private final BookService bookService;
    private final BookPrint bookPrint;

    public BookController() {
        bookService = new BookService();
        bookPrint = new BookPrint();
    }


    // 책 전체 조회
    public void selectAllBookList() {

        List<BookDTO> allBookList = bookService.selectAllBookList();

        if (allBookList != null && !allBookList.isEmpty()) {
            bookPrint.printAllBookList(allBookList);
        } else {
            bookPrint.printErrorMessage("selectAllBook");
        }

    }

    // 책 부분 조회
    public void selectBookByCondition(Condition condition) {

        List<BookDTO> bookList = bookService.selectBookByCondition(condition);

        if (bookList != null && !bookList.isEmpty()) {
            bookPrint.printBookList(bookList, condition);
        } else {
            bookPrint.printErrorMessage("selectBookList");
        }
    }

    // 이벤트 당첨자 조회
    public void bookEventList() {

    List<SeasonEventDTO> seasonEventList = bookService.seasonEventUserList();

        if (seasonEventList != null && !seasonEventList.isEmpty()) {
            bookPrint.printSeasonEventList(seasonEventList);
        } else {
            bookPrint.printErrorMessage("selectBookList");
        }

    }

    // 이벤트 대상 회원 조회
    public UserDTO searchUserByUsername(String userName) {

        UserDTO userDTO = bookService.searchUserByUserName(userName);

        return userDTO;
    }

    // 이벤트 책 조회
    public void eventBookByUsername(UserDTO userDTO) {

        BookDTO bookDTO = bookService.eventBookByUsername(userDTO.getUserSeasonCode());
        Map<String, Integer> map = new HashMap<>();

        if (bookDTO != null) {
            bookPrint.printEventBook(bookDTO);
            map.put("seasonCode", userDTO.getUserSeasonCode());
            map.put("bookCode", bookDTO.getBookCode());
            map.put("userCode", userDTO.getUserCode());
            bookService.insertEventBook(map);
        } else {
            bookPrint.printErrorMessage("selectBookList");
        }
    }

    // 책관리
    public void registNewBook(BookDTO bookDTO) {

        if (bookService.registNewBook(bookDTO)) {
            bookPrint.printSuccessMessage("registBook");
        } else {
            bookPrint.printErrorMessage("registBook");
        }
    }

    public void modifyBookInfo(BookDTO bookDTO) {

        if (bookService.modifyNewBook(bookDTO)) {
            bookPrint.printSuccessMessage("modifyBook");
        } else {
            bookPrint.printErrorMessage("modifyBook");
        }
    }

    public void deleteBook(Map<String, Integer> bookCode) {

        if (bookService.deleteNewBook(bookCode)) {
            bookPrint.printSuccessMessage("deleteBook");
        } else {
            bookPrint.printErrorMessage("deleteBook");
        }
    }


    // 회원가입
    public void registNewUser(UserDTO userDTO) {

        if (bookService.registNewUser(userDTO)) {
            bookPrint.printSuccessMessage("registUser");
        } else {
            bookPrint.printErrorMessage("registUser");
        }
    }

    public void modifyUserInfo(UserDTO userDTO) {

        if (bookService.modifyNewUser(userDTO)) {
            bookPrint.printSuccessMessage("modifyUser");
        } else {
            bookPrint.printErrorMessage("modifyUser");
        }
    }

    public void deleteUser(Map<String, String> userCode) {

        if (bookService.deleteNewUser(userCode)) {
            bookPrint.printSuccessMessage("deleteUser");
        } else {
            bookPrint.printErrorMessage("deleteUser");
        }
    }


}
