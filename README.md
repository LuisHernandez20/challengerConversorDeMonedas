<h1 aling="center"> Challenger Conversor de Moneda </h1>

## Descripción de su proyecto:
    Aplicación en Java para convertir diferentes monedas utilizando el API ExchangeRate.


## Funcionalidades:
    Conversión de monedas en tiempo Real.
       - USD ↔ ARS
       - USD ↔ BRL
       - USD ↔ COP
       - OTRAS ↔ MONEDAS  

## Utilizamos la herramienta Trello.
       Utilizamos la herramienta de colaboración/gestión Trello para seguir una secuencia ordenada en el desarrollo del aplicativo conversor de moneda challenger one java backend.

## Utilizamos la WEB de Exchange Rate API.
       Para el proyecto hemos elegido la Exchange Rate API, con sus tasas de cambio en tiempo real, que nos proporciona información precisa y actualizada en conversión de moneda.
       - Para obtener la clave API nos hemos remitido a la página de ExchangeRate-API cuyo link es: https://www.exchangerate-api.com/
       - No registramos para obtener nuestra clave: https://v6.exchangerate-api.com/v6/368407f3ba2f47c8df3be7fe/latest/USD

## Utilizamos Postman la plataforma para la gestión de las API.
       Herramienta para testear APIs de tipo Rest, también cuenta con una serie de métodos que nos permiten tomar acción ante nuestras peticiones que son:
       - GET: Obtener información
              Realizando la consulta al GET:  https://v6.exchangerate-api.com/v6/368407f3ba2f47c8df3be7fe/latest/USD
       - POST: Agregar información
       - PUT: Reemplazar la información
       - PATCH: Actualizar alguna información
       - DELETE: Borrar información

       Resultado del link; muestra los tipos conversión de monedas:
        {
    "result": "success",
    "documentation": "https://www.exchangerate-api.com/docs",
    "terms_of_use": "https://www.exchangerate-api.com/terms",
    "time_last_update_unix": 1755129601,
    "time_last_update_utc": "Thu, 14 Aug 2025 00:00:01 +0000",
    "time_next_update_unix": 1755216001,
    "time_next_update_utc": "Fri, 15 Aug 2025 00:00:01 +0000",
    "base_code": "USD",
    "conversion_rates": {
        "USD": 1,
        "AED": 3.6725,
        "AFN": 68.3852,
        "ALL": 83.1866,
        "AMD": 383.8448,
        "ANG": 1.7900,
        "AOA": 921.2514,
        "ARS": 1318.0000,
        "AUD": 1.5270,
        "AWG": 1.7900,
        "AZN": 1.7018,
        "BAM": 1.6705,
        "BBD": 2.0000,
        "BDT": 121.5787,
        "BGN": 1.6705,
        "BHD": 0.3760,
        "BIF": 2986.7080,
        "BMD": 1.0000,
        "BND": 1.2802,
        "BOB": 6.9391,
        "BRL": 5.3958,
        "BSD": 1.0000,
        "BTN": 87.5059,
        "BWP": 13.6998,
        "BYN": 3.2206,
        "BZD": 2.0000,
        "CAD": 1.3759,
        "CDF": 2901.8388,
        "CHF": 0.8049,
        "CLP": 956.7127,
        "CNY": 7.1792,
        "COP": 4023.4234,
        "CRC": 506.4919,
        "CUP": 24.0000,
        "CVE": 94.1812,
        "CZK": 20.8854,
        "DJF": 177.7210,
        "DKK": 6.3727,
        "DOP": 61.2798,
        "DZD": 129.8688,
        "EGP": 48.3490,
        "ERN": 15.0000,
        "ETB": 140.0937,
        "EUR": 0.8541,
        "FJD": 2.2509,
        "FKP": 0.7370,
        "FOK": 6.3732,
        "GBP": 0.7369,
        "GEL": 2.7153,
        "GGP": 0.7370,
        "GHS": 10.9862,
        "GIP": 0.7370,
        "GMD": 72.9005,
        "GNF": 8694.6549,
        "GTQ": 7.6782,
        "GYD": 209.4176,
        "HKD": 7.8495,
        "HNL": 26.2691,
        "HRK": 6.4355,
        "HTG": 130.9590,
        "HUF": 337.4966,
        "IDR": 16145.0377,
        "ILS": 3.3852,
        "IMP": 0.7370,
        "INR": 87.5029,
        "IQD": 1311.7677,
        "IRR": 42264.5903,
        "ISK": 122.2386,
        "JEP": 0.7370,
        "JMD": 160.3226,
        "JOD": 0.7090,
        "JPY": 147.3049,
        "KES": 129.3222,
        "KGS": 87.3861,
        "KHR": 4014.5222,
        "KID": 1.5274,
        "KMF": 420.2069,
        "KRW": 1378.5267,
        "KWD": 0.3057,
        "KYD": 0.8333,
        "KZT": 538.6352,
        "LAK": 21708.9121,
        "LBP": 89500.0000,
        "LKR": 300.8980,
        "LRD": 200.9872,
        "LSL": 17.5103,
        "LYD": 5.4391,
        "MAD": 9.0131,
        "MDL": 16.7394,
        "MGA": 4408.0389,
        "MKD": 52.7981,
        "MMK": 2103.7130,
        "MNT": 3620.2344,
        "MOP": 8.0850,
        "MRU": 40.0574,
        "MUR": 45.4194,
        "MVR": 15.4663,
        "MWK": 1740.8943,
        "MXN": 18.6177,
        "MYR": 4.2096,
        "MZN": 63.7762,
        "NAD": 17.5103,
        "NGN": 1535.6098,
        "NIO": 36.8518,
        "NOK": 10.1901,
        "NPR": 140.0094,
        "NZD": 1.6724,
        "OMR": 0.3845,
        "PAB": 1.0000,
        "PEN": 3.5319,
        "PGK": 4.2138,
        "PHP": 56.6759,
        "PKR": 284.0499,
        "PLN": 3.6338,
        "PYG": 7490.2415,
        "QAR": 3.6400,
        "RON": 4.3207,
        "RSD": 100.0516,
        "RUB": 79.5943,
        "RWF": 1450.1997,
        "SAR": 3.7500,
        "SBD": 8.2927,
        "SCR": 14.7796,
        "SDG": 544.8150,
        "SEK": 9.5412,
        "SGD": 1.2802,
        "SHP": 0.7370,
        "SLE": 23.2343,
        "SLL": 23234.2856,
        "SOS": 572.2584,
        "SRD": 37.4988,
        "SSP": 4618.5475,
        "STN": 20.9263,
        "SYP": 12952.6192,
        "SZL": 17.5103,
        "THB": 32.2873,
        "TJS": 9.4428,
        "TMT": 3.5013,
        "TND": 2.8783,
        "TOP": 2.3600,
        "TRY": 40.7828,
        "TTD": 6.7771,
        "TVD": 1.5274,
        "TWD": 29.9325,
        "TZS": 2516.2265,
        "UAH": 41.5601,
        "UGX": 3549.8305,
        "UYU": 40.1019,
        "UZS": 12545.9758,
        "VES": 134.4812,
        "VND": 26184.3124,
        "VUV": 119.2691,
        "WST": 2.6782,
        "XAF": 560.2758,
        "XCD": 2.7000,
        "XCG": 1.7900,
        "XDR": 0.7288,
        "XOF": 560.2758,
        "XPF": 101.9256,
        "YER": 240.5831,
        "ZAR": 17.5101,
        "ZMW": 23.1003,
        "ZWL": 26.7662
    }
}

