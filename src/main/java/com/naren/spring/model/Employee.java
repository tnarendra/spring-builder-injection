package com.naren.spring.model;

public class Employee {

	private final int empID;
	private final String firstName;
	private final String lastName;
	private String middleName;
	private String suffix;

	private Employee(int empID, String firstName, String lastName, String middleName, String suffix) {
		this.empID = empID;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.suffix = suffix;

	}

	public int getEmpID() {
		return empID;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", firstName=" + firstName + ", lastName=" + lastName + ", middleName="
				+ middleName + ", suffix=" + suffix + "]";
	}

	public static class EmployeeBuilder {
		private final int empID;
		private final String firstName;
		private final String lastName;
		private String middleName;
		private String suffix;

		public EmployeeBuilder(final int empID, final String firstName, final String lastName) {
			this.empID = empID;
			this.firstName = firstName;
			this.lastName = lastName;

		}

		public void setMiddleName(final String middleName) {
			this.middleName = middleName;
		}

		public void setSuffix(final String suffix) {
			this.suffix = suffix;
		}

		public Employee createEmployee() {
			return new Employee(empID, firstName, lastName, middleName, suffix);
		}
	}
}