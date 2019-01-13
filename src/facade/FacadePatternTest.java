package facade;

import java.sql.Connection;

public class FacadePatternTest {

	public static void main(String[] args) {
		String tableName = "Employee";

		// generating MySql HTML report and Oracle PDF report without using Facade
		Connection con = MySqlHelper.getMySqlDBConnection();
		MySqlHelper mySqlHelper = new MySqlHelper();
		mySqlHelper.generateMySqlHTMLReport(tableName, con);

		Connection con1 = OracleHelper.getOracleDBConnection();
		OracleHelper oracleHelper = new OracleHelper();
		oracleHelper.generateOraclePDFReport(tableName, con1);

		// generating MySql HTML report and Oracle PDF report using Facade
		HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
		HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
	}
}

/*
 * Suppose we have an application with set of interfaces to use MySql/Oracle database and to generate different types of reports, 
 * such as HTML report, PDF report etc.

So we will have different set of interfaces to work with different types of database. Now a client application 
can use these interfaces to get the required database connection and generate reports.

But when the complexity increases or the interface behavior names are confusing, client application will find it difficult to manage it.
So we can apply Facade design pattern here and provide a wrapper interface on top of the existing interface to help client application.
 */
