# DefaultApi

All URIs are relative to *http://localhost/training/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**plansGet**](DefaultApi.md#plansGet) | **GET** /plans | 
[**plansPlannerNameGet**](DefaultApi.md#plansPlannerNameGet) | **GET** /plans/{planner_name} | 
[**plansPost**](DefaultApi.md#plansPost) | **POST** /plans | 


<a name="plansGet"></a>
# **plansGet**
> List&lt;InlineResponse200&gt; plansGet(limit, offset)



Return a list of training plans

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/training/v1");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Integer limit = 56; // Integer | Limit the number of plans on a page
    Integer offset = 56; // Integer | Specifies the page number of the plans to be displayed
    try {
      List<InlineResponse200> result = apiInstance.plansGet(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#plansGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limit the number of plans on a page | [optional]
 **offset** | **Integer**| Specifies the page number of the plans to be displayed | [optional]

### Return type

[**List&lt;InlineResponse200&gt;**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully returned a list of traning plans |  -  |
**400** | Invalid request |  -  |

<a name="plansPlannerNameGet"></a>
# **plansPlannerNameGet**
> List&lt;InlineResponse2001&gt; plansPlannerNameGet(plannerName)



Get information about the plan registerd by the described planner

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/training/v1");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String plannerName = "plannerName_example"; // String | 
    try {
      List<InlineResponse2001> result = apiInstance.plansPlannerNameGet(plannerName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#plansPlannerNameGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **plannerName** | **String**|  |

### Return type

[**List&lt;InlineResponse2001&gt;**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully returned a list of training plans |  -  |
**400** | Invalid request |  -  |

<a name="plansPost"></a>
# **plansPost**
> plansPost(inlineObject)



Register a new plan

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/training/v1");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    InlineObject inlineObject = new InlineObject(); // InlineObject | 
    try {
      apiInstance.plansPost(inlineObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#plansPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inlineObject** | [**InlineObject**](InlineObject.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully Registered a new trainning plan |  -  |
**400** | Invalid Request |  -  |

