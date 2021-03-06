/*
 * Training Menu API
 * A simple menu for exercise
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.InlineObject;
import org.openapitools.client.model.InlineResponse200;
import org.openapitools.client.model.InlineResponse2001;
import org.openapitools.client.model.InlineResponse400;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * 
     *
     * Return a list of training plans
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void plansGetTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        List<InlineResponse200> response = api.plansGet(limit, offset);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get information about the plan registerd by the described planner
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void plansPlannerNameGetTest() throws ApiException {
        String plannerName = null;
        List<InlineResponse2001> response = api.plansPlannerNameGet(plannerName);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Register a new plan
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void plansPostTest() throws ApiException {
        InlineObject inlineObject = null;
        api.plansPost(inlineObject);

        // TODO: test validations
    }
    
}
