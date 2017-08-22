package com.script;

import javax.script.*;

public class ScriptDemo
{
   public static void main (String [] args) throws ScriptException
   {

		ScriptEngineManager manager = new ScriptEngineManager();

		ScriptEngine engine = manager.getEngineByName("nashorn");
        String script="print (color); print (shape);";
		engine.put("color", "red");
		engine.put("shape", "rectangle");

		engine.eval(script);

		Bindings oldBindings = engine.getBindings(ScriptContext.ENGINE_SCOPE);

		Bindings newBindings = engine.createBindings();
		newBindings.put("color", "blue");
	
		newBindings.put("shape", "triangle");

		engine.eval(script,newBindings);

		engine.setBindings(oldBindings, ScriptContext.ENGINE_SCOPE);

		engine.eval(script,oldBindings);
   }
}