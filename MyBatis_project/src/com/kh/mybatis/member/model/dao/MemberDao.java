package com.kh.mybatis.member.model.dao;

import com.kh.mybatis.member.model.vo.Member;

import org.apache.ibatis.session.SqlSession;

public class MemberDao {
	
	public Member loginMember(SqlSession sqlSession, Member m) {
		
		// 조회해 오는 메소드 selectOne : 조회해 올 데이터가 1개일 때 사용, 조회된 데이터가
		// insert 문을 실행할 때는 insert.
		return sqlSession.selectOne("memberMapper.loginMember" , m);
		
	}
	
	public int InsertMember(SqlSession sqlSession, Member m) {
		
		/*
		 * sqlSession.sql종류에 맞는 메소드("매퍼파일의 namespace.해당sql문 만의 고유한 id" , sql문을 완성시켜줄 객체)
		 */
		return sqlSession.insert("memberMapper.InsertMember" , m);
		
	}
	
}
