package com.script;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
public class Main {
  private int val = 0;

  public void setValue(int x) {
    val = x;
  }

  public int getValue() {
    return val;
  }
  public static void main(String[] args) throws ScriptException {
    ScriptEngineManager manager = new ScriptEngineManager();
    ScriptEngine engine = manager.getEngineByName("nashorn");
    Main result = new Main();
    engine.put("result", result);
    String script = "3 + 4; result.setValue(1);";
    engine.eval(script);
    int returnedValue = result.getValue();
    System.out.println("Returned value is " + returnedValue);
  }
}