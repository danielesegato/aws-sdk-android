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
package com.amazonaws.services.dynamodbv2;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.dynamodbv2.model.*;

/**
 * Interface for accessing AmazonDynamoDBv2.
 * Amazon DynamoDB <p>
 * This is the Amazon DynamoDB API Reference. This guide provides
 * descriptions of the low-level DynamoDB API.
 * </p>
 * <p>
 * This guide is intended for use with the following DynamoDB
 * documentation:
 * </p>
 * 
 * <ul>
 * <li> <p>
 * 
 * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/gettingstartedguide/"> Amazon DynamoDB Getting Started Guide </a>
 * - provides hands-on exercises that help you learn the basics of
 * working with DynamoDB. <i>If you are new to DynamoDB, we recommend
 * that you begin with the Getting Started Guide.</i>
 * </p>
 * </li>
 * <li> <p>
 * 
 * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/"> Amazon DynamoDB Developer Guide </a>
 * - contains detailed information about DynamoDB concepts, usage, and
 * best practices.
 * </p>
 * </li>
 * <li> <p>
 * 
 * <a href="http://docs.aws.amazon.com/dynamodbstreams/latest/APIReference/"> Amazon DynamoDB Streams API Reference </a> - provides descriptions and samples of the DynamoDB Streams API. (For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Streams.html"> Capturing Table Activity with DynamoDB Streams </a>
 * in the Amazon DynamoDB Developer Guide.)
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * Instead of making the requests to the low-level DynamoDB API directly
 * from your application, we recommend that you use the AWS Software
 * Development Kits (SDKs). The easy-to-use libraries in the AWS SDKs
 * make it unnecessary to call the low-level DynamoDB API directly from
 * your application. The libraries take care of request authentication,
 * serialization, and connection management. For more information, see
 * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/UsingAWSSDK.html"> Using the AWS SDKs with DynamoDB </a>
 * in the Amazon DynamoDB Developer Guide.
 * </p>
 * <p>
 * If you decide to code against the low-level DynamoDB API directly, you
 * will need to write the necessary code to authenticate your requests.
 * For more information on signing your requests, see
 * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/API.html"> Using the DynamoDB API </a>
 * in the <i>Amazon DynamoDB Developer Guide</i> .
 * </p>
 * <p>
 * The following are short descriptions of each low-level API action,
 * organized by function.
 * </p>
 * <p>
 * <b>Managing Tables</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * <i>CreateTable</i> - Creates a table with user-specified provisioned
 * throughput settings. You must define a primary key for the table -
 * either a simple primary key (partition key), or a composite primary
 * key (partition key and sort key). Optionally, you can create one or
 * more secondary indexes, which provide fast data access using non-key
 * attributes.
 * </p>
 * </li>
 * <li> <p>
 * <i>DescribeTable</i> - Returns metadata for a table, such as table
 * size, status, and index information.
 * </p>
 * </li>
 * <li> <p>
 * <i>UpdateTable</i> - Modifies the provisioned throughput settings for
 * a table. Optionally, you can modify the provisioned throughput
 * settings for global secondary indexes on the table.
 * </p>
 * </li>
 * <li> <p>
 * <i>ListTables</i> - Returns a list of all tables associated with the
 * current AWS account and endpoint.
 * </p>
 * </li>
 * <li> <p>
 * <i>DeleteTable</i> - Deletes a table and all of its indexes.
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * For conceptual information about managing tables, see
 * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html"> Working with Tables </a>
 * in the <i>Amazon DynamoDB Developer Guide</i> .
 * </p>
 * <p>
 * <b>Reading Data</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * <i>GetItem</i> - Returns a set of attributes for the item that has a
 * given primary key. By default, <i>GetItem</i> performs an eventually
 * consistent read; however, applications can request a strongly
 * consistent read instead.
 * </p>
 * </li>
 * <li> <p>
 * <i>BatchGetItem</i> - Performs multiple <i>GetItem</i> requests for
 * data items using their primary keys, from one table or multiple
 * tables. The response from <i>BatchGetItem</i> has a size limit of 16
 * MB and returns a maximum of 100 items. Both eventually consistent and
 * strongly consistent reads can be used.
 * </p>
 * </li>
 * <li> <p>
 * <i>Query</i> - Returns one or more items from a table or a secondary
 * index. You must provide a specific value for the partition key. You
 * can narrow the scope of the query using comparison operators against a
 * sort key value, or on the index key. <i>Query</i> supports either
 * eventual or strong consistency. A single response has a size limit of
 * 1 MB.
 * </p>
 * </li>
 * <li> <p>
 * <i>Scan</i> - Reads every item in a table; the result set is
 * eventually consistent. You can limit the number of items returned by
 * filtering the data attributes, using conditional expressions.
 * <i>Scan</i> can be used to enable ad-hoc querying of a table against
 * non-key attributes; however, since this is a full table scan without
 * using an index, <i>Scan</i> should not be used for any application
 * query use case that requires predictable performance.
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * For conceptual information about reading data, see
 * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html"> Working with Items </a> and <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html"> Query and Scan Operations </a>
 * in the <i>Amazon DynamoDB Developer Guide</i> .
 * </p>
 * <p>
 * <b>Modifying Data</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * <i>PutItem</i> - Creates a new item, or replaces an existing item
 * with a new item (including all the attributes). By default, if an item
 * in the table already exists with the same primary key, the new item
 * completely replaces the existing item. You can use conditional
 * operators to replace an item only if its attribute values match
 * certain conditions, or to insert a new item only if that item doesn't
 * already exist.
 * </p>
 * </li>
 * <li> <p>
 * <i>UpdateItem</i> - Modifies the attributes of an existing item. You
 * can also use conditional operators to perform an update only if the
 * item's attribute values match certain conditions.
 * </p>
 * </li>
 * <li> <p>
 * <i>DeleteItem</i> - Deletes an item in a table by primary key. You
 * can use conditional operators to perform a delete an item only if the
 * item's attribute values match certain conditions.
 * </p>
 * </li>
 * <li> <p>
 * <i>BatchWriteItem</i> - Performs multiple <i>PutItem</i> and
 * <i>DeleteItem</i> requests across multiple tables in a single request.
 * A failure of any request(s) in the batch will not cause the entire
 * <i>BatchWriteItem</i> operation to fail. Supports batches of up to 25
 * items to put or delete, with a maximum total request size of 16 MB.
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * For conceptual information about modifying data, see
 * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html"> Working with Items </a> and <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html"> Query and Scan Operations </a>
 * in the <i>Amazon DynamoDB Developer Guide</i> .
 * </p>
 */
public interface AmazonDynamoDB {

