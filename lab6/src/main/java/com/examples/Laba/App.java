package com.examples.Laba;

import akka.actor.ActorSystem;
import akka.http.javadsl.Http;
import akka.stream.ActorMaterializer;
import org.apache.zookeeper.ZooKeeper;
import org.asynchttpclient.AsyncHttpClient;
import java.util.logging.Logger;
import java.io.IOException;

import static org.asynchttpclient.Dsl.asyncHttpClient;
public class App {

    public static void main(String[] args) throws IOException {
        String host = args[0];
        int port = Integer.parseInt(args[1]);
        final ZooKeeper zoo = new ZooKeeper("127.0.0.1:2181", 3000, e -> log.info(e.toString()));
        ActorSystem system = ActorSystem.create("routes");
        final Http http = Http.get(system);
        final ActorMaterializer materializer = ActorMaterializer.create(system);

        AsyncHttpClient httpClient = asyncHttpClient();


}
