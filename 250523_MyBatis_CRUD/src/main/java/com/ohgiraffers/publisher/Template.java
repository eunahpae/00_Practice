package com.ohgiraffers.publisher;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// MyBatis를 활용하여 DB와의 연결을 처리할 SqlSession 생성 메서드 정의
public class Template {

  // SqlSessionFactory : MyBatis에서 SQL 세션을 생성할 수 있게 해주는 객체
  private static SqlSessionFactory sqlSessionFactory;

  // SqlSession 객체를 생성해서 반환하는 메서드
  public static SqlSession getSqlSession() {

    // sqlSessionFactory가 아직 생성되지 않았다면, 설정 파일을 읽어 초기화
    if (sqlSessionFactory == null) {
      // MyBatis 설정 파일 경로
      String resource = "com/ohgiraffers/publisher/mybatis-config.xml";

      try {
        /* MyBatis 설정 파일(mybatis-config.xml)을 읽기 위한 입력 스트림(InputStream)을 생성
        (설정 파일에는 DB 연결 정보, 매퍼 위치, 기타 설정들이 정의되어 있음) */
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 설정 파일을 기반으로 SqlSessionFactory를 생성
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
    // 자동 커밋을 꺼둔 상태로 SqlSession을 생성하여 반환
    return sqlSessionFactory.openSession(false);
  }
}
