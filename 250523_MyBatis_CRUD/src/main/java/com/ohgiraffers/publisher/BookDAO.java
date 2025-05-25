package com.ohgiraffers.publisher;

import java.util.List;
import org.apache.ibatis.session.SqlSession;


public class BookDAO {

  public List<BookDTO> selectAllBooks(SqlSession sqlSession) {
    // Mapper를 호출하여 실제 SQL 실행
    return sqlSession.selectList("BookMapper.selectAllBooks");
  }
}