## Utilizamos el lenguaje de programación Java.
    Estamos utilizando Java:
        - Versión versión "17.0.6" 2025-01-21 LTS

    Creamos las siguientes clases:
        - Creando Clase: Principal
        - Creando Clase-Record: Monedas
        - Creando Clase: ConsultaMoneda
        - Creando Clase: ConvertirMoneda
        - Creando Librería Gson: Gson (gson-2.10.1.jar) para convertir objetos Java a JSON(Formato de texto ligero para almacenar y transportar datos) de ExchangeRate-API.

    Creamos el siguiente menú para el conversor de monedas.
        "Bienvenido/a al Conversor de Moneda.\n\n"+
        "Ingrese la conversión que deseas realizar.\n\n"+
        "1.- Dólar => Peso Mexicano\n"+
        "2.- PPeso Mexicano => Dolar\n"+
        "3.- Dólar => Peso Argentino\n"+
        "4.- Peso Argentino => Dólar\n"+
        "5.- Dólar => Real Brasileño\n"+
        "6.- Real Brasileño => Dólar\n"+
        "7.- Dólar => Peso Colombiano\n"+
        "8.- Peso Colombiano => Dólar\n"+
        "9.- Convertir otra moneda => Dólar\n"+
        "10.- Salir");

    Ejemplo01: Ejecución de nuestra aplicación de la conversión de 1 moneda elegida en el según menú de opciones.
        Elija una Opción :
        1
        La conversion para hoy de: [USD] equivale a 18.6177 [MXN]
        Ingrese el valor que desea convertir USD
        1
        El valor 1.0 [USD] corresponde al valor final de 18.6177 [MXN]
        ************************************

    Ejemplo02: Ejecución de nuestra aplicación de la conversión de 1 moneda, en la opción 7 ingresando la moneda que deseo que deseo convertirlo.
        Elija una Opción :
        9
        Ingrese el código de la moneda Base
        eur
        Ingrese la moneda objetivo: 
        usd
        La conversion para hoy de: [EUR] equivale a 1.1708 [USD]
        Ingrese el valor que desea convertir EUR
        1
        El valor 1.0 [EUR] corresponde al valor final de 1.1708 [USD]

## Utilizamos GitHub.
    Utilizamos el GitHub para alojar y compartir nuestro código.  https://github.com/LuisHernandez20/challengerConversorDeMonedas.git

