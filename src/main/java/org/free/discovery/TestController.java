package org.free.discovery;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping(value="get",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Student test(String id) {
		System.out.println("获取ID:"+id);
		Student student = new Student();
		student.setName("maheng");
		return student;
	}
	
	@PostMapping(value="post")
	public Student postTest(String password,
			@RequestHeader(required = false) String token,
			@RequestBody Student ss) {
		System.out.println("param:"+password);
		System.out.println("header:"+token);
		System.out.println("body:"+ss);
		Student student = new Student();
		student.setName("maheng");
		return student;
	}
	
	
	public static class Student {
		private String password;
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "@"+this.getClass().getName()+"[name="+name+",password="+password+"]";
		}
		
	}
	
}
