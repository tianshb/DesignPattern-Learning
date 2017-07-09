package com.crow.JavaIO;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by CrowHawk on 17/7/10.
 */
public class LowerCaseInputStream extends FilterInputStream {//JavaI/O设计时使用了装饰者模式，编写自己的JavaI/O装饰者，把输入流的所有大写字符换成小写
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char)c));
    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for (int i = offset; i < offset + result; i++) {
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return result;
    }
}
