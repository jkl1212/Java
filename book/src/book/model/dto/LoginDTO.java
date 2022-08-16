package book.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class LoginDTO {

	private String id;
	private String pw;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ID: ");
		builder.append(id);
		builder.append(" Name: ");
		builder.append(pw);
		return builder.toString();
	}
}
