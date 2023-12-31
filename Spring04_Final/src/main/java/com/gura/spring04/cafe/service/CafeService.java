package com.gura.spring04.cafe.service;

import javax.servlet.http.HttpServletRequest;

import com.gura.spring04.cafe.dto.CafeCommentDto;
import com.gura.spring04.cafe.dto.CafeDto;

public interface CafeService {
	public void getList(HttpServletRequest request);
	public void getDetail(HttpServletRequest request);
	public void saveContent(CafeDto dto);
	public void updateContent(CafeDto dto);
	public void deleteContent(int num,HttpServletRequest request);
	public void getData(HttpServletRequest request);//글 수정하기 위해 정보를 불러오는 기능
	
	public void saveComment(HttpServletRequest request);
	public void deleteComment(HttpServletRequest request);
	public void updateComment(CafeCommentDto dto);
	public void moreCommentList(HttpServletRequest request);
}
