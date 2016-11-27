package jp.co.kenshu.form.employee;


import lombok.Data;

@Data
public class EmployeeListForm {
    private String name;
    private Integer age;
    private String memo;
	public String getName() {
		return name;
	}
}
