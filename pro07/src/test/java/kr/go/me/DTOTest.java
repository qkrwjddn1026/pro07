package kr.go.me;

import org.junit.Assert;
import org.junit.Test;

import kr.go.me.dto.SampleDTO;
import lombok.extern.log4j.Log4j;

@Log4j
public class DTOTest {
	@Test
	public void test3() throws Exception{
		SampleDTO dto = new SampleDTO();
		dto.setId("pjw");
		dto.setPw("1234");
		Assert.assertNotNull(dto);
		log.info(dto);
		log.info("--------------");
		log.info("id : " + dto.getId());
		log.info("pw : " + dto.getPw());
		log.info("--------------");
	}

}
