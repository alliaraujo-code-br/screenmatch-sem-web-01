package br.com.alura.screenmatch.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpResponse;
import java.util.Objects;

public class ConsumoApi {

    public String obterDados(String endereco){

        package br.com.alura.screenmatch.service;

import IOException;
import URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import HttpResponse;

        public class ConsumoApi {

            public String obterDados(String endereco) {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = null;
                try {
                    response = Objects.requireNonNull(client)
                            .send(request, HttpResponse.BodyHandlers.ofString());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                String json = response.body();
                return json;
            }
        }



    }

}
