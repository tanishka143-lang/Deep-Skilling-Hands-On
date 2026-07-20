@SpringBootApplication
public class OrmLearnApplication {

	public static void main(String[] args) {
		ApplicationContext context =
				SpringApplication.run(OrmLearnApplication.class, args);

		EmployeeService employeeService =
				context.getBean(EmployeeService.class);

		Employee emp = employeeService.get(1);
		System.out.println(emp);
		System.out.println(emp.getDepartment());
	}
}
