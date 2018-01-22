# Jersey Init Example

This example demonstrate how to create a simple Jersey application, package it into WAR file and how to run it using [Gretty](http://akhikhl.github.io/gretty-doc/).

## Contents

The mapping of the URI path space is presented in the following table:

URI Path | Resource class | HTTP method
---------|----------------|------------
/myresource|MyResource|GET

Application is configured by using a java class, which registers javax.ws.rs.core.Application descendant to get classes and singletons from it (see class MyApplication).

## Running the example

Run the example as follows:

```
gradle clean appRun
```
This deploy the example using [Gretty](http://akhikhl.github.io/gretty-doc/) container. You can access the application at:

* http://localhost:8080/api/myresource