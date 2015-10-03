# Simple Java webapp tast
This task is mainly to test your basic sytax and tools learning abilities.

## prerequsities
For this task you would need to install the following:
1. Java SDK (preferably 1.8)
2. Git ([setup](https://help.github.com/articles/set-up-git/))
3. Maven ([setup](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html))
-----------
In this task you would start a simple webserver that will have 2 web-services:  
a) **index-word** : adds words to server's "database".  
b) **show-words** : prints all words ordered by alphabet.


## pret-tasks
1) Create a Github account, or use yours, if you already have one.
2) [Fork](https://help.github.com/articles/fork-a-repo/) this repository.
3) Here's how you run the server:  
3.1) [clone](https://help.github.com/articles/fork-a-repo/#step-2-create-a-local-clone-of-your-fork) the  repository to your local computer. say: `C:\workspace\simple-service`  (or `~/workspace/simple-service` on linux).  
3.2) Go to that directory with CMD console (or Terminal, if your on Linux) `mvn clean install`   
3.3) BUILD SUCCESS? great! now run `mvn exec:java` this will start the local server  
3.4) Open your browser and browse to `http://localhost:8080/myapp/words/index?word=servicefriend`  
3.5) Your browser should print  
   > Thanks for sending: **servicefriend**  
   
   3.6) On your local source code: locate the class: `MyResource.java`:  
   - the method **indexIt** is in charge of the service we've tested but it doesn't do what it supposed to do. It only prints the word back and doesn't store it.
   - the method **showIt** is still unplemented.

Note that if you change anything you will have to run seeps 3.2 and 3.3 again to test it out.

## Task
1. Save the given words, in the most simple way, but make sure no word is saved more than once.
2. When going to `http://localhost:8080/myapp/words/show` I should get a print of all words ordered by alphabet. (**can still be plain text, no special HTML needed**)
3. push your changes to github.
