package priv.lint.SayHello;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.Router;


public class HelloWord  {

    public static void main(String[] args) {
        HttpServer server = Vertx.vertx().createHttpServer();

        server.requestHandler(request -> {


            HttpServerResponse response = request.response();
            response.putHeader("content-type", "text/plain");


            response.end("Hello Word");
        });

        server.listen(8080);
    }
}
