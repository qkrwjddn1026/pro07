package kr.go.me;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class RestService {
	
	public List<String> getTest2(@PathVariable("id") String id) {
		List<String> lst = new ArrayList<String>();
		for(int i=0;i<5;i++) {
		lst.add(id+1);
	}
		return lst;
	}
}
