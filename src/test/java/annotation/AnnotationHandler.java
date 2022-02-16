package annotation;

import java.lang.reflect.Method;

public class AnnotationHandler {

	public static void main(String[] args) {
		try {
			Method meth = TestClass.class.getDeclaredMethod("display", null);
			AnnotationExample annoEx =meth.getAnnotation(AnnotationExample.class);
			if(annoEx.enable()==true)
			{
				meth.invoke(new TestClass(), null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
