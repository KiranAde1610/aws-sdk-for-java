/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Replace Route Request Marshaller
 */
public class ReplaceRouteRequestMarshaller implements Marshaller<Request<ReplaceRouteRequest>, ReplaceRouteRequest> {

    public Request<ReplaceRouteRequest> marshall(ReplaceRouteRequest replaceRouteRequest) {
        Request<ReplaceRouteRequest> request = new DefaultRequest<ReplaceRouteRequest>(replaceRouteRequest, "AmazonEC2");
        request.addParameter("Action", "ReplaceRoute");
        request.addParameter("Version", "2011-05-15");
        if (replaceRouteRequest != null) {
            if (replaceRouteRequest.getRouteTableId() != null) {
                request.addParameter("RouteTableId", StringUtils.fromString(replaceRouteRequest.getRouteTableId()));
            }
        }
        if (replaceRouteRequest != null) {
            if (replaceRouteRequest.getDestinationCidrBlock() != null) {
                request.addParameter("DestinationCidrBlock", StringUtils.fromString(replaceRouteRequest.getDestinationCidrBlock()));
            }
        }
        if (replaceRouteRequest != null) {
            if (replaceRouteRequest.getGatewayId() != null) {
                request.addParameter("GatewayId", StringUtils.fromString(replaceRouteRequest.getGatewayId()));
            }
        }
        if (replaceRouteRequest != null) {
            if (replaceRouteRequest.getInstanceId() != null) {
                request.addParameter("InstanceId", StringUtils.fromString(replaceRouteRequest.getInstanceId()));
            }
        }


        return request;
    }
}
