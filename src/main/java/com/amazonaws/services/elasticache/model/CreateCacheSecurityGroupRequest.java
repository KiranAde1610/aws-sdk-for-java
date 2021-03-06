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
package com.amazonaws.services.elasticache.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#createCacheSecurityGroup(CreateCacheSecurityGroupRequest) CreateCacheSecurityGroup operation}.
 * <p>
 * Creates a new Cache Security Group. Cache Security groups control
 * access to one or more Cache Clusters.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#createCacheSecurityGroup(CreateCacheSecurityGroupRequest)
 */
public class CreateCacheSecurityGroupRequest extends AmazonWebServiceRequest {

    /**
     * The name for the Cache Security Group. This value is stored as a
     * lowercase string. <p>Constraints: Must contain no more than 255
     * alphanumeric characters. Must not be "Default". <p>Example:
     * <code>mysecuritygroup</code>
     */
    private String cacheSecurityGroupName;

    /**
     * The description for the Cache Security Group.
     */
    private String description;

    /**
     * Default constructor for a new CreateCacheSecurityGroupRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateCacheSecurityGroupRequest() {}
    
    /**
     * Constructs a new CreateCacheSecurityGroupRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param cacheSecurityGroupName The name for the Cache Security Group.
     * This value is stored as a lowercase string. <p>Constraints: Must
     * contain no more than 255 alphanumeric characters. Must not be
     * "Default". <p>Example: <code>mysecuritygroup</code>
     * @param description The description for the Cache Security Group.
     */
    public CreateCacheSecurityGroupRequest(String cacheSecurityGroupName, String description) {
        this.cacheSecurityGroupName = cacheSecurityGroupName;
        this.description = description;
    }
    
    /**
     * The name for the Cache Security Group. This value is stored as a
     * lowercase string. <p>Constraints: Must contain no more than 255
     * alphanumeric characters. Must not be "Default". <p>Example:
     * <code>mysecuritygroup</code>
     *
     * @return The name for the Cache Security Group. This value is stored as a
     *         lowercase string. <p>Constraints: Must contain no more than 255
     *         alphanumeric characters. Must not be "Default". <p>Example:
     *         <code>mysecuritygroup</code>
     */
    public String getCacheSecurityGroupName() {
        return cacheSecurityGroupName;
    }
    
    /**
     * The name for the Cache Security Group. This value is stored as a
     * lowercase string. <p>Constraints: Must contain no more than 255
     * alphanumeric characters. Must not be "Default". <p>Example:
     * <code>mysecuritygroup</code>
     *
     * @param cacheSecurityGroupName The name for the Cache Security Group. This value is stored as a
     *         lowercase string. <p>Constraints: Must contain no more than 255
     *         alphanumeric characters. Must not be "Default". <p>Example:
     *         <code>mysecuritygroup</code>
     */
    public void setCacheSecurityGroupName(String cacheSecurityGroupName) {
        this.cacheSecurityGroupName = cacheSecurityGroupName;
    }
    
    /**
     * The name for the Cache Security Group. This value is stored as a
     * lowercase string. <p>Constraints: Must contain no more than 255
     * alphanumeric characters. Must not be "Default". <p>Example:
     * <code>mysecuritygroup</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSecurityGroupName The name for the Cache Security Group. This value is stored as a
     *         lowercase string. <p>Constraints: Must contain no more than 255
     *         alphanumeric characters. Must not be "Default". <p>Example:
     *         <code>mysecuritygroup</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateCacheSecurityGroupRequest withCacheSecurityGroupName(String cacheSecurityGroupName) {
        this.cacheSecurityGroupName = cacheSecurityGroupName;
        return this;
    }
    
    
    /**
     * The description for the Cache Security Group.
     *
     * @return The description for the Cache Security Group.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description for the Cache Security Group.
     *
     * @param description The description for the Cache Security Group.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description for the Cache Security Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The description for the Cache Security Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateCacheSecurityGroupRequest withDescription(String description) {
        this.description = description;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("CacheSecurityGroupName: " + cacheSecurityGroupName + ", ");
        sb.append("Description: " + description + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    