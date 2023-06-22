package com.gura.spring02.guest.dao;

import java.util.List;

import com.gura.spring02.guest.dto.GuestDto;

//구현할 클래스의 메소드 모양을 강제
public interface GuestDao {
	   public void insert(GuestDto dto);
	   public void update(GuestDto dto);
	   public void delete(GuestDto dto);
	   public GuestDto getData(int num);
	   public List<GuestDto> getList();
}
