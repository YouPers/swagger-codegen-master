#!/usr/bin/env python
"""
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
"""
class User:
    """NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually."""


    def __init__(self):
        self.swaggerTypes = {
            'id': 'int',
            'username': 'str',
            'firstName': 'str',
            'lastName': 'str',
            'email': 'str',
            'password': 'str',
            'phone': 'str',
            'userStatus': 'int'

        }


        #Unique identifier for the user
        self.id = None # int
        #Unique username
        self.username = None # str
        #First name of the user
        self.firstName = None # str
        #Last name of the user
        self.lastName = None # str
        #Email address of the user
        self.email = None # str
        #Password name of the user
        self.password = None # str
        #Phone number of the user
        self.phone = None # str
        #User Status
        self.userStatus = None # int
        
