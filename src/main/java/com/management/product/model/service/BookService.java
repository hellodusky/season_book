package com.management.product.model.service;

import com.common.Condition;
import com.management.product.model.dao.BookDAO;
import com.management.product.model.dto.BookDTO;
import com.management.product.model.dto.SeasonEventDTO;
import com.management.product.model.dto.UserDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.common.Template.getSqlSession;

public class BookService {

    private BookDAO bookDAO;

    public List<BookDTO> selectAllBookList() {

        SqlSession sqlSession = getSqlSession();

        bookDAO = sqlSession.getMapper(BookDAO.class);

        List<BookDTO> bookList = bookDAO.selectAllBookList();

        sqlSession.close();

        return bookList;

    }

    public List<BookDTO> selectBookByCondition(Condition condition) {

        SqlSession sqlSession = getSqlSession();

        bookDAO = sqlSession.getMapper(BookDAO.class);

        List<BookDTO> bookList = bookDAO.selectBookByCondition(condition);

        sqlSession.close();

        return bookList;

    }

    public List<SeasonEventDTO> seasonEventUserList() {

        SqlSession sqlSession = getSqlSession();

        bookDAO = sqlSession.getMapper(BookDAO.class);

        List<SeasonEventDTO> eventUserList = bookDAO.seasonEventUserList();

        sqlSession.close();

        return eventUserList;
    }

    public BookDTO eventBookByUsername(int seasonCode) {

        SqlSession sqlSession = getSqlSession();

        bookDAO = sqlSession.getMapper(BookDAO.class);

        BookDTO bookList = bookDAO.eventBookByUsername(seasonCode);

        sqlSession.close();

        return bookList;
    }

    public UserDTO searchUserByUserName(String userName) {

        SqlSession sqlSession = getSqlSession();

        bookDAO = sqlSession.getMapper(BookDAO.class);

        UserDTO userDTO = bookDAO.searchUserByUserName(userName);

        sqlSession.close();

        return userDTO;
    }

    public int insertEventBook(Map<String, Integer> map) {

        SqlSession sqlSession = getSqlSession();

        bookDAO = sqlSession.getMapper(BookDAO.class);

        int result = bookDAO.insertEventBook(map);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();
        return result;

    }


    // 회원 등록
    public boolean registNewUser(UserDTO userDTO) {

        SqlSession sqlSession = getSqlSession();
        bookDAO = sqlSession.getMapper(BookDAO.class);

        int result = bookDAO.insertUser(userDTO);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();
        return result > 0;

    }

    // 회원 수정
    public boolean modifyNewUser(UserDTO userDTO) {

        SqlSession sqlSession = getSqlSession();
        bookDAO = sqlSession.getMapper(BookDAO.class);

        int result = bookDAO.updateUser(userDTO);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();
        return result > 0;
    }

    // 회원 삭제
    public boolean deleteNewUser(Map<String, String> userCode) {

        SqlSession sqlSession = getSqlSession();
        bookDAO = sqlSession.getMapper(BookDAO.class);

        int result = bookDAO.deleteUser(userCode);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();
        return result > 0;

    }

    public boolean registNewBook(BookDTO bookDTO) {

        SqlSession sqlSession = getSqlSession();
        bookDAO = sqlSession.getMapper(BookDAO.class);

        int result = bookDAO.insertBook(bookDTO);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();
        return result > 0;
    }

    public boolean modifyNewBook(BookDTO bookDTO) {

        SqlSession sqlSession = getSqlSession();
        bookDAO = sqlSession.getMapper(BookDAO.class);

        int result = bookDAO.updateBook(bookDTO);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();
        return result > 0;
    }

    public boolean deleteNewBook(Map<String, Integer> bookCode) {

        SqlSession sqlSession = getSqlSession();
        bookDAO = sqlSession.getMapper(BookDAO.class);

        int result = bookDAO.deleteBook(bookCode);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();
        return result > 0;
    }

}
