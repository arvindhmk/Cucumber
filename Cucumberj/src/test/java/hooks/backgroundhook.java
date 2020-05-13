package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class backgroundhook 
{
@Before(order=1)
public void beforescenario()
{
System.out.println("Run before all scenario order 1");
}

@Before(order=2)
public void beforescenario1()
{
System.out.println("Run before all scenario1 order 2");
}

@After(order=2)
public void afterscenario()
{
	System.out.println("Run after all scenario order 2");	
}

@After(order=1)
public void afterscenario1()
{
	System.out.println("Run after all scenario1 order 1");	
}
}
