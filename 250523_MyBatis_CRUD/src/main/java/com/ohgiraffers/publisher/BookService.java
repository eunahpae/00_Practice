package com.ohgiraffers.publisher;

import static com.ohgiraffers.publisher.Template.getSqlSession;

import java.util.List;
import org.apache.ibatis.session.SqlSession;

// 비즈니스 로직 수행 및 DAO 호출
public class BookService {

  private final BookDAO bookDAO;

  public BookService() {
    bookDAO = new BookDAO();
  }

  public List<BookDTO> selectAllBooks() {
    // DB 연결을 위한 SqlSession 생성
    SqlSession sqlSession = getSqlSession();
    // DAO를 통해 실제 쿼리 실행
    List<BookDTO> bookList = bookDAO.selectAllBooks(sqlSession);
    sqlSession.close();
    return bookList;

  }
}
