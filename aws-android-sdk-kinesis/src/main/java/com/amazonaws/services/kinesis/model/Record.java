/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesis.model;

import java.io.Serializable;

/**
 * <p>
 * The unit of data of the Amazon Kinesis stream, which is composed of a
 * sequence number, a partition key, and a data blob.
 * </p>
 */
public class Record implements Serializable {

    /**
     * The unique identifier of the record in the stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     */
    private String sequenceNumber;

    /**
     * The approximate time that the record was inserted into the stream.
     */
    private java.util.Date approximateArrivalTimestamp;

    /**
     * The data blob. The data in the blob is both opaque and immutable to
     * the Amazon Kinesis service, which does not inspect, interpret, or
     * change the data in the blob in any way. When the data blob (the
     * payload before base64-encoding) is added to the partition key size,
     * the total size must not exceed the maximum record size (1 MB).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1048576<br/>
     */
    private java.nio.ByteBuffer data;

    /**
     * Identifies which shard in the stream the data record is assigned to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String partitionKey;

    /**
     * The unique identifier of the record in the stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     *
     * @return The unique identifier of the record in the stream.
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }
    
    /**
     * The unique identifier of the record in the stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     *
     * @param sequenceNumber The unique identifier of the record in the stream.
     */
    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }
    
    /**
     * The unique identifier of the record in the stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>0|([1-9]\d{0,128})<br/>
     *
     * @param sequenceNumber The unique identifier of the record in the stream.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Record withSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     * The approximate time that the record was inserted into the stream.
     *
     * @return The approximate time that the record was inserted into the stream.
     */
    public java.util.Date getApproximateArrivalTimestamp() {
        return approximateArrivalTimestamp;
    }
    
    /**
     * The approximate time that the record was inserted into the stream.
     *
     * @param approximateArrivalTimestamp The approximate time that the record was inserted into the stream.
     */
    public void setApproximateArrivalTimestamp(java.util.Date approximateArrivalTimestamp) {
        this.approximateArrivalTimestamp = approximateArrivalTimestamp;
    }
    
    /**
     * The approximate time that the record was inserted into the stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param approximateArrivalTimestamp The approximate time that the record was inserted into the stream.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Record withApproximateArrivalTimestamp(java.util.Date approximateArrivalTimestamp) {
        this.approximateArrivalTimestamp = approximateArrivalTimestamp;
        return this;
    }

    /**
     * The data blob. The data in the blob is both opaque and immutable to
     * the Amazon Kinesis service, which does not inspect, interpret, or
     * change the data in the blob in any way. When the data blob (the
     * payload before base64-encoding) is added to the partition key size,
     * the total size must not exceed the maximum record size (1 MB).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1048576<br/>
     *
     * @return The data blob. The data in the blob is both opaque and immutable to
     *         the Amazon Kinesis service, which does not inspect, interpret, or
     *         change the data in the blob in any way. When the data blob (the
     *         payload before base64-encoding) is added to the partition key size,
     *         the total size must not exceed the maximum record size (1 MB).
     */
    public java.nio.ByteBuffer getData() {
        return data;
    }
    
    /**
     * The data blob. The data in the blob is both opaque and immutable to
     * the Amazon Kinesis service, which does not inspect, interpret, or
     * change the data in the blob in any way. When the data blob (the
     * payload before base64-encoding) is added to the partition key size,
     * the total size must not exceed the maximum record size (1 MB).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1048576<br/>
     *
     * @param data The data blob. The data in the blob is both opaque and immutable to
     *         the Amazon Kinesis service, which does not inspect, interpret, or
     *         change the data in the blob in any way. When the data blob (the
     *         payload before base64-encoding) is added to the partition key size,
     *         the total size must not exceed the maximum record size (1 MB).
     */
    public void setData(java.nio.ByteBuffer data) {
        this.data = data;
    }
    
    /**
     * The data blob. The data in the blob is both opaque and immutable to
     * the Amazon Kinesis service, which does not inspect, interpret, or
     * change the data in the blob in any way. When the data blob (the
     * payload before base64-encoding) is added to the partition key size,
     * the total size must not exceed the maximum record size (1 MB).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1048576<br/>
     *
     * @param data The data blob. The data in the blob is both opaque and immutable to
     *         the Amazon Kinesis service, which does not inspect, interpret, or
     *         change the data in the blob in any way. When the data blob (the
     *         payload before base64-encoding) is added to the partition key size,
     *         the total size must not exceed the maximum record size (1 MB).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Record withData(java.nio.ByteBuffer data) {
        this.data = data;
        return this;
    }

    /**
     * Identifies which shard in the stream the data record is assigned to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return Identifies which shard in the stream the data record is assigned to.
     */
    public String getPartitionKey() {
        return partitionKey;
    }
    
    /**
     * Identifies which shard in the stream the data record is assigned to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param partitionKey Identifies which shard in the stream the data record is assigned to.
     */
    public void setPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
    }
    
    /**
     * Identifies which shard in the stream the data record is assigned to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param partitionKey Identifies which shard in the stream the data record is assigned to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Record withPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
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
        if (getSequenceNumber() != null) sb.append("SequenceNumber: " + getSequenceNumber() + ",");
        if (getApproximateArrivalTimestamp() != null) sb.append("ApproximateArrivalTimestamp: " + getApproximateArrivalTimestamp() + ",");
        if (getData() != null) sb.append("Data: " + getData() + ",");
        if (getPartitionKey() != null) sb.append("PartitionKey: " + getPartitionKey() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSequenceNumber() == null) ? 0 : getSequenceNumber().hashCode()); 
        hashCode = prime * hashCode + ((getApproximateArrivalTimestamp() == null) ? 0 : getApproximateArrivalTimestamp().hashCode()); 
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode()); 
        hashCode = prime * hashCode + ((getPartitionKey() == null) ? 0 : getPartitionKey().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Record == false) return false;
        Record other = (Record)obj;
        
        if (other.getSequenceNumber() == null ^ this.getSequenceNumber() == null) return false;
        if (other.getSequenceNumber() != null && other.getSequenceNumber().equals(this.getSequenceNumber()) == false) return false; 
        if (other.getApproximateArrivalTimestamp() == null ^ this.getApproximateArrivalTimestamp() == null) return false;
        if (other.getApproximateArrivalTimestamp() != null && other.getApproximateArrivalTimestamp().equals(this.getApproximateArrivalTimestamp()) == false) return false; 
        if (other.getData() == null ^ this.getData() == null) return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false) return false; 
        if (other.getPartitionKey() == null ^ this.getPartitionKey() == null) return false;
        if (other.getPartitionKey() != null && other.getPartitionKey().equals(this.getPartitionKey()) == false) return false; 
        return true;
    }
    
}
    