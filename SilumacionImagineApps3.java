
import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class SilumacionImagineApps3 extends Simulation {

  private HttpProtocolBuilder httpProtocol = http
    .baseUrl("https://demo.serenity.is")
    .inferHtmlResources()
    .acceptHeader("application/json, text/javascript, */*; q=0.01")
    .acceptEncodingHeader("gzip, deflate, br")
    .acceptLanguageHeader("es-ES,es;q=0.8,en-US;q=0.5,en;q=0.3")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:109.0) Gecko/20100101 Firefox/114.0");
  
  private Map<CharSequence, String> headers_0 = Map.ofEntries(
    Map.entry("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8"),
    Map.entry("Sec-Fetch-Dest", "document"),
    Map.entry("Sec-Fetch-Mode", "navigate"),
    Map.entry("Sec-Fetch-Site", "none"),
    Map.entry("Sec-Fetch-User", "?1"),
    Map.entry("Upgrade-Insecure-Requests", "1")
  );
  
  private Map<CharSequence, String> headers_1 = Map.ofEntries(
    Map.entry("Content-Type", "application/json"),
    Map.entry("Origin", "https://demo.serenity.is"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("X-CSRF-TOKEN", "CfDJ8Jjw8e65Y9VGtnWpobvUmkCjKDr2i7XaetV82ZCCsKFsp3XwsezfdnTSvNrdKDwwCuIwfpbhiwVEbHkcRLs1ULcqwm8STYuH1dSBlfCIQxr8huRIsQFT6Z04h35dx7nI7nsKYUw5qqsvpqBIOEY21kOZPvPpTnksra3QvM7MXm2Ax70iI783lqD4OOC-YhZSuQ"),
    Map.entry("X-Requested-With", "XMLHttpRequest")
  );
  
  private Map<CharSequence, String> headers_2 = Map.ofEntries(
    Map.entry("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8"),
    Map.entry("Sec-Fetch-Dest", "document"),
    Map.entry("Sec-Fetch-Mode", "navigate"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("Sec-Fetch-User", "?1"),
    Map.entry("Upgrade-Insecure-Requests", "1")
  );
  
  private Map<CharSequence, String> headers_3 = Map.ofEntries(
    Map.entry("Accept", "*/*"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("X-CSRF-TOKEN", "CfDJ8Jjw8e65Y9VGtnWpobvUmkBdg-KiGxFdhgiERRWRMHkfUyGoA3u0y9y0xikbg770-nJhzA3vcma9vvO-yugd5PWwbPGZBoE857qxZ29SHnWAph_E3WmZNb9xWWoEPsOih-rMrarjsoUCv1vlD_s_RWo13pAXyb6_eAHne6Z7BqAhJFBZLKoCV8aQp_rGA18q1Q"),
    Map.entry("X-Requested-With", "XMLHttpRequest")
  );
  
  private Map<CharSequence, String> headers_5 = Map.ofEntries(
    Map.entry("Accept", "text/plain, */*; q=0.01"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("X-CSRF-TOKEN", "CfDJ8Jjw8e65Y9VGtnWpobvUmkAAIS5T8i3XRe1WIQhGWs_IV7OejR9amn4nja--VpXIks6-GfCDeRGSErAicIWyHT6B-NHNpJI4JUyZ67-4EkW_Kc2J9mBzea-bftBts2x9tTh6FXoa71xhYGqQ43x7mYgoIOr1xFBzppfRNttzgIO55g9VXWHdoXMQxDqVq-qQiQ"),
    Map.entry("X-Requested-With", "XMLHttpRequest")
  );
  
  private Map<CharSequence, String> headers_6 = Map.ofEntries(
    Map.entry("Content-Type", "application/json"),
    Map.entry("Origin", "https://demo.serenity.is"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("X-CSRF-TOKEN", "CfDJ8Jjw8e65Y9VGtnWpobvUmkAAIS5T8i3XRe1WIQhGWs_IV7OejR9amn4nja--VpXIks6-GfCDeRGSErAicIWyHT6B-NHNpJI4JUyZ67-4EkW_Kc2J9mBzea-bftBts2x9tTh6FXoa71xhYGqQ43x7mYgoIOr1xFBzppfRNttzgIO55g9VXWHdoXMQxDqVq-qQiQ"),
    Map.entry("X-Requested-With", "XMLHttpRequest")
  );
  
  private Map<CharSequence, String> headers_11 = Map.ofEntries(
    Map.entry("Content-Type", "application/json"),
    Map.entry("Origin", "https://demo.serenity.is"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("X-CSRF-TOKEN", "CfDJ8Jjw8e65Y9VGtnWpobvUmkDqX9DiPm1A2tR14MA9GtWOZDOct-MvpydlGOx1ptLtaUYggJ2EuJ9MuX4Bxpx5zjj-BfkjGNA21Q9xGI5lWHRJgqnKBAF4YStc0WKCD1pTOM5VmYti84YX9_Pw8zpddkBDkwITwgn3EhCR5ooTD0qW6F-H-U7NUnfE_JVdbeMsVg"),
    Map.entry("X-Requested-With", "XMLHttpRequest")
  );
  
  private Map<CharSequence, String> headers_14 = Map.ofEntries(
    Map.entry("Accept", "text/plain, */*; q=0.01"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("X-CSRF-TOKEN", "CfDJ8Jjw8e65Y9VGtnWpobvUmkDqX9DiPm1A2tR14MA9GtWOZDOct-MvpydlGOx1ptLtaUYggJ2EuJ9MuX4Bxpx5zjj-BfkjGNA21Q9xGI5lWHRJgqnKBAF4YStc0WKCD1pTOM5VmYti84YX9_Pw8zpddkBDkwITwgn3EhCR5ooTD0qW6F-H-U7NUnfE_JVdbeMsVg"),
    Map.entry("X-Requested-With", "XMLHttpRequest")
  );


  private ScenarioBuilder scn = scenario("SilumacionImagineApps3")
    .exec(
      http("request_0")
        .get("/Account/Login/?ReturnUrl=%2F")
        .headers(headers_0)
    )
    .pause(27)
    // login
    .exec(
      http("request_1 / Login")
        .post("/Account/Login")
        .headers(headers_1)
        .body(RawFileBody("silumacionimagineapps3/0001_request.json"))
        .resources(
          http("request_2")
            .get("/")
            .headers(headers_2)
        )
    )
    .pause(13)
    // reunion
    .exec(
      http("request_3 / Reunion")
        .get("/Account/KeepAlive?1687725674694")
        .headers(headers_3)
    )
    .pause(3)
    .exec(
      http("request_4")
        .get("/Meeting/Meeting")
        .headers(headers_2)
        .resources(
          http("request_5")
            .get("/DynJS.axd/Lookup.Serenity.Pro.Organization.Contact.js?v=638233224793544005")
            .headers(headers_5),
          http("request_6")
            .post("/Services/Meeting/Meeting/List")
            .headers(headers_6)
            .body(RawFileBody("silumacionimagineapps3/0006_request.json"))
        )
    )
    .pause(71)
    // nuevaReunion
    .exec(
      http("request_7 / CrearReunion")
        .post("/Services/Meeting/Meeting/Create")
        .headers(headers_6)
        .body(RawFileBody("silumacionimagineapps3/0007_request.json"))
        .resources(
          http("request_8 / ListaReuniones")
            .post("/Services/Meeting/Meeting/List")
            .headers(headers_6)
            .body(RawFileBody("silumacionimagineapps3/0008_request.json"))
        )
    )
    .pause(16)
    // paginaPrincipal
    .exec(
      http("request_9 / PaginaPrincipal")
        .get("/")
        .headers(headers_2)
    )
    .pause(28)
    // unidadDeNegocio
    .exec(
      http("request_10 / UnidadDeNegocio")
        .get("/Organization/BusinessUnit")
        .headers(headers_2)
        .resources(
          http("request_11")
            .post("/Services/Organization/BusinessUnit/List")
            .headers(headers_11)
            .body(RawFileBody("silumacionimagineapps3/0011_request.json"))
        )
    )
    .pause(34)
    // nuevaUnidadDeNegocio
    .exec(
      http("request_12 / NuevaUnidadDeNegocio")
        .post("/Services/Organization/BusinessUnit/Create")
        .headers(headers_11)
        .body(RawFileBody("silumacionimagineapps3/0012_request.json"))
        .resources(
          http("request_13")
            .post("/Services/Organization/BusinessUnit/List")
            .headers(headers_11)
            .body(RawFileBody("silumacionimagineapps3/0013_request.json")),
          http("request_14")
            .get("/DynJS.axd/Lookup.Serenity.Pro.Organization.BusinessUnit.js?v=1687725833254")
            .headers(headers_14)
        )
    )
    .pause(19)
    // paginaInicio
    .exec(
      http("request_15 / PaginaInicio")
        .get("/")
        .headers(headers_2)
    );

  {
	  setUp(scn.injectOpen(atOnceUsers(300))).protocols(httpProtocol);
  }
}
