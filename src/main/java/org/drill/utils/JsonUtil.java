package org.drill.utils;

import java.util.Iterator;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonUtil {
	
	public static JSONObject transToLowerObject(JSONObject jSONArray1) {
        JSONObject jSONArray2 = new JSONObject();
        Iterator it = jSONArray1.keys();
        while (it.hasNext()) {
            String key = (String) it.next();
            Object object = jSONArray1.get(key);
            if (object.getClass().toString().endsWith("String")) {
                jSONArray2.accumulate(key.toLowerCase(), object);
            } else if (object.getClass().toString().endsWith("JSONObject")) {
                jSONArray2.accumulate(key.toLowerCase(), transToLowerObject((JSONObject) object));
            } else if (object.getClass().toString().endsWith("JSONArray")) {
                jSONArray2.accumulate(key.toLowerCase(), transToArray(jSONArray1.getJSONArray(key)));
            }else if (object.getClass().toString().endsWith("Integer")) {
            	jSONArray2.accumulate(key.toLowerCase(), object);
			}
        }
        return jSONArray2;
    }
	
	public static JSONArray transToArray(JSONArray jSONArray1) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray1.size(); i++) {
            Object jArray = jSONArray1.getJSONObject(i);
            if (jArray.getClass().toString().endsWith("JSONObject")) {
                jSONArray2.add(transToLowerObject((JSONObject) jArray));
            } else if (jArray.getClass().toString().endsWith("JSONArray")) {
                jSONArray2.add(transToArray((JSONArray) jArray));
            }
        }
        return jSONArray2;
    }

}
