#!/usr/bin/env python
"""
WordAPI.py
Copyright 2012 Wordnik, Inc.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
"""
import sys
import os

from models import *


class StoreApi(object):

    def __init__(self, apiClient):
      self.apiClient = apiClient

    
    def getOrderById(self, orderId, **kwargs):
        """Find purchase order by ID

        Args:
            orderId, str: ID of pet that needs to be fetched (required)
            
        Returns: Order
        """

        allParams = ['orderId']

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method getOrderById" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/store/order/{orderId}'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'GET'

        queryParams = {}
        headerParams = {}

        if ('orderId' in params):
            replacement = str(self.apiClient.toPathValue(params['orderId']))
            resourcePath = resourcePath.replace('{' + 'orderId' + '}',
                                                replacement)
        postData = (params['body'] if 'body' in params else None)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams)

        if not response:
            return None

        responseObject = self.apiClient.deserialize(response, 'Order')
        return responseObject
        
        
    def deleteOrder(self, orderId, **kwargs):
        """Delete purchase order by ID

        Args:
            orderId, str: ID of the order that needs to be deleted (required)
            
        Returns: 
        """

        allParams = ['orderId']

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method deleteOrder" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/store/order/{orderId}'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'DELETE'

        queryParams = {}
        headerParams = {}

        if ('orderId' in params):
            replacement = str(self.apiClient.toPathValue(params['orderId']))
            resourcePath = resourcePath.replace('{' + 'orderId' + '}',
                                                replacement)
        postData = (params['body'] if 'body' in params else None)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams)

        
        
    def placeOrder(self, body, **kwargs):
        """Place an order for a pet

        Args:
            body, Order: order placed for purchasing the pet (required)
            
        Returns: 
        """

        allParams = ['body']

        params = locals()
        for (key, val) in params['kwargs'].iteritems():
            if key not in allParams:
                raise TypeError("Got an unexpected keyword argument '%s' to method placeOrder" % key)
            params[key] = val
        del params['kwargs']

        resourcePath = '/store/order'
        resourcePath = resourcePath.replace('{format}', 'json')
        method = 'POST'

        queryParams = {}
        headerParams = {}

        postData = (params['body'] if 'body' in params else None)

        response = self.apiClient.callAPI(resourcePath, method, queryParams,
                                          postData, headerParams)

        
        
    


