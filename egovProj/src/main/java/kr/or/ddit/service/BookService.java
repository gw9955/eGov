package kr.or.ddit.service;

import java.util.List;

import kr.or.ddit.vo.BookVO;

public interface BookService {
	// 도서 목록
	public List<BookVO> list();

}
