package com.swapi.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helpers {
  public static Integer getIdFromUrl(String url) {
    if (url != null) {
      Pattern pattern = Pattern.compile("[0-9]+");
      Matcher matcher = pattern.matcher(url);
      if (matcher.find()) {
        return Integer.parseInt(matcher.group(0));
      }
    }
    return -1;
  }
}
