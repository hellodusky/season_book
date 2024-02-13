package com.management.product.model.dao;

import com.common.Condition;
import com.management.product.model.dto.BookDTO;
import com.management.product.model.dto.SeasonEventDTO;
import com.management.product.model.dto.UserDTO;

import java.util.List;
import java.util.Map;

public interface BookDAO {

    List<BookDTO> selectAllBookList();

    List<BookDTO> selectBookByCondition(Condition condition);

    List<SeasonEventDTO> seasonEventUserList();

    BookDTO eventBookByUsername(int seasonCode);

    UserDTO searchUserByUserName(String userName);

    int insertEventBook(Map<String, Integer> map);

    int insertUser(UserDTO userDTO);

    int updateUser(UserDTO userDTO);

    int deleteUser(Map<String, String> userCode);

    int insertBook(BookDTO bookDTO);

    int updateBook(BookDTO bookDTO);

    int deleteBook(Map<String, Integer> bookCode);

}
