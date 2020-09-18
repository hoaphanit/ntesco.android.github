package com.vn.ntesco.activity;

import com.airbnb.deeplinkdispatch.BaseDeepLinkDelegate;
import com.vn.ntesco.deeplink.AppDeepLinkModuleRegistry;
import com.vn.ntesco.deeplink.LibraryDeepLinkModuleRegistry;
import java.lang.String;
import java.util.Arrays;
import java.util.Map;

public final class DeepLinkDelegate extends BaseDeepLinkDelegate {
  public DeepLinkDelegate(AppDeepLinkModuleRegistry appDeepLinkModuleRegistry,
      LibraryDeepLinkModuleRegistry libraryDeepLinkModuleRegistry) {
    super(Arrays.asList(
      appDeepLinkModuleRegistry,
      libraryDeepLinkModuleRegistry
    ));
  }

  public DeepLinkDelegate(AppDeepLinkModuleRegistry appDeepLinkModuleRegistry,
      LibraryDeepLinkModuleRegistry libraryDeepLinkModuleRegistry,
      Map<String, String> configurablePathSegmentReplacements) {
    super(Arrays.asList(
      appDeepLinkModuleRegistry,
      libraryDeepLinkModuleRegistry),
      configurablePathSegmentReplacements
    );
  }
}
