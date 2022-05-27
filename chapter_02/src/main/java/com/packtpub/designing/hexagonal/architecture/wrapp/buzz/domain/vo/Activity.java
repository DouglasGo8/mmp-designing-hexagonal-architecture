package com.packtpub.designing.hexagonal.architecture.wrapp.buzz.domain.vo;

/**
 *
 * @param srcHost
 * @param dstHost
 */
public record Activity(String srcHost, String dstHost) {

  @Override
  public String toString() {
    return "Activity{" +
            "srcHost='" + srcHost + '\'' +
            ", dstHost='" + dstHost + '\'' +
            '}';
  }
}