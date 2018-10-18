package com.yxz.xingyuornament.utils;


import org.springframework.security.crypto.codec.Hex;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author yyz
 * @data 2018/6/28
 */
public class MD5Util {
  /**
   * MD5加密
   *
   *
   * @param str
   * @return
   * @throws NoSuchAlgorithmException
   */
  public static String encrypt(String str) throws NoSuchAlgorithmException {
    MessageDigest m = MessageDigest.getInstance("MD5");
    m.reset();
    m.update(str.getBytes());
    byte[] digest = m.digest();
    BigInteger bigInt = new BigInteger(1, digest);
    String hashtext = bigInt.toString(16);
    while (hashtext.length() < 32) {
      hashtext = "0" + hashtext;
    }
    return hashtext;
  }

  // 计算登录Sign
  public static String getSign(String partner_key, String atime, String user_id)
          throws NoSuchAlgorithmException{
    String info = partner_key + atime + user_id;
    MessageDigest md5 = MessageDigest.getInstance("MD5");
    byte[] srcBytes = info.getBytes();
    md5.update(srcBytes);
    byte[] resultBytes = md5.digest();
    String resultString = new String(new Hex().encode(resultBytes));
    return resultString.substring(8, 24);
  }


  public static void main(String[] args) throws NoSuchAlgorithmException {
    System.out.println(encrypt("43a945e8-feba-11e5-851d-1c872c46a91b20160410091925"));
  }
}
