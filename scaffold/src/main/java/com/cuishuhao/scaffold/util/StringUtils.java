package com.cuishuhao.scaffold.util;

public class StringUtils {

  public static String escapeBeforeQueryLike(String input) {
    if (input == null)
      return null;

    StringBuilder sb = new StringBuilder();
    for (char c : input.toCharArray()) {
      if (c == '%' || c == '_' || c == '\\') {
        sb.append('\\');
      }
      sb.append(c);
    }
    return sb.toString();
  }
}