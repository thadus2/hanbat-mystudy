// App.java

package org.example.myapp;

import com.google.common.base.Joiner;
import org.example.util.Utils;

public class App {
  public static void main(String[] args) {
    Utils.printMessage("hello, world");
    String message = Joiner.on(", ").join("hello", "world");
    Utils.printMessage(message);
  }
}
