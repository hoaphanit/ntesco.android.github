package com.vn.ntesco.deeplink;

import com.airbnb.deeplinkdispatch.BaseRegistry;
import com.airbnb.deeplinkdispatch.DeepLinkEntry;
import com.airbnb.deeplinkdispatch.base.Utils;
import com.vn.ntesco.activity.MainActivity;
import java.lang.String;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public final class LibraryDeepLinkModuleRegistry extends BaseRegistry {
  public LibraryDeepLinkModuleRegistry() {
    super(Collections.unmodifiableList(Arrays.<DeepLinkEntry>asList(
      new DeepLinkEntry("ntesco://ntesco.vn/deepLink/", DeepLinkEntry.Type.CLASS, MainActivity.class, null)
    )), Utils.readMatchIndexFromStrings( new String[] {matchIndex0(), }),
    new HashSet<String>(Arrays.<String>asList()));
  }

  private static String matchIndex0() {
    return "\u0001\u0001\u0000\u0000\u00007ÿÿr\u0002\u0006\u0000\u0000\u0000)ÿÿntesco\u0004\t\u0000\u0000\u0000\u0018ÿÿntesco.vn\b\b\u0000\u0000\u0000\bÿÿdeepLink\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000";}
}
