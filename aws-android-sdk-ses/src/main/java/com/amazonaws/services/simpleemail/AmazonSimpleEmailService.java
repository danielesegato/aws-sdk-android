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
package com.amazonaws.services.simpleemail;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.simpleemail.model.*;

/**
 * Interface for accessing AmazonSimpleEmailService.
 * Amazon Simple Email Service <p>
 * This is the API Reference for Amazon Simple Email Service (Amazon
 * SES). This documentation is intended to be used in conjunction with
 * the
 * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/Welcome.html"> Amazon SES Developer Guide </a>
 * .
 * </p>
 * <p>
 * <b>NOTE:</b>For a list of Amazon SES endpoints to use in service
 * requests, see Regions and Amazon SES in the Amazon SES Developer
 * Guide.
 * </p>
 */
public interface AmazonSimpleEmailService {

    /**
     * Overrides the default endpoint for this client ("https://email.us-east-1.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "email.us-east-1.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://email.us-east-1.amazonaws.com"). If the
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
     *            The endpoint (ex: "email.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://email.us-east-1.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonSimpleEmailService#setEndpoint(String)}, sets the
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
     * Deletes the specified identity (email address or domain) from the
     * list of verified identities.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param deleteIdentityRequest Container for the necessary parameters to
     *           execute the DeleteIdentity service method on AmazonSimpleEmailService.
     * 
     * @return The response from the DeleteIdentity service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteIdentityResult deleteIdentity(DeleteIdentityRequest deleteIdentityRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a receipt rule.
     * </p>
     * <p>
     * For information about managing receipt rules, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param updateReceiptRuleRequest Container for the necessary parameters
     *           to execute the UpdateReceiptRule service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the UpdateReceiptRule service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     * @throws LimitExceededException
     * @throws InvalidS3ConfigurationException
     * @throws RuleSetDoesNotExistException
     * @throws InvalidLambdaFunctionException
     * @throws RuleDoesNotExistException
     * @throws InvalidSnsTopicException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateReceiptRuleResult updateReceiptRule(UpdateReceiptRuleRequest updateReceiptRuleRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list containing all of the email addresses that have been
     * verified.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>The ListVerifiedEmailAddresses action is deprecated
     * as of the May 15, 2012 release of Domain Verification. The
     * ListIdentities action is now preferred.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param listVerifiedEmailAddressesRequest Container for the necessary
     *           parameters to execute the ListVerifiedEmailAddresses service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the ListVerifiedEmailAddresses service
     *         method, as returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListVerifiedEmailAddressesResult listVerifiedEmailAddresses(ListVerifiedEmailAddressesRequest listVerifiedEmailAddressesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified receipt rule.
     * </p>
     * <p>
     * For information about managing receipt rules, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param deleteReceiptRuleRequest Container for the necessary parameters
     *           to execute the DeleteReceiptRule service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the DeleteReceiptRule service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     * @throws RuleSetDoesNotExistException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteReceiptRuleResult deleteReceiptRule(DeleteReceiptRuleRequest deleteReceiptRuleRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Verifies an email address. This action causes a confirmation email
     * message to be sent to the specified address.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param verifyEmailIdentityRequest Container for the necessary
     *           parameters to execute the VerifyEmailIdentity service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the VerifyEmailIdentity service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public VerifyEmailIdentityResult verifyEmailIdentity(VerifyEmailIdentityRequest verifyEmailIdentityRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Given a list of verified identities (email addresses and/or domains),
     * returns a structure describing identity notification attributes.
     * </p>
     * <p>
     * This action is throttled at one request per second and can only get
     * notification attributes for up to 100 identities at a time.
     * </p>
     * <p>
     * For more information about using notifications with Amazon SES, see
     * the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     *
     * @param getIdentityNotificationAttributesRequest Container for the
     *           necessary parameters to execute the GetIdentityNotificationAttributes
     *           service method on AmazonSimpleEmailService.
     * 
     * @return The response from the GetIdentityNotificationAttributes
     *         service method, as returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetIdentityNotificationAttributesResult getIdentityNotificationAttributes(GetIdentityNotificationAttributesRequest getIdentityNotificationAttributesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a set of DKIM tokens for a domain. DKIM <i>tokens</i> are
     * character strings that represent your domain's identity. Using these
     * tokens, you will need to create DNS CNAME records that point to DKIM
     * public keys hosted by Amazon SES. Amazon Web Services will eventually
     * detect that you have updated your DNS records; this detection process
     * may take up to 72 hours. Upon successful detection, Amazon SES will be
     * able to DKIM-sign email originating from that domain.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * To enable or disable Easy DKIM signing for a domain, use the
     * <code>SetIdentityDkimEnabled</code> action.
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go
     * to the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     *
     * @param verifyDomainDkimRequest Container for the necessary parameters
     *           to execute the VerifyDomainDkim service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the VerifyDomainDkim service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public VerifyDomainDkimResult verifyDomainDkim(VerifyDomainDkimRequest verifyDomainDkimRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the current status of Easy DKIM signing for an entity. For
     * domain name identities, this action also returns the DKIM tokens that
     * are required for Easy DKIM signing, and whether Amazon SES has
     * successfully verified that these tokens have been published.
     * </p>
     * <p>
     * This action takes a list of identities as input and returns the
     * following information for each:
     * </p>
     * 
     * <ul>
     * <li>Whether Easy DKIM signing is enabled or disabled.</li>
     * <li>A set of DKIM tokens that represent the identity. If the identity
     * is an email address, the tokens represent the domain of that
     * address.</li>
     * <li>Whether Amazon SES has successfully verified the DKIM tokens
     * published in the domain's DNS. This information is only returned for
     * domain name identities, not for email addresses.</li>
     * 
     * </ul>
     * <p>
     * This action is throttled at one request per second and can only get
     * DKIM attributes for up to 100 identities at a time.
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go
     * to the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     *
     * @param getIdentityDkimAttributesRequest Container for the necessary
     *           parameters to execute the GetIdentityDkimAttributes service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the GetIdentityDkimAttributes service
     *         method, as returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetIdentityDkimAttributesResult getIdentityDkimAttributes(GetIdentityDkimAttributesRequest getIdentityDkimAttributesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the details of the specified receipt rule set.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param describeReceiptRuleSetRequest Container for the necessary
     *           parameters to execute the DescribeReceiptRuleSet service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the DescribeReceiptRuleSet service method,
     *         as returned by AmazonSimpleEmailService.
     * 
     * @throws RuleSetDoesNotExistException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReceiptRuleSetResult describeReceiptRuleSet(DescribeReceiptRuleSetRequest describeReceiptRuleSetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Verifies an email address. This action causes a confirmation email
     * message to be sent to the specified address.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>The VerifyEmailAddress action is deprecated as of
     * the May 15, 2012 release of Domain Verification. The
     * VerifyEmailIdentity action is now preferred.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param verifyEmailAddressRequest Container for the necessary
     *           parameters to execute the VerifyEmailAddress service method on
     *           AmazonSimpleEmailService.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void verifyEmailAddress(VerifyEmailAddressRequest verifyEmailAddressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of sending authorization policies that are attached to
     * the given identity (email address or domain). This API returns only a
     * list. If you want the actual policy content, you can use
     * <code>GetIdentityPolicies</code> .
     * </p>
     * <p>
     * <b>NOTE:</b>This API is for the identity owner only. If you have not
     * verified the identity, this API will return an error.
     * </p>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param listIdentityPoliciesRequest Container for the necessary
     *           parameters to execute the ListIdentityPolicies service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the ListIdentityPolicies service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListIdentityPoliciesResult listIdentityPolicies(ListIdentityPoliciesRequest listIdentityPoliciesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list containing all of the identities (email addresses and
     * domains) for a specific AWS Account, regardless of verification
     * status.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param listIdentitiesRequest Container for the necessary parameters to
     *           execute the ListIdentities service method on AmazonSimpleEmailService.
     * 
     * @return The response from the ListIdentities service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListIdentitiesResult listIdentities(ListIdentitiesRequest listIdentitiesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Given a list of identities (email addresses and/or domains), returns
     * the verification status and (for domain identities) the verification
     * token for each identity.
     * </p>
     * <p>
     * This action is throttled at one request per second and can only get
     * verification attributes for up to 100 identities at a time.
     * </p>
     *
     * @param getIdentityVerificationAttributesRequest Container for the
     *           necessary parameters to execute the GetIdentityVerificationAttributes
     *           service method on AmazonSimpleEmailService.
     * 
     * @return The response from the GetIdentityVerificationAttributes
     *         service method, as returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetIdentityVerificationAttributesResult getIdentityVerificationAttributes(GetIdentityVerificationAttributesRequest getIdentityVerificationAttributesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables or disables the custom MAIL FROM domain setup for a verified
     * identity (email address or domain).
     * </p>
     * <p>
     * <b>IMPORTANT:</b>To send emails using the specified MAIL FROM domain,
     * you must add an MX record to your MAIL FROM domain's DNS settings. If
     * you want your emails to pass Sender Policy Framework (SPF) checks, you
     * must also add or update an SPF record. For more information, see the
     * Amazon SES Developer Guide.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param setIdentityMailFromDomainRequest Container for the necessary
     *           parameters to execute the SetIdentityMailFromDomain service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the SetIdentityMailFromDomain service
     *         method, as returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SetIdentityMailFromDomainResult setIdentityMailFromDomain(SetIdentityMailFromDomainRequest setIdentityMailFromDomainRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Given an identity (email address or domain), enables or disables
     * whether Amazon SES forwards bounce and complaint notifications as
     * email. Feedback forwarding can only be disabled when Amazon Simple
     * Notification Service (Amazon SNS) topics are specified for both
     * bounces and complaints.
     * </p>
     * <p>
     * <b>NOTE:</b>Feedback forwarding does not apply to delivery
     * notifications. Delivery notifications are only available through
     * Amazon SNS.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * For more information about using notifications with Amazon SES, see
     * the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     *
     * @param setIdentityFeedbackForwardingEnabledRequest Container for the
     *           necessary parameters to execute the
     *           SetIdentityFeedbackForwardingEnabled service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the SetIdentityFeedbackForwardingEnabled
     *         service method, as returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SetIdentityFeedbackForwardingEnabledResult setIdentityFeedbackForwardingEnabled(SetIdentityFeedbackForwardingEnabledRequest setIdentityFeedbackForwardingEnabledRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Reorders the receipt rules within a receipt rule set.
     * </p>
     * <p>
     * <b>NOTE:</b>All of the rules in the rule set must be represented in
     * this request. That is, this API will return an error if the reorder
     * request doesn't explicitly position all of the rules.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param reorderReceiptRuleSetRequest Container for the necessary
     *           parameters to execute the ReorderReceiptRuleSet service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the ReorderReceiptRuleSet service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     * @throws RuleSetDoesNotExistException
     * @throws RuleDoesNotExistException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ReorderReceiptRuleSetResult reorderReceiptRuleSet(ReorderReceiptRuleSetRequest reorderReceiptRuleSetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified IP address filter.
     * </p>
     * <p>
     * For information about managing IP address filters, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-ip-filters.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param deleteReceiptFilterRequest Container for the necessary
     *           parameters to execute the DeleteReceiptFilter service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the DeleteReceiptFilter service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteReceiptFilterResult deleteReceiptFilter(DeleteReceiptFilterRequest deleteReceiptFilterRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets the position of the specified receipt rule in the receipt rule
     * set.
     * </p>
     * <p>
     * For information about managing receipt rules, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param setReceiptRulePositionRequest Container for the necessary
     *           parameters to execute the SetReceiptRulePosition service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the SetReceiptRulePosition service method,
     *         as returned by AmazonSimpleEmailService.
     * 
     * @throws RuleSetDoesNotExistException
     * @throws RuleDoesNotExistException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SetReceiptRulePositionResult setReceiptRulePosition(SetReceiptRulePositionRequest setReceiptRulePositionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the details of the specified receipt rule.
     * </p>
     * <p>
     * For information about setting up receipt rules, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param describeReceiptRuleRequest Container for the necessary
     *           parameters to execute the DescribeReceiptRule service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the DescribeReceiptRule service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     * @throws RuleSetDoesNotExistException
     * @throws RuleDoesNotExistException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReceiptRuleResult describeReceiptRule(DescribeReceiptRuleRequest describeReceiptRuleRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the IP address filters associated with your account.
     * </p>
     * <p>
     * For information about managing IP address filters, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-ip-filters.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param listReceiptFiltersRequest Container for the necessary
     *           parameters to execute the ListReceiptFilters service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the ListReceiptFilters service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListReceiptFiltersResult listReceiptFilters(ListReceiptFiltersRequest listReceiptFiltersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new IP address filter.
     * </p>
     * <p>
     * For information about setting up IP address filters, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-ip-filters.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param createReceiptFilterRequest Container for the necessary
     *           parameters to execute the CreateReceiptFilter service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the CreateReceiptFilter service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     * @throws AlreadyExistsException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateReceiptFilterResult createReceiptFilter(CreateReceiptFilterRequest createReceiptFilterRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the user's sending statistics. The result is a list of data
     * points, representing the last two weeks of sending activity.
     * </p>
     * <p>
     * Each data point in the list contains statistics for a 15-minute
     * interval.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param getSendStatisticsRequest Container for the necessary parameters
     *           to execute the GetSendStatistics service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the GetSendStatistics service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetSendStatisticsResult getSendStatistics(GetSendStatisticsRequest getSendStatisticsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets the specified receipt rule set as the active receipt rule set.
     * </p>
     * <p>
     * <b>NOTE:</b>To disable your email-receiving through Amazon SES
     * completely, you can call this API with RuleSetName set to null.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param setActiveReceiptRuleSetRequest Container for the necessary
     *           parameters to execute the SetActiveReceiptRuleSet service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the SetActiveReceiptRuleSet service method,
     *         as returned by AmazonSimpleEmailService.
     * 
     * @throws RuleSetDoesNotExistException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SetActiveReceiptRuleSetResult setActiveReceiptRuleSet(SetActiveReceiptRuleSetRequest setActiveReceiptRuleSetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the metadata and receipt rules for the receipt rule set that
     * is currently active.
     * </p>
     * <p>
     * For information about setting up receipt rule sets, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param describeActiveReceiptRuleSetRequest Container for the necessary
     *           parameters to execute the DescribeActiveReceiptRuleSet service method
     *           on AmazonSimpleEmailService.
     * 
     * @return The response from the DescribeActiveReceiptRuleSet service
     *         method, as returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeActiveReceiptRuleSetResult describeActiveReceiptRuleSet(DescribeActiveReceiptRuleSetRequest describeActiveReceiptRuleSetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sends an email message, with header and content specified by the
     * client. The <code>SendRawEmail</code> action is useful for sending
     * multipart MIME emails. The raw text of the message must comply with
     * Internet email standards; otherwise, the message cannot be sent.
     * </p>
     * <p>
     * There are several important points to know about
     * <code>SendRawEmail</code> :
     * </p>
     * 
     * <ul>
     * <li>You can only send email from verified email addresses and
     * domains; otherwise, you will get an "Email address not verified"
     * error. If your account is still in the Amazon SES sandbox, you must
     * also verify every recipient email address except for the recipients
     * provided by the Amazon SES mailbox simulator. For more information, go
     * to the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"> Amazon SES Developer Guide </a>
     * .</li>
     * <li>The total size of the message cannot exceed 10 MB. This includes
     * any attachments that are part of the message.</li>
     * <li>Amazon SES has a limit on the total number of recipients per
     * message. The combined number of To:, CC: and BCC: email addresses
     * cannot exceed 50. If you need to send an email message to a larger
     * audience, you can divide your recipient list into groups of 50 or
     * fewer, and then call Amazon SES repeatedly to send the message to each
     * group.</li>
     * <li>The To:, CC:, and BCC: headers in the raw message can contain a
     * group list. Note that each recipient in a group list counts towards
     * the 50-recipient limit.</li>
     * <li>For every message that you send, the total number of recipients
     * (To:, CC: and BCC:) is counted against your sending quota - the
     * maximum number of emails you can send in a 24-hour period. For
     * information about your sending quota, go to the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html"> Amazon SES Developer Guide </a>
     * .</li>
     * <li>If you are using sending authorization to send on behalf of
     * another user, <code>SendRawEmail</code> enables you to specify the
     * cross-account identity for the email's "Source," "From," and
     * "Return-Path" parameters in one of two ways: you can pass optional
     * parameters <code>SourceArn</code> , <code>FromArn</code> , and/or
     * <code>ReturnPathArn</code> to the API, or you can include the
     * following X-headers in the header of your raw email:
     * <ul>
     * <li> <code>X-SES-SOURCE-ARN</code> </li>
     * <li> <code>X-SES-FROM-ARN</code> </li>
     * <li> <code>X-SES-RETURN-PATH-ARN</code> </li>
     * 
     * </ul>
     * <p>
     * <b>IMPORTANT:</b>Do not include these X-headers in the DKIM
     * signature, because they are removed by Amazon SES before sending the
     * email.
     * </p>
     * For the most common sending authorization use case, we recommend that
     * you specify the <code>SourceIdentityArn</code> and do not specify
     * either the <code>FromIdentityArn</code> or
     * <code>ReturnPathIdentityArn</code> . (The same note applies to the
     * corresponding X-headers.) If you only specify the
     * <code>SourceIdentityArn</code> , Amazon SES will simply set the "From"
     * address and the "Return Path" address to the identity specified in
     * <code>SourceIdentityArn</code> . For more information about sending
     * authorization, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"> Amazon SES Developer Guide </a>
     * .</li>
     * 
     * </ul>
     *
     * @param sendRawEmailRequest Container for the necessary parameters to
     *           execute the SendRawEmail service method on AmazonSimpleEmailService.
     * 
     * @return The response from the SendRawEmail service method, as returned
     *         by AmazonSimpleEmailService.
     * 
     * @throws MailFromDomainNotVerifiedException
     * @throws MessageRejectedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SendRawEmailResult sendRawEmail(SendRawEmailRequest sendRawEmailRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a receipt rule.
     * </p>
     * <p>
     * For information about setting up receipt rules, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rules.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param createReceiptRuleRequest Container for the necessary parameters
     *           to execute the CreateReceiptRule service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the CreateReceiptRule service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     * @throws AlreadyExistsException
     * @throws LimitExceededException
     * @throws InvalidS3ConfigurationException
     * @throws RuleSetDoesNotExistException
     * @throws InvalidLambdaFunctionException
     * @throws RuleDoesNotExistException
     * @throws InvalidSnsTopicException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateReceiptRuleResult createReceiptRule(CreateReceiptRuleRequest createReceiptRuleRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified receipt rule set and all of the receipt rules
     * it contains.
     * </p>
     * <p>
     * <b>NOTE:</b>The currently active rule set cannot be deleted.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param deleteReceiptRuleSetRequest Container for the necessary
     *           parameters to execute the DeleteReceiptRuleSet service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the DeleteReceiptRuleSet service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     * @throws CannotDeleteException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteReceiptRuleSetResult deleteReceiptRuleSet(DeleteReceiptRuleSetRequest deleteReceiptRuleSetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds or updates a sending authorization policy for the specified
     * identity (email address or domain).
     * </p>
     * <p>
     * <b>NOTE:</b>This API is for the identity owner only. If you have not
     * verified the identity, this API will return an error.
     * </p>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param putIdentityPolicyRequest Container for the necessary parameters
     *           to execute the PutIdentityPolicy service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the PutIdentityPolicy service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     * @throws InvalidPolicyException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public PutIdentityPolicyResult putIdentityPolicy(PutIdentityPolicyRequest putIdentityPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the requested sending authorization policies for the given
     * identity (email address or domain). The policies are returned as a map
     * of policy names to policy contents. You can retrieve a maximum of 20
     * policies at a time.
     * </p>
     * <p>
     * <b>NOTE:</b>This API is for the identity owner only. If you have not
     * verified the identity, this API will return an error.
     * </p>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param getIdentityPoliciesRequest Container for the necessary
     *           parameters to execute the GetIdentityPolicies service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the GetIdentityPolicies service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetIdentityPoliciesResult getIdentityPolicies(GetIdentityPoliciesRequest getIdentityPoliciesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables or disables Easy DKIM signing of email sent from an identity:
     * </p>
     * 
     * <ul>
     * <li>If Easy DKIM signing is enabled for a domain name identity (e.g.,
     * <code>example.com</code> ), then Amazon SES will DKIM-sign all email
     * sent by addresses under that domain name (e.g.,
     * <code>user@example.com</code> ).</li>
     * <li>If Easy DKIM signing is enabled for an email address, then Amazon
     * SES will DKIM-sign all email sent by that email address.</li>
     * 
     * </ul>
     * <p>
     * For email addresses (e.g., <code>user@example.com</code> ), you can
     * only enable Easy DKIM signing if the corresponding domain (e.g.,
     * <code>example.com</code> ) has been set up for Easy DKIM using the AWS
     * Console or the <code>VerifyDomainDkim</code> action.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * For more information about Easy DKIM signing, go to the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     *
     * @param setIdentityDkimEnabledRequest Container for the necessary
     *           parameters to execute the SetIdentityDkimEnabled service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the SetIdentityDkimEnabled service method,
     *         as returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SetIdentityDkimEnabledResult setIdentityDkimEnabled(SetIdentityDkimEnabledRequest setIdentityDkimEnabledRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the user's current sending limits.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param getSendQuotaRequest Container for the necessary parameters to
     *           execute the GetSendQuota service method on AmazonSimpleEmailService.
     * 
     * @return The response from the GetSendQuota service method, as returned
     *         by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetSendQuotaResult getSendQuota(GetSendQuotaRequest getSendQuotaRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified sending authorization policy for the given
     * identity (email address or domain). This API returns successfully even
     * if a policy with the specified name does not exist.
     * </p>
     * <p>
     * <b>NOTE:</b>This API is for the identity owner only. If you have not
     * verified the identity, this API will return an error.
     * </p>
     * <p>
     * Sending authorization is a feature that enables an identity owner to
     * authorize other senders to use its identities. For information about
     * using sending authorization, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param deleteIdentityPolicyRequest Container for the necessary
     *           parameters to execute the DeleteIdentityPolicy service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the DeleteIdentityPolicy service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteIdentityPolicyResult deleteIdentityPolicy(DeleteIdentityPolicyRequest deleteIdentityPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the receipt rule sets that exist under your AWS account. If
     * there are additional receipt rule sets to be retrieved, you will
     * receive a <code>NextToken</code> that you can provide to the next call
     * to <code>ListReceiptRuleSets</code> to retrieve the additional
     * entries.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param listReceiptRuleSetsRequest Container for the necessary
     *           parameters to execute the ListReceiptRuleSets service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the ListReceiptRuleSets service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListReceiptRuleSetsResult listReceiptRuleSets(ListReceiptRuleSetsRequest listReceiptRuleSetsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Composes an email message based on input data, and then immediately
     * queues the message for sending.
     * </p>
     * <p>
     * There are several important points to know about
     * <code>SendEmail</code> :
     * </p>
     * 
     * <ul>
     * <li>You can only send email from verified email addresses and
     * domains; otherwise, you will get an "Email address not verified"
     * error. If your account is still in the Amazon SES sandbox, you must
     * also verify every recipient email address except for the recipients
     * provided by the Amazon SES mailbox simulator. For more information, go
     * to the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"> Amazon SES Developer Guide </a>
     * .</li>
     * <li>The total size of the message cannot exceed 10 MB. This includes
     * any attachments that are part of the message.</li>
     * <li>Amazon SES has a limit on the total number of recipients per
     * message. The combined number of To:, CC: and BCC: email addresses
     * cannot exceed 50. If you need to send an email message to a larger
     * audience, you can divide your recipient list into groups of 50 or
     * fewer, and then call Amazon SES repeatedly to send the message to each
     * group.</li>
     * <li>For every message that you send, the total number of recipients
     * (To:, CC: and BCC:) is counted against your sending quota - the
     * maximum number of emails you can send in a 24-hour period. For
     * information about your sending quota, go to the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html"> Amazon SES Developer Guide </a>
     * .</li>
     * 
     * </ul>
     *
     * @param sendEmailRequest Container for the necessary parameters to
     *           execute the SendEmail service method on AmazonSimpleEmailService.
     * 
     * @return The response from the SendEmail service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     * @throws MailFromDomainNotVerifiedException
     * @throws MessageRejectedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SendEmailResult sendEmail(SendEmailRequest sendEmailRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Verifies a domain.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param verifyDomainIdentityRequest Container for the necessary
     *           parameters to execute the VerifyDomainIdentity service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the VerifyDomainIdentity service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public VerifyDomainIdentityResult verifyDomainIdentity(VerifyDomainIdentityRequest verifyDomainIdentityRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Given an identity (email address or domain), sets the Amazon Simple
     * Notification Service (Amazon SNS) topic to which Amazon SES will
     * publish bounce, complaint, and/or delivery notifications for emails
     * sent with that identity as the <code>Source</code> .
     * </p>
     * <p>
     * <b>NOTE:</b>Unless feedback forwarding is enabled, you must specify
     * Amazon SNS topics for bounce and complaint notifications. For more
     * information, see SetIdentityFeedbackForwardingEnabled.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * <p>
     * For more information about feedback notification, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     *
     * @param setIdentityNotificationTopicRequest Container for the necessary
     *           parameters to execute the SetIdentityNotificationTopic service method
     *           on AmazonSimpleEmailService.
     * 
     * @return The response from the SetIdentityNotificationTopic service
     *         method, as returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SetIdentityNotificationTopicResult setIdentityNotificationTopic(SetIdentityNotificationTopicRequest setIdentityNotificationTopicRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified email address from the list of verified
     * addresses.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>The DeleteVerifiedEmailAddress action is deprecated
     * as of the May 15, 2012 release of Domain Verification. The
     * DeleteIdentity action is now preferred.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param deleteVerifiedEmailAddressRequest Container for the necessary
     *           parameters to execute the DeleteVerifiedEmailAddress service method on
     *           AmazonSimpleEmailService.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteVerifiedEmailAddress(DeleteVerifiedEmailAddressRequest deleteVerifiedEmailAddressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a receipt rule set by cloning an existing one. All receipt
     * rules and configurations are copied to the new receipt rule set and
     * are completely independent of the source rule set.
     * </p>
     * <p>
     * For information about setting up rule sets, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param cloneReceiptRuleSetRequest Container for the necessary
     *           parameters to execute the CloneReceiptRuleSet service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the CloneReceiptRuleSet service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     * @throws AlreadyExistsException
     * @throws LimitExceededException
     * @throws RuleSetDoesNotExistException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CloneReceiptRuleSetResult cloneReceiptRuleSet(CloneReceiptRuleSetRequest cloneReceiptRuleSetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the custom MAIL FROM attributes for a list of identities
     * (email addresses and/or domains).
     * </p>
     * <p>
     * This action is throttled at one request per second and can only get
     * custom MAIL FROM attributes for up to 100 identities at a time.
     * </p>
     *
     * @param getIdentityMailFromDomainAttributesRequest Container for the
     *           necessary parameters to execute the
     *           GetIdentityMailFromDomainAttributes service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the GetIdentityMailFromDomainAttributes
     *         service method, as returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetIdentityMailFromDomainAttributesResult getIdentityMailFromDomainAttributes(GetIdentityMailFromDomainAttributesRequest getIdentityMailFromDomainAttributesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Generates and sends a bounce message to the sender of an email you
     * received through Amazon SES. You can only use this API on an email up
     * to 24 hours after you receive it.
     * </p>
     * <p>
     * <b>NOTE:</b>You cannot use this API to send generic bounces for mail
     * that was not received by Amazon SES.
     * </p>
     * <p>
     * For information about receiving email through Amazon SES, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param sendBounceRequest Container for the necessary parameters to
     *           execute the SendBounce service method on AmazonSimpleEmailService.
     * 
     * @return The response from the SendBounce service method, as returned
     *         by AmazonSimpleEmailService.
     * 
     * @throws MessageRejectedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SendBounceResult sendBounce(SendBounceRequest sendBounceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an empty receipt rule set.
     * </p>
     * <p>
     * For information about setting up receipt rule sets, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     *
     * @param createReceiptRuleSetRequest Container for the necessary
     *           parameters to execute the CreateReceiptRuleSet service method on
     *           AmazonSimpleEmailService.
     * 
     * @return The response from the CreateReceiptRuleSet service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     * @throws AlreadyExistsException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateReceiptRuleSetResult createReceiptRuleSet(CreateReceiptRuleSetRequest createReceiptRuleSetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list containing all of the email addresses that have been
     * verified.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>The ListVerifiedEmailAddresses action is deprecated
     * as of the May 15, 2012 release of Domain Verification. The
     * ListIdentities action is now preferred.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @return The response from the ListVerifiedEmailAddresses service
     *         method, as returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListVerifiedEmailAddressesResult listVerifiedEmailAddresses() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns a list containing all of the identities (email addresses and
     * domains) for a specific AWS Account, regardless of verification
     * status.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @return The response from the ListIdentities service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListIdentitiesResult listIdentities() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Lists the IP address filters associated with your account.
     * </p>
     * <p>
     * For information about managing IP address filters, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-ip-filters.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @return The response from the ListReceiptFilters service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListReceiptFiltersResult listReceiptFilters() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns the user's sending statistics. The result is a list of data
     * points, representing the last two weeks of sending activity.
     * </p>
     * <p>
     * Each data point in the list contains statistics for a 15-minute
     * interval.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @return The response from the GetSendStatistics service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetSendStatisticsResult getSendStatistics() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Sets the specified receipt rule set as the active receipt rule set.
     * </p>
     * <p>
     * <b>NOTE:</b>To disable your email-receiving through Amazon SES
     * completely, you can call this API with RuleSetName set to null.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @return The response from the SetActiveReceiptRuleSet service method,
     *         as returned by AmazonSimpleEmailService.
     * 
     * @throws RuleSetDoesNotExistException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SetActiveReceiptRuleSetResult setActiveReceiptRuleSet() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns the metadata and receipt rules for the receipt rule set that
     * is currently active.
     * </p>
     * <p>
     * For information about setting up receipt rule sets, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-receipt-rule-set.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @return The response from the DescribeActiveReceiptRuleSet service
     *         method, as returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeActiveReceiptRuleSetResult describeActiveReceiptRuleSet() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns the user's current sending limits.
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @return The response from the GetSendQuota service method, as returned
     *         by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetSendQuotaResult getSendQuota() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Lists the receipt rule sets that exist under your AWS account. If
     * there are additional receipt rule sets to be retrieved, you will
     * receive a <code>NextToken</code> that you can provide to the next call
     * to <code>ListReceiptRuleSets</code> to retrieve the additional
     * entries.
     * </p>
     * <p>
     * For information about managing receipt rule sets, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"> Amazon SES Developer Guide </a>
     * .
     * </p>
     * <p>
     * This action is throttled at one request per second.
     * </p>
     * 
     * @return The response from the ListReceiptRuleSets service method, as
     *         returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListReceiptRuleSetsResult listReceiptRuleSets() throws AmazonServiceException, AmazonClientException;
    
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
        