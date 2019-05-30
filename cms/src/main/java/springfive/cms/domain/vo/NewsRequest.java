package springfive.cms.domain.vo;

import java.util.Set;

import io.swagger.annotations.Tag;
import lombok.Data;
import springfive.cms.domain.models.Category;


@Data
public class NewsRequest {

	  String title;

	  String content;

	  Set<Category> categories;

	  Set<Tag> tags;

}
