package cms330;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
public class Controller {

    // Fill this class with methods mapped to URLs

    // You should at least have a constructor that initializes the SearchEngine
    // and a query method that takes a String as input and returns its results.

    // Question to consider: do you want the query method to format the output
    // and return it as a String or do you want it to return an object that's
    // then formatted on the client side?

    // If you want to format the output on the server side, it must be in valid
    // HTML using <p> (for new paragraphs) and <br> (for line breaks).
}