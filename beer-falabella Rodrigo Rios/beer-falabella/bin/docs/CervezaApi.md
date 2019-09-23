# CervezaApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addBeers**](CervezaApi.md#addBeers) | **POST** /beers | Ingresa una nueva cerveza
[**boxBeerPriceById**](CervezaApi.md#boxBeerPriceById) | **GET** /beers/{beerID}/boxprice | Lista el precio de una caja de cervezas de una marca
[**searchBeerById**](CervezaApi.md#searchBeerById) | **GET** /beers/{beerID} | Lista el detalle de la marca de cervezas
[**searchBeers**](CervezaApi.md#searchBeers) | **GET** /beers | Lista todas las cervezas

<a name="addBeers"></a>
# **addBeers**
> addBeers(body)

Ingresa una nueva cerveza

Ingresa una nueva cerveza

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CervezaApi;


CervezaApi apiInstance = new CervezaApi();
BeerItem body = new BeerItem(); // BeerItem | Ingresa una nueva cerveza
try {
    apiInstance.addBeers(body);
} catch (ApiException e) {
    System.err.println("Exception when calling CervezaApi#addBeers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BeerItem**](BeerItem.md)| Ingresa una nueva cerveza | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="boxBeerPriceById"></a>
# **boxBeerPriceById**
> boxBeerPriceById(beerID, currency, quantity)

Lista el precio de una caja de cervezas de una marca

Obtiene el precio de una caja de cerveza por su Id 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CervezaApi;


CervezaApi apiInstance = new CervezaApi();
Integer beerID = 56; // Integer | Busca una cerveza por su Id
String currency = "currency_example"; // String | Tipo de moneda con la que pagará
Integer quantity = 56; // Integer | La cantidad de cervezas a comprar
try {
    apiInstance.boxBeerPriceById(beerID, currency, quantity);
} catch (ApiException e) {
    System.err.println("Exception when calling CervezaApi#boxBeerPriceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **beerID** | **Integer**| Busca una cerveza por su Id |
 **currency** | **String**| Tipo de moneda con la que pagará | [optional]
 **quantity** | **Integer**| La cantidad de cervezas a comprar | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchBeerById"></a>
# **searchBeerById**
> searchBeerById(beerID)

Lista el detalle de la marca de cervezas

Busca una cerveza por su Id 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CervezaApi;


CervezaApi apiInstance = new CervezaApi();
Integer beerID = 56; // Integer | Busca una cerveza por su Id
try {
    apiInstance.searchBeerById(beerID);
} catch (ApiException e) {
    System.err.println("Exception when calling CervezaApi#searchBeerById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **beerID** | **Integer**| Busca una cerveza por su Id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchBeers"></a>
# **searchBeers**
> List&lt;BeerItem&gt; searchBeers()

Lista todas las cervezas

Lista todas las cervezas que se encuentran en la base de datos

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CervezaApi;


CervezaApi apiInstance = new CervezaApi();
try {
    List<BeerItem> result = apiInstance.searchBeers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CervezaApi#searchBeers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;BeerItem&gt;**](BeerItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

