package com.shinesolutions.swaggeraem4j.auth;

import com.shinesolutions.swaggeraem4j.Pair;

import java.util.Map;
import java.util.List;

public interface Authentication {
  /** Apply authentication settings to header and query params. */
  void applyToParams(List<Pair> queryParams, Map<String, String> headerParams);
}
