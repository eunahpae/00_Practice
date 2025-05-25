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

  public BookDTO selectBookByCode(int code) {
    SqlSession sqlSession = getSqlSession();
    BookDTO book = bookDAO.selectBookByCode(sqlSession, code);
    sqlSession.close();
    return book;
  }

  public boolean registBook(BookDTO book) {
    SqlSession sqlSession = getSqlSession();
    int result = bookDAO.registBook(sqlSession, book);
    if (result > 0) {
      sqlSession.commit();
    } else {
      sqlSession.rollback();
    }
    sqlSession.close();
    return result > 0 ? true : false;
  }

  public boolean modifyBook(BookDTO book) {
    SqlSession sqlSession = getSqlSession();
    int result = bookDAO.modifyBook(sqlSession, book);
    if (result > 0) {
      sqlSession.commit();
    } else {
      sqlSession.rollback();
    }
    sqlSession.close();
    return result > 0;
  }

  public int deleteBookByCode(int bookCode) {
    SqlSession sqlSession = getSqlSession();
    int result = bookDAO.deleteBookByCode(sqlSession, bookCode);
    if (result > 0) {
      sqlSession.commit();
    } else {
      sqlSession.rollback();
    }
    sqlSession.close();
    return result;
  }

}
