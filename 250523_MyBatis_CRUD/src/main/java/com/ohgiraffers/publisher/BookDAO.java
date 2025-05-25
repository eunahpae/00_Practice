package com.ohgiraffers.publisher;

import java.util.List;
import org.apache.ibatis.session.SqlSession;

public class BookDAO {

  public List<BookDTO> selectAllBooks(SqlSession sqlSession) {
    // Mapper를 호출하여 실제 SQL 실행
    return sqlSession.selectList("BookMapper.selectAllBooks");
  }

  public BookDTO selectBookByCode(SqlSession sqlSession, int code) {
    return sqlSession.selectOne("BookMapper.selectBookByCode", code);
  }

  public int registBook(SqlSession sqlSession, BookDTO book) {
    return sqlSession.insert("BookMapper.registBook", book);
  }

  public int modifyBook(SqlSession sqlSession, BookDTO book) {
    return sqlSession.update("BookMapper.modifyBook", book);
  }

  public int deleteBookByCode(SqlSession sqlSession, int bookCode) {
    return sqlSession.delete("BookMapper.deleteBookByCode", bookCode);
  }

}
