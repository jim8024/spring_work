package com.gura.spring02.guest.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gura.spring02.guest.dto.GuestDto;
//의존 관계 느슨하게 하기 위해서 

//component scan
@Repository
public class GuestDaoImpl implements GuestDao{
	
	@Autowired
	private SqlSession session;
	@Override
	public void insert(GuestDto dto) {
		/*
		 * Mapper's namespace=guest
		 * sql's id=insert
		 * parameter type=GuestDto
		 */
		session.insert("guest.insert", dto);
	}

	@Override
	public void update(GuestDto dto) {
		session.update("member.update",dto);
		
	}

	@Override
	public void delete(GuestDto dto) {
		session.delete("guest.delete",dto);
		
	}

	@Override
	public GuestDto getData(int num) {
		/*
		 * Mapper의 name space는 guest
		 * sql의 id 는 getdata
		 * parameterType은 int
		 * resultType은 GuestDto
		 */
		return session.selectOne("guest.getData",num);
	}

	@Override
	public List<GuestDto> getList() {
		List<GuestDto> list=session.selectList("guest.getList");
		return list;
	}

}
