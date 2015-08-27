#!/bin/bash

# Work out of the lib directory
cd ../lib

# start in background
java -javaagent:jolokia-jvm-1.2.3-agent.jar=user=camel,password=camel -jar bowd-routing-server.jar &

# get the PID
appPID=$!

# print to terminal
echo $appPID

# Write the the command kill pid in shutdown.sh
echo "kill $appPID" > ../bin/shutdown.sh