package com.cevaris

package object utils {
  implicit class StringImprovements(s: String) {
    def lower = s.map(c => c.toLower)
  }
}