    /**
     * Overrides the default endpoint for this client ("http://dynamodb.us-east-1.amazonaws.com/").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "dynamodb.us-east-1.amazonaws.com/") or a full
     * URL, including the protocol (ex: "http://dynamodb.us-east-1.amazonaws.com/"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *            The endpoint (ex: "dynamodb.us-east-1.amazonaws.com/") or a full URL,
     *            including the protocol (ex: "http://dynamodb.us-east-1.amazonaws.com/") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonDynamoDB#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *            The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't
     *             available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;
    
    /**
     * <p>
     * The <i>Scan</i> operation returns one or more items and item
     * attributes by accessing every item in a table or a secondary index. To
     * have DynamoDB return fewer items, you can provide a <i>ScanFilter</i>
     * operation.
     * </p>
     * <p>
     * If the total number of scanned items exceeds the maximum data set
     * size limit of 1 MB, the scan stops and results are returned to the
     * user as a <i>LastEvaluatedKey</i> value to continue the scan in a
     * subsequent operation. The results also include the number of items
     * exceeding the limit. A scan can result in no table data meeting the
     * filter criteria.
     * </p>
     * <p>
     * By default, <i>Scan</i> operations proceed sequentially; however, for
     * faster performance on a large table or secondary index, applications
     * can request a parallel <i>Scan</i> operation by providing the
     * <i>Segment</i> and <i>TotalSegments</i> parameters. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#QueryAndScanParallelScan"> Parallel Scan </a>
     * in the <i>Amazon DynamoDB Developer Guide</i> .
     * </p>
     * <p>
     * By default, <i>Scan</i> uses eventually consistent reads when
     * accessing the data in a table; therefore, the result set might not
     * include the changes to data in the table immediately before the
     * operation began. If you need a consistent copy of the data, as of the
     * time that the Scan begins, you can set the <i>ConsistentRead</i>
     * parameter to <i>true</i> .
     * </p>
     *
     * @param scanRequest Container for the necessary parameters to execute
     *           the Scan service method on AmazonDynamoDBv2.
     * 
     * @return The response from the Scan service method, as returned by
     *         AmazonDynamoDBv2.
     * 
     * @throws ResourceNotFoundException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ScanResult scan(ScanRequest scanRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the provisioned throughput settings, global secondary
     * indexes, or DynamoDB Streams settings for a given table.
     * </p>
     * <p>
     * You can only perform one of the following operations at once:
     * </p>
     * 
     * <ul>
     * <li> <p>
     * Modify the provisioned throughput settings of the table.
     * </p>
     * </li>
     * <li> <p>
     * Enable or disable Streams on the table.
     * </p>
     * </li>
     * <li> <p>
     * Remove a global secondary index from the table.
     * </p>
     * </li>
     * <li> <p>
     * Create a new global secondary index on the table. Once the index
     * begins backfilling, you can use <i>UpdateTable</i> to perform other
     * operations.
     * </p>
     * </li>
     * 
     * </ul>
     * <p>
     * <i>UpdateTable</i> is an asynchronous operation; while it is
     * executing, the table status changes from <code>ACTIVE</code> to
     * <code>UPDATING</code> . While it is <code>UPDATING</code> , you cannot
     * issue another <i>UpdateTable</i> request. When the table returns to
     * the <code>ACTIVE</code> state, the <i>UpdateTable</i> operation is
     * complete.
     * </p>
     *
     * @param updateTableRequest Container for the necessary parameters to
     *           execute the UpdateTable service method on AmazonDynamoDBv2.
     * 
     * @return The response from the UpdateTable service method, as returned
     *         by AmazonDynamoDBv2.
     * 
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateTableResult updateTable(UpdateTableRequest updateTableRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>DeleteTable</i> operation deletes a table and all of its
     * items. After a <i>DeleteTable</i> request, the specified table is in
     * the <code>DELETING</code> state until DynamoDB completes the deletion.
     * If the table is in the <code>ACTIVE</code> state, you can delete it.
     * If a table is in <code>CREATING</code> or <code>UPDATING</code>
     * states, then DynamoDB returns a <i>ResourceInUseException</i> . If the
     * specified table does not exist, DynamoDB returns a
     * <i>ResourceNotFoundException</i> . If table is already in the
     * <code>DELETING</code> state, no error is returned.
     * </p>
     * <p>
     * <b>NOTE:</b> DynamoDB might continue to accept data read and write
     * operations, such as GetItem and PutItem, on a table in the DELETING
     * state until the table deletion is complete.
     * </p>
     * <p>
     * When you delete a table, any indexes on that table are also deleted.
     * </p>
     * <p>
     * If you have DynamoDB Streams enabled on the table, then the
     * corresponding stream on that table goes into the <code>DISABLED</code>
     * state, and the stream is automatically deleted after 24 hours.
     * </p>
     * <p>
     * Use the <i>DescribeTable</i> API to check the status of the table.
     * </p>
     *
     * @param deleteTableRequest Container for the necessary parameters to
     *           execute the DeleteTable service method on AmazonDynamoDBv2.
     * 
     * @return The response from the DeleteTable service method, as returned
     *         by AmazonDynamoDBv2.
     * 
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteTableResult deleteTable(DeleteTableRequest deleteTableRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>BatchWriteItem</i> operation puts or deletes multiple items in
     * one or more tables. A single call to <i>BatchWriteItem</i> can write
     * up to 16 MB of data, which can comprise as many as 25 put or delete
     * requests. Individual items to be written can be as large as 400 KB.
     * </p>
     * <p>
     * <b>NOTE:</b> BatchWriteItem cannot update items. To update items, use
     * the UpdateItem API.
     * </p>
     * <p>
     * The individual <i>PutItem</i> and <i>DeleteItem</i> operations
     * specified in <i>BatchWriteItem</i> are atomic; however
     * <i>BatchWriteItem</i> as a whole is not. If any requested operations
     * fail because the table's provisioned throughput is exceeded or an
     * internal processing failure occurs, the failed operations are returned
     * in the <i>UnprocessedItems</i> response parameter. You can investigate
     * and optionally resend the requests. Typically, you would call
     * <i>BatchWriteItem</i> in a loop. Each iteration would check for
     * unprocessed items and submit a new <i>BatchWriteItem</i> request with
     * those unprocessed items until all items have been processed.
     * </p>
     * <p>
     * Note that if <i>none</i> of the items can be processed due to
     * insufficient provisioned throughput on all of the tables in the
     * request, then <i>BatchWriteItem</i> will return a
     * <i>ProvisionedThroughputExceededException</i> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b> If DynamoDB returns any unprocessed items, you
     * should retry the batch operation on those items. However, we strongly
     * recommend that you use an exponential backoff algorithm. If you retry
     * the batch operation immediately, the underlying read or write requests
     * can still fail due to throttling on the individual tables. If you
     * delay the batch operation using exponential backoff, the individual
     * requests in the batch are much more likely to succeed. For more
     * information, see Batch Operations and Error Handling in the Amazon
     * DynamoDB Developer Guide.
     * </p>
     * <p>
     * With <i>BatchWriteItem</i> , you can efficiently write or delete
     * large amounts of data, such as from Amazon Elastic MapReduce (EMR), or
     * copy data from another database into DynamoDB. In order to improve
     * performance with these large-scale operations, <i>BatchWriteItem</i>
     * does not behave in the same way as individual <i>PutItem</i> and
     * <i>DeleteItem</i> calls would. For example, you cannot specify
     * conditions on individual put and delete requests, and
     * <i>BatchWriteItem</i> does not return deleted items in the response.
     * </p>
     * <p>
     * If you use a programming language that supports concurrency, you can
     * use threads to write items in parallel. Your application must include
     * the necessary logic to manage the threads. With languages that don't
     * support threading, you must update or delete the specified items one
     * at a time. In both situations, <i>BatchWriteItem</i> provides an
     * alternative where the API performs the specified put and delete
     * operations in parallel, giving you the power of the thread pool
     * approach without having to introduce complexity into your application.
     * </p>
     * <p>
     * Parallel processing reduces latency, but each specified put and
     * delete request consumes the same number of write capacity units
     * whether it is processed in parallel or not. Delete operations on
     * nonexistent items consume one write capacity unit.
     * </p>
     * <p>
     * If one or more of the following is true, DynamoDB rejects the entire
     * batch write operation:
     * </p>
     * 
     * <ul>
     * <li> <p>
     * One or more tables specified in the <i>BatchWriteItem</i> request
     * does not exist.
     * </p>
     * </li>
     * <li> <p>
     * Primary key attributes specified on an item in the request do not
     * match those in the corresponding table's primary key schema.
     * </p>
     * </li>
     * <li> <p>
     * You try to perform multiple operations on the same item in the same
     * <i>BatchWriteItem</i> request. For example, you cannot put and delete
     * the same item in the same <i>BatchWriteItem</i> request.
     * </p>
     * </li>
     * <li> <p>
     * There are more than 25 requests in the batch.
     * </p>
     * </li>
     * <li> <p>
     * Any individual item in a batch exceeds 400 KB.
     * </p>
     * </li>
     * <li> <p>
     * The total request size exceeds 16 MB.
     * </p>
     * </li>
     * 
     * </ul>
     *
     * @param batchWriteItemRequest Container for the necessary parameters to
     *           execute the BatchWriteItem service method on AmazonDynamoDBv2.
     * 
     * @return The response from the BatchWriteItem service method, as
     *         returned by AmazonDynamoDBv2.
     * 
     * @throws ItemCollectionSizeLimitExceededException
     * @throws ResourceNotFoundException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public BatchWriteItemResult batchWriteItem(BatchWriteItemRequest batchWriteItemRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about the table, including the current status of
     * the table, when it was created, the primary key schema, and any
     * indexes on the table.
     * </p>
     * <p>
     * <b>NOTE:</b> If you issue a DescribeTable request immediately after a
     * CreateTable request, DynamoDB might return a
     * ResourceNotFoundException. This is because DescribeTable uses an
     * eventually consistent query, and the metadata for your table might not
     * be available at that moment. Wait for a few seconds, and then try the
     * DescribeTable request again.
     * </p>
     *
     * @param describeTableRequest Container for the necessary parameters to
     *           execute the DescribeTable service method on AmazonDynamoDBv2.
     * 
     * @return The response from the DescribeTable service method, as
     *         returned by AmazonDynamoDBv2.
     * 
     * @throws ResourceNotFoundException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTableResult describeTable(DescribeTableRequest describeTableRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>GetItem</i> operation returns a set of attributes for the item
     * with the given primary key. If there is no matching item,
     * <i>GetItem</i> does not return any data.
     * </p>
     * <p>
     * <i>GetItem</i> provides an eventually consistent read by default. If
     * your application requires a strongly consistent read, set
     * <i>ConsistentRead</i> to <code>true</code> . Although a strongly
     * consistent read might take more time than an eventually consistent
     * read, it always returns the last updated value.
     * </p>
     *
     * @param getItemRequest Container for the necessary parameters to
     *           execute the GetItem service method on AmazonDynamoDBv2.
     * 
     * @return The response from the GetItem service method, as returned by
     *         AmazonDynamoDBv2.
     * 
     * @throws ResourceNotFoundException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetItemResult getItem(GetItemRequest getItemRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Edits an existing item's attributes, or adds a new item to the table
     * if it does not already exist. You can put, delete, or add attribute
     * values. You can also perform a conditional update on an existing item
     * (insert a new attribute name-value pair if it doesn't exist, or
     * replace an existing name-value pair if it has certain expected
     * attribute values).
     * </p>
     * <p>
     * You can also return the item's attribute values in the same
     * <i>UpdateItem</i> operation using the <i>ReturnValues</i> parameter.
     * </p>
     *
     * @param updateItemRequest Container for the necessary parameters to
     *           execute the UpdateItem service method on AmazonDynamoDBv2.
     * 
     * @return The response from the UpdateItem service method, as returned
     *         by AmazonDynamoDBv2.
     * 
     * @throws ItemCollectionSizeLimitExceededException
     * @throws ResourceNotFoundException
     * @throws ConditionalCheckFailedException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateItemResult updateItem(UpdateItemRequest updateItemRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a single item in a table by primary key. You can perform a
     * conditional delete operation that deletes the item if it exists, or if
     * it has an expected attribute value.
     * </p>
     * <p>
     * In addition to deleting an item, you can also return the item's
     * attribute values in the same operation, using the <i>ReturnValues</i>
     * parameter.
     * </p>
     * <p>
     * Unless you specify conditions, the <i>DeleteItem</i> is an idempotent
     * operation; running it multiple times on the same item or attribute
     * does <i>not</i> result in an error response.
     * </p>
     * <p>
     * Conditional deletes are useful for deleting items only if specific
     * conditions are met. If those conditions are met, DynamoDB performs the
     * delete. Otherwise, the item is not deleted.
     * </p>
     *
     * @param deleteItemRequest Container for the necessary parameters to
     *           execute the DeleteItem service method on AmazonDynamoDBv2.
     * 
     * @return The response from the DeleteItem service method, as returned
     *         by AmazonDynamoDBv2.
     * 
     * @throws ItemCollectionSizeLimitExceededException
     * @throws ResourceNotFoundException
     * @throws ConditionalCheckFailedException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteItemResult deleteItem(DeleteItemRequest deleteItemRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the current provisioned-capacity limits for your AWS account
     * in a region, both for the region as a whole and for any one DynamoDB
     * table that you create there.
     * </p>
     * <p>
     * When you establish an AWS account, the account has initial limits on
     * the maximum read capacity units and write capacity units that you can
     * provision across all of your DynamoDB tables in a given region. Also,
     * there are per-table limits that apply when you create a table there.
     * For more information, see
     * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html"> Limits </a>
     * page in the <i>Amazon DynamoDB Developer Guide</i> .
     * </p>
     * <p>
     * Although you can increase these limits by filing a case at
     * <a href="https://console.aws.amazon.com/support/home#/"> AWS Support Center </a>
     * , obtaining the increase is not instantaneous. The
     * <i>DescribeLimits</i> API lets you write code to compare the capacity
     * you are currently using to those limits imposed by your account so
     * that you have enough time to apply for an increase before you hit a
     * limit.
     * </p>
     * <p>
     * For example, you could use one of the AWS SDKs to do the following:
     * </p>
     * <ol> <li>Call <i>DescribeLimits</i> for a particular region to obtain
     * your current account limits on provisioned capacity there.</li>
     * <li>Create a variable to hold the aggregate read capacity units
     * provisioned for all your tables in that region, and one to hold the
     * aggregate write capacity units. Zero them both.</li>
     * <li>Call <i>ListTables</i> to obtain a list of all your DynamoDB
     * tables.</li>
     * <li> <p>
     * For each table name listed by <i>ListTables</i> , do the following:
     * </p>
     * 
     * <ul>
     * <li>Call <i>DescribeTable</i> with the table name.</li>
     * <li>Use the data returned by <i>DescribeTable</i> to add the read
     * capacity units and write capacity units provisioned for the table
     * itself to your variables.</li>
     * <li>If the table has one or more global secondary indexes (GSIs),
     * loop over these GSIs and add their provisioned capacity values to your
     * variables as well.</li>
     * 
     * </ul>
     * </li>
     * <li>Report the account limits for that region returned by
     * <i>DescribeLimits</i> , along with the total current provisioned
     * capacity levels you have calculated.</li>
     * </ol> <p>
     * This will let you see whether you are getting close to your
     * account-level limits.
     * </p>
     * <p>
     * The per-table limits apply only when you are creating a new table.
     * They restrict the sum of the provisioned capacity of the new table
     * itself and all its global secondary indexes.
     * </p>
     * <p>
     * For existing tables and their GSIs, DynamoDB will not let you
     * increase provisioned capacity extremely rapidly, but the only upper
     * limit that applies is that the aggregate provisioned capacity over all
     * your tables and GSIs cannot exceed either of the per-account limits.
     * </p>
     * <p>
     * <b>NOTE:</b> DescribeLimits should only be called periodically. You
     * can expect throttling errors if you call it more than once in a
     * minute.
     * </p>
     * <p>
     * The <i>DescribeLimits</i> Request element has no content.
     * </p>
     *
     * @param describeLimitsRequest Container for the necessary parameters to
     *           execute the DescribeLimits service method on AmazonDynamoDBv2.
     * 
     * @return The response from the DescribeLimits service method, as
     *         returned by AmazonDynamoDBv2.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLimitsResult describeLimits(DescribeLimitsRequest describeLimitsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>CreateTable</i> operation adds a new table to your account. In
     * an AWS account, table names must be unique within each region. That
     * is, you can have two tables with same name if you create the tables in
     * different regions.
     * </p>
     * <p>
     * <i>CreateTable</i> is an asynchronous operation. Upon receiving a
     * <i>CreateTable</i> request, DynamoDB immediately returns a response
     * with a <i>TableStatus</i> of <code>CREATING</code> . After the table
     * is created, DynamoDB sets the <i>TableStatus</i> to
     * <code>ACTIVE</code> . You can perform read and write operations only
     * on an <code>ACTIVE</code> table.
     * </p>
     * <p>
     * You can optionally define secondary indexes on the new table, as part
     * of the <i>CreateTable</i> operation. If you want to create multiple
     * tables with secondary indexes on them, you must create the tables
     * sequentially. Only one table with secondary indexes can be in the
     * <code>CREATING</code> state at any given time.
     * </p>
     * <p>
     * You can use the <i>DescribeTable</i> API to check the table status.
     * </p>
     *
     * @param createTableRequest Container for the necessary parameters to
     *           execute the CreateTable service method on AmazonDynamoDBv2.
     * 
     * @return The response from the CreateTable service method, as returned
     *         by AmazonDynamoDBv2.
     * 
     * @throws ResourceInUseException
     * @throws LimitExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateTableResult createTable(CreateTableRequest createTableRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The <i>BatchGetItem</i> operation returns the attributes of one or
     * more items from one or more tables. You identify requested items by
     * primary key.
     * </p>
     * <p>
     * A single operation can retrieve up to 16 MB of data, which can
     * contain as many as 100 items. <i>BatchGetItem</i> will return a
     * partial result if the response size limit is exceeded, the table's
     * provisioned throughput is exceeded, or an internal processing failure
     * occurs. If a partial result is returned, the operation returns a value
     * for <i>UnprocessedKeys</i> . You can use this value to retry the
     * operation starting with the next item to get.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> If you request more than 100 items BatchGetItem
     * will return a ValidationException with the message "Too many items
     * requested for the BatchGetItem call".
     * </p>
     * <p>
     * For example, if you ask to retrieve 100 items, but each individual
     * item is 300 KB in size, the system returns 52 items (so as not to
     * exceed the 16 MB limit). It also returns an appropriate
     * <i>UnprocessedKeys</i> value so you can get the next page of results.
     * If desired, your application can include its own logic to assemble the
     * pages of results into one data set.
     * </p>
     * <p>
     * If <i>none</i> of the items can be processed due to insufficient
     * provisioned throughput on all of the tables in the request, then
     * <i>BatchGetItem</i> will return a
     * <i>ProvisionedThroughputExceededException</i> . If <i>at least one</i>
     * of the items is successfully processed, then <i>BatchGetItem</i>
     * completes successfully, while returning the keys of the unread items
     * in <i>UnprocessedKeys</i> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b> If DynamoDB returns any unprocessed items, you
     * should retry the batch operation on those items. However, we strongly
     * recommend that you use an exponential backoff algorithm. If you retry
     * the batch operation immediately, the underlying read or write requests
     * can still fail due to throttling on the individual tables. If you
     * delay the batch operation using exponential backoff, the individual
     * requests in the batch are much more likely to succeed. For more
     * information, see Batch Operations and Error Handling in the Amazon
     * DynamoDB Developer Guide.
     * </p>
     * <p>
     * By default, <i>BatchGetItem</i> performs eventually consistent reads
     * on every table in the request. If you want strongly consistent reads
     * instead, you can set <i>ConsistentRead</i> to <code>true</code> for
     * any or all tables.
     * </p>
     * <p>
     * In order to minimize response latency, <i>BatchGetItem</i> retrieves
     * items in parallel.
     * </p>
     * <p>
     * When designing your application, keep in mind that DynamoDB does not
     * return attributes in any particular order. To help parse the response
     * by item, include the primary key values for the items in your request
     * in the <i>AttributesToGet</i> parameter.
     * </p>
     * <p>
     * If a requested item does not exist, it is not returned in the result.
     * Requests for nonexistent items consume the minimum read capacity units
     * according to the type of read. For more information, see
     * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#CapacityUnitCalculations"> Capacity Units Calculations </a>
     * in the <i>Amazon DynamoDB Developer Guide</i> .
     * </p>
     *
     * @param batchGetItemRequest Container for the necessary parameters to
     *           execute the BatchGetItem service method on AmazonDynamoDBv2.
     * 
     * @return The response from the BatchGetItem service method, as returned
     *         by AmazonDynamoDBv2.
     * 
     * @throws ResourceNotFoundException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public BatchGetItemResult batchGetItem(BatchGetItemRequest batchGetItemRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * A <i>Query</i> operation uses the primary key of a table or a
     * secondary index to directly access items from that table or index.
     * </p>
     * <p>
     * Use the <i>KeyConditionExpression</i> parameter to provide a specific
     * value for the partition key. The <i>Query</i> operation will return
     * all of the items from the table or index with that partition key
     * value. You can optionally narrow the scope of the <i>Query</i>
     * operation by specifying a sort key value and a comparison operator in
     * <i>KeyConditionExpression</i> . You can use the
     * <i>ScanIndexForward</i> parameter to get results in forward or reverse
     * order, by sort key.
     * </p>
     * <p>
     * Queries that do not return results consume the minimum number of read
     * capacity units for that type of read operation.
     * </p>
     * <p>
     * If the total number of items meeting the query criteria exceeds the
     * result set size limit of 1 MB, the query stops and results are
     * returned to the user with the <i>LastEvaluatedKey</i> element to
     * continue the query in a subsequent operation. Unlike a <i>Scan</i>
     * operation, a <i>Query</i> operation never returns both an empty result
     * set and a <i>LastEvaluatedKey</i> value. <i>LastEvaluatedKey</i> is
     * only provided if the results exceed 1 MB, or if you have used the
     * <i>Limit</i> parameter.
     * </p>
     * <p>
     * You can query a table, a local secondary index, or a global secondary
     * index. For a query on a table or on a local secondary index, you can
     * set the <i>ConsistentRead</i> parameter to <code>true</code> and
     * obtain a strongly consistent result. Global secondary indexes support
     * eventually consistent reads only, so do not specify
     * <i>ConsistentRead</i> when querying a global secondary index.
     * </p>
     *
     * @param queryRequest Container for the necessary parameters to execute
     *           the Query service method on AmazonDynamoDBv2.
     * 
     * @return The response from the Query service method, as returned by
     *         AmazonDynamoDBv2.
     * 
     * @throws ResourceNotFoundException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public QueryResult query(QueryRequest queryRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new item, or replaces an old item with a new item. If an
     * item that has the same primary key as the new item already exists in
     * the specified table, the new item completely replaces the existing
     * item. You can perform a conditional put operation (add a new item if
     * one with the specified primary key doesn't exist), or replace an
     * existing item if it has certain attribute values.
     * </p>
     * <p>
     * In addition to putting an item, you can also return the item's
     * attribute values in the same operation, using the <i>ReturnValues</i>
     * parameter.
     * </p>
     * <p>
     * When you add an item, the primary key attribute(s) are the only
     * required attributes. Attribute values cannot be null. String and
     * Binary type attributes must have lengths greater than zero. Set type
     * attributes cannot be empty. Requests with empty values will be
     * rejected with a <i>ValidationException</i> exception.
     * </p>
     * <p>
     * You can request that <i>PutItem</i> return either a copy of the
     * original item (before the update) or a copy of the updated item (after
     * the update). For more information, see the <i>ReturnValues</i>
     * description below.
     * </p>
     * <p>
     * <b>NOTE:</b> To prevent a new item from replacing an existing item,
     * use a conditional expression that contains the attribute_not_exists
     * function with the name of the attribute being used as the partition
     * key for the table. Since every record must contain that attribute,
     * the attribute_not_exists function will only succeed if no matching
     * item exists.
     * </p>
     * <p>
     * For more information about using this API, see
     * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html"> Working with Items </a>
     * in the <i>Amazon DynamoDB Developer Guide</i> .
     * </p>
     *
     * @param putItemRequest Container for the necessary parameters to
     *           execute the PutItem service method on AmazonDynamoDBv2.
     * 
     * @return The response from the PutItem service method, as returned by
     *         AmazonDynamoDBv2.
     * 
     * @throws ItemCollectionSizeLimitExceededException
     * @throws ResourceNotFoundException
     * @throws ConditionalCheckFailedException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public PutItemResult putItem(PutItemRequest putItemRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns an array of table names associated with the current account
     * and endpoint. The output from <i>ListTables</i> is paginated, with
     * each page returning a maximum of 100 table names.
     * </p>
     *
     * @param listTablesRequest Container for the necessary parameters to
     *           execute the ListTables service method on AmazonDynamoDBv2.
     * 
     * @return The response from the ListTables service method, as returned
     *         by AmazonDynamoDBv2.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListTablesResult listTables(ListTablesRequest listTablesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the current provisioned-capacity limits for your AWS account
     * in a region, both for the region as a whole and for any one DynamoDB
     * table that you create there.
     * </p>
     * <p>
     * When you establish an AWS account, the account has initial limits on
     * the maximum read capacity units and write capacity units that you can
     * provision across all of your DynamoDB tables in a given region. Also,
     * there are per-table limits that apply when you create a table there.
     * For more information, see
     * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html"> Limits </a>
     * page in the <i>Amazon DynamoDB Developer Guide</i> .
     * </p>
     * <p>
     * Although you can increase these limits by filing a case at
     * <a href="https://console.aws.amazon.com/support/home#/"> AWS Support Center </a>
     * , obtaining the increase is not instantaneous. The
     * <i>DescribeLimits</i> API lets you write code to compare the capacity
     * you are currently using to those limits imposed by your account so
     * that you have enough time to apply for an increase before you hit a
     * limit.
     * </p>
     * <p>
     * For example, you could use one of the AWS SDKs to do the following:
     * </p>
     * <ol> <li>Call <i>DescribeLimits</i> for a particular region to obtain
     * your current account limits on provisioned capacity there.</li>
     * <li>Create a variable to hold the aggregate read capacity units
     * provisioned for all your tables in that region, and one to hold the
     * aggregate write capacity units. Zero them both.</li>
     * <li>Call <i>ListTables</i> to obtain a list of all your DynamoDB
     * tables.</li>
     * <li> <p>
     * For each table name listed by <i>ListTables</i> , do the following:
     * </p>
     * 
     * <ul>
     * <li>Call <i>DescribeTable</i> with the table name.</li>
     * <li>Use the data returned by <i>DescribeTable</i> to add the read
     * capacity units and write capacity units provisioned for the table
     * itself to your variables.</li>
     * <li>If the table has one or more global secondary indexes (GSIs),
     * loop over these GSIs and add their provisioned capacity values to your
     * variables as well.</li>
     * 
     * </ul>
     * </li>
     * <li>Report the account limits for that region returned by
     * <i>DescribeLimits</i> , along with the total current provisioned
     * capacity levels you have calculated.</li>
     * </ol> <p>
     * This will let you see whether you are getting close to your
     * account-level limits.
     * </p>
     * <p>
     * The per-table limits apply only when you are creating a new table.
     * They restrict the sum of the provisioned capacity of the new table
     * itself and all its global secondary indexes.
     * </p>
     * <p>
     * For existing tables and their GSIs, DynamoDB will not let you
     * increase provisioned capacity extremely rapidly, but the only upper
     * limit that applies is that the aggregate provisioned capacity over all
     * your tables and GSIs cannot exceed either of the per-account limits.
     * </p>
     * <p>
     * <b>NOTE:</b> DescribeLimits should only be called periodically. You
     * can expect throttling errors if you call it more than once in a
     * minute.
     * </p>
     * <p>
     * The <i>DescribeLimits</i> Request element has no content.
     * </p>
     * 
     * @return The response from the DescribeLimits service method, as
     *         returned by AmazonDynamoDBv2.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLimitsResult describeLimits() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns an array of table names associated with the current account
     * and endpoint. The output from <i>ListTables</i> is paginated, with
     * each page returning a maximum of 100 table names.
     * </p>
     * 
     * @return The response from the ListTables service method, as returned
     *         by AmazonDynamoDBv2.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListTablesResult listTables() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <i>Scan</i> operation returns one or more items and item
     * attributes by accessing every item in a table or a secondary index. To
     * have DynamoDB return fewer items, you can provide a <i>ScanFilter</i>
     * operation.
     * </p>
     * <p>
     * If the total number of scanned items exceeds the maximum data set
     * size limit of 1 MB, the scan stops and results are returned to the
     * user as a <i>LastEvaluatedKey</i> value to continue the scan in a
     * subsequent operation. The results also include the number of items
     * exceeding the limit. A scan can result in no table data meeting the
     * filter criteria.
     * </p>
     * <p>
     * By default, <i>Scan</i> operations proceed sequentially; however, for
     * faster performance on a large table or secondary index, applications
     * can request a parallel <i>Scan</i> operation by providing the
     * <i>Segment</i> and <i>TotalSegments</i> parameters. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#QueryAndScanParallelScan"> Parallel Scan </a>
     * in the <i>Amazon DynamoDB Developer Guide</i> .
     * </p>
     * <p>
     * By default, <i>Scan</i> uses eventually consistent reads when
     * accessing the data in a table; therefore, the result set might not
     * include the changes to data in the table immediately before the
     * operation began. If you need a consistent copy of the data, as of the
     * time that the Scan begins, you can set the <i>ConsistentRead</i>
     * parameter to <i>true</i> .
     * </p>
     * 
     * @param tableName The name of the table containing the requested items;
     * or, if you provide <code>IndexName</code>, the name of the table to
     * which that index belongs.
     * @param attributesToGet <important><p>This is a legacy parameter, for
     * backward compatibility. New applications should use
     * <i>ProjectionExpression</i> instead. Do not combine legacy parameters
     * and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception. <p>This parameter
     * allows you to retrieve attributes of type List or Map; however, it
     * cannot retrieve individual elements within a List or a
     * Map.</important> <p>The names of one or more attributes to retrieve.
     * If no attribute names are provided, then all attributes will be
     * returned. If any of the requested attributes are not found, they will
     * not appear in the result. <p>Note that <i>AttributesToGet</i> has no
     * effect on provisioned throughput consumption. DynamoDB determines
     * capacity units consumed based on item size, not on the amount of data
     * that is returned to an application.
     * 
     * @return The response from the Scan service method, as returned by
     *         AmazonDynamoDBv2.
     * 
     * @throws ResourceNotFoundException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ScanResult scan(String tableName, java.util.List<String> attributesToGet)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <i>Scan</i> operation returns one or more items and item
     * attributes by accessing every item in a table or a secondary index. To
     * have DynamoDB return fewer items, you can provide a <i>ScanFilter</i>
     * operation.
     * </p>
     * <p>
     * If the total number of scanned items exceeds the maximum data set
     * size limit of 1 MB, the scan stops and results are returned to the
     * user as a <i>LastEvaluatedKey</i> value to continue the scan in a
     * subsequent operation. The results also include the number of items
     * exceeding the limit. A scan can result in no table data meeting the
     * filter criteria.
     * </p>
     * <p>
     * By default, <i>Scan</i> operations proceed sequentially; however, for
     * faster performance on a large table or secondary index, applications
     * can request a parallel <i>Scan</i> operation by providing the
     * <i>Segment</i> and <i>TotalSegments</i> parameters. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#QueryAndScanParallelScan"> Parallel Scan </a>
     * in the <i>Amazon DynamoDB Developer Guide</i> .
     * </p>
     * <p>
     * By default, <i>Scan</i> uses eventually consistent reads when
     * accessing the data in a table; therefore, the result set might not
     * include the changes to data in the table immediately before the
     * operation began. If you need a consistent copy of the data, as of the
     * time that the Scan begins, you can set the <i>ConsistentRead</i>
     * parameter to <i>true</i> .
     * </p>
     * 
     * @param tableName The name of the table containing the requested items;
     * or, if you provide <code>IndexName</code>, the name of the table to
     * which that index belongs.
     * @param scanFilter <important> <p>This is a legacy parameter, for
     * backward compatibility. New applications should use
     * <i>FilterExpression</i> instead. Do not combine legacy parameters and
     * expression parameters in a single API call; otherwise, DynamoDB will
     * return a <i>ValidationException</i> exception. </important> <p>A
     * condition that evaluates the scan results and returns only the desired
     * values. <note><p>This parameter does not support attributes of type
     * List or Map.</note> <p>If you specify more than one condition in the
     * <i>ScanFilter</i> map, then by default all of the conditions must
     * evaluate to true. In other words, the conditions are ANDed together.
     * (You can use the <i>ConditionalOperator</i> parameter to OR the
     * conditions instead. If you do this, then at least one of the
     * conditions must evaluate to true, rather than all of them.) <p>Each
     * <i>ScanFilter</i> element consists of an attribute name to compare,
     * along with the following: <ul> <li> <p><i>AttributeValueList</i> - One
     * or more values to evaluate against the supplied attribute. The number
     * of values in the list depends on the operator specified in
     * <i>ComparisonOperator</i> . <p>For type Number, value comparisons are
     * numeric. <p>String value comparisons for greater than, equals, or less
     * than are based on ASCII character code values. For example,
     * <code>a</code> is greater than <code>A</code>, and <code>a</code> is
     * greater than <code>B</code>. For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * <p>For Binary, DynamoDB treats each byte of the binary data as
     * unsigned when it compares binary values. <p>For information on
     * specifying data types in JSON, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     * Data Format</a> in the <i>Amazon DynamoDB Developer Guide</i>. </li>
     * <li><p><i>ComparisonOperator</i> - A comparator for evaluating
     * attributes. For example, equals, greater than, less than, etc. <p>The
     * following comparison operators are available: <p><code>EQ | NE | LE |
     * LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH
     * | IN | BETWEEN</code> <p>For complete descriptions of all comparison
     * operators, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Condition.html">Condition</a>.
     * </li> </ul>
     * 
     * @return The response from the Scan service method, as returned by
     *         AmazonDynamoDBv2.
     * 
     * @throws ResourceNotFoundException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ScanResult scan(String tableName, java.util.Map<String,Condition> scanFilter)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <i>Scan</i> operation returns one or more items and item
     * attributes by accessing every item in a table or a secondary index. To
     * have DynamoDB return fewer items, you can provide a <i>ScanFilter</i>
     * operation.
     * </p>
     * <p>
     * If the total number of scanned items exceeds the maximum data set
     * size limit of 1 MB, the scan stops and results are returned to the
     * user as a <i>LastEvaluatedKey</i> value to continue the scan in a
     * subsequent operation. The results also include the number of items
     * exceeding the limit. A scan can result in no table data meeting the
     * filter criteria.
     * </p>
     * <p>
     * By default, <i>Scan</i> operations proceed sequentially; however, for
     * faster performance on a large table or secondary index, applications
     * can request a parallel <i>Scan</i> operation by providing the
     * <i>Segment</i> and <i>TotalSegments</i> parameters. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#QueryAndScanParallelScan"> Parallel Scan </a>
     * in the <i>Amazon DynamoDB Developer Guide</i> .
     * </p>
     * <p>
     * By default, <i>Scan</i> uses eventually consistent reads when
     * accessing the data in a table; therefore, the result set might not
     * include the changes to data in the table immediately before the
     * operation began. If you need a consistent copy of the data, as of the
     * time that the Scan begins, you can set the <i>ConsistentRead</i>
     * parameter to <i>true</i> .
     * </p>
     * 
     * @param tableName The name of the table containing the requested items;
     * or, if you provide <code>IndexName</code>, the name of the table to
     * which that index belongs.
     * @param attributesToGet <important><p>This is a legacy parameter, for
     * backward compatibility. New applications should use
     * <i>ProjectionExpression</i> instead. Do not combine legacy parameters
     * and expression parameters in a single API call; otherwise, DynamoDB
     * will return a <i>ValidationException</i> exception. <p>This parameter
     * allows you to retrieve attributes of type List or Map; however, it
     * cannot retrieve individual elements within a List or a
     * Map.</important> <p>The names of one or more attributes to retrieve.
     * If no attribute names are provided, then all attributes will be
     * returned. If any of the requested attributes are not found, they will
     * not appear in the result. <p>Note that <i>AttributesToGet</i> has no
     * effect on provisioned throughput consumption. DynamoDB determines
     * capacity units consumed based on item size, not on the amount of data
     * that is returned to an application.
     * @param scanFilter <important> <p>This is a legacy parameter, for
     * backward compatibility. New applications should use
     * <i>FilterExpression</i> instead. Do not combine legacy parameters and
     * expression parameters in a single API call; otherwise, DynamoDB will
     * return a <i>ValidationException</i> exception. </important> <p>A
     * condition that evaluates the scan results and returns only the desired
     * values. <note><p>This parameter does not support attributes of type
     * List or Map.</note> <p>If you specify more than one condition in the
     * <i>ScanFilter</i> map, then by default all of the conditions must
     * evaluate to true. In other words, the conditions are ANDed together.
     * (You can use the <i>ConditionalOperator</i> parameter to OR the
     * conditions instead. If you do this, then at least one of the
     * conditions must evaluate to true, rather than all of them.) <p>Each
     * <i>ScanFilter</i> element consists of an attribute name to compare,
     * along with the following: <ul> <li> <p><i>AttributeValueList</i> - One
     * or more values to evaluate against the supplied attribute. The number
     * of values in the list depends on the operator specified in
     * <i>ComparisonOperator</i> . <p>For type Number, value comparisons are
     * numeric. <p>String value comparisons for greater than, equals, or less
     * than are based on ASCII character code values. For example,
     * <code>a</code> is greater than <code>A</code>, and <code>a</code> is
     * greater than <code>B</code>. For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * <p>For Binary, DynamoDB treats each byte of the binary data as
     * unsigned when it compares binary values. <p>For information on
     * specifying data types in JSON, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     * Data Format</a> in the <i>Amazon DynamoDB Developer Guide</i>. </li>
     * <li><p><i>ComparisonOperator</i> - A comparator for evaluating
     * attributes. For example, equals, greater than, less than, etc. <p>The
     * following comparison operators are available: <p><code>EQ | NE | LE |
     * LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH
     * | IN | BETWEEN</code> <p>For complete descriptions of all comparison
     * operators, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Condition.html">Condition</a>.
     * </li> </ul>
     * 
     * @return The response from the Scan service method, as returned by
     *         AmazonDynamoDBv2.
     * 
     * @throws ResourceNotFoundException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ScanResult scan(String tableName, java.util.List<String> attributesToGet, java.util.Map<String,Condition> scanFilter)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Modifies the provisioned throughput settings, global secondary
     * indexes, or DynamoDB Streams settings for a given table.
     * </p>
     * <p>
     * You can only perform one of the following operations at once:
     * </p>
     * 
     * <ul>
     * <li> <p>
     * Modify the provisioned throughput settings of the table.
     * </p>
     * </li>
     * <li> <p>
     * Enable or disable Streams on the table.
     * </p>
     * </li>
     * <li> <p>
     * Remove a global secondary index from the table.
     * </p>
     * </li>
     * <li> <p>
     * Create a new global secondary index on the table. Once the index
     * begins backfilling, you can use <i>UpdateTable</i> to perform other
     * operations.
     * </p>
     * </li>
     * 
     * </ul>
     * <p>
     * <i>UpdateTable</i> is an asynchronous operation; while it is
     * executing, the table status changes from <code>ACTIVE</code> to
     * <code>UPDATING</code> . While it is <code>UPDATING</code> , you cannot
     * issue another <i>UpdateTable</i> request. When the table returns to
     * the <code>ACTIVE</code> state, the <i>UpdateTable</i> operation is
     * complete.
     * </p>
     * 
     * @param tableName The name of the table to be updated.
     * @param provisionedThroughput Represents the provisioned throughput
     * settings for a specified table or index. The settings can be modified
     * using the <i>UpdateTable</i> operation. <p>For current minimum and
     * maximum provisioned throughput values, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     * in the <i>Amazon DynamoDB Developer Guide</i>.
     * 
     * @return The response from the UpdateTable service method, as returned
     *         by AmazonDynamoDBv2.
     * 
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateTableResult updateTable(String tableName, ProvisionedThroughput provisionedThroughput)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <i>DeleteTable</i> operation deletes a table and all of its
     * items. After a <i>DeleteTable</i> request, the specified table is in
     * the <code>DELETING</code> state until DynamoDB completes the deletion.
     * If the table is in the <code>ACTIVE</code> state, you can delete it.
     * If a table is in <code>CREATING</code> or <code>UPDATING</code>
     * states, then DynamoDB returns a <i>ResourceInUseException</i> . If the
     * specified table does not exist, DynamoDB returns a
     * <i>ResourceNotFoundException</i> . If table is already in the
     * <code>DELETING</code> state, no error is returned.
     * </p>
     * <p>
     * <b>NOTE:</b> DynamoDB might continue to accept data read and write
     * operations, such as GetItem and PutItem, on a table in the DELETING
     * state until the table deletion is complete.
     * </p>
     * <p>
     * When you delete a table, any indexes on that table are also deleted.
     * </p>
     * <p>
     * If you have DynamoDB Streams enabled on the table, then the
     * corresponding stream on that table goes into the <code>DISABLED</code>
     * state, and the stream is automatically deleted after 24 hours.
     * </p>
     * <p>
     * Use the <i>DescribeTable</i> API to check the status of the table.
     * </p>
     * 
     * @param tableName The name of the table to delete.
     * 
     * @return The response from the DeleteTable service method, as returned
     *         by AmazonDynamoDBv2.
     * 
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteTableResult deleteTable(String tableName)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <i>BatchWriteItem</i> operation puts or deletes multiple items in
     * one or more tables. A single call to <i>BatchWriteItem</i> can write
     * up to 16 MB of data, which can comprise as many as 25 put or delete
     * requests. Individual items to be written can be as large as 400 KB.
     * </p>
     * <p>
     * <b>NOTE:</b> BatchWriteItem cannot update items. To update items, use
     * the UpdateItem API.
     * </p>
     * <p>
     * The individual <i>PutItem</i> and <i>DeleteItem</i> operations
     * specified in <i>BatchWriteItem</i> are atomic; however
     * <i>BatchWriteItem</i> as a whole is not. If any requested operations
     * fail because the table's provisioned throughput is exceeded or an
     * internal processing failure occurs, the failed operations are returned
     * in the <i>UnprocessedItems</i> response parameter. You can investigate
     * and optionally resend the requests. Typically, you would call
     * <i>BatchWriteItem</i> in a loop. Each iteration would check for
     * unprocessed items and submit a new <i>BatchWriteItem</i> request with
     * those unprocessed items until all items have been processed.
     * </p>
     * <p>
     * Note that if <i>none</i> of the items can be processed due to
     * insufficient provisioned throughput on all of the tables in the
     * request, then <i>BatchWriteItem</i> will return a
     * <i>ProvisionedThroughputExceededException</i> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b> If DynamoDB returns any unprocessed items, you
     * should retry the batch operation on those items. However, we strongly
     * recommend that you use an exponential backoff algorithm. If you retry
     * the batch operation immediately, the underlying read or write requests
     * can still fail due to throttling on the individual tables. If you
     * delay the batch operation using exponential backoff, the individual
     * requests in the batch are much more likely to succeed. For more
     * information, see Batch Operations and Error Handling in the Amazon
     * DynamoDB Developer Guide.
     * </p>
     * <p>
     * With <i>BatchWriteItem</i> , you can efficiently write or delete
     * large amounts of data, such as from Amazon Elastic MapReduce (EMR), or
     * copy data from another database into DynamoDB. In order to improve
     * performance with these large-scale operations, <i>BatchWriteItem</i>
     * does not behave in the same way as individual <i>PutItem</i> and
     * <i>DeleteItem</i> calls would. For example, you cannot specify
     * conditions on individual put and delete requests, and
     * <i>BatchWriteItem</i> does not return deleted items in the response.
     * </p>
     * <p>
     * If you use a programming language that supports concurrency, you can
     * use threads to write items in parallel. Your application must include
     * the necessary logic to manage the threads. With languages that don't
     * support threading, you must update or delete the specified items one
     * at a time. In both situations, <i>BatchWriteItem</i> provides an
     * alternative where the API performs the specified put and delete
     * operations in parallel, giving you the power of the thread pool
     * approach without having to introduce complexity into your application.
     * </p>
     * <p>
     * Parallel processing reduces latency, but each specified put and
     * delete request consumes the same number of write capacity units
     * whether it is processed in parallel or not. Delete operations on
     * nonexistent items consume one write capacity unit.
     * </p>
     * <p>
     * If one or more of the following is true, DynamoDB rejects the entire
     * batch write operation:
     * </p>
     * 
     * <ul>
     * <li> <p>
     * One or more tables specified in the <i>BatchWriteItem</i> request
     * does not exist.
     * </p>
     * </li>
     * <li> <p>
     * Primary key attributes specified on an item in the request do not
     * match those in the corresponding table's primary key schema.
     * </p>
     * </li>
     * <li> <p>
     * You try to perform multiple operations on the same item in the same
     * <i>BatchWriteItem</i> request. For example, you cannot put and delete
     * the same item in the same <i>BatchWriteItem</i> request.
     * </p>
     * </li>
     * <li> <p>
     * There are more than 25 requests in the batch.
     * </p>
     * </li>
     * <li> <p>
     * Any individual item in a batch exceeds 400 KB.
     * </p>
     * </li>
     * <li> <p>
     * The total request size exceeds 16 MB.
     * </p>
     * </li>
     * 
     * </ul>
     * 
     * @param requestItems A map of one or more table names and, for each
     * table, a list of operations to be performed (<i>DeleteRequest</i> or
     * <i>PutRequest</i>). Each element in the map consists of the following:
     * <ul> <li> <p><i>DeleteRequest</i> - Perform a <i>DeleteItem</i>
     * operation on the specified item. The item to be deleted is identified
     * by a <i>Key</i> subelement: <ul> <li> <p><i>Key</i> - A map of primary
     * key attribute values that uniquely identify the ! item. Each entry in
     * this map consists of an attribute name and an attribute value. For
     * each primary key, you must provide <i>all</i> of the key attributes.
     * For example, with a simple primary key, you only need to provide a
     * value for the partition key. For a composite primary key, you must
     * provide values for <i>both</i> the partition key and the sort key.
     * </li> </ul> </li> <li> <p><i>PutRequest</i> - Perform a <i>PutItem</i>
     * operation on the specified item. The item to be put is identified by
     * an <i>Item</i> subelement: <ul> <li> <p><i>Item</i> - A map of
     * attributes and their values. Each entry in this map consists of an
     * attribute name and an attribute value. Attribute values must not be
     * null; string and binary type attributes must have lengths greater than
     * zero; and set type attributes must not be empty. Requests that contain
     * empty values will be rejected with a <i>ValidationException</i>
     * exception. <p>If you specify any attributes that are part of an index
     * key, then the data types for those attributes must match those of the
     * schema in the table's attribute definition. </li> </ul> </li> </ul>
     * 
     * @return The response from the BatchWriteItem service method, as
     *         returned by AmazonDynamoDBv2.
     * 
     * @throws ItemCollectionSizeLimitExceededException
     * @throws ResourceNotFoundException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public BatchWriteItemResult batchWriteItem(java.util.Map<String,java.util.List<WriteRequest>> requestItems)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns information about the table, including the current status of
     * the table, when it was created, the primary key schema, and any
     * indexes on the table.
     * </p>
     * <p>
     * <b>NOTE:</b> If you issue a DescribeTable request immediately after a
     * CreateTable request, DynamoDB might return a
     * ResourceNotFoundException. This is because DescribeTable uses an
     * eventually consistent query, and the metadata for your table might not
     * be available at that moment. Wait for a few seconds, and then try the
     * DescribeTable request again.
     * </p>
     * 
     * @param tableName The name of the table to describe.
     * 
     * @return The response from the DescribeTable service method, as
     *         returned by AmazonDynamoDBv2.
     * 
     * @throws ResourceNotFoundException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTableResult describeTable(String tableName)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <i>GetItem</i> operation returns a set of attributes for the item
     * with the given primary key. If there is no matching item,
     * <i>GetItem</i> does not return any data.
     * </p>
     * <p>
     * <i>GetItem</i> provides an eventually consistent read by default. If
     * your application requires a strongly consistent read, set
     * <i>ConsistentRead</i> to <code>true</code> . Although a strongly
     * consistent read might take more time than an eventually consistent
     * read, it always returns the last updated value.
     * </p>
     * 
     * @param tableName The name of the table containing the requested item.
     * @param key A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to retrieve. <p>For the
     * primary key, you must provide all of the attributes. For example, with
     * a simple primary key, you only need to provide a value for the
     * partition key. For a composite primary key, you must provide values
     * for both the partition key and the sort key.
     * 
     * @return The response from the GetItem service method, as returned by
     *         AmazonDynamoDBv2.
     * 
     * @throws ResourceNotFoundException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetItemResult getItem(String tableName, java.util.Map<String,AttributeValue> key)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <i>GetItem</i> operation returns a set of attributes for the item
     * with the given primary key. If there is no matching item,
     * <i>GetItem</i> does not return any data.
     * </p>
     * <p>
     * <i>GetItem</i> provides an eventually consistent read by default. If
     * your application requires a strongly consistent read, set
     * <i>ConsistentRead</i> to <code>true</code> . Although a strongly
     * consistent read might take more time than an eventually consistent
     * read, it always returns the last updated value.
     * </p>
     * 
     * @param tableName The name of the table containing the requested item.
     * @param key A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to retrieve. <p>For the
     * primary key, you must provide all of the attributes. For example, with
     * a simple primary key, you only need to provide a value for the
     * partition key. For a composite primary key, you must provide values
     * for both the partition key and the sort key.
     * @param consistentRead Determines the read consistency model: If set to
     * <code>true</code>, then the operation uses strongly consistent reads;
     * otherwise, the operation uses eventually consistent reads.
     * 
     * @return The response from the GetItem service method, as returned by
     *         AmazonDynamoDBv2.
     * 
     * @throws ResourceNotFoundException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetItemResult getItem(String tableName, java.util.Map<String,AttributeValue> key, Boolean consistentRead)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Edits an existing item's attributes, or adds a new item to the table
     * if it does not already exist. You can put, delete, or add attribute
     * values. You can also perform a conditional update on an existing item
     * (insert a new attribute name-value pair if it doesn't exist, or
     * replace an existing name-value pair if it has certain expected
     * attribute values).
     * </p>
     * <p>
     * You can also return the item's attribute values in the same
     * <i>UpdateItem</i> operation using the <i>ReturnValues</i> parameter.
     * </p>
     * 
     * @param tableName The name of the table containing the item to update.
     * @param key The primary key of the item to be updated. Each element
     * consists of an attribute name and a value for that attribute. <p>For
     * the primary key, you must provide all of the attributes. For example,
     * with a simple primary key, you only need to provide a value for the
     * partition key. For a composite primary key, you must provide values
     * for both the partition key and the sort key.
     * @param attributeUpdates <important> <p>This is a legacy parameter, for
     * backward compatibility. New applications should use
     * <i>UpdateExpression</i> instead. Do not combine legacy parameters and
     * expression parameters in a single API call; otherwise, DynamoDB will
     * return a <i>ValidationException</i> exception. <p>This parameter can
     * be used for modifying top-level attributes; however, it does not
     * support individual list or map elements. </important> <p>The names of
     * attributes to be modified, the action to perform on each, and the new
     * value for each. If you are updating an attribute that is an index key
     * attribute for any indexes on that table, the attribute type must match
     * the index key type defined in the <i>AttributesDefinition</i> of the
     * table description. You can use <i>UpdateItem</i> to update any non-key
     * attributes. <p>Attribute values cannot be null. String and Binary type
     * attributes must have lengths greater than zero. Set type attributes
     * must not be empty. Requests with empty values will be rejected with a
     * <i>ValidationException</i> exception. <p>Each <i>AttributeUpdates</i>
     * element consists of an attribute name to modify, along with the
     * following: <ul> <li> <p><i>Value</i> - The new value, if applicable,
     * for this attribute. </li> <li> <p><i>Action</i> - A value that
     * specifies how to perform the update. This action is only valid for an
     * existing attribute whose data type is Number or is a set; do not use
     * <code>ADD</code> for other data types. <p>If an item with the
     * specified primary key is found in the table, the following values
     * perform the following actions: <ul> <li> <p><code>PUT</code> - Adds
     * the specified attribute to the item. If the attribute already exists,
     * it is replaced by the new value. </li> <li> <p><code>DELETE</code> -
     * Removes the attribute and its value, if no value is specified for
     * <code>DELETE</code>. The data type of the specified value must match
     * the existing value's data type. <p>If a set of values is specified,
     * then those values are subtracted from the old set. For example, if the
     * attribute value was the set <code>[a,b,c]</code> and the
     * <code>DELETE</code> action specifies <code>[a,c]</code>, then the
     * final attribute value is <code>[b]</code>. Specifying an empty set is
     * an error. </li> <li> <p><code>ADD</code> - Adds the specified value to
     * the item, if the attribute does not already exist. If the attribute
     * does exist, then the behavior of <code>ADD</code> depends on the data
     * type of the attribute: <ul> <li> <p>If the existing attribute is a
     * number, and if <i>Value</i> is also a number, then <i>Value</i> is
     * mathematically added to the existing attribute. If <i>Value</i> is a
     * negative number, then it is subtracted from the existing attribute.
     * <note> <p>If you use <code>ADD</code> to increment or decrement a
     * number value for an item that doesn't exist before the update,
     * DynamoDB uses 0 as the initial value. <p>Similarly, if you use
     * <code>ADD</code> for an existing item to increment or decrement an
     * attribute value that doesn't exist before the update, DynamoDB uses
     * <code>0</code> as the initial value. For example, suppose that the
     * item you want to update doesn't have an attribute named
     * <i>itemcount</i>, but you decide to <code>ADD</code> the number
     * <code>3</code> to this attribute anyway. DynamoDB will create the
     * <i>itemcount</i> attribute, set its initial value to <code>0</code>,
     * and finally add <code>3</code> to it. The result will be a new
     * <i>itemcount</i> attribute, with a value of <code>3</code>. </note>
     * </li> <li> <p>If the existing data type is a set, and if <i>Value</i>
     * is also a set, then <i>Value</i> is appended to the existing set. For
     * example, if the attribute value is the set <code>[1,2]</code>, and the
     * <code>ADD</code> action specified <code>[3]</code>, then the final
     * attribute value is <code>[1,2,3]</code>. An error occurs if an
     * <code>ADD</code> action is specified for a set attribute and the
     * attribute type specified does not match the existing set type. <p>Both
     * sets must have the same primitive data type. For example, if the
     * existing data type is a set of strings, <i>Value</i> must also be a
     * set of strings. </li> </ul> </li> </ul> <p>If no item with the
     * specified key is found in the table, the following values perform the
     * following actions: <ul> <li> <p><code>PUT</code> - Causes DynamoDB to
     * create a new item with the specified primary key, and then adds the
     * attribute. </li> <li> <p><code>DELETE</code> - Nothing happens,
     * because attributes cannot be deleted from a nonexistent item. The
     * operation succeeds, but DynamoDB does not create a new item. </li>
     * <li> <p><code>ADD</code> - Causes DynamoDB to create an item with the
     * supplied primary key and number (or set of numbers) for the attribute
     * value. The only data types allowed are Number and Number Set. </li>
     * </ul> </li> </ul> <p>If you provide any attributes that are part of an
     * index key, then the data types for those attributes must match those
     * of the schema in the table's attribute definition.
     * 
     * @return The response from the UpdateItem service method, as returned
     *         by AmazonDynamoDBv2.
     * 
     * @throws ItemCollectionSizeLimitExceededException
     * @throws ResourceNotFoundException
     * @throws ConditionalCheckFailedException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateItemResult updateItem(String tableName, java.util.Map<String,AttributeValue> key, java.util.Map<String,AttributeValueUpdate> attributeUpdates)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Edits an existing item's attributes, or adds a new item to the table
     * if it does not already exist. You can put, delete, or add attribute
     * values. You can also perform a conditional update on an existing item
     * (insert a new attribute name-value pair if it doesn't exist, or
     * replace an existing name-value pair if it has certain expected
     * attribute values).
     * </p>
     * <p>
     * You can also return the item's attribute values in the same
     * <i>UpdateItem</i> operation using the <i>ReturnValues</i> parameter.
     * </p>
     * 
     * @param tableName The name of the table containing the item to update.
     * @param key The primary key of the item to be updated. Each element
     * consists of an attribute name and a value for that attribute. <p>For
     * the primary key, you must provide all of the attributes. For example,
     * with a simple primary key, you only need to provide a value for the
     * partition key. For a composite primary key, you must provide values
     * for both the partition key and the sort key.
     * @param attributeUpdates <important> <p>This is a legacy parameter, for
     * backward compatibility. New applications should use
     * <i>UpdateExpression</i> instead. Do not combine legacy parameters and
     * expression parameters in a single API call; otherwise, DynamoDB will
     * return a <i>ValidationException</i> exception. <p>This parameter can
     * be used for modifying top-level attributes; however, it does not
     * support individual list or map elements. </important> <p>The names of
     * attributes to be modified, the action to perform on each, and the new
     * value for each. If you are updating an attribute that is an index key
     * attribute for any indexes on that table, the attribute type must match
     * the index key type defined in the <i>AttributesDefinition</i> of the
     * table description. You can use <i>UpdateItem</i> to update any non-key
     * attributes. <p>Attribute values cannot be null. String and Binary type
     * attributes must have lengths greater than zero. Set type attributes
     * must not be empty. Requests with empty values will be rejected with a
     * <i>ValidationException</i> exception. <p>Each <i>AttributeUpdates</i>
     * element consists of an attribute name to modify, along with the
     * following: <ul> <li> <p><i>Value</i> - The new value, if applicable,
     * for this attribute. </li> <li> <p><i>Action</i> - A value that
     * specifies how to perform the update. This action is only valid for an
     * existing attribute whose data type is Number or is a set; do not use
     * <code>ADD</code> for other data types. <p>If an item with the
     * specified primary key is found in the table, the following values
     * perform the following actions: <ul> <li> <p><code>PUT</code> - Adds
     * the specified attribute to the item. If the attribute already exists,
     * it is replaced by the new value. </li> <li> <p><code>DELETE</code> -
     * Removes the attribute and its value, if no value is specified for
     * <code>DELETE</code>. The data type of the specified value must match
     * the existing value's data type. <p>If a set of values is specified,
     * then those values are subtracted from the old set. For example, if the
     * attribute value was the set <code>[a,b,c]</code> and the
     * <code>DELETE</code> action specifies <code>[a,c]</code>, then the
     * final attribute value is <code>[b]</code>. Specifying an empty set is
     * an error. </li> <li> <p><code>ADD</code> - Adds the specified value to
     * the item, if the attribute does not already exist. If the attribute
     * does exist, then the behavior of <code>ADD</code> depends on the data
     * type of the attribute: <ul> <li> <p>If the existing attribute is a
     * number, and if <i>Value</i> is also a number, then <i>Value</i> is
     * mathematically added to the existing attribute. If <i>Value</i> is a
     * negative number, then it is subtracted from the existing attribute.
     * <note> <p>If you use <code>ADD</code> to increment or decrement a
     * number value for an item that doesn't exist before the update,
     * DynamoDB uses 0 as the initial value. <p>Similarly, if you use
     * <code>ADD</code> for an existing item to increment or decrement an
     * attribute value that doesn't exist before the update, DynamoDB uses
     * <code>0</code> as the initial value. For example, suppose that the
     * item you want to update doesn't have an attribute named
     * <i>itemcount</i>, but you decide to <code>ADD</code> the number
     * <code>3</code> to this attribute anyway. DynamoDB will create the
     * <i>itemcount</i> attribute, set its initial value to <code>0</code>,
     * and finally add <code>3</code> to it. The result will be a new
     * <i>itemcount</i> attribute, with a value of <code>3</code>. </note>
     * </li> <li> <p>If the existing data type is a set, and if <i>Value</i>
     * is also a set, then <i>Value</i> is appended to the existing set. For
     * example, if the attribute value is the set <code>[1,2]</code>, and the
     * <code>ADD</code> action specified <code>[3]</code>, then the final
     * attribute value is <code>[1,2,3]</code>. An error occurs if an
     * <code>ADD</code> action is specified for a set attribute and the
     * attribute type specified does not match the existing set type. <p>Both
     * sets must have the same primitive data type. For example, if the
     * existing data type is a set of strings, <i>Value</i> must also be a
     * set of strings. </li> </ul> </li> </ul> <p>If no item with the
     * specified key is found in the table, the following values perform the
     * following actions: <ul> <li> <p><code>PUT</code> - Causes DynamoDB to
     * create a new item with the specified primary key, and then adds the
     * attribute. </li> <li> <p><code>DELETE</code> - Nothing happens,
     * because attributes cannot be deleted from a nonexistent item. The
     * operation succeeds, but DynamoDB does not create a new item. </li>
     * <li> <p><code>ADD</code> - Causes DynamoDB to create an item with the
     * supplied primary key and number (or set of numbers) for the attribute
     * value. The only data types allowed are Number and Number Set. </li>
     * </ul> </li> </ul> <p>If you provide any attributes that are part of an
     * index key, then the data types for those attributes must match those
     * of the schema in the table's attribute definition.
     * @param returnValues Use <i>ReturnValues</i> if you want to get the
     * item attributes as they appeared either before or after they were
     * updated. For <i>UpdateItem</i>, the valid values are: <ul> <li>
     * <p><code>NONE</code> - If <i>ReturnValues</i> is not specified, or if
     * its value is <code>NONE</code>, then nothing is returned. (This
     * setting is the default for <i>ReturnValues</i>.) </li> <li>
     * <p><code>ALL_OLD</code> - If <i>UpdateItem</i> overwrote an attribute
     * name-value pair, then the content of the old item is returned. </li>
     * <li> <p><code>UPDATED_OLD</code> - The old versions of only the
     * updated attributes are returned. </li> <li> <p><code>ALL_NEW</code> -
     * All of the attributes of the new version of the item are returned.
     * </li> <li> <p><code>UPDATED_NEW</code> - The new versions of only the
     * updated attributes are returned. </li> </ul> <p>There is no additional
     * cost associated with requesting a return value aside from the small
     * network and processing overhead of receiving a larger response. No
     * Read Capacity Units are consumed. <p>Values returned are strongly
     * consistent
     * 
     * @return The response from the UpdateItem service method, as returned
     *         by AmazonDynamoDBv2.
     * 
     * @throws ItemCollectionSizeLimitExceededException
     * @throws ResourceNotFoundException
     * @throws ConditionalCheckFailedException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateItemResult updateItem(String tableName, java.util.Map<String,AttributeValue> key, java.util.Map<String,AttributeValueUpdate> attributeUpdates, String returnValues)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Deletes a single item in a table by primary key. You can perform a
     * conditional delete operation that deletes the item if it exists, or if
     * it has an expected attribute value.
     * </p>
     * <p>
     * In addition to deleting an item, you can also return the item's
     * attribute values in the same operation, using the <i>ReturnValues</i>
     * parameter.
     * </p>
     * <p>
     * Unless you specify conditions, the <i>DeleteItem</i> is an idempotent
     * operation; running it multiple times on the same item or attribute
     * does <i>not</i> result in an error response.
     * </p>
     * <p>
     * Conditional deletes are useful for deleting items only if specific
     * conditions are met. If those conditions are met, DynamoDB performs the
     * delete. Otherwise, the item is not deleted.
     * </p>
     * 
     * @param tableName The name of the table from which to delete the item.
     * @param key A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to delete. <p>For the primary
     * key, you must provide all of the attributes. For example, with a
     * simple primary key, you only need to provide a value for the partition
     * key. For a composite primary key, you must provide values for both the
     * partition key and the sort key.
     * 
     * @return The response from the DeleteItem service method, as returned
     *         by AmazonDynamoDBv2.
     * 
     * @throws ItemCollectionSizeLimitExceededException
     * @throws ResourceNotFoundException
     * @throws ConditionalCheckFailedException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteItemResult deleteItem(String tableName, java.util.Map<String,AttributeValue> key)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Deletes a single item in a table by primary key. You can perform a
     * conditional delete operation that deletes the item if it exists, or if
     * it has an expected attribute value.
     * </p>
     * <p>
     * In addition to deleting an item, you can also return the item's
     * attribute values in the same operation, using the <i>ReturnValues</i>
     * parameter.
     * </p>
     * <p>
     * Unless you specify conditions, the <i>DeleteItem</i> is an idempotent
     * operation; running it multiple times on the same item or attribute
     * does <i>not</i> result in an error response.
     * </p>
     * <p>
     * Conditional deletes are useful for deleting items only if specific
     * conditions are met. If those conditions are met, DynamoDB performs the
     * delete. Otherwise, the item is not deleted.
     * </p>
     * 
     * @param tableName The name of the table from which to delete the item.
     * @param key A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to delete. <p>For the primary
     * key, you must provide all of the attributes. For example, with a
     * simple primary key, you only need to provide a value for the partition
     * key. For a composite primary key, you must provide values for both the
     * partition key and the sort key.
     * @param returnValues Use <i>ReturnValues</i> if you want to get the
     * item attributes as they appeared before they were deleted. For
     * <i>DeleteItem</i>, the valid values are: <ul> <li>
     * <p><code>NONE</code> - If <i>ReturnValues</i> is not specified, or if
     * its value is <code>NONE</code>, then nothing is returned. (This
     * setting is the default for <i>ReturnValues</i>.) </li> <li>
     * <p><code>ALL_OLD</code> - The content of the old item is returned.
     * </li> </ul>
     * 
     * @return The response from the DeleteItem service method, as returned
     *         by AmazonDynamoDBv2.
     * 
     * @throws ItemCollectionSizeLimitExceededException
     * @throws ResourceNotFoundException
     * @throws ConditionalCheckFailedException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteItemResult deleteItem(String tableName, java.util.Map<String,AttributeValue> key, String returnValues)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <i>CreateTable</i> operation adds a new table to your account. In
     * an AWS account, table names must be unique within each region. That
     * is, you can have two tables with same name if you create the tables in
     * different regions.
     * </p>
     * <p>
     * <i>CreateTable</i> is an asynchronous operation. Upon receiving a
     * <i>CreateTable</i> request, DynamoDB immediately returns a response
     * with a <i>TableStatus</i> of <code>CREATING</code> . After the table
     * is created, DynamoDB sets the <i>TableStatus</i> to
     * <code>ACTIVE</code> . You can perform read and write operations only
     * on an <code>ACTIVE</code> table.
     * </p>
     * <p>
     * You can optionally define secondary indexes on the new table, as part
     * of the <i>CreateTable</i> operation. If you want to create multiple
     * tables with secondary indexes on them, you must create the tables
     * sequentially. Only one table with secondary indexes can be in the
     * <code>CREATING</code> state at any given time.
     * </p>
     * <p>
     * You can use the <i>DescribeTable</i> API to check the table status.
     * </p>
     * 
     * @param attributeDefinitions An array of attributes that describe the
     * key schema for the table and indexes.
     * @param tableName The name of the table to create.
     * @param keySchema Specifies the attributes that make up the primary key
     * for a table or an index. The attributes in <i>KeySchema</i> must also
     * be defined in the <i>AttributeDefinitions</i> array. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html">Data
     * Model</a> in the <i>Amazon DynamoDB Developer Guide</i>. <p>Each
     * <i>KeySchemaElement</i> in the array is composed of: <ul> <li>
     * <p><i>AttributeName</i> - The name of this key attribute. </li> <li>
     * <p><i>KeyType</i> - The role that the key attribute will assume: <ul>
     * <li><p><code>HASH</code> - partition key </li>
     * <li><p><code>RANGE</code> - sort key</li> </ul> </li> </ul> <note>
     * <p>The partition key of an item is also known as its <i>hash
     * attribute</i>. The term "hash attribute" derives from DynamoDB' usage
     * of an internal hash function to evenly distribute data items across
     * partitions, based on their partition key values. <p>The sort key of an
     * item is also known as its <i>range attribute</i>. The term "range
     * attribute" derives from the way DynamoDB stores items with the same
     * partition key physically close together, in sorted order by the sort
     * key value.</note> <p>For a simple primary key (partition key), you
     * must provide exactly one element with a <i>KeyType</i> of
     * <code>HASH</code>. <p>For a composite primary key (partition key and
     * sort key), you must provide exactly two elements, in this order: The
     * first element must have a <i>KeyType</i> of <code>HASH</code>, and the
     * second element must have a <i>KeyType</i> of <code>RANGE</code>.
     * <p>For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#WorkingWithTables.primary.key">Specifying
     * the Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @param provisionedThroughput Represents the provisioned throughput
     * settings for a specified table or index. The settings can be modified
     * using the <i>UpdateTable</i> operation. <p>For current minimum and
     * maximum provisioned throughput values, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     * in the <i>Amazon DynamoDB Developer Guide</i>.
     * 
     * @return The response from the CreateTable service method, as returned
     *         by AmazonDynamoDBv2.
     * 
     * @throws ResourceInUseException
     * @throws LimitExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateTableResult createTable(java.util.List<AttributeDefinition> attributeDefinitions, String tableName, java.util.List<KeySchemaElement> keySchema, ProvisionedThroughput provisionedThroughput)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <i>BatchGetItem</i> operation returns the attributes of one or
     * more items from one or more tables. You identify requested items by
     * primary key.
     * </p>
     * <p>
     * A single operation can retrieve up to 16 MB of data, which can
     * contain as many as 100 items. <i>BatchGetItem</i> will return a
     * partial result if the response size limit is exceeded, the table's
     * provisioned throughput is exceeded, or an internal processing failure
     * occurs. If a partial result is returned, the operation returns a value
     * for <i>UnprocessedKeys</i> . You can use this value to retry the
     * operation starting with the next item to get.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> If you request more than 100 items BatchGetItem
     * will return a ValidationException with the message "Too many items
     * requested for the BatchGetItem call".
     * </p>
     * <p>
     * For example, if you ask to retrieve 100 items, but each individual
     * item is 300 KB in size, the system returns 52 items (so as not to
     * exceed the 16 MB limit). It also returns an appropriate
     * <i>UnprocessedKeys</i> value so you can get the next page of results.
     * If desired, your application can include its own logic to assemble the
     * pages of results into one data set.
     * </p>
     * <p>
     * If <i>none</i> of the items can be processed due to insufficient
     * provisioned throughput on all of the tables in the request, then
     * <i>BatchGetItem</i> will return a
     * <i>ProvisionedThroughputExceededException</i> . If <i>at least one</i>
     * of the items is successfully processed, then <i>BatchGetItem</i>
     * completes successfully, while returning the keys of the unread items
     * in <i>UnprocessedKeys</i> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b> If DynamoDB returns any unprocessed items, you
     * should retry the batch operation on those items. However, we strongly
     * recommend that you use an exponential backoff algorithm. If you retry
     * the batch operation immediately, the underlying read or write requests
     * can still fail due to throttling on the individual tables. If you
     * delay the batch operation using exponential backoff, the individual
     * requests in the batch are much more likely to succeed. For more
     * information, see Batch Operations and Error Handling in the Amazon
     * DynamoDB Developer Guide.
     * </p>
     * <p>
     * By default, <i>BatchGetItem</i> performs eventually consistent reads
     * on every table in the request. If you want strongly consistent reads
     * instead, you can set <i>ConsistentRead</i> to <code>true</code> for
     * any or all tables.
     * </p>
     * <p>
     * In order to minimize response latency, <i>BatchGetItem</i> retrieves
     * items in parallel.
     * </p>
     * <p>
     * When designing your application, keep in mind that DynamoDB does not
     * return attributes in any particular order. To help parse the response
     * by item, include the primary key values for the items in your request
     * in the <i>AttributesToGet</i> parameter.
     * </p>
     * <p>
     * If a requested item does not exist, it is not returned in the result.
     * Requests for nonexistent items consume the minimum read capacity units
     * according to the type of read. For more information, see
     * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#CapacityUnitCalculations"> Capacity Units Calculations </a>
     * in the <i>Amazon DynamoDB Developer Guide</i> .
     * </p>
     * 
     * @param requestItems A map of one or more table names and, for each
     * table, a map that describes one or more items to retrieve from that
     * table. Each table name can be used only once per <i>BatchGetItem</i>
     * request. <p>Each element in the map of items to retrieve consists of
     * the following: <ul> <li> <p><i>ConsistentRead</i> - If
     * <code>true</code>, a strongly consistent read is used; if
     * <code>false</code> (the default), an eventually consistent read is
     * used. </li> <li> <p> <i>ExpressionAttributeNames</i> - One or more
     * substitution tokens for attribute names in the
     * <i>ProjectionExpression</i> parameter. The following are some use
     * cases for using <i>ExpressionAttributeNames</i>: <ul> <li> <p>To
     * access an attribute whose name conflicts with a DynamoDB reserved
     * word. </li> <li> <p>To create a placeholder for repeating occurrences
     * of an attribute name in an expression. </li> <li> <p>To prevent
     * special characters in an attribute name from being misinterpreted in
     * an expression. </li> </ul> <p>Use the <b>#</b> character in an
     * expression to dereference an attribute name. For example, consider the
     * following attribute name: <ul><li><p><code>Percentile</code></li></ul>
     * <p>The name of this attribute conflicts with a reserved word, so it
     * cannot be used directly in an expression. (For the complete list of
     * reserved words, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved
     * Words</a> in the <i>Amazon DynamoDB Developer Guide</i>). To work
     * around this, you could specify the following for
     * <i>ExpressionAttributeNames</i>:
     * <ul><li><p><code>{"#P":"Percentile"}</code></li></ul> <p>You could
     * then use this substitution in an expression, as in this example:
     * <ul><li><p><code>#P = :val</code></li></ul> <note><p>Tokens that begin
     * with the <b>:</b> character are <i>expression attribute values</i>,
     * which are placeholders for the actual value at runtime.</note> <p>For
     * more information on expression attribute names, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Accessing
     * Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </li> <li> <p><i>Keys</i> - An array of primary key attribute values
     * that define specific items in the table. For each primary key, you
     * must provide <i>all</i> of the key attributes. For example, with a
     * simple primary key, you only need to provide the partition key value.
     * For a composite key, you must provide <i>both</i> the partition key
     * value and the sort key value. </li> <li>
     * <p><i>ProjectionExpression</i> - A string that identifies one or more
     * attributes to retrieve from the table. These attributes can include
     * scalars, sets, or elements of a JSON document. The attributes in the
     * expression must be separated by commas. <p>If no attribute names are
     * specified, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the
     * result. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Accessing
     * Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </li> <li> <p> <i>AttributesToGet</i> - <important> <p>This is a
     * legacy parameter, for backward compatibility. New applications should
     * use <i>ProjectionExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception. <p>This
     * parameter allows you to retrieve attributes of type List or Map;
     * however, it cannot retrieve individual elements within a List or a
     * Map.</important> <p>The names of one or more attributes to retrieve.
     * If no attribute names are provided, then all attributes will be
     * returned. If any of the requested attributes are not found, they will
     * not appear in the result. <p>Note that <i>AttributesToGet</i> has no
     * effect on provisioned throughput consumption. DynamoDB determines
     * capacity units consumed based on item size, not on the amount of data
     * that is returned to an application. </li> </ul>
     * @param returnConsumedCapacity Determines the level of detail about
     * provisioned throughput consumption that is returned in the response:
     * <ul> <li><p><i>INDEXES</i> - The response includes the aggregate
     * <i>ConsumedCapacity</i> for the operation, together with
     * <i>ConsumedCapacity</i> for each table and secondary index that was
     * accessed. <p>Note that some operations, such as <i>GetItem</i> and
     * <i>BatchGetItem</i>, do not access any indexes at all. In these cases,
     * specifying <i>INDEXES</i> will only return <i>ConsumedCapacity</i>
     * information for table(s).</li> <li><p><i>TOTAL</i> - The response
     * includes only the aggregate <i>ConsumedCapacity</i> for the
     * operation.</li> <li><p><i>NONE</i> - No <i>ConsumedCapacity</i>
     * details are included in the response.</li> </ul>
     * 
     * @return The response from the BatchGetItem service method, as returned
     *         by AmazonDynamoDBv2.
     * 
     * @throws ResourceNotFoundException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public BatchGetItemResult batchGetItem(java.util.Map<String,KeysAndAttributes> requestItems, String returnConsumedCapacity)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * The <i>BatchGetItem</i> operation returns the attributes of one or
     * more items from one or more tables. You identify requested items by
     * primary key.
     * </p>
     * <p>
     * A single operation can retrieve up to 16 MB of data, which can
     * contain as many as 100 items. <i>BatchGetItem</i> will return a
     * partial result if the response size limit is exceeded, the table's
     * provisioned throughput is exceeded, or an internal processing failure
     * occurs. If a partial result is returned, the operation returns a value
     * for <i>UnprocessedKeys</i> . You can use this value to retry the
     * operation starting with the next item to get.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> If you request more than 100 items BatchGetItem
     * will return a ValidationException with the message "Too many items
     * requested for the BatchGetItem call".
     * </p>
     * <p>
     * For example, if you ask to retrieve 100 items, but each individual
     * item is 300 KB in size, the system returns 52 items (so as not to
     * exceed the 16 MB limit). It also returns an appropriate
     * <i>UnprocessedKeys</i> value so you can get the next page of results.
     * If desired, your application can include its own logic to assemble the
     * pages of results into one data set.
     * </p>
     * <p>
     * If <i>none</i> of the items can be processed due to insufficient
     * provisioned throughput on all of the tables in the request, then
     * <i>BatchGetItem</i> will return a
     * <i>ProvisionedThroughputExceededException</i> . If <i>at least one</i>
     * of the items is successfully processed, then <i>BatchGetItem</i>
     * completes successfully, while returning the keys of the unread items
     * in <i>UnprocessedKeys</i> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b> If DynamoDB returns any unprocessed items, you
     * should retry the batch operation on those items. However, we strongly
     * recommend that you use an exponential backoff algorithm. If you retry
     * the batch operation immediately, the underlying read or write requests
     * can still fail due to throttling on the individual tables. If you
     * delay the batch operation using exponential backoff, the individual
     * requests in the batch are much more likely to succeed. For more
     * information, see Batch Operations and Error Handling in the Amazon
     * DynamoDB Developer Guide.
     * </p>
     * <p>
     * By default, <i>BatchGetItem</i> performs eventually consistent reads
     * on every table in the request. If you want strongly consistent reads
     * instead, you can set <i>ConsistentRead</i> to <code>true</code> for
     * any or all tables.
     * </p>
     * <p>
     * In order to minimize response latency, <i>BatchGetItem</i> retrieves
     * items in parallel.
     * </p>
     * <p>
     * When designing your application, keep in mind that DynamoDB does not
     * return attributes in any particular order. To help parse the response
     * by item, include the primary key values for the items in your request
     * in the <i>AttributesToGet</i> parameter.
     * </p>
     * <p>
     * If a requested item does not exist, it is not returned in the result.
     * Requests for nonexistent items consume the minimum read capacity units
     * according to the type of read. For more information, see
     * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#CapacityUnitCalculations"> Capacity Units Calculations </a>
     * in the <i>Amazon DynamoDB Developer Guide</i> .
     * </p>
     * 
     * @param requestItems A map of one or more table names and, for each
     * table, a map that describes one or more items to retrieve from that
     * table. Each table name can be used only once per <i>BatchGetItem</i>
     * request. <p>Each element in the map of items to retrieve consists of
     * the following: <ul> <li> <p><i>ConsistentRead</i> - If
     * <code>true</code>, a strongly consistent read is used; if
     * <code>false</code> (the default), an eventually consistent read is
     * used. </li> <li> <p> <i>ExpressionAttributeNames</i> - One or more
     * substitution tokens for attribute names in the
     * <i>ProjectionExpression</i> parameter. The following are some use
     * cases for using <i>ExpressionAttributeNames</i>: <ul> <li> <p>To
     * access an attribute whose name conflicts with a DynamoDB reserved
     * word. </li> <li> <p>To create a placeholder for repeating occurrences
     * of an attribute name in an expression. </li> <li> <p>To prevent
     * special characters in an attribute name from being misinterpreted in
     * an expression. </li> </ul> <p>Use the <b>#</b> character in an
     * expression to dereference an attribute name. For example, consider the
     * following attribute name: <ul><li><p><code>Percentile</code></li></ul>
     * <p>The name of this attribute conflicts with a reserved word, so it
     * cannot be used directly in an expression. (For the complete list of
     * reserved words, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved
     * Words</a> in the <i>Amazon DynamoDB Developer Guide</i>). To work
     * around this, you could specify the following for
     * <i>ExpressionAttributeNames</i>:
     * <ul><li><p><code>{"#P":"Percentile"}</code></li></ul> <p>You could
     * then use this substitution in an expression, as in this example:
     * <ul><li><p><code>#P = :val</code></li></ul> <note><p>Tokens that begin
     * with the <b>:</b> character are <i>expression attribute values</i>,
     * which are placeholders for the actual value at runtime.</note> <p>For
     * more information on expression attribute names, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Accessing
     * Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </li> <li> <p><i>Keys</i> - An array of primary key attribute values
     * that define specific items in the table. For each primary key, you
     * must provide <i>all</i> of the key attributes. For example, with a
     * simple primary key, you only need to provide the partition key value.
     * For a composite key, you must provide <i>both</i> the partition key
     * value and the sort key value. </li> <li>
     * <p><i>ProjectionExpression</i> - A string that identifies one or more
     * attributes to retrieve from the table. These attributes can include
     * scalars, sets, or elements of a JSON document. The attributes in the
     * expression must be separated by commas. <p>If no attribute names are
     * specified, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the
     * result. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Accessing
     * Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </li> <li> <p> <i>AttributesToGet</i> - <important> <p>This is a
     * legacy parameter, for backward compatibility. New applications should
     * use <i>ProjectionExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception. <p>This
     * parameter allows you to retrieve attributes of type List or Map;
     * however, it cannot retrieve individual elements within a List or a
     * Map.</important> <p>The names of one or more attributes to retrieve.
     * If no attribute names are provided, then all attributes will be
     * returned. If any of the requested attributes are not found, they will
     * not appear in the result. <p>Note that <i>AttributesToGet</i> has no
     * effect on provisioned throughput consumption. DynamoDB determines
     * capacity units consumed based on item size, not on the amount of data
     * that is returned to an application. </li> </ul>
     * 
     * @return The response from the BatchGetItem service method, as returned
     *         by AmazonDynamoDBv2.
     * 
     * @throws ResourceNotFoundException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public BatchGetItemResult batchGetItem(java.util.Map<String,KeysAndAttributes> requestItems)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Creates a new item, or replaces an old item with a new item. If an
     * item that has the same primary key as the new item already exists in
     * the specified table, the new item completely replaces the existing
     * item. You can perform a conditional put operation (add a new item if
     * one with the specified primary key doesn't exist), or replace an
     * existing item if it has certain attribute values.
     * </p>
     * <p>
     * In addition to putting an item, you can also return the item's
     * attribute values in the same operation, using the <i>ReturnValues</i>
     * parameter.
     * </p>
     * <p>
     * When you add an item, the primary key attribute(s) are the only
     * required attributes. Attribute values cannot be null. String and
     * Binary type attributes must have lengths greater than zero. Set type
     * attributes cannot be empty. Requests with empty values will be
     * rejected with a <i>ValidationException</i> exception.
     * </p>
     * <p>
     * You can request that <i>PutItem</i> return either a copy of the
     * original item (before the update) or a copy of the updated item (after
     * the update). For more information, see the <i>ReturnValues</i>
     * description below.
     * </p>
     * <p>
     * <b>NOTE:</b> To prevent a new item from replacing an existing item,
     * use a conditional expression that contains the attribute_not_exists
     * function with the name of the attribute being used as the partition
     * key for the table. Since every record must contain that attribute,
     * the attribute_not_exists function will only succeed if no matching
     * item exists.
     * </p>
     * <p>
     * For more information about using this API, see
     * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html"> Working with Items </a>
     * in the <i>Amazon DynamoDB Developer Guide</i> .
     * </p>
     * 
     * @param tableName The name of the table to contain the item.
     * @param item A map of attribute name/value pairs, one for each
     * attribute. Only the primary key attributes are required; you can
     * optionally provide other attribute name-value pairs for the item.
     * <p>You must provide all of the attributes for the primary key. For
     * example, with a simple primary key, you only need to provide a value
     * for the partition key. For a composite primary key, you must provide
     * both values for both the partition key and the sort key. <p>If you
     * specify any attributes that are part of an index key, then the data
     * types for those attributes must match those of the schema in the
     * table's attribute definition. <p>For more information about primary
     * keys, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary
     * Key</a> in the <i>Amazon DynamoDB Developer Guide</i>. <p>Each element
     * in the <i>Item</i> map is an <i>AttributeValue</i> object.
     * 
     * @return The response from the PutItem service method, as returned by
     *         AmazonDynamoDBv2.
     * 
     * @throws ItemCollectionSizeLimitExceededException
     * @throws ResourceNotFoundException
     * @throws ConditionalCheckFailedException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public PutItemResult putItem(String tableName, java.util.Map<String,AttributeValue> item)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Creates a new item, or replaces an old item with a new item. If an
     * item that has the same primary key as the new item already exists in
     * the specified table, the new item completely replaces the existing
     * item. You can perform a conditional put operation (add a new item if
     * one with the specified primary key doesn't exist), or replace an
     * existing item if it has certain attribute values.
     * </p>
     * <p>
     * In addition to putting an item, you can also return the item's
     * attribute values in the same operation, using the <i>ReturnValues</i>
     * parameter.
     * </p>
     * <p>
     * When you add an item, the primary key attribute(s) are the only
     * required attributes. Attribute values cannot be null. String and
     * Binary type attributes must have lengths greater than zero. Set type
     * attributes cannot be empty. Requests with empty values will be
     * rejected with a <i>ValidationException</i> exception.
     * </p>
     * <p>
     * You can request that <i>PutItem</i> return either a copy of the
     * original item (before the update) or a copy of the updated item (after
     * the update). For more information, see the <i>ReturnValues</i>
     * description below.
     * </p>
     * <p>
     * <b>NOTE:</b> To prevent a new item from replacing an existing item,
     * use a conditional expression that contains the attribute_not_exists
     * function with the name of the attribute being used as the partition
     * key for the table. Since every record must contain that attribute,
     * the attribute_not_exists function will only succeed if no matching
     * item exists.
     * </p>
     * <p>
     * For more information about using this API, see
     * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html"> Working with Items </a>
     * in the <i>Amazon DynamoDB Developer Guide</i> .
     * </p>
     * 
     * @param tableName The name of the table to contain the item.
     * @param item A map of attribute name/value pairs, one for each
     * attribute. Only the primary key attributes are required; you can
     * optionally provide other attribute name-value pairs for the item.
     * <p>You must provide all of the attributes for the primary key. For
     * example, with a simple primary key, you only need to provide a value
     * for the partition key. For a composite primary key, you must provide
     * both values for both the partition key and the sort key. <p>If you
     * specify any attributes that are part of an index key, then the data
     * types for those attributes must match those of the schema in the
     * table's attribute definition. <p>For more information about primary
     * keys, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary
     * Key</a> in the <i>Amazon DynamoDB Developer Guide</i>. <p>Each element
     * in the <i>Item</i> map is an <i>AttributeValue</i> object.
     * @param returnValues Use <i>ReturnValues</i> if you want to get the
     * item attributes as they appeared before they were updated with the
     * <i>PutItem</i> request. For <i>PutItem</i>, the valid values are: <ul>
     * <li> <p><code>NONE</code> - If <i>ReturnValues</i> is not specified,
     * or if its value is <code>NONE</code>, then nothing is returned. (This
     * setting is the default for <i>ReturnValues</i>.) </li> <li>
     * <p><code>ALL_OLD</code> - If <i>PutItem</i> overwrote an attribute
     * name-value pair, then the content of the old item is returned. </li>
     * </ul>
     * 
     * @return The response from the PutItem service method, as returned by
     *         AmazonDynamoDBv2.
     * 
     * @throws ItemCollectionSizeLimitExceededException
     * @throws ResourceNotFoundException
     * @throws ConditionalCheckFailedException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public PutItemResult putItem(String tableName, java.util.Map<String,AttributeValue> item, String returnValues)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns an array of table names associated with the current account
     * and endpoint. The output from <i>ListTables</i> is paginated, with
     * each page returning a maximum of 100 table names.
     * </p>
     * 
     * @param exclusiveStartTableName The first table name that this
     * operation will evaluate. Use the value that was returned for
     * <i>LastEvaluatedTableName</i> in a previous operation, so that you can
     * obtain the next page of results.
     * 
     * @return The response from the ListTables service method, as returned
     *         by AmazonDynamoDBv2.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListTablesResult listTables(String exclusiveStartTableName)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns an array of table names associated with the current account
     * and endpoint. The output from <i>ListTables</i> is paginated, with
     * each page returning a maximum of 100 table names.
     * </p>
     * 
     * @param exclusiveStartTableName The first table name that this
     * operation will evaluate. Use the value that was returned for
     * <i>LastEvaluatedTableName</i> in a previous operation, so that you can
     * obtain the next page of results.
     * @param limit A maximum number of table names to return. If this
     * parameter is not specified, the limit is 100.
     * 
     * @return The response from the ListTables service method, as returned
     *         by AmazonDynamoDBv2.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListTablesResult listTables(String exclusiveStartTableName, Integer limit)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns an array of table names associated with the current account
     * and endpoint. The output from <i>ListTables</i> is paginated, with
     * each page returning a maximum of 100 table names.
     * </p>
     * 
     * @param limit A maximum number of table names to return. If this
     * parameter is not specified, the limit is 100.
     * 
     * @return The response from the ListTables service method, as returned
     *         by AmazonDynamoDBv2.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListTablesResult listTables(Integer limit)
             throws AmazonServiceException, AmazonClientException;
    
    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
        