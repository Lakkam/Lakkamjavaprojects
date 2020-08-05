package com.lakkam.javaconcepts;

abstract class CompanyReports {

	abstract void quarterlyReports();

	abstract void yearlyReports();
}

class FinanceReports extends CompanyReports {
	@Override
	void quarterlyReports() {
		System.out.println("Quarterly Finance Reports..." + 12344);

	}

	@Override
	void yearlyReports() {
		System.out.println("Yearly Finance Reports..." + 678987);

	}
}

class HRReports extends CompanyReports {
	@Override
	void quarterlyReports() {
		System.out.println("Quarterly HR Reports..." + 1787678);

	}

	@Override
	void yearlyReports() {
		System.out.println("Yearly HR Reports..." + 9876543);

	}
}

public class TestAbstractClass {

	public static void main(String[] args) {

		// You can not create object for abstract class
		// CompanyReports company = new CompanyReports();

		CompanyReports finance = new FinanceReports();
		finance.quarterlyReports();
		finance.yearlyReports();

		CompanyReports hrReports = new HRReports();
		hrReports.quarterlyReports();
		hrReports.yearlyReports();

	}

}
