
	import org.junit.Test;


	import static org.junit.Assert.*;

	import org.junit.After;
	import org.junit.AfterClass;
	import org.junit.Assert;
	import org.junit.Before;
	import org.junit.BeforeClass;

	public class LibraryTest2 {
	   // @Test 
	    public void testSomeLibraryMethod() 
	    {
	    	int a = 2;
	    	int b =3;
	    	boolean result = (a+b) == 5; // give value true
	    	
	    	//Assert.assertTrue(result);
	    	
	    	//boolean result1 = (a+b) == 4; // give value false 
	    	//Assert.assertTrue(result1);
	    	//Assert.assertTrue("4 is not 5", result);
	    	Assert.assertEquals("The value are not the same", 4 ,a+b);
	    	Assert.assertTrue(false);   	
	    	
	    }
	    
	   // @Test 
	    public void test2() {
	    	
	    }
	    
	    Library lib;
	    
	   // @BeforeClass
	    public static void initBD() {
	    	System.out.println("init Dragon Ball");
	    
	    	
	    }
	    
	   // @AfterClass
	    public static void closeBD() {
	    	System.out.println("Close Dragon Ball ");
	    }
	    
	    
	   // @Before
	    public void initLibrary() {
	    	System.out.println("Before Test");
	    	lib = new Library();
	    	
	    }
	    
	   // @After
	    public void closelib() {
	    	System.out.println("After Test");
	    	lib = new Library();
	    }
	    
	   // @Test
	    public void addTest() {
	    	
	    	System.out.println("add Test");
	    	    	
	    	int a = Integer.MAX_VALUE;
	    	int b = 1;
	    	int results = Integer.MIN_VALUE;
	    	
	    	Assert.assertEquals(results, lib.add(a,b));
	    	
	    	
	    }
	    
	 //   @Test
	    public void subTest() {
	    	
	    	System.out.println("subs Test");
	    	
	    	int a = Integer.MAX_VALUE;
	    	int b = Integer.MIN_VALUE;
	    	int results =-1;
	    	
	    	
	    	Assert.assertEquals(results, lib.subs(a,b));
	    	
	    	
	    }
	 //   @Test
	    public void test3() {
	    	System.out.println(" Test 3");
	    	Assert.fail();
	    	
	    }
	    
	}


