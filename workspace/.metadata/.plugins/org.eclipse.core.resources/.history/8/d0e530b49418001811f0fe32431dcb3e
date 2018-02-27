package razo;

import org.junit.Assert;
import org.junit.Test;

//@RunWith(JUnitPlatform.class)
public class QueryParserTest {
	QueryParser juint = new QueryParser();
	String name = "select * from ipl.csv where season > 2014 and city = 'Bangalore' order by win_by_runs group by team1";
	String[] spqry= juint.splqry(name);
	@Test
	public void test() {
		//To check file name
				String results = juint.extfname(name);
				Assert.assertTrue(results.equals("ipl"));
	}
	@Test
	public void test1() {
	//To check before where
	String bfwh = juint.beforewhere(name);
	Assert.assertTrue(bfwh.equals("select * from ipl.csv "));
	}
	@Test
	public void test2() {
	//To check after where 
	String afwh = juint.afterwhere(name);
	Assert.assertTrue(afwh.equals("season > 2014 and city = 'Bangalore' order by win_by_runs group by team1"));
	}
	@Test
	public void test3() {
	// To check the conditions
	String[] conditions= {"","","",""};
	conditions = juint.restrictions(spqry,name);
	Assert.assertTrue(conditions[0].equals("season>2014"));
	Assert.assertTrue(conditions[1].equals("city='Bangalore'"));
	}
	@Test
	public void test4() {
	//To check logical operator
	String[] logical = {""};
	logical = juint.logop(name, spqry);
	Assert.assertTrue(logical[0].equals("and"));
	}
	@Test
	public void test5() {
	//To check group fields
	String grp = juint.grpfld(spqry, name);
	Assert.assertTrue(grp.equals("team1"));
	}
	@Test
	public void test6() {
	//To check order fields
	String ord = juint.ordfld(spqry, name);
	Assert.assertTrue(ord.equals("win_by_runs"));
	
	
}

}
