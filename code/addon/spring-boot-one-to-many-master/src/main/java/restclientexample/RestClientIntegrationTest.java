package restclientexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.elasticsearch.ElasticsearchProperties.Restclient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;


public class RestClientIntegrationTest {

	private String uriBase = "http://localhost:" + 8080;
	
	
	private final String URI = "/articles";
	private final String URI_PATHID = "/articles/{id}";
	
	 
	
	public static void main(String[] args) {
	
		final String url ="http://localhost:8080/articles";
		RestTemplate restTemplate =new RestTemplate();
		
		/*
		ResponseEntity<Collection> responseEntity = 
				restTemplate.getForEntity(url, Collection.class);
		
		
		List<Article> articles = new ArrayList<>(responseEntity.getBody());
	    System.out.println(articles);
		*/
		
		
		
		Article articleobject =new Article(23,"ABC");
		restTemplate.postForObject(url, articleobject, Article.class);
		System.out.println("post is working");
		
		
		
		
		
		
		ResponseEntity<Collection> responseEntity = 
				restTemplate.getForEntity(url, Collection.class);
		
		
		
		//rituals...
		List<Article> articles = new ArrayList<>(responseEntity.getBody());
	    System.out.println(articles);

		
		/*
		restTemplate.getForObject(URI, Article[].class);
		Map<String, String> params = new HashMap<>();
		params.put("id", "1");
		Article article = restTemplate.getForObject(URI, Article.class, params);
		
		
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.set("X-HEADER_NAME", "XYZ");

		HttpEntity<String> entity = new HttpEntity<>(headers);
		ResponseEntity<Article[]> responseEntity = restTemplate
				.exchange("/articles", HttpMethod.GET, entity, Article[].class);
		
		
		
		*/
		
		
		
		
	}
	
	
	

/*
	
	RestClient restclient =RestClient.create();
	
	public void teardown() {
		restClient.delete()
				.uri(uriBase + "/articles")
				.retrieve()
				.toBodilessEntity();
	}

	@Test
	void shouldGetArticlesAndReturnString() {
		String articlesAsString = restClient.get()
				.uri(uriBase + "/articles")
				.retrieve()
				.body(String.class);

		assertThat(articlesAsString).isEqualTo("");
	}

	@Test
	void shouldPostAndGetArticles() {
		Article article = new Article(1, "How to use RestClient");
		restClient.post()
				.uri(uriBase + "/articles")
				.contentType(MediaType.APPLICATION_JSON)
				.body(article)
				.retrieve()
				.toBodilessEntity();

		List<Article> articles = restClient.get()
				.uri(uriBase + "/articles")
				.retrieve()
				.body(new ParameterizedTypeReference<>() {});

		assertThat(articles).isEqualTo(List.of(article));
	}

	@Test
	void shouldPostAndGetArticlesWithExchange() {
		assertThatThrownBy(this::getArticlesWithExchange).isInstanceOf(ArticleNotFoundException.class);

		Article article = new Article(1, "How to use RestClient");
		restClient.post()
				.uri(uriBase + "/articles")
				.contentType(MediaType.APPLICATION_JSON)
				.body(article)
				.retrieve()
				.toBodilessEntity();

		List<Article> articles = getArticlesWithExchange();

		assertThat(articles).isEqualTo(List.of(article));
	}

	private List<Article> getArticlesWithExchange() {
        return restClient.get()
				.uri(uriBase + "/articles")
				.exchange((request, response) -> {
					if (response.getStatusCode().isSameCodeAs(HttpStatusCode.valueOf(204))) {
						throw new ArticleNotFoundException();
					} else if (response.getStatusCode().isSameCodeAs(HttpStatusCode.valueOf(200))) {
						return objectMapper.readValue(response.getBody(), new TypeReference<>() {});
					} else {
						throw new InvalidArticleResponseException();
					}
				});
	}

	@Test
	void shouldPostAndGetArticlesWithErrorHandling() {
		assertThatThrownBy(() -> {
				restClient.get()
						.uri(uriBase + "/articles/1234")
						.retrieve()
						.onStatus(status -> status.value() == 404, (request, response) -> { throw new ArticleNotFoundException(); })
						.body(new ParameterizedTypeReference<>() {});
		}).isInstanceOf(ArticleNotFoundException.class);
	}

	@Test
	void shouldPostAndPutAndGetArticles() {
		Article article = new Article(1, "How to use RestClient");
		restClient.post()
				.uri(uriBase + "/articles")
				.contentType(MediaType.APPLICATION_JSON)
				.body(article)
				.retrieve()
				.toBodilessEntity();

		Article articleChanged = new Article(1, "How to use RestClient even better");
		restClient.put()
				.uri(uriBase + "/articles/1")
				.contentType(MediaType.APPLICATION_JSON)
				.body(articleChanged)
				.retrieve()
 				.toBodilessEntity();

		List<Article> articles = restClient.get()
				.uri(uriBase + "/articles")
				.retrieve()
				.body(new ParameterizedTypeReference<>() {});

		assertThat(articles).isEqualTo(List.of(articleChanged));
	}

	@Test
	void shouldPostAndDeleteArticles() {
		Article article = new Article(1, "How to use RestClient");
		restClient.post()
				.uri(uriBase + "/articles")
				.contentType(MediaType.APPLICATION_JSON)
				.body(article)
				.retrieve()
				.toBodilessEntity();

		restClient.delete()
				.uri(uriBase + "/articles")
				.retrieve()
				.toBodilessEntity();

		ResponseEntity<Void> entity = restClient.get()
				.uri(uriBase + "/articles")
				.accept(MediaType.APPLICATION_JSON)
				.retrieve()
				.toBodilessEntity();

		assertThat(entity.getStatusCode()).isEqualTo(HttpStatusCode.valueOf(204));
	}
	
	*/
}