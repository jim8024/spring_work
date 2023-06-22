package com.gura.spring02.member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gura.spring02.member.dto.MemberDto;

//component scan 시 bean이 되기 위해
@Repository
public class MemberDaoImpl implements MemberDao{
	//Mybatis를 사용하기 위한 핵심 의존 객체 주입 받기
	//sql session template 객체가 주입됨
	//같은 bean이어야 하는데 이때 component scan(찾아다니면서 확인)이 일어나야 한다
	@Autowired
	private SqlSession session;

	@Override
	public void insert(MemberDto dto) {
		
		session.insert("member.insert", dto);
		
	}

	@Override
	public void update(MemberDto dto) {
		session.update("member.update",dto);
		
	}

	@Override
	public void delete(int num) {
		session.delete("member.delete",num);
		
	}

	@Override
	public MemberDto getData(int num) {
		//session.selectOne("member.getData",num);
		return session.selectOne("member.getData",num);
	}

	@Override
	public List<MemberDto> getList() {
		//회원 목록을 얻어와서 
		List<MemberDto> list=session.selectList("member.getList");
		//리턴해주기
		return list;
	}

}
