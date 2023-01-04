package kr.go.me.model;

import java.util.List;

import kr.go.me.dto.FreeDTO;

public interface FreeDAO {
	public List<FreeDTO> freeList() throws Exception;
	public FreeDTO freeDetail(int no) throws Exception;
	public void freeUpdate(FreeDTO free) throws Exception;
	public void freeInsert(FreeDTO dto) throws Exception;
	public void freeDelete(int no) throws Exception;
}
