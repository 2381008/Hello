package jp.co.hello;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import jp.co.hello.HelloUtil;

class HelloUtilTest {

	@Test
	void Format_Ok() {
		System.out.println("ouch");
		assertThat(HelloUtil.Format("Cat"), is("You said a cat."));
	}

	@Test
	void Calc_Add_Ok() {
		assertThat(HelloUtil.Calc_Add(5, 3), is(10));
	}

}
