package kr.go.me;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import kr.go.me.service.SampleService;
import lombok.extern.log4j.Log4j;


@Log4j
public class ServiceTest {
	
	private DAOTest daoTest;
	
	@Autowired
	SampleService sampleService;
	
	@Test
	public void test5()throws Exception {
		int cnt = 5;
		try {
			cnt = serviceCall();
			log.info("서비스 단위 테스트가 성공적으로 처리되었음");
			log.info("회원수 : "+ cnt);
			Assert.assertNotNull(cnt);
		} catch(Exception e){
			log.info("서비스 단위 테스트가 실패 되었음");
			fail("Service 단위 테스트 실패");
		}
	}
	public int serviceCall() {
		int cnt = daoTest.daoCall();
		return cnt;
	}

}
