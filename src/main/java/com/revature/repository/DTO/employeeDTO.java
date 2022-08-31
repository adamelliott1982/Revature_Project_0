package com.revature.repository.DTO;

import java.util.Objects;

public class employeeDTO {

	protected Integer employee_id;

	protected String username;

	public employeeDTO(Integer employee_id, String username) {
		super();
		this.employee_id = employee_id;
		this.username = username;
	}

	public Integer getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public int hashCode() {
		return Objects.hash(employee_id, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		employeeDTO other = (employeeDTO) obj;
		return Objects.equals(employee_id, other.employee_id) && Objects.equals(username, other.username);
	}

	@Override
	public String toString() {
		return "employeeDTO [employee_id=" + employee_id + ", username=" + username + ", getEmployee_id()="
				+ getEmployee_id() + ", getUsername()=" + getUsername() + ", hashCode()=" + hashCode() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}

	
	
	
}
