# ColorNamer

The sprint story is: 
As a color namer 
I need to retrieve the controlled color name for known colors 
So that when I publish the names of colors, the variety of names is kept to a minimum 

Given a color harmonizing service 
When somebody does an http post to the service with a known color value 
Then the service will return a harmonized value according to the following table: 
Known value Harmonized value 
* Aqua - Blue 
* Azul - Blue 
* Turquoise - Blue 
* Blue - Blue 
* Chartreuse - Green 
* Moss - Green 
* Forest - Green 
* Green - Green

## Getting Started

Repository Location:
https://github.com/cwnoel/ColorNamer.git

### Prerequisites

You should have the following installed:
* Java 1.8 or greater
* Maven 2.0 or greater




### Installing
```
git clone https://github.com/cwnoel/ColorNamer.git
```
The service is hosted on AWS Elastic Beanstalk using GlassFish 4.0 Server
```
http://Colornamer-env-1.g8svmtmvgs.us-west-2.elasticbeanstalk.com/colornamer
```
## Running the tests
From your project directory
```
mvn test
```

### Test coverage details

* Each of the 8 base scenarios are covered as per the story
* Null input case
* unsupported color case
* basic performance test
* basic injection test - failure

Results should show 12 pass and 1 failure





## Authors

* **Colin Noel** 