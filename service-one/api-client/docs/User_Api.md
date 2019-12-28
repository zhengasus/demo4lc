# User_Api

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUserUsingGET**](User_Api.md#getUserUsingGET) | **GET** /api/v1/user/{id} | 根据id查用户


<a name="getUserUsingGET"></a>
# **getUserUsingGET**
> Dto getUserUsingGET(id)

根据id查用户

### Example
```java
// Import classes:
//import com.example.service_one.client.invoker.ApiException;
//import com.example.service_one.client.api.User_Api;


User_Api apiInstance = new User_Api();
String id = "id_example"; // String | 用户id
try {
    Dto result = apiInstance.getUserUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling User_Api#getUserUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| 用户id |

### Return type

[**Dto**](Dto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

