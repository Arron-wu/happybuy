package springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yaorange.controller.AppMain;
import com.yaorange.service.HelloService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=AppMain.class)
public class SpringTest {
	@Autowired
	private HelloService helloService;
	@Test
	public void MyTest(){
		helloService.sayHello();
	}
}
