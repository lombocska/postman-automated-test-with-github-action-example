# EXAMPLE OF SPRING APP & POSTMAN CLI & GITHUB ACTIONS CI/CD

This app is just a little thin code for serving an API for testing Postman CLI with GitHub Actions.

Medium article can be found [here]()

## TECH STACK

- JDK 17
- Spring Data Rest
- H2 inmemory db
- Postman (version 10.13.4)
- GitHub Actions (workflows)


## EXAMPLE FOR PATH

http://localhost:8081/h2-console
http://localhost:8081/countries/search/findByName?name=USA

Example of Response

```json
{
  "_embedded" : {
    "countries" : [ {
      "name" : "USA",
      "_links" : {
        "self" : {
          "href" : "http://localhost:8081/countries/1"
        },
        "country" : {
          "href" : "http://localhost:8081/countries/1"
        }
      }
    } ]
  },
  "_links" : {
    "self" : {
      "href" : "http://localhost:8081/countries/search/findByName?name=USA"
    }
  }
}
```


## INSPO

- Data REST
https://www.baeldung.com/spring-data-rest-intro

- H2 InMemory db
https://www.baeldung.com/spring-boot-h2-database