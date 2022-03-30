package org.prgrms.java.gof.ch3_decorator.starbuzz;

import org.junit.jupiter.api.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

class LowerCaseInputStreamTest {

  int c;

  @Test
  void IO_테스트() throws IOException {
    InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
    while ((c = in.read()) >= 0) {
      System.out.println((char)c);
    }
    in.close();
  }
}