CONTENTS OF THIS FILE
---------------------
   
 * Introduction
 * Requirements
 * Steps To Execute The Code
 * Troubleshooting

INTRODUCTION
------------

Problem Description:

Developing a Music Search Engine using Apache Solr
	->The collection will contain Music lyrics, and metadata of the music item its genre, singer/player, album name (if any), release date etc.
	->Searches can be by musician name, album name, lyrics etc.
	->Both backend and frontend of the system has to be developed


SYSTEM REQUIREMENTS
--------------------
- Apache Solr 4.10.1
- JRE1.6 and above
- Eclipse IDE 
- Internet Connectivity
- Apache Maven
- Google Youtube Service API
- Jar Files Required
	*All the Jars from - "solr-4.10.1\dist\" folder
	*All the Jars from - "solr-4.10.1\dist\solrj-lib\" folder
	apache-lucene.jar
	jcommon-1.0.8.jar
	jfreechart.jar
	jsoup-1.9.2.jar
	nekohtml-1.9.17.jar
	org.apache.lucene.core_2.9.1.v201101211721.jar
	org.tartarus.snowball.jar
	scanner-3.1.0.cr1-sources.jar
	xerces-2_6_2.jar
	jdom.jar
	commons-logging-1.2.jar
	commons-logging-1.2-javadoc.jar
	javax.xml.parsers-1_1.jar
	slf4j-api-1.7.21.jar
	slf4j-simple-1.7.21.jar
	log4j-1.2.17.jar
	google-api-client-1.22.0.jar
	google-api-services-youtube-v3-rev179-1.22.0.jar
	google-api-services-youtubeAnalytics-v1-rev63-1.22.0.jar
	google-api-services-youtubereporting-v1-rev10-1.22.0.jar
	google-collections-1.0.jar
	google-http-client-1.20.0.jar
	google-http-client-jackson2-1.20.0.jar
	google-oauth-client-1.22.0.jar
	google-oauth-client-java6-1.20.0.jar
	google-oauth-client-jetty-1.20.0.jar


Step To Execute The Project
-------------------------

1. Changes needs to be done in Solr Directory - 

-Create a New solr Core by Name 'Music'. more informtation on creating Solr core - https://qnalist.com/questions/5400978/how-to-dynamically-create-solr-cores-with-schema
-After creating Music core go to - C:\solr-4.10.1\example\solr\Music\conf and replace velocity folder, schema.xml file and solrconfig.xml file with files submitted with this project.
-Go to path - C:\solr-4.10.1\example from command prompt
-Start the Solr Server - using command -  java -jar start.jar 
-When Solr is started connect to - http://localhost:8983/solr/
-For more information about the "Solr Home" and Solr specific configuration
 * http://lucene.apache.org/solr/tutorial.html - For a Tutorial using this example configuration
 * http://wiki.apache.org/solr/SolrResources - For a list of other tutorials and introductory articles.


2. Steps to crawl data from music lyrics website

-Import Java Project in eclipse IDE
-Use the input.txt file to enter seed URL - http://www.hindilyrics.net.
-Add input.txt file path to config.properties file which is maintained in : ..\MusicSearch\resources 
-Import the External Jar files mentioned in System Requirements.
-Open the LyricsCrawler.java file in Eclipse IDE
-Add samples maven project submitted with this project by selecting pom.xml for java and this project to project resources of MusicSearch project.   
-Build and Run the Code
-Output.txt file will be generated which has details about number of files generated from each Seed URL 
-Connect to -  http://localhost:8983/solr/ and select core as "Music" to see data added to Solr core
-Connect to - http://localhost:8983/solr/Music/browse - here you can see UI page of Search Engine. 

TROUBLESHOOTING
---------------
For any Solr Exceptions  - https://cwiki.apache.org/confluence/display/solr/Apache+Solr+Reference+Guide

For Youtube API Excpetions - https://developers.google.com/youtube/2.0/developers_guide_java

Java Exceptions handled:
-IOException - Exception occurs when reading or writing to file or console. 
-ConnectException - Exception occurs when there is no connectivity to internet.
-NullPointerException - Exception occurs when URL is expired/accessing invalid location in hashSet. 
-SocketTimeoutException - Exception occurs when Socket is busy/ timed out to process url request. Rerun the code.
-MalformedURLException - Exception occurs for Invalid URL.

