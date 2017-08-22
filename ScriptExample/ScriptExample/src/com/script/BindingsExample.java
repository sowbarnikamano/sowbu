package com.script;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class BindingsExample {
	public static void main(String [] args){
		ScriptEngineManager manager=new ScriptEngineManager();
		ScriptEngine engine=manager.getEngineByName("JavaScript");
		//engine.put("bindings", "engine bindings");
		
		
		Bindings bind=engine.createBindings();
		bind.put("1", "hi");
		
	bind.put("2" ,"hello from bindings");
	Object  msg1=bind.get("1");
	Object msg2=bind.get("2");
	System.out.println(msg1 + "" + msg2);
	    manager.put("txt1", "inautix ");
	    String path="c:/sow/newjs.js";
	    Path paths=Paths.get(path);
	    String script = "";

	    engine.put("txt2", "bny mellon");
	   // engine.put("msg", "a string");
	    try{
	    	 Bindings bindings = engine.createBindings();
	 	    bindings.put("txt1", "welcome to  ");
	 	    bindings.put("txt2", "inautix");
	    	Reader reader=Files.newBufferedReader(paths);
	    Boolean result = (Boolean) engine.eval(reader);
	    System.out.println(result);
	    reader.close();
	    Reader reader1=Files.newBufferedReader(paths);

	   
	    engine.eval(reader1, bindings);
	    reader1.close();
	    }
	    catch(ScriptException e){
	    	e.printStackTrace();
	    	
	    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
