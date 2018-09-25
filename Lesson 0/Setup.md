# Installing Java
## Windows
* Download Oracle JDK10 [here](http://www.oracle.com/technetwork/java/javase/downloads/jdk10-downloads-4416644.html).
* Find the directory where JDK was installed. It will be:
  `C:\Program Files\Java\jdk[version]\bin`
* Go to Right Click on 'This PC' > Properties > Advanced Tab > Environment Variables 
* In User Variables, find `PATH` Variable. If found, choose to edit it, otherwise, create new variable.
* Set the value of PATH as the address located earlier: `C:\Program Files\Java\jdk[version]\bin`. Note: If you are editing an already existing variable, paste the address at the beginning of the initial value, followed by `;` (semi-colon).
* Click Ok/Apply as needed.

## Linux (Ubuntu)
Oracle provides 2 compilers (not much difference) with the names Oracle JDK and OpenJDK, you can choose any of them. Read [this](https://stackoverflow.com/questions/22358071/differences-between-oracle-jdk-and-openjdk) stackoverflow answer for differences.

## OpenJDK
Execute the following in terminal:
* `sudo apt install openjdk-11-jdk` 

## Oracle JDK
Execute the following in terminal (in same order):
* `sudo add-apt-repository ppa:webupd8team/java`
* `sudo apt update`
* `sudo apt install oracle-java8-installer`


