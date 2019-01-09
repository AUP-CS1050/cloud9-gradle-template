#!/bin/bash
cd ~
wget https://services.gradle.org/distributions/gradle-5.1-bin.zip
unzip gradle-5.1-bin.zip
rm -f gradle-5.1-bin.zip

echo 'GRADLE_HOME=~/gradle-5.1' >> ~/.profile
echo 'PATH=$GRADLE_HOME/bin:$PATH' >> ~/.profile
source ~/.profile
cd workspace


