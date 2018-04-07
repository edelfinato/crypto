package org.edelf;

import org.edelf.MessageDigestUtil.SHA3;
import org.junit.Test;

import java.nio.charset.Charset;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class MessageDigestUtilTest {
    private final Charset UTF8_CHARSET = Charset.forName("UTF-8");
    private final String test = "asdasd";

    @Test
    public void test256() {
        //Given
        //when
        String digest256 = SHA3.digest256(test.getBytes(UTF8_CHARSET));
        //then
        assertThat(digest256, is("7e3759aa1c6f94082beed27930be292d3207e5b5e3e5bab2a5eacf4b38053a54"));
    }


    @Test
    public void test384() {
        //Given
        //when
        String digest384 = SHA3.digest384(test.getBytes(UTF8_CHARSET));
        //then
        assertThat(digest384, is("c4b5c647e3883389581b9bcdf5669514ac2a2fb830afc2197c8f2e35a281121e09067a8136627b701fc370411e7b8b51"));
    }

}