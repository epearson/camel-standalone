# camel-standalone
An example for setting up a standalone Apache Camel server, including building an RPM with Maven.

Camel Context: src/main/resources/META-INF/spring/camel-context.xml

Notes

Require rpm program in order for Maven RPM plugin to work.

Mac: Install Homebrew, then: brew install rpm (this takes a few minutes)

Troubleshooting rpm install:
http://stackoverflow.com/questions/6616035/maven-rpm-plugin-fails-to-find-rpm-command-in-intellij

Comment at the bottom of stackoverflow thread:
sudo ln -s /usr/local/bin/rpm /bin/rpm
sudo ln -s /usr/local/bin/rpm /bin/rpmbuild

Design

The general idea is to run Apache Camel as a standalone Java application.
Installation should be fully automated, using an RPM package for the installation. Possibly configure Puppet to do the install.

Technology

Java 8
Apache Camel - Enterprise Integration Patterns, Routing
Jolokia JVM Agent - Remote connection via HTTP(S), access MBeans
Hawtio - Java web management console
Redhat Linux
RPM
