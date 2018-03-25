# Music-Lyrics-Search-Engine-with-Solr
# Introduction

Musical Search Engine is web based project for searching the songs lyrics from different movies and albums. It is implemented using Apache Solr search platform. Apache Solr is Open source enterprise search platform written in Java. It is powered by Lucene, which is a Java liberary.
The main features of Solr are Full text search, Hit highlighting, Faceted search, Real-time indexing etc. It uses Inverted Indexing for the searching process. Web crawling is used to generate the data from set of Seed Url’s. This Project aims at the development of optimized search engine for the songs of different languages.

# Systems Requirements
Java 8, Eclipse Java EE IDE, Solr 4.10.1, Jetty plugin.

# Dataset generation
The dataset for populating the search engine is generated by crawling the
seed url ‘http://www.hindilyrics.net/lyrics/’ .A recursive method of crawling
is used to extract each of the unique lyrics pages starting from the given seed
url.The following fields are extracted from each webpage.
• Page title
• url
• Movie
• Song title
• Singer(s)
• Music by
• Lyricist(s)
• Lyrics
• Metadata

The crawled data is stored into SolrDocument with the field values matching those specified in the schema.xml file. Each such document corresponding to a lyrics page is then added to the server. Jsoup libraries are used for crawling the pages.

# Indexing and schema generation
• The field values on which the user can query are indexed by solr implicitly. The addition of documents in the data generation phase invokes POSTing commands to Solr to add documents. The fields are then indexed.
• A new Solr Core called Music is created for serving the purpose.
• The representation of each of the query fields are specified in the schema.xml file. The document id is declared as unique key.
• The data is tokenized, converted into lower case, and word stems are removed before indexing.
• Index time boosting is used to increase the relevance of documents based on particular fields.
• Solrj libraries are used for populating the solr server with the crawled dataset.

# UI and search
• Request handlers are used for performing searches and returning the results
• Search UI based on VelocityResponseWriter is used along with several features.
• Faceted searching is implemented on various fields.
• Search result grouping is implemented on some of the field values.

# Methodology
SolrJ client is used to interact with Solr search engine. It enables any Java application to talk directly with Solr through its extensive library of APIs. Apache SolrJ is a part of the Apache Solr package. Apache velocity is a fast open source templates engine, which is used to quickly generates HTML-based frontend. Index handlers are a type of update handler, handling the task of add, update, and delete function on documents for indexing. Apache Solr supports updates through the index handler through JSON, XML, and text format. On submitting a query through the User Interface created using Velocity
UI, Request Handler assigns the job to appropriate Query Parser which in turn identifies and filters the query. Index Reader searches the index store and returns the result to response writer. Response writer formats the output and responds back to the user.

# Evaluations
## Dataset
The dataset required for populating the search engine is generated by crawling the seed url http://www.hindilyrics.net/lyrics/
## Evaluation measures 
## Results
## Analysis

# Work plan for final presentation
• Suggestions  - Provides users with automatic suggestions for query terms.
• Spell checking - Provide inline query suggestions based on other, similar, terms. The basis for these suggestions can be terms in a field in Solr, externally created text files, or fields in other Lucene indexes.
• Hit Highlighting - Allows fragments of documents that match the user’s query to be included with the query response. The fragments are included in a special section of the response (the highlighting section), and the client uses the formatting clues also included to determine how to present the snippets to users.
• Geospatial queries - Solr supports location data for use in spatial/geospatial searches. Using spatial search, we can index points or other shapes,filter search results by a bounding box or circle or by other shapes,sort or boost scoring by distance
between points, or relative area between rectangles
