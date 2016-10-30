package testnge2e.custanno;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

import testnge2e.TestCalc;

/**
 * The listener interface for receiving MyTestNGAnnotation events.
 * The Listener can be automatically invoked when TestNG tests are run by using ServiceLoader mechanism.
 * You can also add this listener to a TestNG Test class by adding
 * <code>@Listeners({com.amareshp.annotations.MyTestNGAnnotationListener.class})</code>
 * before the test class
 *
 * @see MyTestNGAnnotation
 */
public class MyTestNGAnnotationListener implements IInvokedMethodListener, ITestListener , IAnnotationTransformer {
    
    
    boolean testSuccess = true;
    
    
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        if(method.isTestMethod() && annotationPresent(method, MyTestNGAnnotation.class) ) {
            //System.out.println("This gets invoked before every TestNG Test that has @MyTestNGAnnotation Annotation...");
            //System.out.println("Name: " + DataSet.name + " City: " + DataSet.city + " State: " + DataSet.state);
        }
    }

    
    private boolean annotationPresent(IInvokedMethod method, Class clazz) {
        boolean retVal = method.getTestMethod().getConstructorOrMethod().getMethod().isAnnotationPresent(clazz) ? true : false;
        return retVal;
    }
    
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        if(method.isTestMethod()) {
            if(method.getClass().isAnnotationPresent(MyTestNGAnnotation.class)) {
                System.out.println("This gets invoked after every TestNG Test that has @MyTestNGAnnotation Annotation...");
            }
            if( !testSuccess ) {
                testResult.setStatus(ITestResult.FAILURE);
            }
        }
    }

    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub
        
    }

    public void onTestSuccess(ITestResult result) {
        // TODO Auto-generated method stub
        
    }

    public void onTestFailure(ITestResult result) {
        // TODO Auto-generated method stub
        
    }

    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub
        
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub
        
    }

    public void onStart(ITestContext context) {try{
    //	Method m = context.getCurrentXmlTest().getPackages().get(0).getXmlClasses().get(1).getClass().getDeclaredMethod("tMe", null);
    	//System.out.println(context.getCurrentXmlTest().getPackages().get(0).getXmlClasses().get(1));
        for(ITestNGMethod m1 : context.getAllTestMethods()) {
            if(m1.getConstructorOrMethod().getMethod().isAnnotationPresent(MyTestNGAnnotation.class)) {
                //capture metadata information.
            	DataSet.name = m1.getConstructorOrMethod().getMethod().getAnnotation(MyTestNGAnnotation.class).name();
            	DataSet.city = m1.getConstructorOrMethod().getMethod().getAnnotation(MyTestNGAnnotation.class).city();
            	DataSet.state = m1.getConstructorOrMethod().getMethod().getAnnotation(MyTestNGAnnotation.class).state();
            }
           // m.invoke(new TestCalc(), null);
        } 
    }catch(Exception e){e.printStackTrace();} 
    }

    public void onFinish(ITestContext context) {

    	
    }
  

	public void transform(ITestAnnotation arg0, Class arg1, Constructor arg2,
			Method arg3) {
		
	}
}
