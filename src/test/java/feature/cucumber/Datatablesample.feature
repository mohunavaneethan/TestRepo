Feature: sample scenarios for datatable

Scenario: login into adactin as aslist
Given open browser and pass adactin url
When enter the user name as list
|mohan|
|vasuki|
And enter the password as list
|mohan123|
|vasuki123|
And click login button
Then user logged in adactin


Scenario: login into adactin as aslist
Given open browser and pass adactin url
When enter the user name as lists
|mohan|kumar|
|rajenth|balu|
And enter the password as lists
|mohan123|kumar123|
|rajenth123|balu123|
And click login button
Then user logged in adactin



Scenario: login into adactin as asMap
Given open browser and pass adactin url
When enter the user name as Map
|username|mohanraju|
And enter the password as Map
|password|mohanraju123|
And click login button
Then user logged in adactin


Scenario: login into adactin as asMaps
Given open browser and pass adactin url
When enter the user details as Maps
|username|password|mail|
|mohan|mohan123|mohan@gmail.com|
|vasuki|vasuki123|vasuki@gmail.com|
|kumar|kumar23|kumar@gmail.com|
And click login button
Then user logged in adactin



