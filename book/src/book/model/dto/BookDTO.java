package book.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class BookDTO {

	private int bookNo;
	private String bookName;
	private String writer;
	private String publisher;
	private int inventory;
		
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("No: ");
		builder.append(bookNo);
		builder.append(" Title: ");
		builder.append(bookName);
		builder.append(" Author: ");
		builder.append(writer);
		builder.append(" Publisher: ");
		builder.append(publisher);
		builder.append(" Stock: ");
		builder.append(inventory);
		return builder.toString();
	}
	
}
