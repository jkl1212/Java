package book.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RentDTO {
	private int rentNo;
	private String rentDate;
	private int bookNo;
	private String bookName;
	private int customerId; 
	private String customerName;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rent No: ");
		builder.append(rentNo);
		builder.append(" Date: ");
		builder.append(rentDate);
		builder.append(" Book No: ");
		builder.append(bookNo);
		builder.append(" Book Name: ");
		builder.append(bookName);
		builder.append(" Member ID: ");
		builder.append(customerId);
		builder.append(" Member Name: ");
		builder.append(customerName);
		return builder.toString();
	}
	
}
