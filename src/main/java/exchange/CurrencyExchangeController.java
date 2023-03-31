package exchange;

import exchange.model.CurrencyExchangeResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
//@RequestMapping("/exchange")
public class CurrencyExchangeController {

//    @RequestMapping(method = RequestMethod.GET, value = "/get")
//    @ResponseBody
    @GetMapping("/get")
    public CurrencyExchangeResponse getExchange() {
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> entity = new HttpEntity<>(new HttpHeaders());
        ResponseEntity<CurrencyExchangeResponse> response = restTemplate.exchange(
                "https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5",
                HttpMethod.GET,
                entity,
                CurrencyExchangeResponse.class);
        return response.getBody();
    }
}
