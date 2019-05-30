package springfive.cms.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {

	String userId;

	String status;

	public Review() {
		// TODO Auto-generated constructor stub
	}

	public Review(String userId2, String status2) {

		this.userId = userId2;
		this.status = status2;
	}
}