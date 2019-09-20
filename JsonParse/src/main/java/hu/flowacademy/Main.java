package hu.flowacademy;

import com.fasterxml.jackson.databind.ObjectMapper;
import hu.flowacademy.twitter.Tweet;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
@RequestMapping("/api")
public class Main {

    public static void main(String[] args) throws IOException {


    ObjectMapper mapper = new ObjectMapper();
    JSON json = mapper.readValue((new File("/home/ejay/Flow/j.json")), JSON.class);
        System.out.println(json);
        System.out.println(json.getAddress());


        JSON pista = new JSON();
        pista.setId(3L);
        pista.setName("Pista");
        pista.setPermanent(true);
        pista.setRole("Médium");
        pista.setProperties(new Properties("Sok éves", "Sok a fizetése"));
        pista.setAddress(new Address("Szép utca", "Szeged", 6723L));
        int[] tomb = new int[2];
        tomb[0] = 232323;
        tomb[1] = 34322;
        pista.setPhoneNumbers(tomb);


        mapper.writeValue((new File("/home/ejay/Flow/java-learning/JsonParse/src/pista.json")), pista);

        @RequestMapping(value="/save", method=RequestMethod.GET)
        @ResponseBody
        public ModelAndView saveTweet(Tweet tweet) {
            return new Tweet(tweet);
        }

    }

}
