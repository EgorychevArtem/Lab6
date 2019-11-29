package com.examples.Laba;

import akka.actor.ActorSystem;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        ActorSystem system = ActorSystem.create("routes");
        final Http http = Http.get(system);
        final ActorMaterializer materializer = ActorMaterializer.create(system);

        AsyncHttpClient httpClient = asyncHttpClient();
}
