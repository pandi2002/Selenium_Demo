package testNG;

import org.testng.annotations.Test;

public class testNG_Group {
  @Test(groups = {"smoke"})
  public void Group() {
	  System.out.println("I am in Group");
  }
  @Test(groups = {"sanity"})
  public void Group1() {
	  System.out.println("I am in Group1");
  }
  @Test(groups = {"smoke"})
  public void Group2() {
	  System.out.println("I am in Group2");
  }
  @Test(groups = {"sanity"})
  public void Group3() {
	  System.out.println("I am in Group3");
  }
  @Test(groups = {"smoke"})
  public void Group4() {
	  System.out.println("I am in Group4");
  }
  @Test(groups = {"sanity"})
  public void Group5() {
	  System.out.println("I am in Group5");
  }
  @Test(groups = {"smoke"})
  public void Group6() {
	  System.out.println("I am in Group6");
  }
  
}
