package book.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CustomerDTO {

	private int customerId;
	private String customerName;
	private String phoneNum;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ID: ");
		builder.append(customerId);
		builder.append(" Name: ");
		builder.append(customerName);
		builder.append(" Phone: ");
		builder.append(phoneNum);
		return builder.toString();
	}
	
	
}
