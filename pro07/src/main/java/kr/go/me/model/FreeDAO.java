package kr.go.me.model;

import java.util.List;

import kr.go.me.dto.FreeDTO;

public interface FreeDAO {
	public List<FreeDTO> freeList() throws Exception;
	public FreeDTO freeDetail(int bno) throws Exception;
	public void freeDelete(int bno) throws Exception;
	public void freeInsert(FreeDTO dto) throws Exception;
	public void freeEdit(FreeDTO dto) throws Exception;
}
