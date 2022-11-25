package kr.or.ddit.service;

import java.util.List;

import kr.or.ddit.vo.TreeVO;

public interface TreeService {

	public List<TreeVO> list(String keyword);
}
