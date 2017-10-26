import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;
import java.util.HashMap;
import java.util.Map;

public class Hello {
    public static void main(String[] args) {

        get("/", (req, res) -> {
            return new ModelAndView (null, "index.hbs");
        }, new HandlebarsTemplateEngine());

        post("/sign-in", (req, res) -> {
            Map<String, String> model = new HashMap<>();
            model.put("username", req.queryParams("username"));
            return new ModelAndView(model, "sign-in.hbs");
        }, new HandlebarsTemplateEngine());

        post("/", (req, res) -> "create java");

        put("/", (req, res) -> "update java" );

        delete("/", (req, res) -> "delete java" );

        options("/", (req, res) -> "appease something java?");

     System.out.println("Hello World");


    }
}