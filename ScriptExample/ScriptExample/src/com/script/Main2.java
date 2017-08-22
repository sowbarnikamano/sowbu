package com.script;
import java.io.File;
import java.io.FileWriter;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Main2 {
  public static void main(String[] args) throws Exception {
    ScriptEngineManager manager = new ScriptEngineManager();
    ScriptEngine engine = manager.getEngineByName("JavaScript");

    File outputFile = new File("C:/sow/jsoutput.txt");
    System.out.println("Script output will be written to "
        + outputFile.getAbsolutePath());

    FileWriter writer = new FileWriter(outputFile);
    ScriptContext defaultCtx = engine.getContext();
    defaultCtx.setWriter(writer);
    String script = "print('wow ')";
    engine.eval(script);
    writer.close();

  }
}