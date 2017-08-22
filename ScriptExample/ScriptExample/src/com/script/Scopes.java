package com.script;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.SimpleScriptContext;

public class Scopes {
 public static void main(String args[]) {
		ScriptEngineManager manager=new ScriptEngineManager();
		ScriptEngine engine=manager.getEngineByName("JavaScript");
		engine.put("n2", 1);
		String script="var s=2+3+5*n2; print(s);";
		
		try {
			engine.eval(script);
		} catch (ScriptException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		ScriptContext context=new SimpleScriptContext();
		Bindings bind= context.getBindings(ScriptContext.ENGINE_SCOPE);
		bind.put("n2", 3);
	
		try{
		 engine.eval(script, context);
		}
		catch(ScriptException e){
			e.printStackTrace();
		}
	
}
}
