package com.modules.bootapplication.modules.weixin.utils;

import com.modules.bootapplication.common.utils.StringUtils;
import sun.misc.BASE64Decoder;

import java.io.UnsupportedEncodingException;

@SuppressWarnings("restriction")
public class Base64 {
    public static String encode(String s) {
        if (StringUtils.isEmpty(s)) {
            return "";
        }
        try {
            return (new sun.misc.BASE64Encoder()).encode(s.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
        }
        return "";
    }

    public static String decode(String s) {
        if (StringUtils.isEmpty(s)) {
            return "";
        }
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            byte[] b = decoder.decodeBuffer(s);
            return new String(b);
        } catch (Exception e) {
            return null;
        }
    }
}
