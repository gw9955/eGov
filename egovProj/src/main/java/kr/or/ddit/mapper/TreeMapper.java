package kr.or.ddit.mapper;

import java.util.List;

import kr.or.ddit.vo.TreeVO;

public interface TreeMapper {
	
	public List<TreeVO> list(String keyword);
}
