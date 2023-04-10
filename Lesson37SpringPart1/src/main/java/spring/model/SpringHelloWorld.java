package spring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import spring.JsonMarshaller;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Getter
@Setter
public class SpringHelloWorld {
  private JsonMarshaller jsonMarshaller;
  private final String helloMessage;
}
